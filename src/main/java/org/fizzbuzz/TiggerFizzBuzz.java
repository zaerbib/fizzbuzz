package org.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.fizzbuzz.model.Buzz5;
import org.fizzbuzz.model.Fizz3;

/**
 * Hello world!
 *
 */
public class TiggerFizzBuzz 
{
    public static void main( String[] args ) {
        lauchFizzBuzz();
    }
    
    public static void lauchFizzBuzz() {
    	List<Integer> list = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        list.forEach(item -> {
        	if(new Fizz3(item).isFizz()) {
        		
        		System.out.println("fizz"); 
        	}
        	if(new Buzz5(item).isBuzz()) {
        		System.out.println("buzz");
        	}
        	if(!new Fizz3(item).isFizz() && !new Buzz5(item).isBuzz()) {
        		System.out.println(item);
        	}        	
        });
    }
}
