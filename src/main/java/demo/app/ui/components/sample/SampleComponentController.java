package demo.app.ui.components.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.spring.annotation.SpringComponent;

import demo.app.service.SampleService;
import demo.lib.ui.controller.BaseController;
import demo.lib.utils.Log;

@SpringComponent
@Scope("prototype")
public class SampleComponentController extends BaseController {

    @Autowired
    private SampleService sampleService;

    // Public API
    // ------------------------------------------------------------------------
    public String getTino() {
        try {
            String tino = sampleService.findByName("Tino").get(0).getName();
            Log.info(getClass(), tino);

            return tino;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}
