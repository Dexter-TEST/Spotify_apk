package com.spotify.connectivity.auth.AccessToken;
import android.os.Parcelable;
import com.spotify.connectivity.auth.AccessToken$Creator;
import java.lang.String;
import java.util.Date;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.io.Serializable;

public final class AccessToken implements Parcelable	// class@0005ca from classes.dex
{
    private final Date expiresAt;
    private final String token;
    private final String type;
    public static final Parcelable$Creator CREATOR;

    static {
       AccessToken.CREATOR = new AccessToken$Creator();
    }
    public void AccessToken(String p0,String p1,Date p2){
       co5.o(p0, "type");
       co5.o(p1, "token");
       co5.o(p2, "expiresAt");
       super();
       this.type = p0;
       this.token = p1;
       this.expiresAt = p2;
    }
    public static AccessToken copy$default(AccessToken p0,String p1,String p2,Date p3,int p4,Object p5){
       AccessToken type;
       AccessToken token;
       AccessToken expiresAt;
       if ((p4 & 0x01)) {
          type = p0.type;
       }
       if ((p4 & 0x02)) {
          token = p0.token;
       }
       if ((p4 & 0x04)) {
          expiresAt = p0.expiresAt;
       }
       return p0.copy(type, token, expiresAt);
    }
    public final String component1(){
       return this.type;
    }
    public final String component2(){
       return this.token;
    }
    public final Date component3(){
       return this.expiresAt;
    }
    public final AccessToken copy(String p0,String p1,Date p2){
       co5.o(p0, "type");
       co5.o(p1, "token");
       co5.o(p2, "expiresAt");
       return new AccessToken(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AccessToken) {
          return false;
       }
       if (!co5.c(this.type, p0.type)) {
          return false;
       }
       if (!co5.c(this.token, p0.token)) {
          return false;
       }
       if (!co5.c(this.expiresAt, p0.expiresAt)) {
          return false;
       }
       return true;
    }
    public final Date getExpiresAt(){
       return this.expiresAt;
    }
    public final String getToken(){
       return this.token;
    }
    public final String getType(){
       return this.type;
    }
    public int hashCode(){
       return (this.expiresAt.hashCode() + tp2.g(this.token, (this.type.hashCode() * 31), 31));
    }
    public String toString(){
       return "AccessToken\(type="+this.type+", token="+this.token+", expiresAt="+this.expiresAt+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.type);
       p0.writeString(this.token);
       p0.writeSerializable(this.expiresAt);
    }
}
