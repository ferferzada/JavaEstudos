package br.cesul.lista03.ex05.app;

import br.cesul.lista03.ex05.share.Contact;
import br.cesul.lista03.ex05.share.ContactBook;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("teste","teste","S","TESTE");
        ContactBook contactBook = new ContactBook();
        contactBook.insertContact(contact);
        contactBook.listContacts();

    }
}
