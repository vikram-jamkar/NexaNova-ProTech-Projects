package com.institute.timetable.controller;
import com.institute.timetable.entity.Batch;
import com.institute.timetable.service.BatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/batches")
public class BatchController {

    private final BatchService batchService;

    public BatchController(BatchService batchService) {
        this.batchService = batchService;
    }

    @PostMapping
    public Batch createBatch(@RequestBody Batch batch) {
        return batchService.saveBatch(batch);
    }

    @GetMapping
    public List<Batch> getAllBatches() {
        return batchService.getAllBatches();
    }
}