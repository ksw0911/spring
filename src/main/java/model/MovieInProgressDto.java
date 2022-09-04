package model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class MovieInProgressDto implements Serializable {
    private final Long movieId;
    private final LocalDate date;
    private final String room;
}
