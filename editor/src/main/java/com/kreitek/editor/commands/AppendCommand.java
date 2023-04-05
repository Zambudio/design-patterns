package com.kreitek.editor.commands;

import com.kreitek.editor.LastStateDocument;
import com.kreitek.editor.interfaces.Command;

import java.util.ArrayList;

public class AppendCommand implements Command {
    private final String text;

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(ArrayList<String> documentLines,LastStateDocument lastStateDocument) {
        lastStateDocument.setState(new ArrayList<>(documentLines));
        documentLines.add(text);
    }
}
