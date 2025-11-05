package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheApp {
    public static void main(String[] args) {

        //create a list to hold our family members
        List<Person> myFamily = new ArrayList<Person>();

        //create and add family members to the list
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(myFamily);

        for (Person currentPerson : myFamily){
            System.out.println(currentPerson.getLastName() +", " + currentPerson.getFirstName()+ " - " + currentPerson.getAge());
        }
    }




}
