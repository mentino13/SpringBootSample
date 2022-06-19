package com.example.DefaultSpringBootProject.Models;

import javax.persistence.*;

@Entity(name = "SampleModelChild")
@Table(name = "SampleModelChilds")
public class SampleModelChild {

    // ATTRIBUTES:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "sampleModelChild_id",
            nullable = false,
            updatable = false
    )
    private Long sampleModelChild_id;


    // User Name:
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    // SampleModel ManyToOne
    @ManyToOne
    @JoinColumn(name = "SampleModel")
    private SampleModel sampleModelParent;


    // CONSTRUCTORS:
    public SampleModelChild() {

    }

    public SampleModelChild(Long sampleModelChild_id, String name) {
        this.sampleModelChild_id = sampleModelChild_id;
        this.name = name;
    }

    // GETTERS & SETTERS:
    public Long getSampleModelChild_id() {
        return sampleModelChild_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
