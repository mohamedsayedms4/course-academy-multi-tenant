package org.example.multitenetcourse.domain.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.example.multitenetcourse.domain.model.constant.AcademicYear;
import org.example.multitenetcourse.domain.model.constant.SubjectConstant;
import org.example.multitenetcourse.domain.model.constant.Term;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subjects")
@Data

public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true )
    private String  code ;

    @Enumerated
    private AcademicYear academicYear;

    @Enumerated
    private SubjectConstant subject;

    @Enumerated
    private Term term;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Lesson> lessons = new ArrayList<>();



}
