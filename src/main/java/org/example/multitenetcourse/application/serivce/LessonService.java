package org.example.multitenetcourse.application.serivce;

import org.example.multitenetcourse.domain.model.Lesson;

import java.util.List;

/**
 * Service interface for managing lessons.
 */
public interface LessonService {

    /**
     * Retrieves all lessons from the database.
     *
     * @return a list of lessons
     */
    List<Lesson> getAllLessons();

    /**
     * Retrieves a lesson by its unique identifier.
     *
     * @param id the ID of the lesson
     * @return the lesson if found, otherwise null
     */
    Lesson getLessonById(Long id);

    /**
     * Saves a new lesson or updates an existing one.
     *
     * @param lesson the lesson entity to save
     * @return the saved lesson entity
     */
    Lesson saveLesson(Lesson lesson);

    /**
     * Deletes a lesson by its unique identifier.
     *
     * @param id the ID of the lesson to delete
     */
    void deleteLesson(Long id);

    /**
     * Checks if a lesson exists in the database by ID.
     *
     * @param id the ID of the lesson
     * @return true if lesson exists, otherwise false
     */
    boolean isLessonExist(Long id);

}
