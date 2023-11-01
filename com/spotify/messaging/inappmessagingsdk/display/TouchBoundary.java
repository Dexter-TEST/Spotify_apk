package com.spotify.messaging.inappmessagingsdk.display.TouchBoundary;
import android.os.Parcelable;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.AutoValue_TouchBoundary;

public abstract class TouchBoundary implements Parcelable	// class@000a45 from classes.dex
{

    public void TouchBoundary(){
       super();
    }
    public static TouchBoundary create(float p0,float p1,float p2,float p3,float p4){
       return new AutoValue_TouchBoundary((p0 * p4), (p1 * p4), (p2 * p4), (p3 * p4));
    }
    public abstract float mHeight();
    public abstract float mWidth();
    public abstract float mXPos();
    public abstract float mYPos();
}
