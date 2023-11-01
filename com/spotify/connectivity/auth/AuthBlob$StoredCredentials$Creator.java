package com.spotify.connectivity.auth.AuthBlob$StoredCredentials$Creator;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.auth.AuthBlob$StoredCredentials;
import java.lang.String;
import p.co5;

public final class AuthBlob$StoredCredentials$Creator implements Parcelable$Creator	// class@0005cc from classes.dex
{

    public void AuthBlob$StoredCredentials$Creator(){
       super();
    }
    public final AuthBlob$StoredCredentials createFromParcel(Parcel p0){
       co5.o(p0, "parcel");
       return new AuthBlob$StoredCredentials(p0.readString(), p0.createByteArray());
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final AuthBlob$StoredCredentials[] newArray(int p0){
       AuthBlob$StoredCredentials[] storedCreden = new AuthBlob$StoredCredentials[p0];
       return storedCreden;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
