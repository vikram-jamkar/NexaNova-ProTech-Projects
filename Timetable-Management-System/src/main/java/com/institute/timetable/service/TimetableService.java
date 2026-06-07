package com.institute.timetable.service;

import com.institute.timetable.entity.Timetable;
import java.util.List;

public interface TimetableService {

    Timetable saveTimetable(Timetable timetable);

    List<Timetable> getAllTimetables();

    List<Timetable> getTimetableByBatch(Long batchId);

    List<Timetable> getTimetableByTeacher(Long teacherId);

    void deleteTimetable(Long id);

}