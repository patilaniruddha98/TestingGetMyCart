package com.getmycart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is : "+e.getMessage());
		}
	}
	
	public String getUrl() {
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getChromeDriver() {
		String chrome=pro.getProperty("chromePath");
		return chrome;
	}
	
	public String getUsername() {
		String uname=pro.getProperty("uname");
		return uname;
	}
	
	public String getPassword() {
		String pword=pro.getProperty("pword");
		return pword;
	}

}
