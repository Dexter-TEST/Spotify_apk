package com.spotify.connectivity.auth.SerializableCredentials;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.util.Arrays;
import java.lang.StringBuilder;
import p.hr7;

public final class SerializableCredentials	// class@000611 from classes.dex
{
    private final byte[] authBlob;
    private final String deviceId;
    private final String username;

    public void SerializableCredentials(){
       super(null, null, null, 7, null);
    }
    public void SerializableCredentials(String p0,byte[] p1,String p2){
       super();
       this.username = p0;
       this.authBlob = p1;
       this.deviceId = p2;
    }
    public void SerializableCredentials(String p0,byte[] p1,String p2,int p3,DefaultConstructorMarker p4){
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
    private final String component3(){
       return this.deviceId;
    }
    public static SerializableCredentials copy$default(SerializableCredentials p0,String p1,byte[] p2,String p3,int p4,Object p5){
       SerializableCredentials username;
       SerializableCredentials authBlob;
       SerializableCredentials deviceId;
       if ((p4 & 0x01)) {
          username = p0.username;
       }
       if ((p4 & 0x02)) {
          authBlob = p0.authBlob;
       }
       if ((p4 & 0x04)) {
          deviceId = p0.deviceId;
       }
       return p0.copy(username, authBlob, deviceId);
    }
    public final String component1(){
       return this.username;
    }
    public final byte[] component2(){
       return this.authBlob;
    }
    public final SerializableCredentials copy(String p0,byte[] p1,String p2){
       return new SerializableCredentials(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof SerializableCredentials) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.authBlob, p0.authBlob)) {
          return false;
       }
       if (!co5.c(this.deviceId, p0.deviceId)) {
          return false;
       }
       return true;
    }
    public final byte[] getAuthBlob(){
       return this.authBlob;
    }
    public final String getUsername(){
       return this.username;
    }
    public int hashCode(){
       SerializableCredentials tauthBlob;
       SerializableCredentials tusername = this.username;
       int i = 0;
       int i1 = (tusername == null)? 0: tusername.hashCode();
       i1 = i1 * 31;
       int i2 = ((tauthBlob = this.authBlob) == null)? 0: Arrays.hashCode(tauthBlob);
       i1 = (i1 + i2) * 31;
       if ((tauthBlob = this.deviceId) != null) {
          i = tauthBlob.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return hr7.a("SerializableCredentials\(username="+this.username+", authBlob="+Arrays.toString(this.authBlob)+", deviceId=", this.deviceId, ')');
    }
}
