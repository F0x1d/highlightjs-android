package com.pddstudio.highlightjs.models;

/**
 * This Class was created by Patrick J
 * on 09.06.16. For more Details and Licensing
 * have a look at the README.md
 */

public enum Theme {
    GOOGLECODE("googlecode"),
    DOGBIN_NIGHT_THEME("dogbin");

    private final String themeName;

    Theme(String themeName) {
        this.themeName = themeName;
    }

    public String getName() {
        return themeName;
    }

}
