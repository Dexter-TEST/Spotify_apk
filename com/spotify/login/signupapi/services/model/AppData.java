package com.spotify.login.signupapi.services.model.AppData;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import p.k73;
import p.rf6;
import java.lang.StringBuilder;
import p.hr7;

public final class AppData	// class@000993 from classes.dex
{
    private final String appVersion;
    private final String creationPoint;
    private final String key;

    public void AppData(){
       super(null, null, null, 7, null);
    }
    public void AppData(String p0,String p1,String p2){
       super();
       this.key = p0;
       this.creationPoint = p1;
       this.appVersion = p2;
    }
    public void AppData(String p0,String p1,String p2,int p3,DefaultConstructorMarker p4){
       if ((p3 & 0x01)) {
          p0 = null;
       }
       if ((p3 & 0x02)) {
          p1 = null;
       }
       if ((p3 & 0x04)) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static AppData copy$default(AppData p0,String p1,String p2,String p3,int p4,Object p5){
       AppData key;
       AppData creationPoin;
       AppData appVersion;
       if ((p4 & 0x01)) {
          key = p0.key;
       }
       if ((p4 & 0x02)) {
          creationPoin = p0.creationPoint;
       }
       if ((p4 & 0x04)) {
          appVersion = p0.appVersion;
       }
       return p0.copy(key, creationPoin, appVersion);
    }
    public final String component1(){
       return this.key;
    }
    public final String component2(){
       return this.creationPoint;
    }
    public final String component3(){
       return this.appVersion;
    }
    public final AppData copy(String p0,String p1,String p2){
       return new AppData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AppData) {
          return false;
       }
       if (!co5.c(this.key, p0.key)) {
          return false;
       }
       if (!co5.c(this.creationPoint, p0.creationPoint)) {
          return false;
       }
       if (!co5.c(this.appVersion, p0.appVersion)) {
          return false;
       }
       return true;
    }
    public final String getAppVersion(){
       return this.appVersion;
    }
    public final String getCreationPoint(){
       return this.creationPoint;
    }
    public final String getKey(){
       return this.key;
    }
    public int hashCode(){
       AppData tcreationPoi;
       AppData tkey = this.key;
       int i = 0;
       int i1 = (tkey == null)? 0: tkey.hashCode();
       i1 = i1 * 31;
       int i2 = ((tcreationPoi = this.creationPoint) == null)? 0: tcreationPoi.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tcreationPoi = this.appVersion) != null) {
          i = tcreationPoi.hashCode();
       }
       return (i1 + i);
    }
    public final void setFields(k73 p0){
       AppData tkey;
       co5.o(p0, "paramBuilder");
       if ((tkey = this.key) == null) {
          tkey = rf6.a;
       }
       p0.d("key", tkey);
       p0.d("platform", "Android-ARM");
       if ((tkey = this.appVersion) != null) {
          p0.d("app_version", tkey);
       }
       if ((tkey = this.creationPoint) != null) {
          p0.d("creation_point", tkey);
       }
       return;
    }
    public String toString(){
       return hr7.a("AppData\(key="+this.key+", creationPoint="+this.creationPoint+", appVersion=", this.appVersion, ')');
    }
}
