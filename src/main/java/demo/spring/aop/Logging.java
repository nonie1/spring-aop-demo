package demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {

	public void beforeAdvice() {
		
		System.out.println("Before Advice.");
	}

	public void afterAdvice() {
		System.out.println("After Advice.");
	}
	
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("Around Advice before.");
		Object output = pjp.proceed();
		System.out.println("Around Advice after.");
		return output;
	}

	public void afterReturningAdvice(Object retVal) {
		
		System.out.println("After Returning Advice. Return Value: "+ retVal.toString());
	}


}