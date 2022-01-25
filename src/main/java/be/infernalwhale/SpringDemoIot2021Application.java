package be.infernalwhale;

import be.infernalwhale.service.CleaningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoIot2021Application {

    public static void main(String[] args) {
        // Application Context >> Beans (Application Objects) managen
        // Persistence Context / EM >> Entities (Data Objects) Managen

        ApplicationContext ctx =
                SpringApplication.run(SpringDemoIot2021Application.class, args);

        CleaningService cs = ctx.getBean(CleaningService.class);
        cs.doCleaning();

        // GardeningService
            // Gardeners
                // Rake, Shovel, ....

        // CookingService
            // Cooks (HotCook, ColdCook)
            // HotCook >> Uses pots or pans
            // ColdCook >> Uses SaladBowls

        // HouseHoldService >> manages: CleaningService, GardeningService AND CookingService
    }

}
