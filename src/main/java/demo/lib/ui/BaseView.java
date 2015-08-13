package demo.lib.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

import demo.app.ui.AppUI;
import demo.lib.utils.I18n;

@UIScope
public class BaseView extends VerticalLayout {

    private static final long serialVersionUID = -6926863820248274083L;

    @Autowired
    private I18n messages;

    // Public API
    // ------------------------------------------------------------------------
    public String i18n(String key) {
        return messages.get(key);
    }

    public BaseView getBean(Class<? extends BaseView> requiredClass) {
        return AppUI.getCurrentApp().getAppContext().getBean(requiredClass);
    }

}
