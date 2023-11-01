package com.spotify.connectivity.auth.AuthUserInfo;
import android.os.Parcelable;
import com.spotify.connectivity.auth.AuthUserInfo$Creator;
import java.lang.String;
import com.spotify.connectivity.auth.AccessToken;
import com.spotify.connectivity.auth.AuthBlob;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class AuthUserInfo implements Parcelable	// class@0005e9 from classes.dex
{
    private final AccessToken accessToken;
    private final AuthBlob authBlob;
    private final String username;
    public static final Parcelable$Creator CREATOR;

    static {
       AuthUserInfo.CREATOR = new AuthUserInfo$Creator();
    }
    public void AuthUserInfo(String p0,AccessToken p1,AuthBlob p2){
       co5.o(p0, "username");
       co5.o(p2, "authBlob");
       super();
       this.username = p0;
       this.accessToken = p1;
       this.authBlob = p2;
    }
    public static AuthUserInfo copy$default(AuthUserInfo p0,String p1,AccessToken p2,AuthBlob p3,int p4,Object p5){
       AuthUserInfo username;
       AuthUserInfo accessToken;
       AuthUserInfo authBlob;
       if ((p4 & 0x01)) {
          username = p0.username;
       }
       if ((p4 & 0x02)) {
          accessToken = p0.accessToken;
       }
       if ((p4 & 0x04)) {
          authBlob = p0.authBlob;
       }
       return p0.copy(username, accessToken, authBlob);
    }
    public final String component1(){
       return this.username;
    }
    public final AccessToken component2(){
       return this.accessToken;
    }
    public final AuthBlob component3(){
       return this.authBlob;
    }
    public final AuthUserInfo copy(String p0,AccessToken p1,AuthBlob p2){
       co5.o(p0, "username");
       co5.o(p2, "authBlob");
       return new AuthUserInfo(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthUserInfo) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.accessToken, p0.accessToken)) {
          return false;
       }
       if (!co5.c(this.authBlob, p0.authBlob)) {
          return false;
       }
       return true;
    }
    public final AccessToken getAccessToken(){
       return this.accessToken;
    }
    public final AuthBlob getAuthBlob(){
       return this.authBlob;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       AuthUserInfo taccessToken;
       int i = this.username.hashCode() * 31;
       int i1 = ((taccessToken = this.accessToken) == null)? 0: taccessToken.hashCode();
       return (this.authBlob.hashCode() + ((i + i1) * 31));
    }
    public String toString(){
       return "AuthUserInfo\(username="+this.username+", accessToken="+this.accessToken+", authBlob="+this.authBlob+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       AuthUserInfo taccessToken;
       co5.o(p0, "out");
       p0.writeString(this.username);
       if ((taccessToken = this.accessToken) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          taccessToken.writeToParcel(p0, p1);
       }
       p0.writeParcelable(this.authBlob, p1);
       return;
    }
}
