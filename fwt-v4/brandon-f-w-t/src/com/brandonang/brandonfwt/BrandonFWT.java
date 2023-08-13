package com.brandonang.brandonfwt;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.runtime.EventDispatcher;

public class BrandonFWT extends AndroidNonvisibleComponent {

  //Activity and Context
  private Activity activity;
  private Context context;

  public BrandonFWT(ComponentContainer container) {
    super(container.$form());
    this.activity = container.$context();
    this.context = container.$context();
  }

  @SimpleFunction
  public void CreateFWTLabel(AndroidViewComponent layout){
    View view = layout.getView();
    FrameLayout frameLayout = (FrameLayout) view;
    TextView tv = new TextView(this.context);
    tv.setText("🤒");
    frameLayout.addView(tv);
  }
  
  @SimpleFunction
  public void AnimateFWT(AndroidViewComponent layout, int duration, int startOffset){
    View view = layout.getView();
    FrameLayout frameLayout = (FrameLayout) view;
    TextView tv = new TextView(this.context);
    Animation anim = new AlphaAnimation(0.0f, 1.0f);
    anim.setDuration(duration);
    anim.setStartOffset(startOffset);
    anim.setRepeatMode(Animation.REVERSE);
    anim.setRepeatCount(Animation.INFINITE);
    tv.setText("🤒");
    tv.startAnimation(anim);
    frameLayout.addView(tv);
  }

  @SimpleFunction
  public String SaveData(String username){
    String data = "🤒" + username;
    GetData(data);
    return data;
  }

  @SimpleEvent
  public void GetData(String data){
    EventDispatcher.dispatchEvent(this, "GetData", data);
  }
}