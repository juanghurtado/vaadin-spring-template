package demo.lib.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;

import demo.lib.utils.I18n;

public abstract class BaseController {

    @Autowired
    private I18n i18n;

    // Public API
    // ------------------------------------------------------------------------
    /**
     * Get the localized string for the given key
     *
     * @return the localized string
     */
    public String i18n(String key) {
        return i18n.get(key);
    }

}