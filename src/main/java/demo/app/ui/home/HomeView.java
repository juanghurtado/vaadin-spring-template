package demo.app.ui.home;

import com.vaadin.ui.Label;

import demo.lib.ui.NavigableView;

public class HomeView extends NavigableView {

    private static final long serialVersionUID = 5999378752344921622L;

    public HomeView() {
        this.addComponent(new Label(i18n("HOME_VIEW")));
    }

}
