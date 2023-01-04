package uk.warley.ganesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.TennisCoach;

public class BeanScopeUsingAnnotationDemo {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

//			//singleton scope
			TennisCoach coach1 = applicationContext.getBean("tennisCoach", TennisCoach.class);
			System.out.println(coach1);
			TennisCoach coach2 = applicationContext.getBean("tennisCoach", TennisCoach.class);
			System.out.println(coach2);
			/*
			 * uk.warley.ganesh.springdemo.beans.TennisCoach@1e16c0aa
			 * uk.warley.ganesh.springdemo.beans.TennisCoach@1e16c0aa
			 */
			// prototype scope

			
//			TennisCoach coach1 = applicationContext.getBean("tennisCoach", TennisCoach.class);
//			System.out.println(coach1);
//			TennisCoach coach2 = applicationContext.getBean("tennisCoach", TennisCoach.class);
//			System.out.println(coach2);
			/*
			 * uk.warley.ganesh.springdemo.beans.TennisCoach@1e16c0aa
			 * uk.warley.ganesh.springdemo.beans.TennisCoach@2f67a4d3
			 */

		}

	}

}
