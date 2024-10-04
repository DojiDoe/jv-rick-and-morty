package mate.academy.rickandmorty.dto.external;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class RickAndMortyApiResultDto {
    private Long id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    @JsonProperty("origin")
    private RickAndMortyApiOriginDto rickAndMortyApiOriginDto;
    @JsonProperty("location")
    private RickAndMortyApiLocationDto rickAndMortyApiLocationDto;
    private String image;
    private List<String> episode;
    private String url;
    private LocalDateTime created;
}
