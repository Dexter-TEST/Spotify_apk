package com.spotify.clientfoundations.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.util.Arrays;
import java.lang.StringBuilder;
import p.kg4;

public final class FullAuthenticatedScopeConfiguration	// class@00055e from classes.dex
{
    private String brand;
    private String cachePath;
    private boolean canPlay;
    private String clientId;
    private String deduplicationId;
    private String description;
    private String descriptionShort;
    private String deviceId;
    private String deviceModelName;
    private String deviceName;
    private int deviceType;
    private String model;
    private String nativeBundleId;
    private String settingsPath;
    private String[] supportedContentTypes;
    private String versionName;
    private int versionNumber;
    private String volatileCachePath;
    private int volumeSteps;

    public void FullAuthenticatedScopeConfiguration(){
       super(null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 0, null, false, 0x7ffff, null);
    }
    public void FullAuthenticatedScopeConfiguration(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,int p10,String p11,String p12,int p13,String[] p14,String p15,int p16,String p17,boolean p18){
       int i = this;
       super();
       i.clientId = p0;
       i.nativeBundleId = p1;
       i.deviceName = p2;
       i.description = p3;
       i.descriptionShort = p4;
       i.model = p5;
       i.brand = p6;
       i.cachePath = p7;
       i.volatileCachePath = p8;
       i.settingsPath = p9;
       i.versionNumber = p10;
       i.versionName = p11;
       i.deviceId = p12;
       i.deviceType = p13;
       i.supportedContentTypes = p14;
       i.deduplicationId = p15;
       i.volumeSteps = p16;
       i.deviceModelName = p17;
       i.canPlay = p18;
    }
    public void FullAuthenticatedScopeConfiguration(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,int p10,String p11,String p12,int p13,String[] p14,String p15,int p16,String p17,boolean p18,int p19,DefaultConstructorMarker p20){
       int i = p19;
       int i1 = ((i & 0x01))? 0: p0;
       int i2 = ((i & 0x02))? 0: p1;
       int i3 = ((i & 0x04))? 0: p2;
       int i4 = ((i & 0x08))? 0: p3;
       int i5 = ((i & 0x10))? 0: p4;
       int i6 = ((i & 0x20))? 0: p5;
       int i7 = ((i & 0x40))? 0: p6;
       int i8 = ((i & 0x0080))? 0: p7;
       int i9 = ((i & 0x0100))? 0: p8;
       int i10 = ((i & 0x0200))? 0: p9;
       int i11 = 0;
       int i12 = ((i & 0x0400))? 0: p10;
       int i13 = ((i & 0x0800))? 0: p11;
       int i14 = ((i & 0x1000))? 0: p12;
       if (!((i & 0x2000))) {
          i11 = p13;
       }
       int i15 = ((i & 0x4000))? 0: p14;
       int i16 = ((i & 0x8000))? 0: p15;
       int i17 = ((i & 0x10000))? 32: p16;
       int i18 = ((i & 0x20000))? 0: p17;
       i = ((i & 0x40000))? 1: p18;
       super(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i12, i13, i14, i11, i15, i16, i17, i18, i);
       return;
    }
    public static FullAuthenticatedScopeConfiguration copy$default(FullAuthenticatedScopeConfiguration p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,int p11,String p12,String p13,int p14,String[] p15,String p16,int p17,String p18,boolean p19,int p20,Object p21){
       int i1;
       FullAuthenticatedScopeConfiguration uFullAuthent = p0;
       int i = p20;
       FullAuthenticatedScopeConfiguration clientId = ((i & 0x01))? uFullAuthent.clientId: p1;
       FullAuthenticatedScopeConfiguration nativeBundle = ((i & 0x02))? uFullAuthent.nativeBundleId: p2;
       FullAuthenticatedScopeConfiguration deviceName = ((i & 0x04))? uFullAuthent.deviceName: p3;
       FullAuthenticatedScopeConfiguration description = ((i & 0x08))? uFullAuthent.description: p4;
       FullAuthenticatedScopeConfiguration descriptionS = ((i & 0x10))? uFullAuthent.descriptionShort: p5;
       FullAuthenticatedScopeConfiguration model = ((i & 0x20))? uFullAuthent.model: p6;
       FullAuthenticatedScopeConfiguration brand = ((i & 0x40))? uFullAuthent.brand: p7;
       FullAuthenticatedScopeConfiguration cachePath = ((i & 0x0080))? uFullAuthent.cachePath: p8;
       FullAuthenticatedScopeConfiguration volatileCach = ((i & 0x0100))? uFullAuthent.volatileCachePath: p9;
       FullAuthenticatedScopeConfiguration settingsPath = ((i & 0x0200))? uFullAuthent.settingsPath: p10;
       FullAuthenticatedScopeConfiguration versionNumbe = ((i & 0x0400))? uFullAuthent.versionNumber: p11;
       FullAuthenticatedScopeConfiguration versionName = ((i & 0x0800))? uFullAuthent.versionName: p12;
       FullAuthenticatedScopeConfiguration deviceId = ((i & 0x1000))? uFullAuthent.deviceId: p13;
       FullAuthenticatedScopeConfiguration deviceType = ((i & 0x2000))? uFullAuthent.deviceType: p14;
       FullAuthenticatedScopeConfiguration uFullAuthent1 = deviceType;
       deviceType = ((i & 0x4000))? uFullAuthent.supportedContentTypes: p15;
       FullAuthenticatedScopeConfiguration uFullAuthent2 = deviceType;
       deviceType = ((i & 0x8000))? uFullAuthent.deduplicationId: p16;
       FullAuthenticatedScopeConfiguration uFullAuthent3 = deviceType;
       deviceType = ((i & 0x10000))? uFullAuthent.volumeSteps: p17;
       FullAuthenticatedScopeConfiguration uFullAuthent4 = deviceType;
       deviceType = ((i & 0x20000))? uFullAuthent.deviceModelName: p18;
       FullAuthenticatedScopeConfiguration canPlay = ((i & 0x40000))? uFullAuthent.canPlay: p19;
       return p0.copy(clientId, nativeBundle, deviceName, description, descriptionS, model, brand, cachePath, volatileCach, settingsPath, versionNumbe, versionName, deviceId, uFullAuthent1, uFullAuthent2, uFullAuthent3, uFullAuthent4, deviceType, canPlay);
    }
    public final String component1(){
       return this.clientId;
    }
    public final String component10(){
       return this.settingsPath;
    }
    public final int component11(){
       return this.versionNumber;
    }
    public final String component12(){
       return this.versionName;
    }
    public final String component13(){
       return this.deviceId;
    }
    public final int component14(){
       return this.deviceType;
    }
    public final String[] component15(){
       return this.supportedContentTypes;
    }
    public final String component16(){
       return this.deduplicationId;
    }
    public final int component17(){
       return this.volumeSteps;
    }
    public final String component18(){
       return this.deviceModelName;
    }
    public final boolean component19(){
       return this.canPlay;
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
       return this.model;
    }
    public final String component7(){
       return this.brand;
    }
    public final String component8(){
       return this.cachePath;
    }
    public final String component9(){
       return this.volatileCachePath;
    }
    public final FullAuthenticatedScopeConfiguration copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,int p10,String p11,String p12,int p13,String[] p14,String p15,int p16,String p17,boolean p18){
       FullAuthenticatedScopeConfiguration v20 = new FullAuthenticatedScopeConfiguration(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
       return v20;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FullAuthenticatedScopeConfiguration) {
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
       if (!co5.c(this.model, p0.model)) {
          return false;
       }
       if (!co5.c(this.brand, p0.brand)) {
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
       if (this.canPlay != p0.canPlay) {
          return false;
       }
       return true;
    }
    public final String getBrand(){
       return this.brand;
    }
    public final String getCachePath(){
       return this.cachePath;
    }
    public final boolean getCanPlay(){
       return this.canPlay;
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
    public final String getModel(){
       return this.model;
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
       FullAuthenticatedScopeConfiguration tnativeBundl;
       FullAuthenticatedScopeConfiguration tcanPlay;
       FullAuthenticatedScopeConfiguration tclientId = this.clientId;
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
       i2 = ((tnativeBundl = this.model) == null)? 0: tnativeBundl.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tnativeBundl = this.brand) == null)? 0: tnativeBundl.hashCode();
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
       i1 = (i1 + i) * 31;
       if ((tcanPlay = this.canPlay) != null) {
          tcanPlay = 1;
       }
       return (i1 + tcanPlay);
    }
    public final void setBrand(String p0){
       this.brand = p0;
    }
    public final void setCachePath(String p0){
       this.cachePath = p0;
    }
    public final void setCanPlay(boolean p0){
       this.canPlay = p0;
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
    public final void setModel(String p0){
       this.model = p0;
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
       return kg4.p("FullAuthenticatedScopeConfiguration\(clientId="+this.clientId+", nativeBundleId="+this.nativeBundleId+", deviceName="+this.deviceName+", description="+this.description+", descriptionShort="+this.descriptionShort+", model="+this.model+", brand="+this.brand+", cachePath="+this.cachePath+", volatileCachePath="+this.volatileCachePath+", settingsPath="+this.settingsPath+", versionNumber="+this.versionNumber+", versionName="+this.versionName+", deviceId="+this.deviceId+", deviceType="+this.deviceType+", supportedContentTypes="+Arrays.toString(this.supportedContentTypes)+", deduplicationId="+this.deduplicationId+", volumeSteps="+this.volumeSteps+", deviceModelName="+this.deviceModelName+", canPlay=", this.canPlay, ')');
    }
}
