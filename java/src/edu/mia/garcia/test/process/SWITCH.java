package edu.mia.garcia.test.process;

public class SWITCH {
    private boolean isOn;

    public void prenderSwitch(){
        this.isOn= true;
    }

    public void apagarSwitch(){
        this.isOn= false;
    }

    public boolean isOn(){
        return this.isOn;
    }
}
