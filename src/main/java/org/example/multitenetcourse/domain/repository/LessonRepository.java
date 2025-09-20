package org.example.multitenetcourse.domain.repository;

import org.example.multitenetcourse.domain.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing lesson data.
 */
@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
