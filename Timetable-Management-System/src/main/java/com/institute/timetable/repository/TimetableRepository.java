package com.institute.timetable.repository;

import com.institute.timetable.entity.Timetable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {
	List<Timetable> findByBatchId(Long batchId);
	 List<Timetable> findByTeacherId(Long teacherId);
	 boolean existsByBatchIdAndDayAndTimeSlot(Long batchId,String day,String timeSlot);
}