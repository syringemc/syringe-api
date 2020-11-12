package org.syringe.api.text;

public class Style {
    private final int rgb;
    private final boolean bold;
    private final boolean italic;
    private final boolean underlined;
    private final boolean strikethrough;
    private final boolean obfuscated;
    private final String font;

    private Style(int rgb, boolean bold, boolean italic, boolean underlined, boolean strikethrough, boolean obfuscated, String font) {
        this.rgb = rgb;
        this.bold = bold;
        this.italic = italic;
        this.underlined = underlined;
        this.strikethrough = strikethrough;
        this.obfuscated = obfuscated;
        this.font = font;
    }

    public int getRgb() {
        return rgb;
    }

    public boolean isBold() {
        return bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public boolean isUnderlined() {
        return underlined;
    }

    public boolean isStrikethrough() {
        return strikethrough;
    }

    public boolean isObfuscated() {
        return obfuscated;
    }

    public String getFont() {
        return font;
    }

    public static class Builder {
        private int rgb;
        private boolean bold;
        private boolean italic;
        private boolean underlined;
        private boolean strikethrough;
        private boolean obfuscated;
        private String font;

        public Builder rgb(int rgb) {
            this.rgb = rgb;
            return this;
        }

        public Builder bold() {
            this.bold = true;
            return this;
        }

        public Builder italic() {
            this.italic = true;
            return this;
        }

        public Builder underlined() {
            this.underlined = true;
            return this;
        }

        public Builder strikethrough() {
            this.strikethrough = true;
            return this;
        }

        public Builder obfuscated() {
            this.obfuscated = true;
            return this;
        }

        public Builder font(String font) {
            this.font = font;
            return this;
        }

        public Style build() {
            return new Style(rgb, bold, italic, underlined, strikethrough, obfuscated, font);
        }
    }
}
