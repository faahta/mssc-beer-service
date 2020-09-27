package com.beer.msscbeerservice.web.mappers;

import com.beer.msscbeerservice.domain.Beer;
import com.beer.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Fassil on 27/09/20.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    Beer beerTobeerDto(Beer beer);
    BeerDto beerDtoTobeer(BeerDto beerDto);
}
