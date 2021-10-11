package teamnosleep.ebtrescue.EBT.Rescue.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebContollerTest {
	
	private WebController webController;
	
	@Test
	public void anthonyApiTest() {
		webController = new WebController();
		Assert.assertEquals("Anthony's API", webController.getURL());
	}
}
