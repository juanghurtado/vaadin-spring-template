package demo.app.ui.components.sample;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

import demo.lib.ui.view.BaseView;
import demo.lib.ui.view.ViewActionListener;
import demo.lib.utils.Log;

@SpringComponent
@Scope("prototype")
public class SampleComponentView extends BaseView {

    private static final long serialVersionUID = 1617496270603244516L;

    @Autowired
    private SampleComponentController controller;

    private Label label;

    @Override
    @PostConstruct
    public void init() {
        this.addViewActionListener(new ViewActionListener() {

            @Override
            public void onViewAction(int actionId, BaseView view, Object obj) {
                Log.info(getClass(), String.format("Executing action [%d], triggered by [%s], recieving [%s]", actionId, view.toString(), obj.toString()));
            }
        });
    }

    @Override
    public void setupViewUI() {
        label = new Label(i18n("SAMPLE_VIEW") + " - " + controller.getTino());

        this.addStyleName(ValoTheme.PANEL_WELL);
        this.addComponent(label);
    }


}
