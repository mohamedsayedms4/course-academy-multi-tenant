package org.example.multitenetcourse.application.serivce;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.multitenetcourse.domain.exception.SubjectNotFound;
import org.example.multitenetcourse.domain.model.Subject;
import org.example.multitenetcourse.domain.repository.SubjectRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementation of {@link SubjectService}.
 *
 * This class provides the business logic for managing subjects.
 * It interacts with the {@link SubjectRepository} to perform CRUD operations.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id)
                .orElseThrow(() -> new SubjectNotFound("Subject not found with id: " + id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
}
