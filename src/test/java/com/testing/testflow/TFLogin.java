package com.testing.testflow;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.base.TestBase;

public class TFLogin extends TestBase{

	String ruc;
	String user;
	String clave;

	public TFLogin() throws IOException, AWTException {
		super();
		// TODO Auto-generated constructor stub
		this.ruc = properties.getLoginRuc();
		this.user = properties.getLoginUser();
		this.clave = properties.getLoginClave();
	}


	public boolean login() throws IOException, AWTException {
		reporte.appendLine("Estamos en la pagina de login.");
	/*inicio login*/

		WebElement msge1 = driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-notifier/mat-dialog-actions/button/span"));
		msge1.click(); 
		
		WebElement campRuc = driver.findElement(By.xpath("//input[@id='txtRuc']"));
		campRuc.clear();
		campRuc.sendKeys(ruc);

		reporte.appendSalto();
		reporte.append(campRuc);

		WebElement campUser = driver.findElement(By.xpath("//input[@id='txtUsuario']"));
		campUser.clear();
		campUser.sendKeys(user);

		reporte.appendSalto();
		reporte.append(campUser);
		
		WebElement campClave = driver.findElement(By.xpath("//input[@id='txtContrasena']"));
		campClave.clear();
		campClave.sendKeys(clave);

		reporte.appendSalto();
		reporte.append(campClave);

		screenshotter.tomarScreenshot();
		driver.findElement(By.xpath("//button[@id='btnAceptar']")).click();

		reporte.appendSalto();
		reporte.appendLine("Se ha dado click al botón de inicio de sesion.");
		reporte.appendSalto();

        WebDriverWait wait = new WebDriverWait(driver, 2, 2);
       
       // */ //fin login
        

		try {
			/*WebElement nombNuevoUsuario = driver.findElement(By.id("USUARIO.nombre"));*/
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("USUARIO.nombre")));
			reporte.appendLine("Se ha logrado login.");
			reporte.appendSalto();
			System.out.println("Se reporta error login");
			return false;
		}catch(Exception e) {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idOpcionesMenu")));
			reporte.appendLine("Se reporta error login.");
			reporte.appendSalto();
			System.out.println("Se ha logrado login");
			return true;
		}

		//		if(driver.findElements(By.partialLinkText("bienvenido al sistema")).size() >= 0) {
		//			reporte.appendLine("Se reporta error login");
		//			System.out.println("Se reporta error login");
		//			return false;
		//		}else {
		//			reporte.appendLine("Se ha logrado login");
		//			System.out.println("Se ha logrado login");
		//			return true;
		//		}
	}
}
