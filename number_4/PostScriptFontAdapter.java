package number_4;

// Адаптер для PostScriptFont
public class PostScriptFontAdapter implements FontRenderer {
    private PostScriptFont postScriptFont;

    public PostScriptFontAdapter(PostScriptFont postScriptFont) {
        this.postScriptFont = postScriptFont;
    }

    @Override
    public void render(String text) {
        postScriptFont.renderPostScriptFont(text);
    }
}
