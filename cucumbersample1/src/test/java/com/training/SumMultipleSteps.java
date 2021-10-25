package com.training;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java8.En;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SumMultipleSteps implements En {

   public SumMultipleSteps(){
       List<Integer> inputs =  new ArrayList<>();
       AtomicInteger sum =  new AtomicInteger(0);
       Given("user executes sum function on arrays:", (DataTable dataTable) -> {
           List<Integer> numbers = dataTable.asList(Integer.class);
           for(Integer num: numbers){
               inputs.add(num);
           }
       });

       When("user executes sum function on arrays",()->{
                for(Integer no: inputs){
                    sum.set(sum.get()+no);
                }
       });
       Then("the sum of arrays is {int}",(Integer result)->{
           Assert.assertEquals(new Integer(sum.get()),result);
       });
   }



}
