package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResultDto;
import mate.academy.rickandmorty.dto.internal.RickAndMortyWikiDto;
import mate.academy.rickandmorty.model.RickAndMortyCharacter;

public interface RickAndMortyService {
    RickAndMortyCharacter save(RickAndMortyApiResultDto rickAndMortyApiResultDto);

    List<RickAndMortyCharacter> saveAll(List<RickAndMortyApiResultDto> resultDtoList);

    RickAndMortyWikiDto getRandomCharacter();
}
