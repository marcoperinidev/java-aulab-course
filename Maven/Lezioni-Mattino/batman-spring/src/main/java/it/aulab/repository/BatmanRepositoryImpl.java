package it.aulab.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import it.aulab.model.Batman;

@Component("batmanRepository")
public class BatmanRepositoryImpl implements BatmanRepository {

    @Autowired
    @Qualifier("batmanWhite")
    private Batman batman;

    public BatmanRepositoryImpl() {
        System.out.println("Create repository");
    }

    @Override
    public Batman getBatman() {
       return this.batman;
    }

    @Override
    public void setBatman(Batman batman) {
        this.batman = batman;
    }
    
}
