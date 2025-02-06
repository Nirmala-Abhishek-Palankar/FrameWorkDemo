package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import com.github.dockerjava.api.model.Driver;

public class FlipkartDataPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		// step1:-connecting the physical file path to the script
				FileInputStream fis = new FileInputStream("./src/test/resources/flipkartJewelryBoxColor.properties.txt"); //read mode
				
		       Properties pro = new Properties();
		       pro.setProperty("url", "https://www.flipkart.com/");
		       pro.setProperty("jewelryBoxName", "4tens Makeup Storage Organizer,Large Skincare Organizer Cosmetic Display Case with Lid Makeup Organizer Vanity Box");
		       pro.setProperty("jewelryBoxColor", "Clear, Light Green");
		     
		    
		      FileOutputStream fos = new FileOutputStream("./src/test/resources/flipkartJewelryBoxColor.properties.txt"); //write mode
			  pro.store(fos, "CommomData");

	}

}
