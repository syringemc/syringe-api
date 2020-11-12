package org.syringe.api.text;

import org.syringe.api.SyringeAPI;
import org.syringe.api.util.Position;

import java.util.UUID;

public class TextBuilder {
    private final UUID uuid;
    private final String key;
    private final String text;
    private final Position position;
    private Style style = Style.EMPTY;
    private float offset;
    private long fadein;
    private boolean shadow;

    public TextBuilder(UUID uuid, String key, String text, Position position) {
        this.uuid = uuid;
        this.key = key;
        this.text = text;
        this.position = position;
    }

    public TextBuilder style(Style style) {
        this.style = style;
        return this;
    }

    public TextBuilder offset(float offset) {
        this.offset = offset;
        return this;
    }

    public TextBuilder fadein(long fadein) {
        this.fadein = fadein;
        return this;
    }

    public TextBuilder shadow() {
        this.shadow = true;
        return this;
    }

    public void display() {
        SyringeAPI.displayText(uuid, key, text, position, style, offset, fadein, shadow);
    }
}
