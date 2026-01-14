package edu.mia.garcia.actividad1.process;

public class SWITCH {
    private boolean isOn;

    public void prenderSwitch(){
        this.isOn= true;
    }

    private void apagarSwitch(){
        this.isOn= false;
    }

    public boolean isOn(){
        return this.isOn;
    }
}
