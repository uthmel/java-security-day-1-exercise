package com.booleanuk.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "age_rating")
    private String age_rating;

    @Column(name = "number_of_players")
    private int number_of_players;


    public Game(String title, String age_rating, int number_of_players) {
        this.title = title;
        this.age_rating = age_rating;
        this.number_of_players = number_of_players;
    }
}