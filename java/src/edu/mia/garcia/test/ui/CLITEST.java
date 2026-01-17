package edu.mia.garcia.test.ui;

import edu.mia.garcia.test.process.SWITCH;

import java.util.Scanner;

public class CLITEST {
    public static void start(){
        SWITCH switch_wifi= new SWITCH();
        Scanner scanner= new Scanner(System.in);
        System.out.println("bienvenido al programa");
        System.out.println("el switch esta "+switch_wifi.isOn());
        String respuesta;
        if (switch_wifi.isOn()){
            System.out.println("desea apagar el switch? s/n");
            respuesta= scanner.nextLine();
            if(respuesta.equals("s")) switch_wifi.apagarSwitch();
        }else {
            System.out.println("desea prender el switch");
            respuesta= scanner.nextLine();
            if(respuesta.equals("s")) switch_wifi.prenderSwitch();
        }
        System.out.println("El switch esta"+switch_wifi.isOn());
    }
}
