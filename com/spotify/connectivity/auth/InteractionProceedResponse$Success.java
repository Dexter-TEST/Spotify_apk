package com.spotify.connectivity.auth.InteractionProceedResponse$Success;
import com.spotify.connectivity.auth.InteractionProceedResponse;
import com.spotify.connectivity.auth.AuthUserInfo;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class InteractionProceedResponse$Success extends InteractionProceedResponse	// class@0005f7 from classes.dex
{
    private final AuthUserInfo authUserInfo;

    public void InteractionProceedResponse$Success(AuthUserInfo p0){
       co5.o(p0, "authUserInfo");
       super(null);
       this.authUserInfo = p0;
    }
    public static InteractionProceedResponse$Success copy$default(InteractionProceedResponse$Success p0,AuthUserInfo p1,int p2,Object p3){
       InteractionProceedResponse$Success authUserInfo;
       if ((p2 & 0x01)) {
          authUserInfo = p0.authUserInfo;
       }
       return p0.copy(authUserInfo);
    }
    public final AuthUserInfo component1(){
       return this.authUserInfo;
    }
    public final InteractionProceedResponse$Success copy(AuthUserInfo p0){
       co5.o(p0, "authUserInfo");
       return new InteractionProceedResponse$Success(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof InteractionProceedResponse$Success) {
          return false;
       }
       if (!co5.c(this.authUserInfo, p0.authUserInfo)) {
          return false;
       }
       return true;
    }
    public final AuthUserInfo getAuthUserInfo(){
       return this.authUserInfo;
    }
    public int hashCode(){
       return this.authUserInfo.hashCode();
    }
    public String toString(){
       return "Success\(authUserInfo="+this.authUserInfo+')';
    }
}
