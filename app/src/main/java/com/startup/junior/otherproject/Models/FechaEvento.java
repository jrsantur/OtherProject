package com.startup.junior.otherproject.Models;

/**
 * Created by Junior on 28/01/2015.
 */
public class FechaEvento {
    String minuto;
    String hora;
    String mes;
    String dia;
    String numeroDia;
    String año;



    public FechaEvento(String dia,String mes, String numeroDia, String año ,String hora, String minuto) {
        this.hora = hora;
        this.numeroDia = numeroDia;
        this.dia = dia;
        this.mes = mes;
        this.minuto = minuto;
        this.año = año;
    }

    public FechaEvento() {
        hora = "";
        numeroDia = "";
        dia = "";
        mes = "";
        minuto = "";
        año = "";
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(String numeroDia) {
        this.numeroDia = numeroDia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
