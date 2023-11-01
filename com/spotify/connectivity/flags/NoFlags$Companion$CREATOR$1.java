package com.spotify.connectivity.flags.NoFlags$Companion$CREATOR$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.flags.NoFlags;
import java.lang.String;
import p.co5;

public final class NoFlags$Companion$CREATOR$1 implements Parcelable$Creator	// class@000712 from classes.dex
{

    public void NoFlags$Companion$CREATOR$1(){
       super();
    }
    public NoFlags createFromParcel(Parcel p0){
       String str;
       co5.o(p0, "in");
       if ((str = p0.readString()) == null) {
          str = "";
       }
       return new NoFlags(str);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public NoFlags[] newArray(int p0){
       NoFlags[] noFlagsArray = new NoFlags[p0];
       return noFlagsArray;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
