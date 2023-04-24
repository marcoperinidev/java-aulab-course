package com.example.application.views.list;

import com.example.application.data.service.CrmService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.ChartType;
import com.vaadin.flow.component.charts.model.DataSeries;
import com.vaadin.flow.component.charts.model.DataSeriesItem;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "dashboard", layout = MainLayout.class)
@PageTitle("Dashboard | Management CRM")
public class DashboardView extends VerticalLayout {
    private CrmService service;

    public DashboardView(CrmService service) {
        this.service = service;

        addClassName("dashboard-view");
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);//center everything on horiz axes
        add(getContactStats(), getCompaniesChart());//helpers
    }

    private Component getContactStats() {
        Span stats = new Span(service.countContacts() + " contact");// span containing tot num of contacts
        stats.addClassNames("text-xl", "mt-m");
        return stats;
    }

    private Component getCompaniesChart() {
        Chart chart = new Chart(ChartType.PIE);//pie charts

        DataSeries dataSeries = new DataSeries();
        service.findAllCompanies().forEach(company->{//pulls of the service the data and uses the @Formula to get the count
            dataSeries.add(new DataSeriesItem(company.getName(), company.getEmployeeCount()));
        });
        chart.getConfiguration().setSeries(dataSeries);
        return chart;

    }
}
