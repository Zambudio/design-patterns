package com.kreitek.pets.controllers;

import com.kreitek.pets.interfaces.Controller;

public class ControllerFactory {
    public Controller getCatController() {
        return new CatController();
    }

    public Controller getDogController() {
        return new DogController();
    }
}
