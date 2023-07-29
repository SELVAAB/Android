package com.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Linkedin {
	public static AndroidDriver driver;
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		

		DesiredCapabilities capabilites=new DesiredCapabilities();
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("platformVersion", "12");
		capabilites.setCapability("udid", "ZD22275F65");
		capabilites.setCapability("deviceName", "motog22");
		
		capabilites.setCapability("appPackage", "com.linkedin.android");
		capabilites.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		 
		driver=new AndroidDriver(url,capabilites);
		System.out.println("done");
		

	}

}
