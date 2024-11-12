package com.testing.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.github.javafaker.Internet;
import com.github.javafaker.Lorem;
import com.github.javafaker.Number;
import com.github.javafaker.PhoneNumber;
import com.testing.tool.ReporteTool;

/**
 * TODO: STE - renombrar esta clase (tool, poblar, valor, dato, componente,
 * accion, usuario, user, operacion)
 */
public class OperacionesEnWeb {

	/** TODO: STE - agregar alcance de variable : private */
	private WebDriver driver;
	private Faker faker;
	private ReporteTool reporte;
	private WebDriverWait wait;

	public OperacionesEnWeb() {
		// TODO Auto-generated constructor stub
	}

	public OperacionesEnWeb(WebDriver driver, ReporteTool reporte) {
		super();
		this.driver = driver;
		this.reporte = reporte;
		wait = new WebDriverWait(driver, 60);
	}

	/**
	 * TODO: STE - cambiar nombre de variable id por algo mas reconocidble
	 * (idComponenteWeb, idWeb)
	 */
	public void llenarTextboxConUnaPalabra(String idWeb) {
		By id = By.id(idWeb);
		WebElement webElement = driver.findElement(id);
		Lorem lorem = faker.lorem();
		String word = lorem.word();
		webElement.sendKeys(word);
		reporte.append(webElement);
	}

	public void llenarTextboxConNumero(String idWeb) {
		By id = By.id(idWeb);
		WebElement webElement = driver.findElement(id);
		Number number = faker.number();
		String string = number.randomDigitNotZero() + "";
		webElement.sendKeys(string);
		reporte.append(webElement);
	}

	public void llenarTextboxConNumerosEnRango(String idWeb, int max) {
		By id = By.id(idWeb);
		WebElement webElement = driver.findElement(id);
		Number number = faker.number();
		int numberBetween = number.numberBetween(1, max);
		webElement.sendKeys(numberBetween + "");
		reporte.append(webElement);
	}

	public void llenarCorreoElectronico(String idWeb) {
		By id = By.id(idWeb);
		WebElement webElement = driver.findElement(id);
		Internet internet = faker.internet();
		String emailAddress = internet.emailAddress();
		webElement.sendKeys(emailAddress);
		reporte.append(webElement);
	}

	public void llenarTelefono(String idWeb) {
		By id = By.id(idWeb);
		WebElement webElement = driver.findElement(id);
		PhoneNumber phone = faker.phoneNumber();
		String phoneNumber = phone.phoneNumber();
		webElement.sendKeys(phoneNumber);
		reporte.append(webElement);
	}

	public void marcarPrimeraOpcionSelect(String idWeb) {
		/** TODO: STE - este linea de espera debe optimizarse, te envie correo */
//		driver.manage().timeouts().implicitlyWait(900000000, TimeUnit.SECONDS);
		By id = By.id(idWeb);
		wait.until(ExpectedConditions.elementToBeClickable(id));
		WebElement webElement = driver.findElement(id);
		Select select = new Select(webElement);
		select.selectByIndex(1);//Opción de
		reporte.appendText(webElement);
	}

	public void marcarUnaOpcionSelect(String idWeb, int index) {
//		driver.manage().timeouts().implicitlyWait(900000000, TimeUnit.SECONDS);
		By id = By.id(idWeb);
		wait.until(ExpectedConditions.elementToBeClickable(id));
		WebElement webElement = driver.findElement(id);
		Select select = new Select(webElement);
		select.selectByIndex(index);
		reporte.appendText(webElement);
	}

	public void marcarOpcionSegunTextoSelect(String idWeb, String opcion) {
//		driver.manage().timeouts().implicitlyWait(900000000, TimeUnit.SECONDS);
		By id = By.id(idWeb);
		wait.until(ExpectedConditions.elementToBeClickable(id));
		WebElement webElement = driver.findElement(id);
		Select select = new Select(webElement);
		select.selectByVisibleText(opcion);
		reporte.appendText(webElement);
	}

	public void abrirBuscadorYCambiarAPopup(String idWeb) {
		/** TODO: STE - antes de usar el metodo, id debe ser controlado que no sea nulo */
		By id = By.id(idWeb);
		WebElement buscador = driver.findElement(id);
		buscador.click();
		reporte.appendLine("Sistema está pasando a Ventana Emergente.");
		By cssSelector = By.cssSelector("#popupFrame");
		WebElement iframe = driver.findElement(cssSelector);
		driver.switchTo().frame(iframe);
	}

	public void abrirEnlaceYCambiarAPopup(WebElement a) {
		/** TODO: STE - antes de usar la variable a, debe ser controlado que no sea nulo */
		if(a!=null) {
			a.click();
			reporte.appendLine("Sistema está pasando a Ventana Emergente.");
			By cssSelector = By.cssSelector("#popupFrame");
			WebElement iframe = driver.findElement(cssSelector);
			TargetLocator switchTo = driver.switchTo();
			switchTo.frame(iframe);
		}
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public Faker getFaker() {
		return faker;
	}

	public void setFaker(Faker faker) {
		this.faker = faker;
	}

}
