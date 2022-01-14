package com.company.section7;

public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case aCase;

    public PC(Motherboard motherboard, Monitor monitor, Case aCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.aCase = aCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getaCase() {
        return aCase;
    }
}
