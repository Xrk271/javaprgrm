package com.dal.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*Runnable r = new MyTaskThread();
		 Thread thread = new Thread(r);
		 thread.start();
         */
		
		 /*Runnable r = () -> {
		     Task task = new Task();
	         task.connect();
           };  
           
			 Thread t1 = new Thread(r);
			 t1.start();
	    */  
		
		
		 /* new Thread(()-> {
			
			 new Task().connect();
		  }).start();
		 */  
		
		// new Thread(new Task()::connect).start();
		
		
		 User u1 = new User(11,"Nilima","nilima@gmail.com"); User u2 = new
		 User(12,"Praveen","prav@gmail.com"); User u3 = new
		 User(13,"Aarika","arika@gmail.com");
				  
				  
	  List<User> li = new ArrayList<User>();
	  li.add(u1);
	  li.add(u2);
	  li.add(u3);
	    System.out.println("User List :" + li);
				  
				 
	/*  Iterator<User> i = li.iterator();
	 while (i.hasNext()) {
	 System.out.println(i.next());
	 }
	 */ 
	    
	    
	    li.forEach(lis->System.out.println(lis));
	   // li.forEach(System.out::println);
		
	}

}
