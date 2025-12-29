package LinkedList.TextUndoRedo;

public class Main {
    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();
        editor.addState("Text 1");
        editor.addState("Text 2");
        editor.addState("Text 3");
        editor.displayCurrent();
        editor.undo();
        editor.undo();
        editor.redo();
        editor.addState("Text 4");
        editor.displayCurrent();
    }
}
