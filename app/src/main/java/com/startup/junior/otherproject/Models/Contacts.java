package com.startup.junior.otherproject.Models;

/**
 * Created by Junior on 27/11/2014.
 */
public class Contacts {
    String name;
    String email;
    String telefono;

    public Contacts(String name, String email, String telefono) {
        this.name = name;
        this.email = email;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
