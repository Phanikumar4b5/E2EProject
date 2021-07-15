package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	public Properties pro;
	
public String getPropertyValue(String key) throws IOException {
	FileInputStream fio = new FileInputStream(new File("./Config.properties"));
	pro=new Properties();
	pro.load(fio);
	return pro.getProperty(key);
}
}
