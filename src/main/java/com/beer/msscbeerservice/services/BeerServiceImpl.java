package com.beer.msscbeerservice.services;

import com.beer.msscbeerservice.web.model.BeerDto;
import com.beer.msscbeerservice.web.model.BeerPagedList;
import com.beer.msscbeerservice.web.model.BeerStyleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Fassil on 27/09/20.
 */
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public BeerDto getById(UUID beerId, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto getByUpc(String upc) {
        return null;
    }
}
