package utilit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MapElement {

	public MapElement() {
	}

	public void changeForFrame(WebDriver driver, String idFrame) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement iframe = driver.findElement(By.id(idFrame));
		driver.switchTo().frame(iframe);
	}

	public WebElement mapElement(WebDriver driver, String element, String tpElement) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (tpElement.equals("id")) {
			if (wait.until((ExpectedConditions.visibilityOfElementLocated(By.id(element)))).isDisplayed()
					&& !wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(element))).isEmpty()) {
				return driver.findElement(By.id(element));
			}
		}
		if (tpElement.equals("xpath")) {
			if (wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(element)))).isDisplayed()
					&& !wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(element))).isEmpty()) {
				return driver.findElement(By.xpath(element));
			}
		}
		return null;
	}
}
