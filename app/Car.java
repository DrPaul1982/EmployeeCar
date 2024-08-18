package src.app;

class Car {

    private void startElectricity() {
        System.out.println("Electricity started.");
    }

    private void startCommand() {
        System.out.println("Command started.");
    }

    private void startFuelSystem() {
        System.out.println("FuelSystem started.");
    }

    void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

}

