package com.spotify.login.signupapi.services.model.AppData$Builder;
import com.spotify.login.signupapi.services.model.AppData;
import java.lang.Object;
import java.lang.String;

public final class AppData$Builder	// class@000992 from classes.dex
{
    private String appVersion;
    private String creationPoint;
    private String key;

    public void AppData$Builder(AppData p0){
       super();
       String str = null;
       String key = (p0 != null)? p0.getKey(): str;
       this.key = key;
       key = (p0 != null)? p0.getCreationPoint(): str;
       this.creationPoint = key;
       if (p0 != null) {
          str = p0.getAppVersion();
       }
       this.appVersion = str;
       return;
    }
    public final AppData$Builder appVersion(String p0){
       this.appVersion = p0;
       return this;
    }
    public final AppData build(){
       return new AppData(this.key, this.creationPoint, this.appVersion);
    }
    public final AppData$Builder creationPoint(String p0){
       this.creationPoint = p0;
       return this;
    }
    public final AppData$Builder key(String p0){
       this.key = p0;
       return this;
    }
}
