package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;

import com.github.dockerjava.api.model.Driver;

public class YoutubeDataPropertiesFile
{

	public static void main(String[] args) throws Throwable 
	{
		// step1:-connecting the physical file path to the script
		FileInputStream fis = new FileInputStream("./src/test/resources/youtube.properties.txt");//read mode
		
       Properties pro = new Properties();
       pro.setProperty("url", "https://www.youtube.com/");
       pro.setProperty("favSong", "Lofi Version | Bajrang Baan (बजरंग बाण) With Lyrics - Rasraj Ji Maharaj ‪@lofibhajans‬");
     
     
    
      FileOutputStream fos = new FileOutputStream("./src/test/resources/youtube.properties.txt");//write mode
	  pro.store(fos, "CommomData");

	}

}
