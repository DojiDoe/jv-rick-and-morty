package mate.academy.rickandmorty.service;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResultDto;
import mate.academy.rickandmorty.dto.internal.RickAndMortyWikiDto;
import mate.academy.rickandmorty.mapper.RickAndMortyCharacterMapper;
import mate.academy.rickandmorty.model.RickAndMortyCharacter;
import mate.academy.rickandmorty.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RickAndMortyServiceImpl implements RickAndMortyService {

    private final CharacterRepository characterRepository;

    private final RickAndMortyCharacterMapper characterMapper;

    @Override
    public RickAndMortyCharacter save(RickAndMortyApiResultDto rickAndMortyApiResultDto) {
        RickAndMortyCharacter rickAndMortyCharacter = characterMapper
                .toModel(rickAndMortyApiResultDto);
        return characterRepository.save(rickAndMortyCharacter);
    }

    @Override
    public List<RickAndMortyCharacter> saveAll(List<RickAndMortyApiResultDto> resultDtoList) {
        List<RickAndMortyCharacter> rickAndMortyCharacterList = new ArrayList<>();
        for (RickAndMortyApiResultDto resultDto : resultDtoList) {
            rickAndMortyCharacterList.add(characterMapper.toModel(resultDto));
        }
        return characterRepository.saveAll(rickAndMortyCharacterList);
    }

    @Override
    public RickAndMortyWikiDto getRandomCharacter() {
        return characterMapper.toDto(characterRepository.getRandomCharacter());
    }
}
