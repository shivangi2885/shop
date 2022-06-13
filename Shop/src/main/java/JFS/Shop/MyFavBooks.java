package JFS.Shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyFavBooks implements MyBookInterface {
	
	@Value("#{100+25}")
     public int favbkid;
	
	@Value("harryporter")
	public String favbkname;
	
	@Value("#{'JK' + 'Rowling'}")
	public String author;
	
	
	
	public void myfavbooks()
	{
		System.out.println("harry porter");
	}

	
	

	@Override
	public String toString() {
		return "MyFavBooks [favbkid=" + favbkid + ", favbkname=" + favbkname + ", author=" + author + "]";
	}
	
	public void my1stBook() {
		System.out.println("interface method of favbook class");
	}

	
	
}
