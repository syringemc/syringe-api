package org.syringe.api;

public interface API {
    default void init() {
        SyringeAPI.init(this);
    }
}
