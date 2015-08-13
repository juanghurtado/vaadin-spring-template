package demo.lib.ui;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import demo.lib.utils.I18n;

public abstract class BaseController<T extends BaseView> implements Serializable {

    private static final long serialVersionUID = -5106499046851317230L;

    private T view;

    @Autowired
    private I18n i18n;

    // Constructor
    // ------------------------------------------------------------------------
    public BaseController() {
        // Not implemented
    }

    public BaseController(T view) {
        setView(view);
    }

    // Public API
    // ------------------------------------------------------------------------
    /**
     * Get the view handled by this controller
     *
     * @return the handled view
     */
    public T getView() {
        return view;
    }

    /**
     * Set the view handled by this controller
     *
     * @param view
     *            the view to be handled
     */
    public void setView(T view) {
        this.view = view;
    }

    /**
     * Get the localized string for the given key
     *
     * @return the localized string
     */
    public String i18n(String key) {
        return getView().i18n(key);
    }

}