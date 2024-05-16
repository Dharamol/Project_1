package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {
public static String getProperty(String key) throws IOException
{
	
	String Filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\Varibles.properties";
			FileReader fileReader = new FileReader(Filepath);
    Properties properties = new Properties();
    properties.load(fileReader);
	return properties.getProperty(key);
    
}
}
