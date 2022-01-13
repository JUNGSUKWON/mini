package com.example.mini.domain.movie;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String title;

    @Column(length = 200, nullable = false)
    private String image;

    @Column(length = 200, nullable = false)
    private String subtitle;

    @Column(length = 10, nullable = false)
    private String pubDate;

    @Column(length = 200, nullable = false)
    private String director;

    @Column(length = 200, nullable = false)
    private String actor;

    @Column(length = 10, nullable = false)
    private String userRating;


    @Builder
    public Movie(String title, String image, String subtitle, String pubDate, String director, String actor, String userRating) {
        this.title = title;
        this.image = image;
        this.subtitle = subtitle;
        this.pubDate = pubDate;
        this.director = director;
        this.actor = actor;
        this.userRating = userRating;
    }
}
