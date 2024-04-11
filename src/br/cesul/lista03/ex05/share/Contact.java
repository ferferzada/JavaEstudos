package br.cesul.lista03.ex05.share;

public class Contact {

    private String name;

    private String Address;

    private char Sex;

    private String email;

    public Contact(String name, String address, char sex, String email) {
        this.name = name;
        Address = address;
        Sex = sex;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
