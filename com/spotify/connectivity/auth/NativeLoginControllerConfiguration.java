package com.spotify.connectivity.auth.NativeLoginControllerConfiguration;
import java.lang.Object;
import java.lang.String;

public final class NativeLoginControllerConfiguration	// class@0005fe from classes.dex
{
    private String accesspointLanguage;
    private String cachePath;
    private String clientID;
    private String contentAccessRefreshToken;
    private String deviceHardwareModel;
    private String deviceId;
    private int protocolOsOverride;
    private int reconnectPolicy;
    private long revision;
    private int streamingRulesSupported;
    private boolean tracingEnabled;
    private String versionLong;

    public void NativeLoginControllerConfiguration(){
       super();
       this.reconnectPolicy = 2;
    }
    public final String getAccesspointLanguage(){
       return this.accesspointLanguage;
    }
    public final String getCachePath(){
       return this.cachePath;
    }
    public final String getClientID(){
       return this.clientID;
    }
    public final String getContentAccessRefreshToken(){
       return this.contentAccessRefreshToken;
    }
    public final String getDeviceHardwareModel(){
       return this.deviceHardwareModel;
    }
    public final String getDeviceId(){
       return this.deviceId;
    }
    public final int getProtocolOsOverride(){
       return this.protocolOsOverride;
    }
    public final int getReconnectPolicy(){
       return this.reconnectPolicy;
    }
    public final long getRevision(){
       return this.revision;
    }
    public final int getStreamingRulesSupported(){
       return this.streamingRulesSupported;
    }
    public final boolean getTracingEnabled(){
       return this.tracingEnabled;
    }
    public final String getVersionLong(){
       return this.versionLong;
    }
    public final void setAccesspointLanguage(String p0){
       this.accesspointLanguage = p0;
    }
    public final void setCachePath(String p0){
       this.cachePath = p0;
    }
    public final void setClientID(String p0){
       this.clientID = p0;
    }
    public final void setContentAccessRefreshToken(String p0){
       this.contentAccessRefreshToken = p0;
    }
    public final void setDeviceHardwareModel(String p0){
       this.deviceHardwareModel = p0;
    }
    public final void setDeviceId(String p0){
       this.deviceId = p0;
    }
    public final void setProtocolOsOverride(int p0){
       this.protocolOsOverride = p0;
    }
    public final void setReconnectPolicy(int p0){
       this.reconnectPolicy = p0;
    }
    public final void setRevision(long p0){
       this.revision = p0;
    }
    public final void setStreamingRulesSupported(int p0){
       this.streamingRulesSupported = p0;
    }
    public final void setTracingEnabled(boolean p0){
       this.tracingEnabled = p0;
    }
    public final void setVersionLong(String p0){
       this.versionLong = p0;
    }
}
