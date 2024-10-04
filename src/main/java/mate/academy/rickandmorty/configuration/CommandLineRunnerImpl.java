package mate.academy.rickandmorty.configuration;

import java.util.List;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResultDto;
import mate.academy.rickandmorty.service.RickAndMortyApiServiceImpl;
import mate.academy.rickandmorty.service.RickAndMortyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private final RickAndMortyApiServiceImpl rickAndMortyApiService;
    private final RickAndMortyService rickAndMortyService;

    public CommandLineRunnerImpl(RickAndMortyApiServiceImpl rickAndMortyApiService,
                                 RickAndMortyService rickAndMortyService) {
        this.rickAndMortyApiService = rickAndMortyApiService;
        this.rickAndMortyService = rickAndMortyService;
    }

    @Override
    public void run(String... args) {
        List<RickAndMortyApiResultDto> allCharacters = rickAndMortyApiService.getAllCharacters();
        rickAndMortyService.saveAll(allCharacters);
    }
}
