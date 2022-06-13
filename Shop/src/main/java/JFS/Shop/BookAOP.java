package JFS.Shop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy

public class BookAOP {
	
	@Before(value="execution(public void show())")
	public void beforeShow(JoinPoint joinPoint) {
		System.out.println("Log Info:"+joinPoint.getSignature());
		System.out.println("Log Info:"+joinPoint.getClass()+" "+joinPoint.getSignature().getName());
		System.out.println(" no parameter passed ");
	}
    @After(value="execution(public void show())")
    public void afterShow() {
    	System.out.println("doent return any value");
    }
    @AfterReturning(value="execution(public void display())",returning="a")
    public void afterReturningDisplay() {
    	System.out.println("value returned succesfully from display method");
    }
//    @Around(value="execution(public void show())")
//    public void afterShow() {
//    	System.out.println("doent return any valu");
//    }
}
