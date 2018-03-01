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
  /*      Children go crazy - they can have as many pets as they want!!!

        Create a new pet and add a child. Perform the operations separately.
        CASCADE.ALL has been removed

*/      Pets myPet = new Pets();
        myPet.setAge(3);
        myPet.setName("Snuffy");
        petRepo.save(myPet);


        myPet = new Pets();
        myPet.setAge(1);
        myPet.setName("Tammy");
        petRepo.save(myPet);

        Child newChild = new Child();
        newChild.setName("Jim");
        newChild.addPetToChild(petRepo.findByName("Snuffy"));
        newChild.addPetToChild(petRepo.findByName("Tammy"));
        childRepo.save(newChild);

    }
}
