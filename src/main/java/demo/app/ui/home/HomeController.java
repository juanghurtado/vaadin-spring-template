package demo.app.ui.home;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringComponent;

import demo.app.model.SampleDTO;
import demo.app.service.SampleService;
import demo.lib.ui.BaseController;
import demo.lib.utils.Log;

@SpringComponent
public class HomeController extends BaseController {

    @Autowired
    private SampleService sampleService;

    // Public API
    // ------------------------------------------------------------------------
    public void getJuan() {
        sampleService.save(new SampleDTO("Juan"));
        sampleService.save(new SampleDTO("José"));
        sampleService.save(new SampleDTO("Pepe"));
        sampleService.save(new SampleDTO("Antonio"));
        sampleService.save(new SampleDTO("Tino"));

        try {
            Log.info(getClass(), sampleService.findByName("Juan").get(0).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
