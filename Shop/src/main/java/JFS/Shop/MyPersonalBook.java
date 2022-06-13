package JFS.Shop;

import org.springframework.stereotype.Component;

@Component

public class MyPersonalBook implements MyBookInterface {

	
	public void my1stBook() {
		System.out.println("interface method from personal book class");
	}
    
}
