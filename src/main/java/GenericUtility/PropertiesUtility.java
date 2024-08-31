package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	
	
	public String getDatafromproperties1(String data) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.Propertiespath1);
		Properties pobj=new Properties();
		pobj.load(fis);
		String info=pobj.getProperty(data);
		return info;
		
	
	}

}
