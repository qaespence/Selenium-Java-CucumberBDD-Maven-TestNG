package WebdriverUniversityFramework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	// protected InputStream input = null;
	// protected Properties prop = null;
	
	FileInputStream input = null;
	Properties prop = new Properties();
	File src = null;
	
	public ReadConfigFile() throws IOException {
		try {
			// ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
			// prop = new Properties();
			
			src = new File(Constant.CONFIG_PROPERTIES_DIRECTORY);
			input = new FileInputStream(src);
			prop.load(input);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getBrowser() {
		if(prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
		
	}
}
