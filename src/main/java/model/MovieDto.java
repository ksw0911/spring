package model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MovieDto implements Serializable {
    private final String title;
    private final int duration;
    private final String genre;
    private final List<MovieInProgressDto> Movies;
}
