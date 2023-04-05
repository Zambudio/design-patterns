package com.kreitek.editor.commands;

import com.kreitek.editor.LastStateDocument;
import com.kreitek.editor.interfaces.Command;

import java.util.ArrayList;

public class UndoCommand implements Command {

    @Override
    public void execute(ArrayList<String> documentLines, LastStateDocument lastStateDocument) {
        documentLines.clear();
        documentLines.addAll(lastStateDocument.getState()) ;

    }
}