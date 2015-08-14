package demo.app.ui.home;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;

import demo.lib.ui.NavigableView;

@UIScope
@SpringView(name = "")
public class HomeView extends NavigableView {

    private static final long serialVersionUID = 5999378752344921622L;

    @Autowired
    private HomeController controller;

    @PostConstruct
    void init() {
        SampleViewComponent view = getAppContext().getBean(SampleViewComponent.class);

        controller.getJuan();

        this.addComponent(new Label(i18n("HOME_VIEW")));
        this.addComponent(view);
    }

}
