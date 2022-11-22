package edu.aqmal.gui;

public class Person {
    private String Username;
    private String Pw;

    public Person() {
    }

    public Person(String username, String pw) {
        Username = username;
        Pw = pw;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPw() {
        return Pw;
    }

    public void setPw(String pw) {
        Pw = pw;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Username='" + Username + '\'' +
                ", Pw='" + Pw + '\'' +
                '}';
    }
}