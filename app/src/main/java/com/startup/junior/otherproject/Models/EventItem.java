package com.startup.junior.otherproject.Models;

/**
 * Created by Junior on 20/11/2014.
 */
public class EventItem {

    String nunDia;
    String dia;
    String nameEvent;
    String hourEvent;
    String venueEvent;
    int image;
    int fragment;

    public EventItem(String dia, String nunDia, String nameEvent, String hourEvent, String venueEvent, int image) {
        this.image = image;
        this.dia = dia;
        this.nunDia = nunDia;
        this.venueEvent = venueEvent;
        this.hourEvent = hourEvent;
        this.nameEvent = nameEvent;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getNunDia() {
        return nunDia;
    }

    public void setNunDia(String nunDia) {
        this.nunDia = nunDia;
    }

    public String getVenueEvent() {
        return venueEvent;
    }

    public void setVenueEvent(String venueEvent) {
        this.venueEvent = venueEvent;
    }

    public String getHourEvent() {
        return hourEvent;
    }

    public void setHourEvent(String hourEvent) {
        this.hourEvent = hourEvent;
    }
}
