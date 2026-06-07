package com.institute.timetable.controller;

import com.institute.timetable.entity.Timetable;
import com.institute.timetable.service.TimetableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timetable")
public class TimetableController {

    private final TimetableService timetableService;

    public TimetableController(TimetableService timetableService) {
        this.timetableService = timetableService;
    }

    @PostMapping
    public Timetable createTimetable(@RequestBody Timetable timetable) {
        return timetableService.saveTimetable(timetable);
    }

    @GetMapping
    public List<Timetable> getAllTimetables() {
        return timetableService.getAllTimetables();
    }

    @GetMapping("/batch/{id}")
    public List<Timetable> getByBatch(@PathVariable Long id) {
        return timetableService.getTimetableByBatch(id);
    }

    @GetMapping("/teacher/{id}")
    public List<Timetable> getByTeacher(@PathVariable Long id) {
        return timetableService.getTimetableByTeacher(id);
    }
    // ⭐ ADD THIS METHOD
    @DeleteMapping("/{id}")
    public void deleteTimetable(@PathVariable Long id) {
        timetableService.deleteTimetable(id);
    }
}