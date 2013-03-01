package com.example.itdoesntmatteruitest;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class ItDoesntMatterUITest extends UiAutomatorTestCase{
	
	public void testDemo() throws UiObjectNotFoundException {   
	      
	      // Simulate a short press on the Home button.
	      getUiDevice().pressHome();
	      
	      // We’re now in the homescreen. Next, we want to simulate 
	      // a user launching our app
	      // use this property to create a UiSelector to find the button. 
	      UiObject myAppIcon = new UiObject(new UiSelector()
	         .textStartsWith("ItDoesntMatt"));
	      
	      Assert.assertTrue(myAppIcon.click());
	      //Lets click on find contacts button
	      UiObject contactsButton = new UiObject(new UiSelector()
	         .textStartsWith("Find Contacts"));
	      
	      Assert.assertTrue(contactsButton.click());
	      
	      UiSelector contactNameSelector = new UiSelector().text("Qwerty");
	      UiObject contactObject = new UiObject(contactNameSelector);
	      
	      //Assert that theres a contact called Qwerty
	      Assert.assertNotNull(contactObject);
	}

}
