package com.localmodule;

import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class LocalModuleEventEmitter {
    private final RCTEventEmitter eventEmitter;

    private int viewId = View.NO_ID;

    public LocalModuleEventEmitter(ReactContext reactContext) {
        this.eventEmitter = reactContext.getJSModule(RCTEventEmitter.class);
    }

    public void setViewId(int id) {
        this.viewId = id;
    }

    public void colorChanged() {
        this.eventEmitter.receiveEvent(viewId, "onColorChanged", null);
    }
}