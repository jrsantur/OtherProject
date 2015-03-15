package com.startup.junior.otherproject.Models;

/**
 * Created by Junior on 27/11/2014.
 */
public class Eventos {
    String title;
    String startTime;
    String summary;
    String direccion;
    String urlImage1;
    String urlImage2;
    String urlImagen3;
    Discotecas discotecas;
    Contacts contacts;
    Links links;

    public Eventos(String title, String startTime, String summary, String direccion, String urlImage1, String urlImage2, String urlImagen3, Discotecas discotecas, Contacts contacts, Links links) {
        this.title = title;
        this.startTime = startTime;
        this.summary = summary;
        this.direccion = direccion;
        this.urlImage1 = urlImage1;
        this.urlImage2 = urlImage2;
        this.urlImagen3 = urlImagen3;
        this.discotecas = discotecas;
        this.contacts = contacts;
        this.links = links;
    }
    public Eventos(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrlImage1() {
        return urlImage1;
    }

    public void setUrlImage1(String urlImage1) {
        this.urlImage1 = urlImage1;
    }

    public String getUrlImage2() {
        return urlImage2;
    }

    public void setUrlImage2(String urlImage2) {
        this.urlImage2 = urlImage2;
    }

    public String getUrlImagen3() {
        return urlImagen3;
    }

    public void setUrlImagen3(String urlImagen3) {
        this.urlImagen3 = urlImagen3;
    }

    public Discotecas getDiscotecas() {
        return discotecas;
    }

    public void setDiscotecas(Discotecas discotecas) {
        this.discotecas = discotecas;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
