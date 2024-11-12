package com.testing.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//import com.testing.testcases.TCDatosSolicitantePestanha;
import com.testing.testcases.TCInicioRegistro;

//import com.testing.testcases.TCReqAdjuntosPestanha;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		TestVerRequisito test1 = new TestVerRequisito();
		test1.buscarEditarUltimoRequisito();
		*/
		
		String autor = "DVUCEPT";
		System.setProperty("autor", autor);
		
//		Result result = JUnitCore.runClasses(TCDatosSolicitantePestanha.class);
		Result result = JUnitCore.runClasses(TCInicioRegistro.class);
		
		//Result result = JUnitCore.runClasses(TestCasesModificarEtiqueta.class, TestCaseGuardarFormulario.class, TestCaseClonarRequisito.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
//			sc.close();
		}
			
		
	}
	
}
