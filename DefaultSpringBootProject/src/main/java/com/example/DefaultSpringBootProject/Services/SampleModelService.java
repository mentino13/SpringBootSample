package com.example.DefaultSpringBootProject.Services;

import com.example.DefaultSpringBootProject.Models.SampleModel;
import com.example.DefaultSpringBootProject.Models.SampleModelChild;
import com.example.DefaultSpringBootProject.Repositories.SampleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleModelService {
    @Autowired
    private SampleModelRepository sampleModelRepository;

    // CREATE:
    // Create new SampleModel:
    public SampleModel createSampleModel(SampleModel sampleModel) {
        return sampleModelRepository.save(sampleModel);
    }


    // READ:
    // Get single SampleModel:
    public Optional<SampleModel> getSampleModel(Long userId) {
        return sampleModelRepository.findById(userId);
    }

    // Get all SampleModels:
    public List<SampleModel> getAllSampleModels() {
        return sampleModelRepository.findAll();
    }

    // Get user SampleModelChilds:
    public List<SampleModelChild> getSampleModelSampleModelChilds(Long sampleModel_id) {
        return sampleModelRepository.getSampleModelSampleModelChilds(sampleModel_id);
    }


    // UPDATE:


    // DELETE:
    // Delete SampleModel:
    public void deleteSampleModel(SampleModel sampleModel) {
        sampleModelRepository.delete(sampleModel);
    }
}
