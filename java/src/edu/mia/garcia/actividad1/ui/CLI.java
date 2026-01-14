package edu.mia.garcia.actividad1.ui;

import edu.mia.garcia.actividad1.process.SWITCH;

public class CLI {
    public static void start(){
        SWITCH switch_wifi= new SWITCH();
        System.out.println("bienvenido al programa");
        System.out.println("el switch esta ");
        if (switch_wifi.isOn()){
            System.out.println("desea apagar el switch");
        }else {
            System.out.println("desea prender el switch");
        }
        System.out.println("El switch esta"+switch_wifi.isOn());
    }
}
