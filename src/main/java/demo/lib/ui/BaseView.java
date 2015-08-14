package demo.lib.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

import demo.app.ui.AppUI;
import demo.lib.utils.I18n;

@UIScope
public class BaseView extends VerticalLayout {

    private static final long serialVersionUID = -6926863820248274083L;

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

    /**
     * Returns current application context
     *
     * @return the application context
     */
    public ApplicationContext getAppContext() {
        return AppUI.getCurrentApp().getAppContext();
    }

}
