package com.kreitek.editor.console;

import com.kreitek.editor.interfaces.Editor;

public class EditorFactory {
    public Editor getEditor() {
        return new ConsoleEditor();
    }
}
