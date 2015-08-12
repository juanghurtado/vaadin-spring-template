package demo.app.ui;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;

import demo.app.navigation.Route;
import demo.lib.navigator.Navigator;

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
        setupNavigator();
    }

    // Public API
    // ------------------------------------------------------------------------
    /**
     * Returns current application UI instance
     *
     * @return the application UI instance
     */
    public static final AppUI getCurrentApp() {
        return (AppUI) UI.getCurrent();
    }

    // Private utils
    // ------------------------------------------------------------------------
    private void setupNavigator() {
        new Navigator(this, this, viewProvider, getNavigatorPaths());
    }

    private List<Route> getNavigatorPaths() {
        return Arrays.asList(Route.values());
    }

}