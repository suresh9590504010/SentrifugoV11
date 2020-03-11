package com.sentrifugo.myInfo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() throws IOException {
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsername() {
		String uname=pro.getProperty("username");
		return uname;
		
	}
	
	public String getPassword() {
		String pwd=pro.getProperty("password");
		return pwd;
		
	}
	
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}
	
	public String getFirefoxPath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
		
	}
	
	public String getIePath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
		
	}
}
