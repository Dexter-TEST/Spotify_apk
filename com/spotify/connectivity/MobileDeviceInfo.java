package com.spotify.connectivity.MobileDeviceInfo;
import java.lang.Object;
import java.lang.String;

public final class MobileDeviceInfo	// class@0005b8 from classes.dex
{
    private int apiLevel;
    private String brand;
    private int deviceType;
    private String manufacturer;
    private String model;
    private String name;
    private String osVersion;
    private int screenDensityCurrent;
    private int screenDensityStable;
    private int screenHeight;
    private int screenWidth;
    private int smallestScreenWidthDp;
    private int volumeSteps;

    public void MobileDeviceInfo(){
       super();
       this.volumeSteps = 32;
    }
    public final int getApiLevel(){
       return this.apiLevel;
    }
    public final String getBrand(){
       return this.brand;
    }
    public final int getDeviceType(){
       return this.deviceType;
    }
    public final String getManufacturer(){
       return this.manufacturer;
    }
    public final String getModel(){
       return this.model;
    }
    public final String getName(){
       return this.name;
    }
    public final String getOsVersion(){
       return this.osVersion;
    }
    public final int getScreenDensityCurrent(){
       return this.screenDensityCurrent;
    }
    public final int getScreenDensityStable(){
       return this.screenDensityStable;
    }
    public final int getScreenHeight(){
       return this.screenHeight;
    }
    public final int getScreenWidth(){
       return this.screenWidth;
    }
    public final int getSmallestScreenWidthDp(){
       return this.smallestScreenWidthDp;
    }
    public final int getVolumeSteps(){
       return this.volumeSteps;
    }
    public final void setApiLevel(int p0){
       this.apiLevel = p0;
    }
    public final void setBrand(String p0){
       this.brand = p0;
    }
    public final void setDeviceType(int p0){
       this.deviceType = p0;
    }
    public final void setManufacturer(String p0){
       this.manufacturer = p0;
    }
    public final void setModel(String p0){
       this.model = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setOsVersion(String p0){
       this.osVersion = p0;
    }
    public final void setScreenDensityCurrent(int p0){
       this.screenDensityCurrent = p0;
    }
    public final void setScreenDensityStable(int p0){
       this.screenDensityStable = p0;
    }
    public final void setScreenHeight(int p0){
       this.screenHeight = p0;
    }
    public final void setScreenWidth(int p0){
       this.screenWidth = p0;
    }
    public final void setSmallestScreenWidthDp(int p0){
       this.smallestScreenWidthDp = p0;
    }
    public final void setVolumeSteps(int p0){
       this.volumeSteps = p0;
    }
}
