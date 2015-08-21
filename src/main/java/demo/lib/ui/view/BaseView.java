package demo.lib.ui.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.ui.VerticalLayout;

import demo.lib.utils.I18n;

public class BaseView extends VerticalLayout {

    private static final long serialVersionUID = -6926863820248274083L;

    private transient List<ViewActionListener> viewActionListeners = new ArrayList<ViewActionListener>();

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

    /**
     * Adds an action listener to this view
     *
     * @param viewActionListener
     *            the action listener to be added to this view
     */
    public void addViewActionListener(ViewActionListener viewActionListener) {
        this.viewActionListeners.add(viewActionListener);
    }

    /**
     * Sends an action to be executed on any view listener of this view
     *
     * @param actionId
     *            the ID of the action to be executed
     * @param view
     *            the view which sent the action
     * @param obj
     *            an object with information to be used within the action
     */
    public void sendAction(int actionId, BaseView view, Object item) {
        for (ViewActionListener listener : viewActionListeners) {
            listener.onViewAction(actionId, view, item);
        }
    }

}
