package com.kreitek.editor.commands;

import com.kreitek.editor.interfaces.Command;

import java.util.ArrayList;

public class UndoCommand implements Command {

    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines == null){
            documentLines = new ArrayList<>();
        }
        ArrayList<String> lastState = new ArrayList<>(documentLines);
        documentLines.clear();
        documentLines.addAll(lastState);
    }
}