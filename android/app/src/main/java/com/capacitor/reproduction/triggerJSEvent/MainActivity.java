package com.capacitor.reproduction.triggerJSEvent;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(TestPlugin.class);
        super.onCreate(savedInstanceState);
    }
}
