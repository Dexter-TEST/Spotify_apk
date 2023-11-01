package com.spotify.clientfoundations.core.corelimitedimpl.LimitedAuthenticatedScopeConfiguration;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.util.Arrays;
import java.lang.StringBuilder;
import p.hr7;

public final class LimitedAuthenticatedScopeConfiguration	// class@000566 from classes.dex
{
    private String cachePath;
    private String clientId;
    private String deduplicationId;
    private String description;
    private String descriptionShort;
    private String deviceId;
    private String deviceModelName;
    private String deviceName;
    private int deviceType;
    private String nativeBundleId;
    private String settingsPath;
    private String[] supportedContentTypes;
    private String versionName;
    private int versionNumber;
    private String volatileCachePath;
    private int volumeSteps;

    public void LimitedAuthenticatedScopeConfiguration(){
       super(null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 0, null, 0xffff, null);
    }
    public void LimitedAuthenticatedScopeConfiguration(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,int p8,String p9,String p10,int p11,String[] p12,String p13,int p14,String p15){
       int i = this;
       super();
       i.clientId = p0;
       i.nativeBundleId = p1;
       i.deviceName = p2;
       i.description = p3;
       i.descriptionShort = p4;
       i.cachePath = p5;
       i.volatileCachePath = p6;
       i.settingsPath = p7;
       i.versionNumber = p8;
       i.versionName = p9;
       i.deviceId = p10;
       i.deviceType = p11;
       i.supportedContentTypes = p12;
       i.deduplicationId = p13;
       i.volumeSteps = p14;
       i.deviceModelName = p15;
    }
    public void LimitedAuthenticatedScopeConfiguration(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,int p8,String p9,String p10,int p11,String[] p12,String p13,int p14,String p15,int p16,DefaultConstructorMarker p17){
       int i = p16;
       int i1 = ((i & 0x01))? 0: p0;
       int i2 = ((i & 0x02))? 0: p1;
       int i3 = ((i & 0x04))? 0: p2;
       int i4 = ((i & 0x08))? 0: p3;
       int i5 = ((i & 0x10))? 0: p4;
       int i6 = ((i & 0x20))? 0: p5;
       int i7 = ((i & 0x40))? 0: p6;
       int i8 = ((i & 0x0080))? 0: p7;
       int i9 = 0;
       int i10 = ((i & 0x0100))? 0: p8;
       int i11 = ((i & 0x0200))? 0: p9;
       int i12 = ((i & 0x0400))? 0: p10;
       if (!((i & 0x0800))) {
          i9 = p11;
       }
       int i13 = ((i & 0x1000))? 0: p12;
       int i14 = ((i & 0x2000))? 0: p13;
       int i15 = ((i & 0x4000))? 32: p14;
       i = ((i & 0x8000))? 0: p15;
       super(i1, i2, i3, i4, i5, i6, i7, i8, i10, i11, i12, i9, i13, i14, i15, i);
       return;
    }
    public static LimitedAuthenticatedScopeConfiguration copy$default(LimitedAuthenticatedScopeConfiguration p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,int p9,String p10,String p11,int p12,String[] p13,String p14,int p15,String p16,int p17,Object p18){
       int i1;
       LimitedAuthenticatedScopeConfiguration limitedAuthe = p0;
       int i = p17;
       LimitedAuthenticatedScopeConfiguration clientId = ((i & 0x01))? limitedAuthe.clientId: p1;
       LimitedAuthenticatedScopeConfiguration nativeBundle = ((i & 0x02))? limitedAuthe.nativeBundleId: p2;
       LimitedAuthenticatedScopeConfiguration deviceName = ((i & 0x04))? limitedAuthe.deviceName: p3;
       LimitedAuthenticatedScopeConfiguration description = ((i & 0x08))? limitedAuthe.description: p4;
       LimitedAuthenticatedScopeConfiguration descriptionS = ((i & 0x10))? limitedAuthe.descriptionShort: p5;
       LimitedAuthenticatedScopeConfiguration cachePath = ((i & 0x20))? limitedAuthe.cachePath: p6;
       LimitedAuthenticatedScopeConfiguration volatileCach = ((i & 0x40))? limitedAuthe.volatileCachePath: p7;
       LimitedAuthenticatedScopeConfiguration settingsPath = ((i & 0x0080))? limitedAuthe.settingsPath: p8;
       LimitedAuthenticatedScopeConfiguration versionNumbe = ((i & 0x0100))? limitedAuthe.versionNumber: p9;
       LimitedAuthenticatedScopeConfiguration versionName = ((i & 0x0200))? limitedAuthe.versionName: p10;
       LimitedAuthenticatedScopeConfiguration deviceId = ((i & 0x0400))? limitedAuthe.deviceId: p11;
       LimitedAuthenticatedScopeConfiguration deviceType = ((i & 0x0800))? limitedAuthe.deviceType: p12;
       LimitedAuthenticatedScopeConfiguration supportedCon = ((i & 0x1000))? limitedAuthe.supportedContentTypes: p13;
       LimitedAuthenticatedScopeConfiguration deduplicatio = ((i & 0x2000))? limitedAuthe.deduplicationId: p14;
       LimitedAuthenticatedScopeConfiguration limitedAuthe1 = deduplicatio;
       deduplicatio = ((i & 0x4000))? limitedAuthe.volumeSteps: p15;
       LimitedAuthenticatedScopeConfiguration deviceModelN = ((i & 0x8000))? limitedAuthe.deviceModelName: p16;
       return p0.copy(clientId, nativeBundle, deviceName, description, descriptionS, cachePath, volatileCach, settingsPath, versionNumbe, versionName, deviceId, deviceType, supportedCon, limitedAuthe1, deduplicatio, deviceModelN);
    }
    public final String component1(){
       return this.clientId;
    }
    public final String component10(){
       return this.versionName;
    }
    public final String component11(){
       return this.deviceId;
    }
    public final int component12(){
       return this.deviceType;
    }
    public final String[] component13(){
       return this.supportedContentTypes;
    }
    public final String component14(){
       return this.deduplicationId;
    }
    public final int component15(){
       return this.volumeSteps;
    }
    public final String component16(){
       return this.deviceModelName;
    }
    public final String component2(){
       return this.nativeBundleId;
    }
    public final String component3(){
       return this.deviceName;
    }
    public final String component4(){
       return this.description;
    }
    public final String component5(){
       return this.descriptionShort;
    }
    public final String component6(){
       return this.cachePath;
    }
    public final String component7(){
       return this.volatileCachePath;
    }
    public final String component8(){
       return this.settingsPath;
    }
    public final int component9(){
       return this.versionNumber;
    }
    public final LimitedAuthenticatedScopeConfiguration copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,int p8,String p9,String p10,int p11,String[] p12,String p13,int p14,String p15){
       LimitedAuthenticatedScopeConfiguration v17 = new LimitedAuthenticatedScopeConfiguration(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       return v17;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LimitedAuthenticatedScopeConfiguration) {
          return false;
       }
       if (!co5.c(this.clientId, p0.clientId)) {
          return false;
       }
       if (!co5.c(this.nativeBundleId, p0.nativeBundleId)) {
          return false;
       }
       if (!co5.c(this.deviceName, p0.deviceName)) {
          return false;
       }
       if (!co5.c(this.description, p0.description)) {
          return false;
       }
       if (!co5.c(this.descriptionShort, p0.descriptionShort)) {
          return false;
       }
       if (!co5.c(this.cachePath, p0.cachePath)) {
          return false;
       }
       if (!co5.c(this.volatileCachePath, p0.volatileCachePath)) {
          return false;
       }
       if (!co5.c(this.settingsPath, p0.settingsPath)) {
          return false;
       }
       if (this.versionNumber != p0.versionNumber) {
          return false;
       }
       if (!co5.c(this.versionName, p0.versionName)) {
          return false;
       }
       if (!co5.c(this.deviceId, p0.deviceId)) {
          return false;
       }
       if (this.deviceType != p0.deviceType) {
          return false;
       }
       if (!co5.c(this.supportedContentTypes, p0.supportedContentTypes)) {
          return false;
       }
       if (!co5.c(this.deduplicationId, p0.deduplicationId)) {
          return false;
       }
       if (this.volumeSteps != p0.volumeSteps) {
          return false;
       }
       if (!co5.c(this.deviceModelName, p0.deviceModelName)) {
          return false;
       }
       return true;
    }
    public final String getCachePath(){
       return this.cachePath;
    }
    public final String getClientId(){
       return this.clientId;
    }
    public final String getDeduplicationId(){
       return this.deduplicationId;
    }
    public final String getDescription(){
       return this.description;
    }
    public final String getDescriptionShort(){
       return this.descriptionShort;
    }
    public final String getDeviceId(){
       return this.deviceId;
    }
    public final String getDeviceModelName(){
       return this.deviceModelName;
    }
    public final String getDeviceName(){
       return this.deviceName;
    }
    public final int getDeviceType(){
       return this.deviceType;
    }
    public final String getNativeBundleId(){
       return this.nativeBundleId;
    }
    public final String getSettingsPath(){
       return this.settingsPath;
    }
    public final String[] getSupportedContentTypes(){
       return this.supportedContentTypes;
    }
    public final String getVersionName(){
       return this.versionName;
    }
    public final int getVersionNumber(){
       return this.versionNumber;
    }
    public final String getVolatileCachePath(){
       return this.volatileCachePath;
    }
    public final int getVolumeSteps(){
       return this.volumeSteps;
    }
    public int hashCode(){
       LimitedAuthenticatedScopeConfiguration tnativeBundl;
       LimitedAuthenticatedScopeConfiguration tclientId = this.clientId;
       int i = 0;
       int i1 = (tclientId == null)? 0: tclientId.hashCode();
       i1 = i1 * 31;
       int i2 = ((tnativeBundl = this.nativeBundleId) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.deviceName) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.description) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.descriptionShort) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.cachePath) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.volatileCachePath) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.settingsPath) == null)? 0: tnativeBundl.hashCode();
       i1 = (((i1 + i2) * 31) + this.versionNumber) * 31;
       i2 = ((tnativeBundl = this.versionName) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.deviceId) == null)? 0: tnativeBundl.hashCode();
       i1 = (((i1 + i2) * 31) + this.deviceType) * 31;
       i2 = ((tnativeBundl = this.supportedContentTypes) == null)? 0: Arrays.hashCode(tnativeBundl);
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.deduplicationId) == null)? 0: tnativeBundl.hashCode();
       i1 = (((i1 + i2) * 31) + this.volumeSteps) * 31;
       if ((tnativeBundl = this.deviceModelName) != null) {
          i = tnativeBundl.hashCode();
       }
       return (i1 + i);
    }
    public final void setCachePath(String p0){
       this.cachePath = p0;
    }
    public final void setClientId(String p0){
       this.clientId = p0;
    }
    public final void setDeduplicationId(String p0){
       this.deduplicationId = p0;
    }
    public final void setDescription(String p0){
       this.description = p0;
    }
    public final void setDescriptionShort(String p0){
       this.descriptionShort = p0;
    }
    public final void setDeviceId(String p0){
       this.deviceId = p0;
    }
    public final void setDeviceModelName(String p0){
       this.deviceModelName = p0;
    }
    public final void setDeviceName(String p0){
       this.deviceName = p0;
    }
    public final void setDeviceType(int p0){
       this.deviceType = p0;
    }
    public final void setNativeBundleId(String p0){
       this.nativeBundleId = p0;
    }
    public final void setSettingsPath(String p0){
       this.settingsPath = p0;
    }
    public final void setSupportedContentTypes(String[] p0){
       this.supportedContentTypes = p0;
    }
    public final void setVersionName(String p0){
       this.versionName = p0;
    }
    public final void setVersionNumber(int p0){
       this.versionNumber = p0;
    }
    public final void setVolatileCachePath(String p0){
       this.volatileCachePath = p0;
    }
    public final void setVolumeSteps(int p0){
       this.volumeSteps = p0;
    }
    public String toString(){
       return hr7.a("LimitedAuthenticatedScopeConfiguration\(clientId="+this.clientId+", nativeBundleId="+this.nativeBundleId+", deviceName="+this.deviceName+", description="+this.description+", descriptionShort="+this.descriptionShort+", cachePath="+this.cachePath+", volatileCachePath="+this.volatileCachePath+", settingsPath="+this.settingsPath+", versionNumber="+this.versionNumber+", versionName="+this.versionName+", deviceId="+this.deviceId+", deviceType="+this.deviceType+", supportedContentTypes="+Arrays.toString(this.supportedContentTypes)+", deduplicationId="+this.deduplicationId+", volumeSteps="+this.volumeSteps+", deviceModelName=", this.deviceModelName, ')');
    }
}
