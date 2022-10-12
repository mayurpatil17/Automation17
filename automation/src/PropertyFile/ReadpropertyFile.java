package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ReadpropertyFile {
	public String readData(String PropPath,String key) throws IOException
	
	{
	FileInputStream fis = new FileInputStream(PropPath);	
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;
	}

}
