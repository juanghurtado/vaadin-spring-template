package demo.lib.ui.view;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.ui.VerticalLayout;

import demo.lib.utils.I18n;

public class BaseView extends VerticalLayout {

    private static final long serialVersionUID = -6926863820248274083L;

    @Autowired
    private I18n i18n;

    // Public API
    // ------------------------------------------------------------------------
    /**
     * Initialization method executed at the moment this class is instantiated
     * by Spring dependency injector
     */
    public void init() {
        // Not implemented
    }

    /**
     * Performs the required actions to setup the view UI
     */
    public void setupViewUI() {
        // Not implemented
    }

    /**
     * Get the localized string for the given key
     *
     * @return the localized string
     */
    public String i18n(String key) {
        return i18n.get(key);
    }

}
