package number_4;

// Адаптер для TrueTypeFont
public class TrueTypeFontAdapter implements FontRenderer {
    private TrueTypeFont trueTypeFont;

    public TrueTypeFontAdapter(TrueTypeFont trueTypeFont) {
        this.trueTypeFont = trueTypeFont;
    }

    @Override
    public void render(String text) {
        trueTypeFont.renderTrueTypeFont(text);
    }
}
