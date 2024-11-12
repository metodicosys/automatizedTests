/*
 * Fecha: 25/06/2020
 * Automatización: Buzón de Correo Electrónico
 * Formato: xxxx
 * Autor: InspiraIT
*/
package com.testing.testflow;

import java.awt.AWTException;
import java.io.IOException;
//import java.util.Set;
import java.util.concurrent.TimeUnit;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TFNuevaSolicitud extends TFPrincipal{

	Select comboEntidad;
	String entidad;
	
	long start;

	public TFNuevaSolicitud() throws IOException, AWTException {
		super();
		// TODO Auto-generated constructor stub
		seleccionarPestanaNuevaSolicitud();
	}

/*
	private boolean seleccionarEntidad() {
		comboEntidad.selectByVisibleText(entidad);
		return true;
	}*/

	@Test
	public boolean buscarComponenteUno() throws IOException {
		//boolean found = false;
		boolean resultado = false;
		System.out.println("EXPLORANDO");
		try {
		
	    WebElement tbody1 = driver.findElement(By.xpath("//mat-option[@id='mat-option-0']/span/span"));
		tbody1.click(); 
	//Notificación
	    WebElement option1 = driver.findElement(By.xpath("//h4"));
	    option1.click();    
	    WebElement chekN1 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chekN1.click(); 
	    WebElement chekN2 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chekN2.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekN3 = driver.findElement(By.xpath("//mat-list-item/div/mat-checkbox/label/div"));
	    chekN3.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekN4 = driver.findElement(By.xpath("//mat-list-item/div/mat-checkbox/label/div"));
	    chekN4.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekN5 = driver.findElement(By.xpath("//p[2]"));
	    chekN5.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    //botónes
	 // La ubicación actual de la ventana se almacena en la cadena de la Ventana Principal.
	    String parentWindow = driver.getWindowHandle();
	 // Haga clic en algún enlace que abra una nueva ventana.
	    driver.findElement(By.xpath("//div[@id='print-message']/div/div/button/span")).click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    screenshotter.tomarScreenshot();
	 // Guarda la ventana recién abierta en la ventana del niño usando getWindowHandles.
	    for (String childWindow : driver.getWindowHandles()) {
	 // Cambie a la ventana recién abierta usando switchTo().
	    driver.switchTo().window(childWindow); 
	    }
	 // Cierre la ventana recién abierta cuando termine con ella.
	    driver.close();
	 // Cambie de nuevo a la ventana Padre.    
	    driver.switchTo().window(parentWindow);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
   //Mensaje
	    WebElement option2 = driver.findElement(By.xpath("//mat-list-item[2]/div/div[2]/h4"));
	    option2.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekM1 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chekM1.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekM2 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chekM2.click();	    
	   // screenshotter.tomarScreenshot();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
   //Mis carpetas
	    WebElement option3 = driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-0']/span/mat-panel-title"));
	    option3.click();
	    WebElement option3x = driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-0']/span/mat-panel-title"));
	    option3x.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC1 = driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span"));
	    chekC1.click();
	    //clic a la carpeta DOCUMENTOS
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC2 = driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span"));
	    chekC2.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    //DOCUMENTOS - Ordenes de pago
	    WebElement chekC3 = driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/mat-list/mat-list-item/div/div[2]/h4"));
	    chekC3.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC4 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chekC4.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC5 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chekC5.click();
	    
		//Carpeta Doc. Resolutivo
	  /*  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC7 = driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/mat-list/mat-list-item[2]/div/div[2]/h4"));
	    chekC7.click();*/
	    
	  //Abre el popup de Documento
	 //   WebElement chekC8x = driver.findElement(By.cssSelector("#mat-expansion-panel-header-1 > span.mat-content.ng-tns-c104-10 > mat-icon > svg"));
	    WebElement chekC8x = driver.findElement(By.cssSelector("#mat-expansion-panel-header-1 > span.mat-content.ng-tns-c102-10 > mat-icon > svg"));
	    chekC8x.click();
	//  screenshotter.tomarScreenshot();
	    
	  //Activa el check Doc. Resolutivo(en el popup)
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC81 = driver.findElement(By.xpath("//mat-checkbox[2]/label"));
	    chekC81.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC82 = driver.findElement(By.xpath("//mat-checkbox[2]/label/div"));
	    chekC82.click();
	    
	    //botón Aceptar de popup
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC83 = driver.findElement(By.xpath("//mat-dialog-actions/button/span"));
	    chekC83.click();
	    
//	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//	    WebElement chekC84 = driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']/app-enable-category/mat-dialog-actions/button/span"));
//	    chekC84.click();
	    
		//ENTIDAD
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekx1 = driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-2']/span/mat-panel-title/span"));
	    chekx1.click();
	    WebElement chekx2 = driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-2']/span/mat-panel-title/span"));
	    chekx2.click();
	    
	  //Abre el popup de Entidad
	  //WebElement chekC8xx = driver.findElement(By.cssSelector("#mat-expansion-panel-header-3 > span.mat-content.ng-tns-c104-16 > mat-icon:nth-child(3)"));
	    WebElement chekC8xx = driver.findElement(By.cssSelector("#mat-expansion-panel-header-2 > span.mat-content.ng-tns-c102-13 > mat-icon > svg"));
	    chekC8xx.click();
	    //screenshotter.tomarScreenshot();
	    
	    //Activa el check de Carpetas Nuevas
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC21 = driver.findElement(By.xpath("//mat-dialog-actions/button[2]/span"));
	    chekC21.click();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	    WebElement chekC22 = driver.findElement(By.xpath("//mat-dialog-actions/button/span"));
	    chekC22.click();    
	    
	    //SENASA
	    WebElement chekC8 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-36']/label/div"));
	    chekC8.click();
	    WebElement chekC9 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-36']/label/div"));
	    chekC9.click();
	    
	    WebElement chekC10 = driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-enable-category/mat-dialog-actions/button[2]/span"));
	    chekC10.click();

	    WebElement chekC11 = driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']/app-notifier/mat-dialog-actions/button/span"));
	    chekC11.click();
	    
	    screenshotter.tomarScreenshot();
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
		}catch (Exception e) {
			reporte.appendSalto();
			reporte.appendLine("Bloqueante de sistema: " + e.getMessage());
			reporte.appendSalto();
			System.out.println(this.getReporte().toString());
		//	this.buscarComponenteUno();
			e.printStackTrace();
		}
			
		return resultado;
	    

	//	operador.marcarOpcionSegunTextoSelect("select_DETALLE_origenProducto", "NACIONAL");
	//	operador.marcarPrimeraOpcionSelect("select_DETALLE_grupoFarmaceutico");


		//return found;
	}
/*
	@Test
	public boolean buscarComponenteDos() throws IOException {
		boolean found = false;
		System.out.println("EXPLORANDO2");

		WebElement line2 = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div[2]"));
		line2.click();
	    WebElement tbody2 = driver.findElement(By.xpath("//mat-option[@id='mat-option-1']/span"));
		tbody2.click(); 
	    WebElement option1 = driver.findElement(By.xpath("//h4[contains(.,'Notificación')]"));
	    option1.click();    
	    WebElement chek1 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chek1.click(); 
	    WebElement chek2 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chek2.click();
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	//	operador.marcarOpcionSegunTextoSelect("select_DETALLE_origenProducto", "NACIONAL");
	//	operador.marcarPrimeraOpcionSelect("select_DETALLE_grupoFarmaceutico");

		return found;
	}	*/

	/*
	@Test
	public boolean buscarComponenteTres() throws IOException {
		boolean found = false;
		System.out.println("EXPLORANDO3");

		WebElement line3 = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div"));
		line3.click();
	    WebElement tbody3 = driver.findElement(By.xpath("//mat-option[@id='mat-option-2']/span/span"));
		tbody3.click(); 
	    WebElement option1 = driver.findElement(By.xpath("//h4[contains(.,'Importantes')]"));
	    option1.click();    
	    WebElement chek1 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chek1.click(); 
	    WebElement chek2 = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div"));
	    chek2.click();
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
	//	operador.marcarOpcionSegunTextoSelect("select_DETALLE_origenProducto", "NACIONAL");
	//	operador.marcarPrimeraOpcionSelect("select_DETALLE_grupoFarmaceutico");

		return found;
	}	*/
	
/*	public boolean guardarDatosSolicitante() throws IOException {
		boolean resultado = ingresarDatosPestanhaSolicitante();
		driver.manage().timeouts().implicitlyWait(90000,TimeUnit.SECONDS);
		WebElement butGuardarDatosSolicitante = null;
		screenshotter.tomarScreenshot();;

		try {		
			
				butGuardarDatosSolicitante = driver.findElement(By.id("grabarDetalleTopButton"));		
				driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
				butGuardarDatosSolicitante.click();
		
		} catch (Exception e) {
			reporte.appendSalto();
			reporte.appendLine("Bloqueante de sistema: " + e.getMessage());
			reporte.appendSalto();
			System.out.println(this.getReporte().toString());
			this.guardarEnArchivo();
			e.printStackTrace();
		}
		
		if(!saleAlerta()) {
			return false;
		}else {
			return true;
		}
	}*/

}
