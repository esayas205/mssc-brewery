package guru.springframwork.msscbrewery.service;

import guru.springframwork.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Walya")
                .beerStyle("New Style")
                .build();
    }

    @Override
    public BeerDto newBeer(BeerDto beer) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Walya")
                .beerStyle("New Style")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting beer id: " + beerId);
    }
}
