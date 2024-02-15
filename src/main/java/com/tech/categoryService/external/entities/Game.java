package com.tech.categoryService.external.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {
    private String gameId;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private String platform; //(PS5, PS4, PC).
    private String developer;
    private String publisher;
    private double price;
    private int gameLength;
    private String imageUrl;
    private String enterpriseId;
    private String categoryId;
    private List<Rating> ratings = new ArrayList<>();
}
