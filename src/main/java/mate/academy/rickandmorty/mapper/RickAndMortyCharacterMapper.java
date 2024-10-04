package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.configuration.MapperConfig;
import mate.academy.rickandmorty.dto.external.RickAndMortyApiResultDto;
import mate.academy.rickandmorty.dto.internal.RickAndMortyWikiDto;
import mate.academy.rickandmorty.model.RickAndMortyCharacter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface RickAndMortyCharacterMapper {
    @Mapping(source = "id", target = "externalId")
    @Mapping(source = "rickAndMortyApiOriginDto", target = "origin")
    @Mapping(source = "rickAndMortyApiLocationDto", target = "location")
    RickAndMortyCharacter toModel(RickAndMortyApiResultDto resultDto);

    RickAndMortyWikiDto toDto(RickAndMortyCharacter character);
}
