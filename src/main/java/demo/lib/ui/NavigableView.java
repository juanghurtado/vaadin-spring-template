package demo.lib.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public abstract class NavigableView extends BaseView implements View {

    private static final long serialVersionUID = -6926863820248274083L;

    // Overrides
    // ------------------------------------------------------------------------
    @Override
    public void enter(ViewChangeEvent event) {
        // Not implemented
    }

}
