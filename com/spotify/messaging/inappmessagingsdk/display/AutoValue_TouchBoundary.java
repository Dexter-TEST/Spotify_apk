package com.spotify.messaging.inappmessagingsdk.display.AutoValue_TouchBoundary;
import com.spotify.messaging.inappmessagingsdk.display.$AutoValue_TouchBoundary;
import com.spotify.messaging.inappmessagingsdk.display.AutoValue_TouchBoundary$1;
import android.os.Parcel;

final class AutoValue_TouchBoundary extends $AutoValue_TouchBoundary	// class@000a2d from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       AutoValue_TouchBoundary.CREATOR = new AutoValue_TouchBoundary$1();
    }
    public void AutoValue_TouchBoundary(float p0,float p1,float p2,float p3){
       super(p0, p1, p2, p3);
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeFloat(this.mXPos());
       p0.writeFloat(this.mYPos());
       p0.writeFloat(this.mHeight());
       p0.writeFloat(this.mWidth());
    }
}
