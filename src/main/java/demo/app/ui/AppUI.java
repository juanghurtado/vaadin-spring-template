package demo.app.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;

@Theme("sample-theme")
@SpringUI
public class AppUI extends UI {

    private static final long serialVersionUID = -913027416663935019L;

    @Autowired
    private SpringViewProvider viewProvider;

    // Overrides
    // ------------------------------------------------------------------------
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Navigator navigator = new Navigator(this, this);
        navigator.addProvider(viewProvider);
    }

    // Public API
    // ------------------------------------------------------------------------
    public static final AppUI getCurrentApp() {
        return (AppUI) UI.getCurrent();
    }

}