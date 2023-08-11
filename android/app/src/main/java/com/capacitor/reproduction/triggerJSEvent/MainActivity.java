package com.capacitor.reproduction.triggerJSEvent;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(TestPlugin.class);
        /*
        Import problematic plugin (which contains 'triggerJSEvent')
        The error occurs even if the plugin is not registered.
        */
        registerPlugin(TestEvent.class);
        super.onCreate(savedInstanceState);
    }
}
