package org.example.multitenetcourse.application.serivce;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.multitenetcourse.domain.model.Lesson;
import org.example.multitenetcourse.domain.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link LessonService} for managing lessons.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Lesson getLessonById(Long id) {
        return lessonRepository.findById(id).orElse(null);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Lesson saveLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteLesson(Long id) {
        Lesson lesson = lessonRepository.findById(id).orElse(null);
        lessonRepository.delete(lesson);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isLessonExist(Long id) {
        return lessonRepository.existsById(id);
    }
}
