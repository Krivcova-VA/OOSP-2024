package number_4;

// Адаптер для OpenTypeFont
public class OpenTypeFontAdapter implements FontRenderer {
    private OpenTypeFont openTypeFont;

    public OpenTypeFontAdapter(OpenTypeFont openTypeFont) {
        this.openTypeFont = openTypeFont;
    }

    @Override
    public void render(String text) {
        openTypeFont.renderOpenTypeFont(text);
    }
}

