package browser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser extends Driver {

	public final String BROWSERUSED = "chrome";
	public final String MODEEXECUTIONHEADLESS = "headless";
	public final String MODEEXECUTIOWINDOWVISIBLE = "start-maximized";
	public WebDriver driver;
	private final String URL = "https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/";

	public Browser() {
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	@Override
	public void startBrowser(String browserName, String executionMode) {

		int count = 0;

		while (count <= 10) {
			count++;

			if (browserName.equals("chrome")) {
				try {
					System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					options.addArguments(executionMode, "--ignore-certificate-errors");
					driver = new ChromeDriver(options);
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					break;
					
				} catch(Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					continue;
				}
			}

			if (browserName.equals("firefox")) {
				try {
					System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\firefox\\geckodriver.exe");
					FirefoxOptions options = new FirefoxOptions();
					options.addArguments(executionMode, "--ignore-certificate-errors");
					driver = new FirefoxDriver(options);
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					break;

				} catch (Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					continue;
				}
			}

			if (browserName.equals("iexplore")) {
				try {
					System.setProperty("webdriver.ie.driver", "C:\\webdriver\\iexplore\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					break;

				} catch (Exception msgError) {
					msgError.printStackTrace();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					continue;
				}
			}

			if (browserName.equals("opera")) {
				// TODO Auto-generated method stub
			}
		}
	}

	@Override
	public void openUrl() {
		driver.get(this.URL);

	}
	
	public void openUrl(String url) {
		driver.get(url);
	}

	public String getBROWSERUSED() {
		return BROWSERUSED;
	}

	public String getMODEEXECUTIONHEADLESS() {
		return MODEEXECUTIONHEADLESS;
	}

	public String getMODEEXECUTIOWINDOWVISIBLE() {
		return MODEEXECUTIOWINDOWVISIBLE;
	}
}
