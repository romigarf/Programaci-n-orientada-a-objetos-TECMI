package edu.mia.garcia.actividad1.process;

import edu.mia.garcia.actividad1.data.Auto;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private List <Auto> carList;

    public ShopManager() {
        carList = new ArrayList<>();
        this.carList.add(new Auto("1","Vocho 1999", "2 Puertas", "Cuenta con una transmisión manual de 4 velocidades y reversa", "Potencia de 50hp", 100000));
        this.carList.add(new Auto ("2","Tsuru tuneado", "4 Puertas", "Cuenta con una transmision de 5 velocidades", "Potencia de 100hp", 110000));
        this.carList.add(new Auto ("3","Marcheratti", "4 puertas", "Cuenta coj una transmisión manual de 5 velocidades", "Potendia de 106hp", 150000));
        System.out.println(this.carList);

    }
    public List<Auto> getCarList() {
        return carList;
    }
    public Auto buscarAuto(String num) {
        for (Auto auto : carList) {
            if (auto.getNum().equals(num)) {
                return auto;
            }
        }
        return null;
    }
}
