package com.spotify.messaging.inappmessagingsdk.display.AutoValue_TouchBoundary$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.messaging.inappmessagingsdk.display.AutoValue_TouchBoundary;

class AutoValue_TouchBoundary$1 implements Parcelable$Creator	// class@000a2c from classes.dex
{

    public void AutoValue_TouchBoundary$1(){
       super();
    }
    public AutoValue_TouchBoundary createFromParcel(Parcel p0){
       return new AutoValue_TouchBoundary(p0.readFloat(), p0.readFloat(), p0.readFloat(), p0.readFloat());
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public AutoValue_TouchBoundary[] newArray(int p0){
       AutoValue_TouchBoundary[] uAutoValue_T = new AutoValue_TouchBoundary[p0];
       return uAutoValue_T;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
