package com.kreitek.editor;

import java.util.ArrayList;

public class LastStateDocument {
    // Clase memento
    private ArrayList<String> state;
    public void setState(ArrayList<String> state){
        this.state = state;
    }
    public ArrayList<String> getState(){
        return state;
    }

}
