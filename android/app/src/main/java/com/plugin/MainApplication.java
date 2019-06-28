package com.plugin;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.wenkesj.voice.VoicePackage;
import cl.json.RNSharePackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.imagepicker.ImagePickerPackage;
import com.agontuk.RNFusedLocation.RNFusedLocationPackage;
import com.hieuvp.fingerprint.ReactNativeFingerprintScannerPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new VoicePackage(),
            new RNSharePackage(),
            new LinearGradientPackage(),
            new ImagePickerPackage(),
            new RNFusedLocationPackage(),
            new ReactNativeFingerprintScannerPackage(),
            new VectorIconsPackage(),
            new RNGestureHandlerPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
