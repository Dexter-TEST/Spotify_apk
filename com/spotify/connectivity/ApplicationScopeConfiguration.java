package com.spotify.connectivity.ApplicationScopeConfiguration;
import java.lang.Object;
import com.spotify.connectivity.ReconnectPolicy;
import java.lang.String;

public final class ApplicationScopeConfiguration	// class@0005a9 from classes.dex
{
    private String accesspointLanguage;
    private String cachePath;
    private String clientId;
    private int clientRevision;
    private String clientVersionLong;
    private String contentAccessRefreshToken;
    private String defaultHTTPUserAgent;
    private String deviceHardwareModel;
    private String deviceId;
    private boolean enableClientToken;
    private boolean enableIPv6;
    private boolean enableOldNetworkImplementation;
    private boolean enablePerformanceTracing;
    private String encryptedPersistedClientToken;
    private int protocolOsOverride;
    private int protocolPlatformOverride;
    private int protocolProductOverride;
    private int reconnectPolicy;

    public void ApplicationScopeConfiguration(){
       super();
       this.enableIPv6 = true;
       this.reconnectPolicy = ReconnectPolicy.AUTOMATIC_ON_CHANGE;
       this.protocolOsOverride = -1;
       this.protocolPlatformOverride = -1;
       this.protocolProductOverride = -1;
    }
    public final String getAccesspointLanguage(){
       return this.accesspointLanguage;
    }
    public final String getCachePath(){
       return this.cachePath;
    }
    public final String getClientId(){
       return this.clientId;
    }
    public final int getClientRevision(){
       return this.clientRevision;
    }
    public final String getClientVersionLong(){
       return this.clientVersionLong;
    }
    public final String getContentAccessRefreshToken(){
       return this.contentAccessRefreshToken;
    }
    public final String getDefaultHTTPUserAgent(){
       return this.defaultHTTPUserAgent;
    }
    public final String getDeviceHardwareModel(){
       return this.deviceHardwareModel;
    }
    public final String getDeviceId(){
       return this.deviceId;
    }
    public final boolean getEnableClientToken(){
       return this.enableClientToken;
    }
    public final boolean getEnableIPv6(){
       return this.enableIPv6;
    }
    public final boolean getEnableOldNetworkImplementation(){
       return this.enableOldNetworkImplementation;
    }
    public final boolean getEnablePerformanceTracing(){
       return this.enablePerformanceTracing;
    }
    public final String getEncryptedPersistedClientToken(){
       return this.encryptedPersistedClientToken;
    }
    public final int getProtocolOsOverride(){
       return this.protocolOsOverride;
    }
    public final int getProtocolPlatformOverride(){
       return this.protocolPlatformOverride;
    }
    public final int getProtocolProductOverride(){
       return this.protocolProductOverride;
    }
    public final int getReconnectPolicy(){
       return this.reconnectPolicy;
    }
    public final void setAccesspointLanguage(String p0){
       this.accesspointLanguage = p0;
    }
    public final void setCachePath(String p0){
       this.cachePath = p0;
    }
    public final void setClientId(String p0){
       this.clientId = p0;
    }
    public final void setClientRevision(int p0){
       this.clientRevision = p0;
    }
    public final void setClientVersionLong(String p0){
       this.clientVersionLong = p0;
    }
    public final void setContentAccessRefreshToken(String p0){
       this.contentAccessRefreshToken = p0;
    }
    public final void setDefaultHTTPUserAgent(String p0){
       this.defaultHTTPUserAgent = p0;
    }
    public final void setDeviceHardwareModel(String p0){
       this.deviceHardwareModel = p0;
    }
    public final void setDeviceId(String p0){
       this.deviceId = p0;
    }
    public final void setEnableClientToken(boolean p0){
       this.enableClientToken = p0;
    }
    public final void setEnableIPv6(boolean p0){
       this.enableIPv6 = p0;
    }
    public final void setEnableOldNetworkImplementation(boolean p0){
       this.enableOldNetworkImplementation = p0;
    }
    public final void setEnablePerformanceTracing(boolean p0){
       this.enablePerformanceTracing = p0;
    }
    public final void setEncryptedPersistedClientToken(String p0){
       this.encryptedPersistedClientToken = p0;
    }
    public final void setProtocolOsOverride(int p0){
       this.protocolOsOverride = p0;
    }
    public final void setProtocolPlatformOverride(int p0){
       this.protocolPlatformOverride = p0;
    }
    public final void setProtocolProductOverride(int p0){
       this.protocolProductOverride = p0;
    }
    public final void setReconnectPolicy(int p0){
       this.reconnectPolicy = p0;
    }
}
