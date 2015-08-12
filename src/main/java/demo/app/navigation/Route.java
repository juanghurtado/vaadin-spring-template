package demo.app.navigation;

import demo.app.ui.home.HomeView;
import demo.lib.navigator.NavigatorPath;
import demo.lib.ui.NavigableView;

public enum Route implements NavigatorPath {

    // Instances
    // ------------------------------------------------------------------------

    // @formatter:off
    HOME("", HomeView.class);
    // @formatter:on

    private final String path;
    private final Class<? extends NavigableView> viewClass;

    // Constructor
    // ------------------------------------------------------------------------
    private Route(String path, Class<? extends NavigableView> viewClass) {
        this.path = path;
        this.viewClass = viewClass;
    }

    // Public API
    // ------------------------------------------------------------------------
    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Class<? extends NavigableView> getViewClass() {
        return viewClass;
    }

}
