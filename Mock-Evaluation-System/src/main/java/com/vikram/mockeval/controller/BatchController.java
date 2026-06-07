package com.vikram.mockeval.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vikram.mockeval.entity.Batch;
import com.vikram.mockeval.service.BatchService;
@CrossOrigin
@RestController
@RequestMapping("/batches")
public class BatchController {
	@Autowired
	private BatchService service;
 //private BatchService service = new BatchService();  me khud object bana raha tha
 
 //add batch (post)
 @PostMapping
 public String addBaatch(@RequestBody Batch batch )
 {
	 service.addBatch(batch);//yaha se data srice me gaya controller - service 
	 return "batch added succesfully";
 }
 
 @PutMapping("/{id}")
 public String updateBatch(@PathVariable Long id, @RequestBody Batch batch) {
service.updateBatch(id,batch);
return "Batch updated";
	 
 }
 @DeleteMapping("/{id}")
 public String  deleteBatch(@PathVariable Long id) {
	 
	 return service.deletebatch(id);
 }
 @GetMapping
 public List <Batch> getAllBatches(){
	 return service.getAllBatches();// yaha se data service aya  serice ==controller
 }
 
 
}
