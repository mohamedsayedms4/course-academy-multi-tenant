package org.example.multitenetcourse.application.serivce;

import org.example.multitenetcourse.domain.model.Subject;
import java.util.List;

/**
 * Service interface for managing {@link Subject} entities.
 * Defines the core business operations for Subject such as:
 * - retrieving all subjects
 * - retrieving a subject by ID
 * - adding a new subject
 *
 * Implementations of this interface should handle business logic
 * and delegate persistence tasks to the {@link org.example.multitenetcourse.domain.repository.SubjectRepository}.
 */
public interface SubjectService {

     /**
      * Retrieve all subjects from the database.
      *
      * @return list of all {@link Subject} entities
      */
     List<Subject> getAllSubjects();

     /**
      * Retrieve a subject by its unique ID.
      *
      * @param id the unique identifier of the subject
      * @return the found {@link Subject}
      * @throws org.example.multitenetcourse.domain.exception.SubjectNotFound if no subject is found
      */
     Subject getSubjectById(Long id);

     /**
      * Add a new subject to the database.
      *
      * @param subject the subject entity to persist
      * @return the saved {@link Subject} with generated ID
      */
     Subject addSubject(Subject subject);
}
