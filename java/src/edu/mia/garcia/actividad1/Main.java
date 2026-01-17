package edu.mia.garcia.actividad1;

import edu.mia.garcia.actividad1.process.ShopManager;
import edu.mia.garcia.actividad1.ui.CLI;

public class Main {
    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();
        CLI cli = new CLI(shopManager);
        cli.start();
    }
}
