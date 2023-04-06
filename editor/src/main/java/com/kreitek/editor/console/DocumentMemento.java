package com.kreitek.editor.console;

import java.util.ArrayList;

public class DocumentMemento {
    private static ArrayList<String> state;
    public void setState(ArrayList<String> state){
        this.state = state;
    }
    public ArrayList<String> getState(){
        return state;
    }

}
