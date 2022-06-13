package JFS.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
       public int bookid;
       
       
//       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//       MyBook o=context.getBean(MyBook.class);
       
       @Autowired
       public MyFavBooks myFavBooks;
       
       @Autowired
       public MyPersonalBook myPersonalBook; 
       
//       @Qualifier("myFavBooks")
       @Autowired
       public MyBookInterface myBookInterface;
       
       
       @Value("#{myFavBooks.author?.toUpperCase()}")
       public String publisher;
       
       public int getBookid() {
		return bookid;
	}



	public void setBookid(int bookid) {
		this.bookid = bookid;
	}



	public MyFavBooks getMyFavBooks() {
		return myFavBooks;
	}



	public void setMyFavBooks(MyFavBooks myFavBooks) {
		this.myFavBooks = myFavBooks;
	}



	public void show() {
    	   System.out.println("My book class method");
    	   System.out.println("Publisher name:"+publisher);
    	   myFavBooks.myfavbooks();
    	   System.out.println(myFavBooks);
    	   myBookInterface.my1stBook();
    	   myPersonalBook.my1stBook();
    	   myFavBooks.my1stBook();
       }


	
}
