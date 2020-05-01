import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class TestLandingPage {
  
	private static String serverBaseURL= "http://192.168.33.14:8080";
	private static String webpageURI= "/helloworld";
	
	@Test
	public void testContent(){
		open(serverBaseURL+webpageURI);
		$("#content").shouldHave(text("You have reached some content here. Congratulations!"));
	}
	
}
