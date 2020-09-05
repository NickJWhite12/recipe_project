package com.nickjwhite12.recipe_project.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @OneToOne
    private UnitOfMeasurement unit;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasurement unit, Recipe recipe) {

        this.description = description;
        this.amount = amount;
        this.unit = unit;
        this.recipe = recipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descirption) {
        this.description = descirption;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipes() {
        return recipe;
    }

    public void setRecipes(Recipe recipes) {
        this.recipe = recipes;
    }
}
