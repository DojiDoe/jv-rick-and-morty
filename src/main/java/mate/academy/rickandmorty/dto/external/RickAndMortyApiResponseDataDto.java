package mate.academy.rickandmorty.dto.external;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class RickAndMortyApiResponseDataDto {
    @JsonProperty("info")
    private RickAndMortyApiInfoDto rickAndMortyApiInfoDto;
    @JsonProperty("results")
    private List<RickAndMortyApiResultDto> rickAndMortyApiResultDto;
}
