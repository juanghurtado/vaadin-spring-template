package demo.app.ui.home;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

import demo.lib.ui.BaseView;
import demo.lib.utils.I18n;

@SpringComponent
public class SampleViewComponent extends BaseView {

    private static final long serialVersionUID = 1617496270603244516L;

    @Autowired
    private I18n messages;

    @PostConstruct
    private void init() {
        this.addStyleName(ValoTheme.PANEL_WELL);
        this.addComponent(new Label(i18n("SAMPLE_VIEW")));
    }

}
