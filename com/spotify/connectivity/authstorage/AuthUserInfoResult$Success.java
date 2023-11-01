package com.spotify.connectivity.authstorage.AuthUserInfoResult$Success;
import com.spotify.connectivity.authstorage.AuthUserInfoResult;
import com.spotify.connectivity.auth.AuthUserInfo;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthUserInfoResult$Success extends AuthUserInfoResult	// class@000675 from classes.dex
{
    private final AuthUserInfo userInfo;

    public void AuthUserInfoResult$Success(AuthUserInfo p0){
       co5.o(p0, "userInfo");
       super(null);
       this.userInfo = p0;
    }
    public static AuthUserInfoResult$Success copy$default(AuthUserInfoResult$Success p0,AuthUserInfo p1,int p2,Object p3){
       AuthUserInfoResult$Success userInfo;
       if ((p2 & 0x01)) {
          userInfo = p0.userInfo;
       }
       return p0.copy(userInfo);
    }
    public final AuthUserInfo component1(){
       return this.userInfo;
    }
    public final AuthUserInfoResult$Success copy(AuthUserInfo p0){
       co5.o(p0, "userInfo");
       return new AuthUserInfoResult$Success(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthUserInfoResult$Success) {
          return false;
       }
       if (!co5.c(this.userInfo, p0.userInfo)) {
          return false;
       }
       return true;
    }
    public final AuthUserInfo getUserInfo(){
       return this.userInfo;
    }
    public int hashCode(){
       return this.userInfo.hashCode();
    }
    public String toString(){
       return "Success\(userInfo="+this.userInfo+')';
    }
}
