package org.syringe.api;

import org.syringe.api.text.Style;
import org.syringe.api.util.Position;

import java.util.UUID;

public interface API {
    void displayText(UUID uuid, String key, String text, Position position, Style style, float offset, long fadein, boolean shadow);
}
