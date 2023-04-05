package com.kreitek.editor.interfaces;

import com.kreitek.editor.LastStateDocument;

import java.util.ArrayList;

public interface Command {
    void execute(ArrayList<String> documentLines, LastStateDocument lastStateDocument);
}

