package com.startup.junior.otherproject.Models;

/**
 * Created by Junior on 27/11/2014.
 */
public class Discotecas {
    String logo;
    String name;
    String address;
    double latitud;
    double longitud;
    String website;

    public Discotecas(){
        logo = "";
        name = "";
        address = "";
        latitud = 0.0;
        longitud = 0.0;
        website = "";
    }

    public Discotecas(String logo, String name, String address, double latitud, double longitud, String website) {
        this.logo = logo;
        this.name = name;
        this.address = address;
        this.latitud = latitud;
        this.longitud = longitud;
        this.website = website;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
