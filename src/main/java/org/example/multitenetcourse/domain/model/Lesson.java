package org.example.multitenetcourse.domain.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String image;

    private String pdfUrl ;

    private String videoUrl;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    @JsonBackReference
    private Subject subject;


}
