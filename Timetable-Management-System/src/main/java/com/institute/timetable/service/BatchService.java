package com.institute.timetable.service;

import com.institute.timetable.entity.Batch;
import java.util.List;

public interface BatchService {

    Batch saveBatch(Batch batch);

    List<Batch> getAllBatches();
}