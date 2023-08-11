# capacitor-bug-triggerJSEvent

triggerJSEvent bug sample application

## Steps to Reproduce

1. Setup Project:

    ```bash
    git clone https://github.com/kimiroo/capacitor-bug-triggerJSEvent.git
    cd ./capacitor-bug-triggerJSEvent
    npm install
    npm run build
    npx cap sync
    npx cap open android
    ```
2. Build an app in Android Studio & install
3. Launch app on phone
4. Click "Run Test" button

## Expected Behavior

- It should dispatch "testEvent" event in WebView window.

## Actual Behavior

- triggerJSEvent fails to execute with following error:
  - Attempt to invoke virtual method 'void com.getcapacitor.Bridge.triggerJSEvent(java.lang.String, java.lang.String, java.lang.String)' on a null object reference

```
2023-08-11 23:15:39.868  9359-10932 AndroidRuntime          com...r.reproduction.triggerJSEvent  E  FATAL EXCEPTION: CapacitorPlugins
	Process: com.capacitor.reproduction.triggerJSEvent, PID: 9359
	java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
		at com.getcapacitor.Bridge.lambda$callPluginMethod$0(Bridge.java:783)
		at com.getcapacitor.Bridge.$r8$lambda$ehFTi5f4HhVNFKTbCKAYDkpQYRA(Unknown Source:0)
		at com.getcapacitor.Bridge$$ExternalSyntheticLambda3.run(Unknown Source:8)
		at android.os.Handler.handleCallback(Handler.java:883)
		at android.os.Handler.dispatchMessage(Handler.java:100)
		at android.os.Looper.loop(Looper.java:237)
		at android.os.HandlerThread.run(HandlerThread.java:67)
	Caused by: java.lang.reflect.InvocationTargetException
		at java.lang.reflect.Method.invoke(Native Method)
		at com.getcapacitor.PluginHandle.invoke(PluginHandle.java:138)
		at com.getcapacitor.Bridge.lambda$callPluginMethod$0(Bridge.java:774)
		at com.getcapacitor.Bridge.$r8$lambda$ehFTi5f4HhVNFKTbCKAYDkpQYRA(Unknown Source:0) 
		at com.getcapacitor.Bridge$$ExternalSyntheticLambda3.run(Unknown Source:8) 
		at android.os.Handler.handleCallback(Handler.java:883) 
		at android.os.Handler.dispatchMessage(Handler.java:100) 
		at android.os.Looper.loop(Looper.java:237) 
		at android.os.HandlerThread.run(HandlerThread.java:67) 
	Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'void com.getcapacitor.Bridge.triggerJSEvent(java.lang.String, java.lang.String, java.lang.String)' on a null object reference
		at com.capacitor.reproduction.triggerJSEvent.TestEvent.testCall(TestEvent.java:31)
		at com.capacitor.reproduction.triggerJSEvent.TestPlugin.testRun(TestPlugin.java:24)
		at java.lang.reflect.Method.invoke(Native Method) 
		at com.getcapacitor.PluginHandle.invoke(PluginHandle.java:138) 
		at com.getcapacitor.Bridge.lambda$callPluginMethod$0(Bridge.java:774) 
		at com.getcapacitor.Bridge.$r8$lambda$ehFTi5f4HhVNFKTbCKAYDkpQYRA(Unknown Source:0) 
		at com.getcapacitor.Bridge$$ExternalSyntheticLambda3.run(Unknown Source:8) 
		at android.os.Handler.handleCallback(Handler.java:883) 
		at android.os.Handler.dispatchMessage(Handler.java:100) 
		at android.os.Looper.loop(Looper.java:237) 
		at android.os.HandlerThread.run(HandlerThread.java:67)
```

## What I have tried
- Add or remove "@CapacitorPlugin" in TestEvent.java
- Calling triggerJSEvent in 2 different ways:
  - As described in official documentation.
    - https://capacitorjs.com/docs/core-apis/android#triggerjsevent
  - Storing a reference of bridge and calling triggerJSEvent from that.
    - https://forum.ionicframework.com/t/capacitor-v3-plugin-addeventlistener-and-triggerjsevent-lacking-and-dont-work-as-described/206641/3
- Both registering & not registering plugin via registerPlugin in MainActivity.java

## My environment
- Capacitor version:
  ```
  Latest Dependencies:
  
  @capacitor/cli: 5.2.3
  @capacitor/core: 5.2.3
  @capacitor/android: 5.2.3
  @capacitor/ios: 5.2.3
  
  Installed Dependencies:
  
  @capacitor/ios: not installed
  @capacitor/cli: 5.2.3
  @capacitor/android: 5.2.3
  @capacitor/core: 5.2.3
  
  [success] Android looking great! 👌
  ```
- npm version: 9.6.7
- node version: v18.17.0
- Android Studio version: Android Studio Giraffe (2022.3.1)
- Tried android environments:
  - Galaxy S21 (API 33)
  - Galaxy S9 (API 29)
  - (AVD) Pixel 3 (API 31)