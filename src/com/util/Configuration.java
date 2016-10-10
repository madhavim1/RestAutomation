package com.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	public static String URI;
	public static String CONSUMER_KEY;
	public static String CONSUMER_SECRET;
	public static String TOKEN;
	public static String TOKEN_SECRET;

	public Configuration() {
		loadProperties();
	}

	public void loadProperties() {
		try {
			Properties prop = new Properties();
			FileReader fr = new FileReader(
					new File(String.format("%s/src/com/resources/config.properties", System.getProperty("user.dir"))));
			prop.load(fr);
			URI = prop.getProperty("uri");
			CONSUMER_KEY = prop.getProperty("consumerKey");
			CONSUMER_SECRET = prop.getProperty("consumerSecret");
			TOKEN = prop.getProperty("token");
			TOKEN_SECRET = prop.getProperty("tokenSecret");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
