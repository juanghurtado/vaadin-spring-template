package demo.app.ui.navigation.home;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;

import demo.app.constants.ViewActions;
import demo.app.ui.components.sample.SampleComponentView;
import demo.lib.ui.view.NavigableView;

@UIScope
@SpringView(name = "")
public class HomeView extends NavigableView {

    private static final long serialVersionUID = 5999378752344921622L;

    @Autowired
    private HomeController controller;

    @Autowired
    private SampleComponentView sampleViewComponent;

    @Override
    @PostConstruct
    public void init() {
        sampleViewComponent.setupViewUI();
        this.setupViewUI();
    }

    @Override
    public void setupViewUI() {
        sampleViewComponent.sendAction(ViewActions.SAMPLE_ACTION, this, new Object());

        this.addComponent(new Label(i18n("HOME_VIEW") + " - " + controller.getJuan()));
        this.addComponent(sampleViewComponent);

        this.setMargin(true);
        this.setSpacing(true);
    }

}
