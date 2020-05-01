import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;

public class TestFirstServlet {
  
	private static String serverBaseURL= "http://192.168.33.14:8080";
	private static String webpageURI= "/helloworld/FirstServlet";
	
	@Test
	public void testContent() {
	  open(serverBaseURL+webpageURI);
	  $("#hi").shouldHave(text("Hi There!")); // Waits until element gets text
	}
	
	@Test //This should fail as we are asserting wrong time with that of the one shown in the page
	public void testTime(){
		open(serverBaseURL+webpageURI);
		$("#date").shouldHave(text("Date=Fri Apr 10 10:30:46 UTC 2020")); // Waits until element gets text
	}
	
}
