package demo.lib.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.ui.VerticalLayout;

import demo.lib.utils.i18n;

public class BaseView extends VerticalLayout {

    private static final long serialVersionUID = -6926863820248274083L;

    @Autowired
    private i18n i18n;

    // Public API
    // ------------------------------------------------------------------------
    public String i18n(String key) {
        return i18n.get(key);
    }

}
