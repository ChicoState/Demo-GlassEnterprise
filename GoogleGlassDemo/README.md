# Getting Started With Google Glass Demo: Shopping List

## How Shopping List Works
Shopping List is a glassware application that is added to the "Ok Glass" menu. Shopping List allows the user to add or remove items in thier list.

To open Shopping List, the user must say "Ok glass" followed by "Show me a demo with" followed by "Shopping List". Once Shopping List is opened, the user must say "Ok glass" to activate the add/remove menu. Then the user is able to choose which action to perform. 

If there are no items in the shopping list, then "No Items" will be displayed.
If there is 1 or more items in the list, then each item will be displayed.

## Software needed
To get stared with this Google Glass Demo: Shopping List, you will need the following Integrated Development Environment (IDE).
- **Android Studio**.
If you currently do not have this IDE, click the following link to download it. [Android Studio](https://developer.android.com/studio/index.html)

Once you install Android Studio you will also need to install the following tools for Android Studio.
> Android 4.4.2 (API 19)
	> SDK Platform  (API 19)
	> Glass Development Kit Preview (API 19)

To install these tools, click on **configure > SDK Manager** from the main menu of Android Studio. Then intall the appropiate tools. Both SDK Platform and GDK Preview are under the package Android 4.4.2 (API 19).

## Steps to Cloning and Installing Shopping List

Once you have the necessary tools installed you need to clone this repo from the Android Studio menu. To clone this repo from Android Studio menu, click on **Check project from version control > git**. Then copy and paste this repo URL *https://github.com/ChicoState/Demo-GlassEnterprise.git*. Click on **clone** then **ok/yes** on the following screens. Once you have completed these steps you will be able to build the project on Android Studio located at the top of the screen.

Now make sure that google glass is on **debug mode** and is connected to you computer. Once that's complete and you successfully built the project, you must make sure you have the correct configurations. To do this, click on **Run > Edit Configurations** at the top of the screen. Then you must apply the the correct setting as follows...

> Module - app
> Deploy - Default APK
> Launch - Default Activity
> Target - Open Select Target Catalog

Once you applied the above configurations, you may click the **Play** button on the top right of the screen. Then double click on the appropiate device.

That's it. You have successfully intalled the Shopping List Demo.

## Addition links and Documentation

For a better understanding of the application head over to this [link](https://www.raywenderlich.com/92840/google-glass-app-tutorial). 

To learn more about developing for Google Glass, head over to [Glass Explorer Edition](https://developers.google.com/glass/). 

To learn more about developing in Android Studio, head over to [Android Trainin](https://developer.android.com/training/index.html).

For more demo application, head over to [Glass Explorer Edition Samples](https://developers.google.com/glass/samples/).
