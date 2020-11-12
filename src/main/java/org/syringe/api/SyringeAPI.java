package org.syringe.api;

public final class SyringeAPI {
    private static API instance;

    private SyringeAPI() {}

    static void init(API api) {
        instance = api;
    }
}