package edu.mia.garcia.actividad1;

import edu.mia.garcia.actividad1.process.ShopManager;
import edu.mia.garcia.actividad1.ui.CLI;
/**
 * Inicia el menú principal de la aplicación.
 */
public class Starter {
    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();
        CLI cli = new CLI(shopManager);
        cli.start();
    }
}
