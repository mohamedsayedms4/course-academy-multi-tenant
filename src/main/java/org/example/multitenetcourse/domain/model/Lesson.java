package org.example.multitenetcourse.domain.model;


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
    private Subject subject;


}
