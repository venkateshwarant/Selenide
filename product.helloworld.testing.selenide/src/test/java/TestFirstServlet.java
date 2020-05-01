import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;

public class TestFirstServlet {
  
	private static String serverBaseURL= "http://192.168.33.14:8080";
	private static String webpageURI= "/helloworld/FirstServlet";
	
	@Test
	public void testContent() {
	  open(serverBaseURL+webpageURI);
	  $("#hi").shouldHave(text("Hi There!"));
	}
	
	@Test
	public void testTime(){
		open(serverBaseURL+webpageURI);
		$("#date").shouldHave(text("Date=Fri Apr 10 10:30:46 UTC 2020"));
	}
	
}
