package org.syringe.api;

import org.syringe.api.text.Style;
import org.syringe.api.util.Position;

import java.util.UUID;

public final class SyringeAPI {
    private static API instance;

    private SyringeAPI() {}

    public static void init(API api) {
        instance = api;
    }

    public static void displayText(UUID uuid, String key, String text, Position position, Style style, float offset, long fadein, boolean shadow) {
        instance.displayText(uuid, key, text, position, style, offset, fadein, shadow);
    }
}