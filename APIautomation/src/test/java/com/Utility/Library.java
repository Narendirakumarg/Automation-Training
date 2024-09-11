package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Library {

	public Properties ObjProp;
	
	public void ReadPropertiesFile() throws IOException {
		File objfile = new File(System.getProperty("user,dir") +" //src//test//resources//propertiesInfo//Project.properties");
		FileInputStream objFileInput = new FileInputStream(objfile);
		Properties ObjProp = new Properties();
		ObjProp.load(objFileInput);
		
		System.out.println("ReqesCreateUser : " +ObjProp.getProperty("ReqesCreateUser"));
		//System.out.println("SuccessResponseStatuscode : " +ObjProp.getProperty("SuccessResponseStatuscode"));
		System.out.println("CreatedResponseStatuscode : " +ObjProp.getProperty("CreatedResponseStatuscode"));
	}

} 