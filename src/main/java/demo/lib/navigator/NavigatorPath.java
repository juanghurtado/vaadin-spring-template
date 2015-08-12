package demo.lib.navigator;

import demo.lib.ui.NavigableView;

public interface NavigatorPath {

    /**
     * Returns the URL string for the given navigation path
     *
     * @return the URL path
     */
    public String getPath();

    /**
     * Returns the Vaadin view to be shown when navigating to this navigation
     * path
     *
     * @return the view to be shown
     */
    public Class<? extends NavigableView> getViewClass();

}
