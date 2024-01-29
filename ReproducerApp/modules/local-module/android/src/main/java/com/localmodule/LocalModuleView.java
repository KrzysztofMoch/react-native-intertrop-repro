package com.localmodule;

import android.content.Context;
import android.view.View;

import androidx.annotation.ColorInt;

import com.facebook.react.uimanager.ThemedReactContext;

public class LocalModuleView extends View {
    LocalModuleEventEmitter eventEmitter;
    public LocalModuleView(ThemedReactContext context) {
        super(context);
        eventEmitter = new LocalModuleEventEmitter(context);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
        eventEmitter.setViewId(id);
    }

    @Override
    public void setBackgroundColor(@ColorInt int color) {
        super.setBackgroundColor(color);
        eventEmitter.colorChanged();
    }
}
