package br.cesul.lista03.ex05.share;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    List<Contact> points = new ArrayList<>();

    public void insertContact(Contact contact){

        points.add(contact);
    }

    public void removeContact(String name){
        for (Contact contact : points) {
            if (contact.getName().equalsIgnoreCase(name)) {
                points.remove(contact);
            }
        }
    }

    public void listContacts(){
        for (Contact contact : points) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Sex: " + contact.getSex());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Address: " + contact.getAddress());
        }
    }

}