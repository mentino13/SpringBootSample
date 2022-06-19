package com.example.DefaultSpringBootProject.Controllers;

import com.example.DefaultSpringBootProject.Models.SampleModel;
import com.example.DefaultSpringBootProject.Models.SampleModelChild;
import com.example.DefaultSpringBootProject.Services.SampleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/samplemodels")
public class SampleModelController {

    @Autowired
    private SampleModelService sampleModelService;

    // CREATE:
    // Add New SampleModel:
    @PostMapping("/add_samplemodel")
    private SampleModel saveNewUser(@RequestBody SampleModel sampleModel) {
        return sampleModelService.createSampleModel(sampleModel);
    }

    // READ:
    // Get SampleModel by Id:
    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<SampleModel>> getUser(@PathVariable("id") Long id) {
        return ResponseEntity.ok(sampleModelService.getSampleModel(id));
    }

    // Get list of all SampleModels:
    @GetMapping("/all")
    private ResponseEntity<List<SampleModel>> listAllUsers() {
        return ResponseEntity.ok(sampleModelService.getAllSampleModels());
    }

    // Get User SampleModelChilds:
    @GetMapping("/samplemodelchids/{id}")
    private List<SampleModelChild> listSampleModelSampleModelChilds(@PathVariable("id") Long id) {
        return sampleModelService.getSampleModelSampleModelChilds(id);
    }

    // UPDATE:


    // DELETE:
    // Delete SampleModel:
    @DeleteMapping
    private ResponseEntity<Void> deleteSampleModel(@RequestBody SampleModel sampleModel) {
        sampleModelService.deleteSampleModel(sampleModel);
        return ResponseEntity.ok().build();
    }


}
