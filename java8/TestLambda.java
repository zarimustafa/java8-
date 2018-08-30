package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class TestLambda {

	public static void main(String[] args) {
		
//		new Thread(()->System.out.println("Lambda used to implement Thread")).start();
//
//		new Thread(()->{System.out.println("no arguments");}).start();
//		int i = 2;
//		new Thread(()-> {System.out.println(i*i);}).start();
		
		  
        int ii = 10;
        int jj = 5;
         
        int sum = calculate(ii, jj, (i,j) -> {return (ii+jj);} );
        System.out.println("Sum:"+sum);
        int sub = calculate(ii, jj, (i,j) -> {return (ii-jj);} );
        System.out.println("Subtraction:"+sub);
        
        String msg = "mustafa";
        
        Print p = (msgg)->{System.out.println("Hi "+msgg);};
        p.print(msg);
        p.print("zee");
        
        p =  (msgg)->{System.out.println("Bye "+msgg);};
        p.print(msg);
        p.print("zee");
        
        
        Sayable s = ()->{System.out.println("nothing to say");};
        s.say();
        
        Operation add = (i,j)-> {return i+j;} ;
		Operation substract = (i, j) -> {
			if (i > j) {
				return i - j;
			} else {
				return j - i;
			}
		};
        Operation multiplicate = (i,j)-> {return i*j;} ;
        Operation divide = (i,j)-> {
//			if (i > j) {
				return i/j;
//			} else {
//				return j/i;
//			}
		} ;
        
        System.out.println(add.operation(20, 30));
        System.out.println(substract.operation(20, 30));
        System.out.println(multiplicate.operation(20, 30));
        System.out.println(divide.operation(20, 30));
        
        
        
        Integer[] arr  = {1,2,3,4,5,6,7,8,9,10};
       
       Arrays.asList(arr).forEach((e)->{System.out.println(e + " x " +e +"="+ e * e );});
       
       Operation summ= (i,j)->{
    	   int st = i<j?i:j;
    	   int gt = i>j?i:j;
    	   int total = 0;
    	   while(st < gt) {
    		   total += st;
    		   st++;
    	   }
    	   
    	   return total+gt;
       };
       
       
       System.out.println(summ.operation(1, 10));
       
       List<Integer> list = Arrays.asList(arr);
       Collections.sort(list, (p1,p2)->{ return p2.intValue()-p1.intValue();});
       list.forEach((e)->{System.out.println(e);});
    
//     Stream<Integer> stream  = list.stream().filter((e)->e<=5);
       list.stream().filter((e)->e>5).forEach((e)->System.out.println(e));
       
        
//        System.out.println(new BinaryOperator<Integer>((ii,jj)->{return ii*jj;}));
    }
     
    public static int calculate(int i, int j, BinaryOperator<Integer> bo){
         
        return bo.apply(i, j);
    }
    
    
    public static void print(String msg) {
    	System.out.println("hello world -> " + msg );
    }
    
    
    
}

interface Operation{
	int operation(int i, int j);
}

interface Print{
	void print(String msg);
}

interface Sayable{
	void say();
//	void tell();
}

