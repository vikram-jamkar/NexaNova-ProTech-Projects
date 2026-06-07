package com.institute.timetable.service;

import com.institute.timetable.entity.Subject;
import java.util.List;

public interface SubjectService {

    Subject addSubject(Subject subject);

    List<Subject> getAllActiveSubjects();
}
