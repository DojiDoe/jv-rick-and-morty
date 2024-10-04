package mate.academy.rickandmorty.service;

import java.util.ArrayList;
import java.util.List;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResponseDataDto;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResultDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RickAndMortyApiServiceImpl implements RickAndMortyApiService {
    public static final String BASE_URL = "https://rickandmortyapi.com/api/character";

    private final RestTemplate restTemplate;

    public RickAndMortyApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<RickAndMortyApiResultDto> getAllCharacters() {
        List<RickAndMortyApiResultDto> result = new ArrayList<>();
        String url = BASE_URL;
        RickAndMortyApiResponseDataDto response;
        do {
            response = restTemplate.getForObject(url, RickAndMortyApiResponseDataDto.class);
            if (response != null && response.getRickAndMortyApiResultDto() != null) {
                url = response.getRickAndMortyApiInfoDto().getNext();
                result.addAll(response.getRickAndMortyApiResultDto());
            }
        } while (response != null && response.getRickAndMortyApiInfoDto().getNext() != null);
        return result;
    }
}
