package com.genericutilities.pomclasses;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfileutility {
	public FileInputStream fisp;
	public String readDataFromPropertyFile(String key)throws Throwable{
	 FileInputStream fisp=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\HYBRIDFRAMEWORK\\src\\main\\resources\\Commondata.properties");
	 Properties p=new Properties();
	 p.load(fisp);
	 return p.getProperty(key);
	}

}
