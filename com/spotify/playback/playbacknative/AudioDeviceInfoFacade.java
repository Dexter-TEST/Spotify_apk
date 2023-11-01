package com.spotify.playback.playbacknative.AudioDeviceInfoFacade;
import android.media.AudioDeviceInfo;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import p.eh;
import com.spotify.playback.playbacknative.AudioDeviceInfoFacadeKt;
import java.lang.StringBuilder;
import p.hr7;

public final class AudioDeviceInfoFacade	// class@000ac9 from classes.dex
{
    private final String address;
    private final int audioDeviceInfoType;
    private final String productName;

    public void AudioDeviceInfoFacade(AudioDeviceInfo p0){
       co5.o(p0, "audioDeviceInfo");
       super(eh.o(p0).toString(), eh.d(p0), AudioDeviceInfoFacadeKt.access$getAddressFrom(p0));
    }
    public void AudioDeviceInfoFacade(String p0,int p1,String p2){
       co5.o(p0, "productName");
       super();
       this.productName = p0;
       this.audioDeviceInfoType = p1;
       this.address = p2;
    }
    public static AudioDeviceInfoFacade copy$default(AudioDeviceInfoFacade p0,String p1,int p2,String p3,int p4,Object p5){
       AudioDeviceInfoFacade productName;
       AudioDeviceInfoFacade audioDeviceI;
       AudioDeviceInfoFacade address;
       if ((p4 & 0x01)) {
          productName = p0.productName;
       }
       if ((p4 & 0x02)) {
          audioDeviceI = p0.audioDeviceInfoType;
       }
       if ((p4 & 0x04)) {
          address = p0.address;
       }
       return p0.copy(productName, audioDeviceI, address);
    }
    public final String component1(){
       return this.productName;
    }
    public final int component2(){
       return this.audioDeviceInfoType;
    }
    public final String component3(){
       return this.address;
    }
    public final AudioDeviceInfoFacade copy(String p0,int p1,String p2){
       co5.o(p0, "productName");
       return new AudioDeviceInfoFacade(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AudioDeviceInfoFacade) {
          return false;
       }
       if (!co5.c(this.productName, p0.productName)) {
          return false;
       }
       if (this.audioDeviceInfoType != p0.audioDeviceInfoType) {
          return false;
       }
       if (!co5.c(this.address, p0.address)) {
          return false;
       }
       return true;
    }
    public final String getAddress(){
       return this.address;
    }
    public final int getAudioDeviceInfoType(){
       return this.audioDeviceInfoType;
    }
    public final String getProductName(){
       return this.productName;
    }
    public int hashCode(){
       AudioDeviceInfoFacade taddress;
       int i = ((this.productName.hashCode() * 31) + this.audioDeviceInfoType) * 31;
       int i1 = ((taddress = this.address) == null)? 0: taddress.hashCode();
       return (i + i1);
    }
    public String toString(){
       return hr7.a("AudioDeviceInfoFacade\(productName="+this.productName+", audioDeviceInfoType="+this.audioDeviceInfoType+", address=", this.address, ')');
    }
}
