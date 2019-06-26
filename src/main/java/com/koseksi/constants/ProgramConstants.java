package com.koseksi.constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;



public class ProgramConstants  {
	private static Properties properties=new Properties();;
	public ProgramConstants() {
		
	}
	public static Properties getConstants() throws Exception {
	//FileReader reader=new FileReader("app.properties");
		/*File myFile = new File("/SendMailThroughJava/src/main/resources/app.properties");
		InputStream input=new FileInputStream(myFile);*/
		if(properties.isEmpty()) {
	properties.load(ProgramConstants.class.getClassLoader().getResourceAsStream("/com/koseksi/commons/app.properties"));
		}
	return properties;
	
	}
}
