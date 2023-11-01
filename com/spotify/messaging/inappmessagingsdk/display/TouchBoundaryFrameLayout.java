package com.spotify.messaging.inappmessagingsdk.display.TouchBoundaryFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import com.spotify.messaging.inappmessagingsdk.display.TouchBoundary;
import org.json.JSONArray;
import org.json.JSONObject;
import android.view.MotionEvent;

public class TouchBoundaryFrameLayout extends FrameLayout	// class@000a46 from classes.dex
{
    private TouchBoundary[] mBoundaries;
    private boolean mShouldConsumeAllTouches;

    public void TouchBoundaryFrameLayout(Context p0){
       super(p0);
    }
    public void TouchBoundaryFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TouchBoundaryFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static TouchBoundary[] getTouchBoundariesFromString(String p0,float p1){
       JSONArray jSONArray = new JSONArray(p0);
       TouchBoundary[] touchBoundar = new TouchBoundary[jSONArray.length()];
       for (int i = 0; i < jSONArray.length(); i = i + 1) {
          JSONObject jSONObject = jSONArray.getJSONObject(i);
          touchBoundar[i] = TouchBoundary.create((float)jSONObject.getInt("mXPos"), (float)jSONObject.getInt("mYPos"), (float)jSONObject.getInt("mHeight"), (float)jSONObject.getInt("mWidth"), p1);
       }
       return touchBoundar;
    }
    public void consumeAllTouches(){
       this.mShouldConsumeAllTouches = true;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return (this.shouldAllowTouch(p0) ^ 0x01);
    }
    public void registerTouchBoundries(TouchBoundary[] p0){
       this.mBoundaries = p0;
    }
    public boolean shouldAllowTouch(MotionEvent p0){
       TouchBoundaryFrameLayout tmBoundaries;
       float f1;
       if (this.mShouldConsumeAllTouches != null) {
          return true;
       }
       if ((tmBoundaries = this.mBoundaries) != null) {
          int len = tmBoundaries.length;
          int i = 0;
          while (i < len) {
             object oobject = tmBoundaries[i];
             if ((oobject.mYPos() - p0.getY()) > 0 && (oobject.mXPos() - p0.getX()) > 0) {
                float f = oobject.mHeight() + oobject.mYPos();
                if ((p0.getY() - f) < 0 && ((f1 = oobject.mWidth() + oobject.mXPos())) < 0) {
                   return true;
                }
             }
             i = i + 1;
          }
       }
       return false;
    }
}
