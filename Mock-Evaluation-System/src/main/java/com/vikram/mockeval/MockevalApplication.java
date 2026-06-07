package com.vikram.mockeval;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class MockevalApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(MockevalApplication.class, args);

        //BatchService service = new BatchService();

       // Batch b1 = new Batch(1, "Java Batch", LocalDate.now(), LocalDate.now().plusMonths(3));
       // Batch b2 = new Batch(2, "Python Batch", LocalDate.now(), LocalDate.now().plusMonths(2));

        // add
       // service.addBatch(b1);
       // service.addBatch(b2);

        // fetch
      //  List<Batch> list = service.getAllBatches();

        // print
       // for (Batch b : list) {
       //     System.out.println(b.getName());
      //  }

    }}