package number_4;

public class Main {
    public static void main(String[] args) {

        TrueTypeFont trueTypeFont = new TrueTypeFont();
        OpenTypeFont openTypeFont = new OpenTypeFont();
        PostScriptFont postScriptFont = new PostScriptFont();

        FontRenderer trueTypeAdapter = new TrueTypeFontAdapter(trueTypeFont);
        FontRenderer openTypeAdapter = new OpenTypeFontAdapter(openTypeFont);
        FontRenderer postScriptAdapter = new PostScriptFontAdapter(postScriptFont);

        FontManager fontManager = new FontManager(trueTypeAdapter);
        fontManager.renderText("Hello, TrueType World!");

        fontManager = new FontManager(openTypeAdapter);
        fontManager.renderText("Hello, OpenType World!");

        fontManager = new FontManager(postScriptAdapter);
        fontManager.renderText("Hello, PostScript World!");
    }
}
