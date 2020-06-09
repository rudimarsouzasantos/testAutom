package system.south;

import org.openqa.selenium.WebElement;
import java.util.List;
import org.junit.*;
import org.openqa.selenium.By;

import browser.Browser;
import junit.framework.TestCase;
import pageObject.PageSavingSimulator;
import utilit.MapElement;

/**
 * Unit test for simple App.
 */
public class TestSavingsSimulator
    extends TestCase
{
	Browser browser = new Browser();
	MapElement maping = new MapElement();
	PageSavingSimulator pageSavingSimulator = new PageSavingSimulator();
	
	WebElement divProfile, valueToApply, valueToSaving, qtdMonth, btnSimulator, tableResultSimulator,
	lblMsgErrorApply, lblMsgErrorSaving;
	List<WebElement> lstDivProfile;
	boolean passed = false;
	
	@Before
	protected void setUp() throws Exception {
		browser.startBrowser(browser.getBROWSERUSED(), browser.getMODEEXECUTIOWINDOWVISIBLE());
		browser.openUrl();
	}

	@After
	protected void tearDown() throws Exception {
		browser.getDriver().close();
	}
	
	public void clickfyProfile(String profile)
	{
		divProfile = maping.mapElement(browser.getDriver(), "//*[@id=\"formInvestimento\"]/div[1]", "xpath");
    	lstDivProfile = divProfile.findElements(By.cssSelector("input"));
    	
    	for (int i = 0; i < lstDivProfile.size(); i++) {
    		
    		if(lstDivProfile.get(i).getAttribute("value").equals(profile))
    		{
    			if(lstDivProfile.get(i).isSelected())
    			{
    				break;
    			}
    			else{
    				lstDivProfile.get(i).click();
    			}
    		}
		}
	}

    @Test
	public void testSimulatorForYouHappyWay()
    {
    	clickfyProfile(pageSavingSimulator.getValueProfileForYou());
    	
    	valueToApply = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdValueToApply(), "id");
    	valueToApply.sendKeys(pageSavingSimulator.getTxtValueToApply());
    	
    	valueToSaving = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdValueToSaving(), "id");
    	valueToSaving.sendKeys(pageSavingSimulator.getTxtValueToSaving());
    	
    	qtdMonth = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdMonth(), "id");
    	qtdMonth.sendKeys(pageSavingSimulator.getTxtQtdMonth());
    	   	
    	btnSimulator = maping.mapElement(browser.getDriver(), pageSavingSimulator.getXoathBtnSimulator(), "xpath");
    	btnSimulator.click();
    	
    	tableResultSimulator = maping.mapElement(browser.getDriver(), pageSavingSimulator.getXpathTableResultSimulator(), "xpath");
    	lstDivProfile = tableResultSimulator.findElements(By.cssSelector("tr"));

    	passed = lstDivProfile.size() > 4 ? true:false;
    	assertTrue(passed);
    }
    
    @Test
    public void testSimulatorForCompanyHappyWay()
    {
    	clickfyProfile(pageSavingSimulator.getValueProfileForCompany());
    	
    	valueToApply = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdValueToApply(), "id");
    	valueToApply.sendKeys(pageSavingSimulator.getTxtValueToApply());
    	
    	valueToSaving = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdValueToSaving(), "id");
    	valueToSaving.sendKeys(pageSavingSimulator.getTxtValueToSaving());
    	
    	qtdMonth = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdMonth(), "id");
    	qtdMonth.sendKeys(pageSavingSimulator.getTxtQtdMonth());
    	   	
    	btnSimulator = maping.mapElement(browser.getDriver(), pageSavingSimulator.getXoathBtnSimulator(), "xpath");
    	btnSimulator.click();
    	
    	tableResultSimulator = maping.mapElement(browser.getDriver(), pageSavingSimulator.getXpathTableResultSimulator(), "xpath");
    	lstDivProfile = tableResultSimulator.findElements(By.cssSelector("tr"));

    	passed = lstDivProfile.size() > 4 ? true:false;
    	assertTrue(passed);
    }
    
    @Test
    public void testSimulatorFormUnFillFieldToApply()
    {
    	clickfyProfile(pageSavingSimulator.getValueProfileForCompany());
    	
    	valueToSaving = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdValueToSaving(), "id");
    	valueToSaving.sendKeys(pageSavingSimulator.getTxtValueToSaving());
    	
    	qtdMonth = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdMonth(), "id");
    	qtdMonth.sendKeys(pageSavingSimulator.getTxtQtdMonth());
    	   	
    	btnSimulator = maping.mapElement(browser.getDriver(), pageSavingSimulator.getXoathBtnSimulator(), "xpath");
    	btnSimulator.click();
    	
    	lblMsgErrorApply = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdLblMsgErrorApply(), "id");
    	
    	passed = lblMsgErrorApply.getText().equals(pageSavingSimulator.getMsgErrorToApply()) ? true:false;
    	
    	assertTrue(passed);

    }
    
    @Test
    public void testSimulatorFormUnFillFieldToSaving()
    {
    	clickfyProfile(pageSavingSimulator.getValueProfileForCompany());
    	
    	valueToApply = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdValueToApply(), "id");
    	valueToApply.sendKeys(pageSavingSimulator.getTxtValueToApply());
    	
    	qtdMonth = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdMonth(), "id");
    	qtdMonth.sendKeys(pageSavingSimulator.getTxtQtdMonth());
    	   	
    	btnSimulator = maping.mapElement(browser.getDriver(), pageSavingSimulator.getXoathBtnSimulator(), "xpath");
    	btnSimulator.click();
    	
    	lblMsgErrorSaving = maping.mapElement(browser.getDriver(), pageSavingSimulator.getIdLblMsgErrorSaving(), "id");
    	
    	passed = lblMsgErrorSaving.getText().equals(pageSavingSimulator.getMsgErrorToSaving()) ? true:false;
    	
    	assertTrue(passed);

    }
}
