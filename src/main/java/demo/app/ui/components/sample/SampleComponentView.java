package demo.app.ui.components.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

import demo.lib.ui.view.BaseView;

@SpringComponent
@Scope("prototype")
public class SampleComponentView extends BaseView {

    private static final long serialVersionUID = 1617496270603244516L;

    @Autowired
    private SampleComponentController controller;

    private Label label;

    @Override
    public void setupViewUI() {
        label = new Label(i18n("SAMPLE_VIEW") + " - " + controller.getTino());

        this.addStyleName(ValoTheme.PANEL_WELL);
        this.addComponent(label);
    }


}
