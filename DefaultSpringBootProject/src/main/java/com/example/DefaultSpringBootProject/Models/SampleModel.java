package com.example.DefaultSpringBootProject.Models;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "SampleModel")
@Table(name = "SampleModels")
public class SampleModel {
    // ATTRIBUTES:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "samplemodel_id",
            nullable = false,
            updatable = false
    )
    private Long sampleModel_id;

    // User Name:
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    // SampleManyToOneEntities set:
    // One SampleModel will have many SampleManyToOneEntities.
    @OneToMany(targetEntity = SampleModelChild.class, mappedBy = "sampleModelParent")
    private Set<SampleModelChild> sampleModelChildSet;


    // CONSTRUCTORS:
    public SampleModel() {

    }

    public SampleModel(
            String name
    ) {
        this.name = name;
    }

    public Long getId() {
        return sampleModel_id;
    }

    public String getName() {
        return name;
    }


}
