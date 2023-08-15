package com.capacitor.reproduction.triggerJSEvent;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "TestPlugin")
public class TestPlugin extends Plugin {
    @PluginMethod()
    public void testRun(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", "Processed: " + value);
        call.resolve(ret);

        Log.d("TestPlugin", "testRun: " + value);

        TestEvent testEvent = new TestEvent(bridge);
        testEvent.testCall();
    }
}

