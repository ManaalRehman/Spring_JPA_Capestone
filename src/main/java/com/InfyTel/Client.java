package com.InfyTel;
import com.InfyTel.domain.Customer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;
import com.InfyTel.dto.CustomerDTO;
import com.InfyTel.dto.PlanDTO;
import com.InfyTel.service.CustomerService;

import java.util.List;

//@SpringBootApplication
public class Client implements CommandLineRunner {
    @Autowired
    AbstractApplicationContext context;
    static Logger logger = Logger.getLogger(Client.class);

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        CustomerService customerService = (CustomerService)context.getBean("customerService");
/*
        PlanDTO plan1 = new PlanDTO(1,"INFY_60",60,60);
        CustomerDTO customer1= new CustomerDTO(8009009010L, "Mary", 27, 'F', "Colorado","INFY", plan1);

        customerService.insertCustomer(customer1);
        logger.info("Records are successfully added..");



        Long phoneNo=8009009009L;
        String newCurrentPlan= "INFY000000";
        PlanDTO plan2=new PlanDTO(1,"INFY_100",100,120);
        CustomerDTO customer2= new CustomerDTO();
        customer2.setPhoneNumber(phoneNo);
        customer2.setAddress("Colorado");
        customer2.setAge(27);
        customer2.setGender('F');
        customer2.setName("Mary");
        customer2.setCurrentPlan(newCurrentPlan);
        customer2.setPlan(plan2);

        try {
            // Method to update customer plane name and Plan table
            customerService.updateCustomer(customer2);
            logger.info("Success : Both Customer and Plan details updated successfully!");
        } catch (DataAccessException exp) {

            logger.error("ERROR : "+exp.getMessage());
            logger.error(exp.getMessage(),exp);
        }
        finally
        {
            context.close();
        }


*/
        CustomerDTO customer1 = new CustomerDTO(7022713754L, "Adam", 27, 'M', "Chicago", 1);
        CustomerDTO customer2 = new CustomerDTO(7022713744L, "Susan", 25, 'F', "Alberta", 2);
        CustomerDTO customer3 = new CustomerDTO(7022713745L, "Andrew", 27, 'M', "Chicago", 2);
        // invoke service layer method to insert Customer
        customerService.insertCustomer(customer1);
        customerService.insertCustomer(customer2);
        customerService.insertCustomer(customer3);

        List<Customer> cus1 = customerService.searchCustomer(null, null, 'F', null);
        logger.info(cus1);

        List<Customer> cus2 = customerService.searchCustomer("Adam", null, 'M', null);
        logger.info(cus2);

        List<Customer> cus3 = customerService.searchCustomer(null, null,null , 27);
        logger.info(cus3);

        List<Customer> cus4 = customerService.searchCustomer("Susan","Alberta",null, null);
        logger.info(cus4);

    }

}

