package uk.warley.ganesh.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // default bean id= tennisCoach
//@Component("myTennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

//	@Autowired // this is field injection where we dont need to have setter, method or constructor to inject dependency(java reflection)
//	@Qualifier("happyFortuneService") //default bean id , if name is like RESTFortuneService then it stays as it is
	private FortuneService fortuneService;

	// @Autowired // this cant be applied to name as there is no bean of type String
	// has been created in container
	// NoSuchBeanDefinitionException: No qualifying bean of type
	// 'java.lang.String' available: expected at least 1 bean which
	// qualifies as autowire candidate.
	@Value("${coach.team}")
	private String name;

	@Autowired // dependency injection using annotation and this is not required if only one
				// constructor defined
	// default bean id
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

//	@Autowired // setter injection using annotation
//	@Qualifier("happyFortuneService") //default bean id
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "This is Tennis workout";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortuneService();
	}

//	@Autowired // any method injection using annotation
//	@Qualifier("happyFortuneService") //default bean id
//	public void setNothingWithParameter(FortuneService fortuneService) {
//		System.out.println("this is a any method with autowired doing nothing:" + fortuneService);
//	}

	public String getName() {
		return name;
	}

}
