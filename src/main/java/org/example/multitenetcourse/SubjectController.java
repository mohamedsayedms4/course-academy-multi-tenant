package org.example.multitenetcourse;

import lombok.RequiredArgsConstructor;
import org.example.multitenetcourse.application.serivce.SubjectService;
import org.example.multitenetcourse.domain.model.Subject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

/**
 * REST controller for managing {@link Subject} resources.
 *
 * Provides endpoints for:
 * - Retrieving all subjects
 * - Retrieving a subject by ID
 * - Creating a new subject
 *
 * Base path: /api/v1/subject
 */
@RestController
@RequestMapping("/api/v1/subject")
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectService subjectService;

    /**
     * Get all subjects.
     *
     * @return {@link ResponseEntity} containing the list of subjects
     */
    @GetMapping("")
    private ResponseEntity<List<Subject>> getAllSubjects() {
        return ResponseEntity.ok(subjectService.getAllSubjects());
    }

    /**
     * Create a new subject.
     *
     * @param subject the subject payload from request body
     * @return {@link ResponseEntity} with created status, Location header, and saved subject
     */
    @PostMapping("")
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        Subject savedSubject = subjectService.addSubject(subject);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedSubject.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedSubject);
    }

    /**
     * Get a subject by ID.
     *
     * @param id the subject ID
     * @return {@link ResponseEntity} containing the subject if found
     */
    @GetMapping("/{id}")
    private ResponseEntity<Subject> getSubject(@PathVariable Long id) {
        return ResponseEntity.ok(subjectService.getSubjectById(id));
    }
}
