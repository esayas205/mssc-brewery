package guru.springframwork.msscbrewery.web.mapper;

import guru.springframwork.msscbrewery.domain.Beer;
import guru.springframwork.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses={DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
