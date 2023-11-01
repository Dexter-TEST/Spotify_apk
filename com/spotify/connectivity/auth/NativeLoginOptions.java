package com.spotify.connectivity.auth.NativeLoginOptions;
import java.lang.Object;
import java.lang.String;

public final class NativeLoginOptions	// class@0005ff from classes.dex
{
    private String apHostOverride;
    private String apSrvHostOverride;
    private boolean authOnly;
    private boolean bootstrapRequired;
    private byte[] cacheId;
    private byte[] cacheSalt;
    private String canonicalUsername;
    private boolean enableAlwaysBootstrap;
    private boolean maintainPersistentApConnection;
    private String proxyHostName;
    private int proxyOption;
    private String proxyPassword;
    private int proxyPort;
    private String proxyUserName;
    private String referrer;
    private String xResolveHostOverride;

    public void NativeLoginOptions(){
       super();
       this.maintainPersistentApConnection = true;
    }
    public final String getApHostOverride(){
       return this.apHostOverride;
    }
    public final String getApSrvHostOverride(){
       return this.apSrvHostOverride;
    }
    public final boolean getAuthOnly(){
       return this.authOnly;
    }
    public final boolean getBootstrapRequired(){
       return this.bootstrapRequired;
    }
    public final byte[] getCacheId(){
       return this.cacheId;
    }
    public final byte[] getCacheSalt(){
       return this.cacheSalt;
    }
    public final String getCanonicalUsername(){
       return this.canonicalUsername;
    }
    public final boolean getEnableAlwaysBootstrap(){
       return this.enableAlwaysBootstrap;
    }
    public final boolean getMaintainPersistentApConnection(){
       return this.maintainPersistentApConnection;
    }
    public final String getProxyHostName(){
       return this.proxyHostName;
    }
    public final int getProxyOption(){
       return this.proxyOption;
    }
    public final String getProxyPassword(){
       return this.proxyPassword;
    }
    public final int getProxyPort(){
       return this.proxyPort;
    }
    public final String getProxyUserName(){
       return this.proxyUserName;
    }
    public final String getReferrer(){
       return this.referrer;
    }
    public final String getXResolveHostOverride(){
       return this.xResolveHostOverride;
    }
    public final void setApHostOverride(String p0){
       this.apHostOverride = p0;
    }
    public final void setApSrvHostOverride(String p0){
       this.apSrvHostOverride = p0;
    }
    public final void setAuthOnly(boolean p0){
       this.authOnly = p0;
    }
    public final void setBootstrapRequired(boolean p0){
       this.bootstrapRequired = p0;
    }
    public final void setCacheId(byte[] p0){
       this.cacheId = p0;
    }
    public final void setCacheSalt(byte[] p0){
       this.cacheSalt = p0;
    }
    public final void setCanonicalUsername(String p0){
       this.canonicalUsername = p0;
    }
    public final void setEnableAlwaysBootstrap(boolean p0){
       this.enableAlwaysBootstrap = p0;
    }
    public final void setMaintainPersistentApConnection(boolean p0){
       this.maintainPersistentApConnection = p0;
    }
    public final void setProxyHostName(String p0){
       this.proxyHostName = p0;
    }
    public final void setProxyOption(int p0){
       this.proxyOption = p0;
    }
    public final void setProxyPassword(String p0){
       this.proxyPassword = p0;
    }
    public final void setProxyPort(int p0){
       this.proxyPort = p0;
    }
    public final void setProxyUserName(String p0){
       this.proxyUserName = p0;
    }
    public final void setReferrer(String p0){
       this.referrer = p0;
    }
    public final void setXResolveHostOverride(String p0){
       this.xResolveHostOverride = p0;
    }
}
