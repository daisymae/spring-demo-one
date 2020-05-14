package com.cherylorcutt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		CricketCoach theOtherCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		CricketCoach protoCoach = context.getBean("protoCricketCoach", CricketCoach.class);
		CricketCoach anotherCoach = context.getBean("protoCricketCoach", CricketCoach.class);
		
		// verify likeness
		boolean sameCoach = (theCoach == theOtherCoach);
		System.out.println("theCoach and theOtherCoach are same?: " + sameCoach);
		
		sameCoach = (protoCoach == anotherCoach);
		System.out.println("protoCoach and anotherCoach are same?: " + sameCoach);
		
		sameCoach = (theCoach == protoCoach);
		System.out.println("theCoach and protoCoach are same?: " + sameCoach);
		
		System.out.println("\nMemories:");
		System.out.println("theCoach: " + theCoach);
		System.out.println("theOtherCoach: " + theOtherCoach);
		System.out.println("protoCoach: " + protoCoach);;
		System.out.println("anotherCoach: " + anotherCoach);
		
		// call methods on the bean
		System.out.println("\nBean methods: ");
		System.out.println("theCoach: " + theCoach.getDailyWorkout());
		System.out.println("theCoach: " + theCoach.getDailyFortune());
		System.out.println("theOtherCoach: " + theOtherCoach.getDailyWorkout());
		System.out.println("theOtherCoach: " + theOtherCoach.getDailyFortune());
		System.out.println("protoCoach: " + protoCoach.getDailyWorkout());
		System.out.println("protoCoach: " + protoCoach.getDailyFortune());
		System.out.println("anotherCoach: " + anotherCoach.getDailyWorkout());
		System.out.println("anotherCoach: " + anotherCoach.getDailyFortune());
		
		// call new methods to get the literal values
		System.out.println("\nLiteral values:");
		System.out.println("theCoach: " + theCoach.getEmailAddress());
		System.out.println("theCoach: " + theCoach.getTeam());
		System.out.println("theOtherCoach: " + theOtherCoach.getEmailAddress());
		System.out.println("theOtherCoach: " + theOtherCoach.getTeam());
		System.out.println("protoCoach: " + protoCoach.getEmailAddress());
		System.out.println("protoCoach: " + protoCoach.getTeam());
		System.out.println("anotherCoach: " + anotherCoach.getEmailAddress());
		System.out.println("anotherCoach: " + anotherCoach.getTeam());
		
		// close the context
		context.close();
	}

}
