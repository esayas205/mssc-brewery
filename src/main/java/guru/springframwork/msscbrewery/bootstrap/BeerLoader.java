package guru.springframwork.msscbrewery.bootstrap;

import guru.springframwork.msscbrewery.domain.Beer;
import guru.springframwork.msscbrewery.repositories.BeerRepository;
import guru.springframwork.msscbrewery.web.model.BeerStyleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {

        if(beerRepository.count() == 0 ) {
            loadBeerObjects();
        }
    }

    private void loadBeerObjects() {
        Beer b1 = Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle(BeerStyleEnum.IPA.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(1233432234324L)
                .build();

        Beer b2 = Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.PALE_ALE.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(1233432234324L)
                .build();

        Beer b3 = Beer.builder()
                .beerName("Pinball Porter")
                .beerStyle(BeerStyleEnum.PALE_ALE.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(1233432234324L)
                .build();

        beerRepository.save(b1);
        System.out.println("# of beers: " + b1.getId());

        beerRepository.save(b2);
        beerRepository.save(b3);

        System.out.println("# of beers: " + beerRepository.count());
    }
}
