package com.testing.testflow;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TFInicioRegistroNuevaSolicitud extends TFNuevaSolicitud{

	long end;
	
	public TFInicioRegistroNuevaSolicitud() throws IOException, AWTException {
		// TODO Auto-generated constructor stub
		super();

		buscarComponenteUno();
	//	buscarComponenteDos();
	//	buscarComponenteTres();
	}
	
	//Acá debe ir un método que verifique la data del solicitante (o los campos que deben existir)
	
	public void clickGuardarFormato() {
		end = System.currentTimeMillis();
		reporte.appendLine("Tiempo fin carga página web = " + end);
		reporte.appendSalto();
				
	}
	
	
}
