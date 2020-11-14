package org.syringe.api.util;

public final class Color {

    public static final Color BLACK = new Color(0);
    public static final Color DARK_BLUE = new Color(170);
    public static final Color DARK_GREEN = new Color(43520);
    public static final Color DARK_AQUA = new Color(43690);
    public static final Color DARK_RED = new Color(11141120);
    public static final Color DARK_PURPLE = new Color(11141290);
    public static final Color GOLD = new Color(16755200);
    public static final Color GRAY = new Color(11184810);
    public static final Color DARK_GRAY = new Color(5592405);
    public static final Color BLUE = new Color(5592575);
    public static final Color GREEN = new Color(5635925);
    public static final Color AQUA = new Color(5636095);
    public static final Color RED = new Color(16733525);
    public static final Color LIGHT_PURPLE = new Color(16733695);
    public static final Color YELLOW = new Color(16777045);
    public static final Color WHITE = new Color(16777215);

    private final int rgb;

    private Color(int rgb) {
        this.rgb = rgb;
    }

    public int getRgb() {
        return rgb;
    }

    public static Color fromRgb(int r, int g, int b) {
        int rgb = r;
        rgb = (rgb << 8) + g;
        rgb = (rgb << 8) + b;
        return new Color(rgb);
    }

    public static Color fromHex(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        return new Color(Integer.parseInt(hex, 16));
    }
}
