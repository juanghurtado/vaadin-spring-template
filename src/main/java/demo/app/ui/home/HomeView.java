package demo.app.ui.home;

import javax.annotation.PostConstruct;

import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;

import demo.lib.ui.NavigableView;

@UIScope
@SpringView(name = "")
public class HomeView extends NavigableView {

    private static final long serialVersionUID = 5999378752344921622L;

    @PostConstruct
    void init() {
        SampleViewComponent view = (SampleViewComponent) getBean(SampleViewComponent.class);

        this.addComponent(new Label(i18n("HOME_VIEW")));
        this.addComponent(view);
    }

}
