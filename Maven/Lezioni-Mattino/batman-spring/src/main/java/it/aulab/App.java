package it.aulab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.aulab.model.Batman;
import it.aulab.model.Batmobile;
import it.aulab.model.Suite;
import it.aulab.service.BatmanService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Batman batman = context.getBean("batman", Batman.class);
        // Batmobile batmobile1 = context.getBean("batmobile", Batmobile.class);
        // Batmobile batmobile2 = context.getBean("batmobile", Batmobile.class);
        // Suite suite = context.getBean("suite", Suite.class);

        // // System.out.println(batman);
        // System.out.println(batman.getBatmobile());
        // System.out.println(batman.getSuite());
        // System.out.println(batmobile1);
        // System.out.println(batmobile2);
        // System.out.println(suite);

        BatmanService service = context.getBean("batmanService", BatmanService.class);

        service.attack();
        service.climb();
        service.glide();
        service.goForwardWithBatmobile();
        service.goBackwardWithBatmobile();
        
    }
}
