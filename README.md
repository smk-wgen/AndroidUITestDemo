Running the UI test

From your terminal, you need to push the jar to the device or emulator,

1. Go to the UITest project home.
2. Run the following command
adb push bin/UIDemo.jar /data/local/tmp/

To execute the test, 
1. First install the app on your device / emulator
2. Please have the App on your home screen first. (Because the test looks for the App icon on the home screen)
3. Run the following command

adb shell uiautomator runtest UIDemo.jar -c com.example.itdoesntmatteruitest.ItDoesntMatterUITest