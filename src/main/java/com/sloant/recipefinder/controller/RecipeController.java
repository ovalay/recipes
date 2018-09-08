package com.sloant.recipefinder.controller;

import com.sloant.recipefinder.entities.OperationResult;
import com.sloant.recipefinder.entities.Recipe;
import com.sloant.recipefinder.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public CompletableFuture<OperationResult> sayHello () {
        return CompletableFuture.completedFuture(new OperationResult<>(HttpStatus.OK.value(), "Why hello sir", null));
    }

    @RequestMapping(value = "/addrecipe", method = RequestMethod.POST)
    public CompletableFuture<OperationResult> addRecipe (@RequestBody Recipe recipe, HttpServletRequest request) {
        boolean isSaved = recipeService.saveRecipe(recipe);
        if (isSaved)
            return CompletableFuture.completedFuture(new OperationResult<>(HttpStatus.OK.value(), "Recipe added", null));
        else
            return CompletableFuture.completedFuture(new OperationResult<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), null, "Something broke..."));
    }
}
