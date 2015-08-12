package demo.lib.navigator;

import java.util.List;

import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.UI;

public class Navigator extends com.vaadin.navigator.Navigator {

    private static final long serialVersionUID = 701965341367782734L;

    // Constructor
    // ------------------------------------------------------------------------
    /**
     * Creates a new Navigator instance.
     *
     * @param ui
     *            the application UI which will be managed by this Navigator
     * @param container
     *            the Vaadin container where the views will be shown
     * @param viewProvider
     *            the ViewProvider which will handle the views
     * @param paths
     *            the list of "paths-views" pairs to be attached to this
     *            Navigator
     */
    public Navigator(UI ui, SingleComponentContainer container, SpringViewProvider viewProvider, List<? extends NavigatorPath> paths) {
        super(ui, container);

        this.addProvider(viewProvider);

        for (NavigatorPath path : paths) {
            this.addView(path.getPath(), path.getViewClass());
        }
    }

}