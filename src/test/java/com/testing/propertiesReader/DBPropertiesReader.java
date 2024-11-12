package com.testing.propertiesReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.testing.tool.cte.BaseCte;
import com.testing.tool.cte.PathsCte;

public class DBPropertiesReader {

	private Properties properties;
	private final String propertyFilePath = PathsCte.PATH_DBPARAMS;
	
	public DBPropertiesReader() {
		// TODO Auto-generated constructor stub
		BufferedReader reader;

		try {
			FileReader in = new FileReader(propertyFilePath);
			reader = new BufferedReader(in);
			properties = new Properties();

			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("config.properties no se encuentra en " + propertyFilePath);

		}
	}
	
	public String getPasswordBD() {
		String resultado = properties.getProperty(BaseCte.DBPARAM_PASSWORD);
		if (resultado != null) {
			return resultado;
		}else {
			throw new RuntimeException("Url no esta especificado en archivo config.properties");
		}
	}
	
	public String getUserBD() {
		String resultado = properties.getProperty(BaseCte.DBPARAM_USER);
		if (resultado != null) {
			return resultado;
		}else {
			throw new RuntimeException("Url no esta especificado en archivo config.properties");
		}
	}
	
	public String getUrlBD() {
		String resultado = properties.getProperty(BaseCte.DBPARAM_URL);
		if (resultado != null) {
			return resultado;
		}else {
			throw new RuntimeException("Url no esta especificado en archivo config.properties");
		}
	}
	
}
