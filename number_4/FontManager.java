package number_4;

public class FontManager {
    private FontRenderer fontRenderer;

    public FontManager(FontRenderer fontRenderer) {
        this.fontRenderer = fontRenderer;
    }

    public void renderText(String text) {
        fontRenderer.render(text);
    }
}

