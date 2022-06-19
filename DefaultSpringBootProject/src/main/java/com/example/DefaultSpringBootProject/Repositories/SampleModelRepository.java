package com.example.DefaultSpringBootProject.Repositories;

import com.example.DefaultSpringBootProject.Models.SampleModel;
import com.example.DefaultSpringBootProject.Models.SampleModelChild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SampleModelRepository extends JpaRepository<SampleModel, Long> {

    @Query("SELECT s.sampleModelChildSet FROM SampleModel s where s.sampleModel_id = :sampleModel_id")
    public List<SampleModelChild> getSampleModelSampleModelChilds(Long sampleModel_id);

}
