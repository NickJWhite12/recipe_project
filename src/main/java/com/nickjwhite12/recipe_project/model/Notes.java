package com.nickjwhite12.recipe_project.model;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
