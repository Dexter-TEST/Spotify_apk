package com.spotify.connectivity.auth.AuthUserInfo$Creator;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.auth.AuthUserInfo;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.AccessToken;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import com.spotify.connectivity.auth.AuthBlob;

public final class AuthUserInfo$Creator implements Parcelable$Creator	// class@0005e8 from classes.dex
{

    public void AuthUserInfo$Creator(){
       super();
    }
    public final AuthUserInfo createFromParcel(Parcel p0){
       co5.o(p0, "parcel");
       String str = p0.readString();
       AccessToken uAccessToken = (!p0.readInt())? null: AccessToken.CREATOR.createFromParcel(p0);
       return new AuthUserInfo(str, uAccessToken, p0.readParcelable(AuthUserInfo.class.getClassLoader()));
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final AuthUserInfo[] newArray(int p0){
       AuthUserInfo[] uAuthUserInf = new AuthUserInfo[p0];
       return uAuthUserInf;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
