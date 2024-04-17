package br.cesul.lista03.ex05.share;

public class Contact {

    private String name;

    private String Address;

    private String Sex;

    private String email;

    public Contact(String name, String address, String sex, String email) {
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
