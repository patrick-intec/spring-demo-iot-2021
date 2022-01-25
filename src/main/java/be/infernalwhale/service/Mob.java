package be.infernalwhale.service;

public class Mob implements CleaningTool {
    public Mob() {
        System.out.println("Creating a mob object");
    }

    @Override
    public void clean() {
        System.out.println("Mop mop mop");
    }
}
