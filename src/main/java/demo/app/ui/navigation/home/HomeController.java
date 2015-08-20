package demo.app.ui.navigation.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.spring.annotation.SpringComponent;

import demo.app.service.SampleService;
import demo.lib.ui.controller.BaseController;
import demo.lib.utils.Log;

@SpringComponent
@Scope("prototype")
public class HomeController extends BaseController {

    @Autowired
    private SampleService sampleService;

    // Public API
    // ------------------------------------------------------------------------
    public String getJuan() {
        try {
            String juan = sampleService.findByName("Juan").get(0).getName();
            Log.info(getClass(), juan);

            return juan;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}
