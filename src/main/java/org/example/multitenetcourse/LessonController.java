package org.example.multitenetcourse;

import lombok.RequiredArgsConstructor;
import org.example.multitenetcourse.application.serivce.LessonService;
import org.example.multitenetcourse.domain.model.Lesson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing lessons.
 */
@RestController
@RequestMapping("/api/v1/lessons")
@RequiredArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    /**
     * Retrieves all lessons.
     *
     * @return list of lessons with HTTP 200
     */
    @GetMapping("")
    private ResponseEntity<List<Lesson>> getAllLessons() {
        return new ResponseEntity<>(lessonService.getAllLessons(), HttpStatus.OK);
    }

    /**
     * Retrieves a lesson by ID.
     *
     * @param id the ID of the lesson
     * @return the lesson with HTTP 200
     */
    @GetMapping("/{id}")
    private ResponseEntity<Lesson> getLessonById(@PathVariable Long id) {
        return new ResponseEntity<>(lessonService.getLessonById(id), HttpStatus.OK);
    }

    /**
     * Creates a new lesson.
     *
     * @param lesson the lesson to create
     * @return the created lesson with HTTP 201
     */
    @PostMapping("")
    private ResponseEntity<Lesson> createLesson(@RequestBody Lesson lesson) {
        Lesson l = lessonService.saveLesson(lesson);
        return new ResponseEntity<>(l, HttpStatus.CREATED);
    }

    /**
     * Deletes a lesson by ID.
     *
     * @param id the ID of the lesson to delete
     * @return HTTP 204 (No Content)
     */
    @DeleteMapping("/{id}")
    private ResponseEntity<Lesson> deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
