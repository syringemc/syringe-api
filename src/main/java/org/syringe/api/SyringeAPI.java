package org.syringe.api;

import org.syringe.api.text.Style;
import org.syringe.api.util.Position;

import java.util.UUID;

public final class SyringeAPI {
    public static final String NAMESPACE = "syringe";

    private static API instance;

    private SyringeAPI() {}

    public static void init(API api) {
        instance = api;
    }

    public static void displayText(UUID uuid, String key, String text, Position position, Style style, float offsetX, float offsetY, float scale, long fadein, boolean shadow) {
        instance.displayText(uuid, key, text, position, style, offsetX, offsetY, scale, fadein, shadow);
    }
}