package com.spotify.connectivity.auth.AuthRequestConfiguration;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthRequestConfiguration	// class@0005de from classes.dex
{
    private final String interactionCallbackUri;
    private final String uiLocale;

    public void AuthRequestConfiguration(String p0,String p1){
       co5.o(p0, "interactionCallbackUri");
       super();
       this.interactionCallbackUri = p0;
       this.uiLocale = p1;
    }
    public void AuthRequestConfiguration(String p0,String p1,int p2,DefaultConstructorMarker p3){
       if ((p2 & 0x02)) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static AuthRequestConfiguration copy$default(AuthRequestConfiguration p0,String p1,String p2,int p3,Object p4){
       AuthRequestConfiguration interactionC;
       AuthRequestConfiguration uiLocale;
       if ((p3 & 0x01)) {
          interactionC = p0.interactionCallbackUri;
       }
       if ((p3 & 0x02)) {
          uiLocale = p0.uiLocale;
       }
       return p0.copy(interactionC, uiLocale);
    }
    public final String component1(){
       return this.interactionCallbackUri;
    }
    public final String component2(){
       return this.uiLocale;
    }
    public final AuthRequestConfiguration copy(String p0,String p1){
       co5.o(p0, "interactionCallbackUri");
       return new AuthRequestConfiguration(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthRequestConfiguration) {
          return false;
       }
       if (!co5.c(this.interactionCallbackUri, p0.interactionCallbackUri)) {
          return false;
       }
       if (!co5.c(this.uiLocale, p0.uiLocale)) {
          return false;
       }
       return true;
    }
    public final String getInteractionCallbackUri(){
       return this.interactionCallbackUri;
    }
    public final String getUiLocale(){
       return this.uiLocale;
    }
    public int hashCode(){
       AuthRequestConfiguration tuiLocale;
       int i = this.interactionCallbackUri.hashCode() * 31;
       int i1 = ((tuiLocale = this.uiLocale) == null)? 0: tuiLocale.hashCode();
       return (i + i1);
    }
    public String toString(){
       return hr7.a("AuthRequestConfiguration\(interactionCallbackUri="+this.interactionCallbackUri+", uiLocale=", this.uiLocale, ')');
    }
}
