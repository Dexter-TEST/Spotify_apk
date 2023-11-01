package com.spotify.connectivity.auth.AuthCredentials$FacebookSignInCredentials;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$FacebookSignInCredentials extends AuthCredentials	// class@0005d3 from classes.dex
{
    private final String accessToken;
    private final String fbUid;

    public void AuthCredentials$FacebookSignInCredentials(String p0,String p1){
       co5.o(p0, "fbUid");
       co5.o(p1, "accessToken");
       super(null);
       this.fbUid = p0;
       this.accessToken = p1;
    }
    public static AuthCredentials$FacebookSignInCredentials copy$default(AuthCredentials$FacebookSignInCredentials p0,String p1,String p2,int p3,Object p4){
       AuthCredentials$FacebookSignInCredentials uFacebookSig;
       AuthCredentials$FacebookSignInCredentials accessToken;
       if ((p3 & 0x01)) {
          uFacebookSig = p0.fbUid;
       }
       if ((p3 & 0x02)) {
          accessToken = p0.accessToken;
       }
       return p0.copy(uFacebookSig, accessToken);
    }
    public final String component1(){
       return this.fbUid;
    }
    public final String component2(){
       return this.accessToken;
    }
    public final AuthCredentials$FacebookSignInCredentials copy(String p0,String p1){
       co5.o(p0, "fbUid");
       co5.o(p1, "accessToken");
       return new AuthCredentials$FacebookSignInCredentials(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$FacebookSignInCredentials) {
          return false;
       }
       if (!co5.c(this.fbUid, p0.fbUid)) {
          return false;
       }
       if (!co5.c(this.accessToken, p0.accessToken)) {
          return false;
       }
       return true;
    }
    public final String getAccessToken(){
       return this.accessToken;
    }
    public final String getFbUid(){
       return this.fbUid;
    }
    public int hashCode(){
       return (this.accessToken.hashCode() + (this.fbUid.hashCode() * 31));
    }
    public String toString(){
       return hr7.a("FacebookSignInCredentials\(fbUid="+this.fbUid+", accessToken=", this.accessToken, ')');
    }
}
