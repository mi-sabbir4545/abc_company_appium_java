# Setup instructions

## Technology and Tool Used
- java
- Android Studio Emulator
- Appium
- Appium Inspector

## Dependencies
- java
- Android Studio
- Appium
- Appium Inspector
- Vysor or NOX
- Debug APK

## Dependencies To use APPIUM
- Java JDK Download, install, set JAVA_HOME and path in environment’s system variable.
- Appium Download & install.
- Android Studio Download, install, set ANDROID_HOME and path in environment’s system variable.
- Android Studio SDK Manager Setup
- Android Studio AVD(Android Virtual Devices) Manager Setup / Emulator
- Physical Device setup
- Intelij or any other IDE download and install


## How to run the tests
1. Clone the project
2. Start the Appium server "Appium -p 4724"
3. Open **Android Studio**
4. Go to **Tools → Device Manager** and create an **Android Virtual Device (AVD)** if not already created
5. Start the emulator from AVD Manager
6. Make sure the emulator is unlocked and running
7. Open `build.gradle` as a project in IntelliJ
8. Run the following command:
    ```bash
    gradle clean test
    ```



