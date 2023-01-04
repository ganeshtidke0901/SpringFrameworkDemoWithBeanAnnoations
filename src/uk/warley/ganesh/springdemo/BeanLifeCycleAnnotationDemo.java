package uk.warley.ganesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;

public class BeanLifeCycleAnnotationDemo {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			Coach coach = applicationContext.getBean("cricketCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
		}

		// doing my Init stuff
		// This is Tennis workout
		// doing my clean stuff   //if the scope of the bean is prototype then it does not call @PreDestroy method

	}

}
