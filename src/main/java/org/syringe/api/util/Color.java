package org.syringe.api.util;

public final class Color {

    public static final int BLACK = 0;
    public static final int DARK_BLUE = 170;
    public static final int DARK_GREEN = 43520;
    public static final int DARK_AQUA = 43690;
    public static final int DARK_RED = 11141120;
    public static final int DARK_PURPLE = 11141290;
    public static final int GOLD = 16755200;
    public static final int GRAY = 11184810;
    public static final int DARK_GRAY = 5592405;
    public static final int BLUE = 5592575;
    public static final int GREEN = 5635925;
    public static final int AQUA = 5636095;
    public static final int RED = 16733525;
    public static final int LIGHT_PURPLE = 16733695;
    public static final int YELLOW = 16777045;
    public static final int WHITE = 16777215;

    private Color() {
    }

    public static int fromRgb(int r, int g, int b) {
        int rgb = r;
        rgb = (rgb << 8) + g;
        rgb = (rgb << 8) + b;
        return rgb;
    }

    public static int fromHex(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        return Integer.parseInt(hex, 16);
    }
}
