package teamnosleep.ebtrescue.EBT.Rescue.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebContollerTest {
	
	@Autowired private WebController webController;
	
	@Test
	public void anthonyApiTest() {
		Assert.assertEquals("Anthony's API", webController.getURL());
	}

	@Test
	public void ashleyAPITest() {
		Assert.assertEquals("Ashley's API", webController.ashleyURL());
	}
	@Test
	public void anthonyNAPITest() {
		Assert.assertEquals("Anthony Nguyen's API", webController.anthonyNURL());
	}
}
