package com.baking.controller;

import com.baking.model.RecipeC;
import com.baking.model.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BakingAppController {
    
    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping("/recipes")
    public String getRecipes() {
       // logger.info("Request to get all greetings");
        String result = "";

        for(RecipeC cust : recipeRepository.findAll()){
            result += cust.toString() + "<br>";
        }

        return result;

    }
}
