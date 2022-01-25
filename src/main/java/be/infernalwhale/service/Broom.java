package be.infernalwhale.service;

public class Broom implements CleaningTool {
    public Broom() {
        System.out.println("Creating a Broom object");
    }

    @Override
    public void clean() {
        System.out.println("Sweep sweep sweep....");
    }
}
