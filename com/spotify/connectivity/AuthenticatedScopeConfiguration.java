package com.spotify.connectivity.AuthenticatedScopeConfiguration;
import java.lang.Object;
import java.lang.String;

public final class AuthenticatedScopeConfiguration	// class@0005ab from classes.dex
{
    private String cachePath;
    private String clientId;
    private String clientVersionLong;
    private int dealerPingTime;
    private String deviceId;
    private boolean includePayloads;
    private String webgateLocale;
    private String webgateUserAgentParameterAppPlatform;
    private String webgateUserAgentParameterAppVersion;
    private String webgateUserAgentParameterExtraInformation;
    private String webgateUserAgentParameterOsVersion;

    public void AuthenticatedScopeConfiguration(){
       super();
       this.dealerPingTime = 0x7530;
    }
    public final String getCachePath(){
       return this.cachePath;
    }
    public final String getClientId(){
       return this.clientId;
    }
    public final String getClientVersionLong(){
       return this.clientVersionLong;
    }
    public final int getDealerPingTime(){
       return this.dealerPingTime;
    }
    public final String getDeviceId(){
       return this.deviceId;
    }
    public final boolean getIncludePayloads(){
       return this.includePayloads;
    }
    public final String getWebgateLocale(){
       return this.webgateLocale;
    }
    public final String getWebgateUserAgentParameterAppPlatform(){
       return this.webgateUserAgentParameterAppPlatform;
    }
    public final String getWebgateUserAgentParameterAppVersion(){
       return this.webgateUserAgentParameterAppVersion;
    }
    public final String getWebgateUserAgentParameterExtraInformation(){
       return this.webgateUserAgentParameterExtraInformation;
    }
    public final String getWebgateUserAgentParameterOsVersion(){
       return this.webgateUserAgentParameterOsVersion;
    }
    public final void setCachePath(String p0){
       this.cachePath = p0;
    }
    public final void setClientId(String p0){
       this.clientId = p0;
    }
    public final void setClientVersionLong(String p0){
       this.clientVersionLong = p0;
    }
    public final void setDealerPingTime(int p0){
       this.dealerPingTime = p0;
    }
    public final void setDeviceId(String p0){
       this.deviceId = p0;
    }
    public final void setIncludePayloads(boolean p0){
       this.includePayloads = p0;
    }
    public final void setWebgateLocale(String p0){
       this.webgateLocale = p0;
    }
    public final void setWebgateUserAgentParameterAppPlatform(String p0){
       this.webgateUserAgentParameterAppPlatform = p0;
    }
    public final void setWebgateUserAgentParameterAppVersion(String p0){
       this.webgateUserAgentParameterAppVersion = p0;
    }
    public final void setWebgateUserAgentParameterExtraInformation(String p0){
       this.webgateUserAgentParameterExtraInformation = p0;
    }
    public final void setWebgateUserAgentParameterOsVersion(String p0){
       this.webgateUserAgentParameterOsVersion = p0;
    }
}
