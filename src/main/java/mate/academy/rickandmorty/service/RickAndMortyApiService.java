package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResultDto;

public interface RickAndMortyApiService {
    public List<RickAndMortyApiResultDto> getAllCharacters();
}
