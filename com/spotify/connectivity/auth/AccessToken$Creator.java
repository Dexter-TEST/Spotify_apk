package com.spotify.connectivity.auth.AccessToken$Creator;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.auth.AccessToken;
import java.lang.String;
import p.co5;
import java.io.Serializable;
import java.util.Date;

public final class AccessToken$Creator implements Parcelable$Creator	// class@0005c9 from classes.dex
{

    public void AccessToken$Creator(){
       super();
    }
    public final AccessToken createFromParcel(Parcel p0){
       co5.o(p0, "parcel");
       return new AccessToken(p0.readString(), p0.readString(), p0.readSerializable());
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final AccessToken[] newArray(int p0){
       AccessToken[] uAccessToken = new AccessToken[p0];
       return uAccessToken;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
