package com.testing.testflow;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testing.tool.cte.ByCte;


public class TFPestanhaSegunda extends TFPestanhaDatosSolicitante{

	public TFPestanhaSegunda() throws IOException, AWTException {
		super();
		// TODO Auto-generated constructor stub
		guardarDatosSolicitante();
		seleccionarSegundaPestanha();
	}
	
	protected void seleccionarSegundaPestanha() {
		String textSegundaPestanha = pestanhas.get(1);
		WebElement pestanhaDos = driver.findElement(By.linkText(textSegundaPestanha));
		pestanhaDos.click();
	}
	
	public void ingresarDatosPestanhaSegunda() {
	//	String tipoTramite = properties.getTipoTramite();
	/*	switch(tupa) {
		case 72:
			//debe poder readaptarse cuando es Reinscripcion
		//	operador.marcarOpcionSegunTextoSelect("DETALLE.dgmTipoTramite", tipoTramite.replace('o', 'ó'));
			//debe poder readaptarse para seleccionarse cualquier opcion
			operador.marcarPrimeraOpcionSelect("DETALLE.dgmTipoProdBiologico");
			break;
		case 73:			
			operador.abrirBuscadorYCambiarAPopup("buscarRegistroSanitarioButton");
			
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			
			WebElement popup_inputNombre = driver.findElement(By.id("nombre"));
			popup_inputNombre.sendKeys("tresiba");		
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);		
			operador.marcarPrimeraOpcionSelect("ADMINISTRACION.viaAdministracion");			
			driver.findElement(By.id("agregarViaAdmButton")).click();			
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);			
			operador.marcarOpcionSegunTextoSelect("DETALLE.productoConDiluyente", "No");
			operador.marcarOpcionSegunTextoSelect("DETALLE.productoConDm", "No");
			
			driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
			break;
		}*/
	}
	
	public boolean guardarDatosSegunda() throws IOException {
		ingresarDatosPestanhaSegunda();
		screenshotter.tomarScreenshot();
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
		WebElement butGuardarDatosSegundaPestanha = null;
		
	/*	switch(tupa) {
		case 72:
			butGuardarDatosSegundaPestanha = driver.findElement(By.id("grabarTramiteButton"));
			break;
		case 73:
			butGuardarDatosSegundaPestanha = driver.findElement(By.id("grabarDetalleButton"));
			break;
		} */
		
		butGuardarDatosSegundaPestanha.click();
		if(!saleAlerta()) {
			return false;
		}else {
			return true;
		}
	}

}
