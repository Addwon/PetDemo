package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner{
    @Autowired
    ChildrenRepository childRepo;

    @Autowired
    PetRepository petRepo;


    @Override
    public void run(String... args) throws Exception {
        /*Sadness. a child can only have one pet. */



        Child newChild = new Child();
        newChild.setName("Jim");
        childRepo.save(newChild);

        Pets myPet = new Pets();
        myPet.setAge(3);
        myPet.setName("Snuffy");
        myPet.setChild(newChild);
        petRepo.save(myPet);


        newChild = new Child();
        newChild.setName("Sarah");
        childRepo.save(newChild);

        myPet = new Pets();
        myPet.setAge(1);
        myPet.setName("Fluffy");
        myPet.setChild(newChild);
        petRepo.save(myPet);



    }
}
