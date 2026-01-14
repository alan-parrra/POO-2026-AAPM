package edu.alan.parra.actividad1.process;

public class Switch {
    public boolean is0n;

    public void prender(){
        this.is0n = true;
    }

    private void apagar(){
        this.is0n = false;
    }

    public boolean is0n(){
        return this.is0n;
    }

    public boolean isOn() {
    }
}

