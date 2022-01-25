package be.infernalwhale.config;

import be.infernalwhale.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
public class BeanConfiguration {
    // Dependency Injection
    // Dependency : Een afhankelijkheid, Een class kan zijn werk niet doen zonder zijn dependencies...
    // Injection (Iets wordt in jou gestoken) <> Ingestion (Iets naar jezelf toebrengen)

    @Bean
    @Primary
    public CleaningTool createBroom() {
        return new Broom();
    }

    @Bean
    @Qualifier(value = "mobBean")
    @Scope("prototype")
    public CleaningTool createMob() {
        return new Mob();
    }

    @Bean
    public Cleaner createCleaner(CleaningTool tool) {
        Cleaner cleaner = new Cleaner();
        cleaner.setTool(tool);
        return cleaner;
    }

    @Bean
    public Cleaner createCleanerWithBroom(CleaningTool tool) {
        Cleaner cleaner = new Cleaner();
        cleaner.setTool(tool);
        return cleaner;
    }

    @Bean
    public Cleaner createAnotherCleaner(CleaningTool tool) {
        Cleaner cleaner = new Cleaner();
        cleaner.setTool(tool);
        return cleaner;
    }

    @Bean
    @Lazy
    public CleaningService createCompany(List<Cleaner> cleaners) {
        UpgradedCleaningService cs = new UpgradedCleaningService();
        cs.setCleaners(cleaners);
        return cs;
    }

}
