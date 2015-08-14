package demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.vaadin.spring.annotation.SpringComponent;

import demo.app.model.SampleDTO;
import demo.app.repository.SampleRepository;
import demo.lib.service.BaseService;
import demo.lib.utils.Log;

@SpringComponent
public class SampleService extends BaseService {

    @Autowired
    private SampleRepository sampleRepository;

    public void save(SampleDTO dto) {
        Log.info(getClass(), String.format("Saving SampleDTO: %s", dto));
        sampleRepository.save(dto);
    }

    public List<SampleDTO> findByName(String name) throws Exception {
        try {
            Log.info(getClass(), String.format("Finding SampleDTO with name: %s", name));
            return sampleRepository.findByName(name);
        } catch (DataAccessException e) {
            throw new Exception("Can't access data from datasource", e);
        }
    }

}
