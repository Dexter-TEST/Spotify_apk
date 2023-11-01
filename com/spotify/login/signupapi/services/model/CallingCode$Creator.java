package com.spotify.login.signupapi.services.model.CallingCode$Creator;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.lang.String;
import p.co5;

public final class CallingCode$Creator implements Parcelable$Creator	// class@000994 from classes.dex
{

    public void CallingCode$Creator(){
       super();
    }
    public final CallingCode createFromParcel(Parcel p0){
       co5.o(p0, "parcel");
       return new CallingCode(p0.readString(), p0.readString());
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final CallingCode[] newArray(int p0){
       CallingCode[] uCallingCode = new CallingCode[p0];
       return uCallingCode;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
