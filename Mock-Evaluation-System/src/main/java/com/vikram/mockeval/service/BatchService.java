package com.vikram.mockeval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.mockeval.entity.Batch;
import com.vikram.mockeval.repository.BatchRepository;
@Service
public class BatchService {

	@Autowired
	private BatchRepository repo;
	
	
    // Repository object
   // private BatchRepository repo = new BatchRepository();

    // ADD (batch add करना)
    public void addBatch(Batch batch) {
        repo.save(batch);
    }
    
    
    public Batch updateBatch(Long id, Batch batch) {

        Batch existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(batch.getName());
            existing.setStartDate(batch.getStartDate());
            existing.setEndDate(batch.getEndDate());

            return repo.save(existing);
        }

        return null;
    }

    
    
    public String deletebatch(Long id) {
    	
    	if(repo.existsById(id)) {
    		
    		repo.deleteById(id);
    		return"Batch deleted";
    	}
		return "Batch not Found";
    }
    // FETCH (सारे batch लेना)
    public List<Batch> getAllBatches() {
        return repo.findAll();
    }
}