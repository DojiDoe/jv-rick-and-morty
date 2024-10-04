package mate.academy.rickandmorty.controller;

import mate.academy.rickandmorty.dto.internal.RickAndMortyWikiDto;
import mate.academy.rickandmorty.service.RickAndMortyServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rick_and_morty")
public class RickAndMortyController {

    private final RickAndMortyServiceImpl service;

    public RickAndMortyController(RickAndMortyServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/random")
    public RickAndMortyWikiDto testRickAndMorty() {
        return service.getRandomCharacter();
    }
}
