package system.south;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.junit.*;
import browser.Browser;
import junit.framework.TestCase;
import pageObject.PageAPISimulator;
import utilit.MapElement;
import org.junit.After;
import org.junit.Before;

public class TestAPI
	extends TestCase
	{
		Browser browser = new Browser();
		MapElement maping = new MapElement();
		PageAPISimulator pageAPISimulator = new PageAPISimulator();
				
		WebElement jsonResponse;
		String textJsonResponse;
		
		@Before
		protected void setUp() throws Exception {
			browser.startBrowser(browser.getBROWSERUSED(), browser.getMODEEXECUTIOWINDOWVISIBLE());
			browser.openUrl("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador");
		}

		@After
		protected void tearDown() throws Exception {
			browser.getDriver().close();
		}
		
		@Test
		public void testAPISimulatorToInvest()
		{
			jsonResponse = maping.mapElement(browser.getDriver(), pageAPISimulator.getXpathJsonResponse(), "xpath");
			textJsonResponse = jsonResponse.getText();
			
			assertEquals(pageAPISimulator.getJsonResponse(), textJsonResponse);
		}
	}
