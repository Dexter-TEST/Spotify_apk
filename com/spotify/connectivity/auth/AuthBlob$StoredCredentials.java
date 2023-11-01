package com.spotify.connectivity.auth.AuthBlob$StoredCredentials;
import com.spotify.connectivity.auth.AuthBlob;
import com.spotify.connectivity.auth.AuthBlob$StoredCredentials$Creator;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Arrays;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class AuthBlob$StoredCredentials extends AuthBlob	// class@0005cd from classes.dex
{
    private final byte[] storedCredentials;
    private final String username;
    public static final Parcelable$Creator CREATOR;

    static {
       AuthBlob$StoredCredentials.CREATOR = new AuthBlob$StoredCredentials$Creator();
    }
    public void AuthBlob$StoredCredentials(String p0,byte[] p1){
       co5.o(p0, "username");
       co5.o(p1, "storedCredentials");
       super(null);
       this.username = p0;
       this.storedCredentials = p1;
    }
    public static AuthBlob$StoredCredentials copy$default(AuthBlob$StoredCredentials p0,String p1,byte[] p2,int p3,Object p4){
       AuthBlob$StoredCredentials username;
       AuthBlob$StoredCredentials storedCreden;
       if ((p3 & 0x01)) {
          username = p0.username;
       }
       if ((p3 & 0x02)) {
          storedCreden = p0.storedCredentials;
       }
       return p0.copy(username, storedCreden);
    }
    public final String component1(){
       return this.username;
    }
    public final byte[] component2(){
       return this.storedCredentials;
    }
    public final AuthBlob$StoredCredentials copy(String p0,byte[] p1){
       co5.o(p0, "username");
       co5.o(p1, "storedCredentials");
       return new AuthBlob$StoredCredentials(p0, p1);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthBlob$StoredCredentials) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.storedCredentials, p0.storedCredentials)) {
          return false;
       }
       return true;
    }
    public final byte[] getStoredCredentials(){
       return this.storedCredentials;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       return (Arrays.hashCode(this.storedCredentials) + (this.username.hashCode() * 31));
    }
    public String toString(){
       return "StoredCredentials\(username="+this.username+", storedCredentials="+Arrays.toString(this.storedCredentials)+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.username);
       p0.writeByteArray(this.storedCredentials);
    }
}
