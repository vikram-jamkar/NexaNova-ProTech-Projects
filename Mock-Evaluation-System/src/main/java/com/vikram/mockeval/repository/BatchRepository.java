package com.vikram.mockeval.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.mockeval.entity.Batch;

public interface BatchRepository extends JpaRepository<Batch,Long>{

    // storage (temporary database)
    //private List<Batch> batchList = new ArrayList<>();

    // SAVE (data dalna)
   // public void save(Batch batch) {
       // batchList.add(batch);
   // }

    // FETCH (data nikalna)
   // public List<Batch> findAll() {
       // return batchList;
    }
