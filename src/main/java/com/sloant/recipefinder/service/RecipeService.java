package com.sloant.recipefinder.service;

import com.sloant.recipefinder.entities.Recipe;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    public boolean saveRecipe(Recipe recipe) {
        //repo.save
        System.out.println("saving recipe now");
        return true;
    }
}
