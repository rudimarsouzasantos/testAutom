package utilit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilit {

	public Utilit() {
	}

	public void waitForElement(WebDriver driver, String element, String tpElemento) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int count = 0;
		while (count <= 3) {

			if (tpElemento.equals("id")) {
				try {
					if (wait.until((ExpectedConditions.visibilityOfElementLocated(By.id(element)))).isDisplayed()
							&& !wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(element)))
									.isEmpty()) {
						break;
					}
				} catch (Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					continue;
				}
			}

			if (tpElemento.equals("xpath")) {
				try {
					if (wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(element)))).isDisplayed()
							&& !wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(element)))
									.isEmpty()) {
						break;
					}
				} catch (Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					continue;
				}
			}
		}
	}

	/*public void waitTextAppearInElement(WebDriver driver, String element, String textElement, String tpElement) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int count = 0;

		while (count <= 3) {
			if (tpElement.equals("id")) {

				try {
					if (wait.until(ExpectedConditions.textToBe(By.id(element),
							textElement)) == true) {
						break;
					}
				} catch (Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					continue;
				}
			}
			
			if (tpElement.equals("xpath")) {

				try {
					if (wait.until(ExpectedConditions.textToBe(By.xpath(element),
							textElement)) == true) {
						break;
					}
				} catch (Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					continue;
				}
			}
		}
	}*/
}