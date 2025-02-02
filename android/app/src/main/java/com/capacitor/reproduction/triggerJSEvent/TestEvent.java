package com.capacitor.reproduction.triggerJSEvent;

import android.util.Log;

import com.getcapacitor.Bridge;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;


public class TestEvent {
    Bridge myBridge;

    public TestEvent(Bridge bridge) {
        super();
        myBridge = bridge;
    }

    public void testCall() {
        Log.d("TestEvent", "testCall!"); // Some random output

        /*
        The problematic part:
         */

        // A. As-is from official documentation (https://capacitorjs.com/docs/core-apis/android#triggerjsevent)
        //bridge.triggerJSEvent("testEvent", "window", "{ 'testKey': 'dataValue' }");

        // B. Solution from forum: https://forum.ionicframework.com/t/capacitor-v3-plugin-addeventlistener-and-triggerjsevent-lacking-and-dont-work-as-described/206641/3
        myBridge.triggerJSEvent("testEvent", "window", "{ 'testKey': 'dataValue' }");
    }
}
