package demo.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.app.model.SampleDTO;
import demo.lib.repository.BaseRepository;

public interface SampleRepository extends BaseRepository, CrudRepository<SampleDTO, Long> {

    public List<SampleDTO> findByName(String name);

}