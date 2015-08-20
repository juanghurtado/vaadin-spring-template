package demo.app.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;

import demo.app.model.SampleDTO;
import demo.app.service.SampleService;

@Theme("sample-theme")
@SpringUI
public class AppUI extends UI {

    private static final long serialVersionUID = -913027416663935019L;

    @Autowired
    private SpringViewProvider viewProvider;

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private SampleService sampleService;

    // Overrides
    // ------------------------------------------------------------------------
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupNavigator();

        sampleService.save(new SampleDTO("Juan"));
        sampleService.save(new SampleDTO("José"));
        sampleService.save(new SampleDTO("Pepe"));
        sampleService.save(new SampleDTO("Antonio"));
        sampleService.save(new SampleDTO("Tino"));
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

    /**
     * Returns current application context
     *
     * @return the application context
     */
    public final ApplicationContext getAppContext() {
        return appContext;
    }

    // Private utils
    // ------------------------------------------------------------------------
    private void setupNavigator() {
        Navigator navigator = new Navigator(this, this);
        navigator.addProvider(viewProvider);
    }

}