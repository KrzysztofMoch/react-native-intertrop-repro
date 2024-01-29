package com.localmodule;

import android.graphics.Color;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Map;

public class LocalModuleViewManager extends SimpleViewManager<LocalModuleView> {
  public static final String REACT_CLASS = "LocalModuleView";

  @Override
  @NonNull
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  @NonNull
  public LocalModuleView createViewInstance(ThemedReactContext reactContext) {
    return new LocalModuleView(reactContext);
  }

  @ReactProp(name = "color")
  public void setColor(View view, String color) {
    view.setBackgroundColor(Color.parseColor(color));
  }

  @Override
  public @Nullable Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    MapBuilder.Builder<String, Object> builder = MapBuilder.builder();

    builder.put("onColorChanged", MapBuilder.of("registrationName", "onColorChanged"));

    return builder.build();
  }
}
