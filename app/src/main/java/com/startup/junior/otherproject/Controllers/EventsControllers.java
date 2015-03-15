package com.startup.junior.otherproject.Controllers;



import com.startup.junior.otherproject.Models.FechaEvento;

import java.util.ArrayList;

/**
 * Created by Junior on 27/11/2014.
 */
public class EventsControllers {



    public ArrayList<String> separarLinks(String cadena){

        ArrayList<String> result = new ArrayList<String>();
        int inicio = 0;
        int end = 0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==';'){
                result.add(cadena.substring(inicio , i-1));
                inicio=i+1;
            }
            if(i==cadena.length()-1){
                result.add(cadena.substring(inicio,i));
            }
        }
        if(result.size()<3){
            int tamaño =  result.size();
            switch (tamaño){
                case 1 :
                    result.add(null);
                    result.add(null);
                    break;
                case 2:
                    result.add(null);
                    break;
            }
        }
        return result;
    }

    public FechaEvento getDataFecha(String fecha){

        String cadena1 = separarCadena(fecha)[0];
        String cadena2 = separarCadena(fecha)[1];
        ArrayList<FechaEvento> dataFecha = new ArrayList<>();
        FechaEvento data = new FechaEvento();

        String[] childCadena1 = cadena1.split(" ");
        String[] childCadena2 = cadena2.split(":");
        data.setDia(childCadena1[0]);
        data.setMes(childCadena1[1]);
        data.setNumeroDia(childCadena1[2]);
        data.setAño(childCadena1[3]);
        data.setHora(childCadena2[0]);
        data.setMinuto(childCadena2[1]);
        return data;
    }

    public static String[] separarCadena(String cadena){
        int positionInicial=0;
        String cadena1="";
        String cadena2 = "";

        for(int i=0; i<cadena.length(); i++){
            cadena1 = cadena.substring(0, 15);
            positionInicial = 16;
            cadena2 = cadena.substring(positionInicial,21);
        }
        String[] result = new String [] {cadena1, cadena2};
        return result;
    }


}
