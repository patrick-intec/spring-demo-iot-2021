package be.infernalwhale.service;

import java.util.ArrayList;
import java.util.List;

public class CleaningServiceImpl implements CleaningService {
    private List<Cleaner> cleaners = new ArrayList<>();

    public void addCleaner(Cleaner cleaner) {
        this.cleaners.add(cleaner);
    }

    public void doCleaning() {
        for (Cleaner cleaner : cleaners) {
            cleaner.doJob();
        }
    }
}
