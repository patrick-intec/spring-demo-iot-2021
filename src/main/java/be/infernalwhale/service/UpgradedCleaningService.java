package be.infernalwhale.service;

// Programming against an interface

import java.util.ArrayList;
import java.util.Collection;

public class UpgradedCleaningService implements CleaningService {
    private Collection<Cleaner> cleaners = new ArrayList<>();

    public UpgradedCleaningService() {
        System.out.println("Creating the upgraded cleaning service");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ignored) {
//        }
    }

    public Collection<Cleaner> getCleaners() {
        return cleaners;
    }

    public UpgradedCleaningService setCleaners(Collection<Cleaner> cleaners) {
        this.cleaners = cleaners;
        return this;
    }

    public void addCleaner(Cleaner cleaner) {
        cleaners.add(cleaner);
    }

    @Override
    public void doCleaning() {
        cleaners.forEach(cleaner -> cleaner.doJob());
    }
}
