package com.institute.timetable.service;

import com.institute.timetable.entity.Timetable;
import com.institute.timetable.repository.TimetableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableServiceImpl implements TimetableService {

    private final TimetableRepository timetableRepository;

    public TimetableServiceImpl(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    @Override
    public Timetable saveTimetable(Timetable timetable) {

        boolean exists = timetableRepository
                .existsByBatchIdAndDayAndTimeSlot(
                        timetable.getBatch().getId(),
                        timetable.getDay(),
                        timetable.getTimeSlot()
                );

        if (exists) {
            throw new RuntimeException("Timetable already exists for this slot");
        }

        return timetableRepository.save(timetable);
    }

    @Override
    public List<Timetable> getAllTimetables() {
        return timetableRepository.findAll();
    }

    @Override
    public List<Timetable> getTimetableByBatch(Long batchId) {
        return timetableRepository.findByBatchId(batchId);
    }

    @Override
    public List<Timetable> getTimetableByTeacher(Long teacherId) {
        return timetableRepository.findByTeacherId(teacherId);
    }

    @Override
    public void deleteTimetable(Long id) {
        timetableRepository.deleteById(id);
    }
}