package com.kreitek.editor.commands;

import com.kreitek.editor.LastStateDocument;
import com.kreitek.editor.interfaces.Command;

import java.util.ArrayList;

public class UpdateCommand implements Command {
    private final String text;
    private final int lineNumber;

    public UpdateCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines, LastStateDocument lastStateDocument) {
        if (documentLines.size() > lineNumber) {
            lastStateDocument.setState(new ArrayList<>(documentLines));
            documentLines.set(lineNumber, text);
        }
        else {
            lastStateDocument.setState(new ArrayList<>(documentLines));
            documentLines.add(text);
        }
    }
}
