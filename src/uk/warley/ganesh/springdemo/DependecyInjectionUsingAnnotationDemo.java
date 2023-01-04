package uk.warley.ganesh.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.TennisCoach;

public class DependecyInjectionUsingAnnotationDemo {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			TennisCoach coach = applicationContext.getBean("tennisCoach", TennisCoach.class);
			System.out.println(coach.getDailyFortuneService());
			System.out.println(coach.getName());
			System.out.println(coach);
		}

	}

}
