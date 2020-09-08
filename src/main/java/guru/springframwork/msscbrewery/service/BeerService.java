package guru.springframwork.msscbrewery.service;

import guru.springframwork.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto newBeer(BeerDto beer);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
