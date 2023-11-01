package com.spotify.connectivity.auth.UnencryptedCredentials;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class UnencryptedCredentials	// class@000615 from classes.dex
{
    private final byte[] authBlob;
    private final String username;

    public void UnencryptedCredentials(){
       super(null, null, 3, null);
    }
    public void UnencryptedCredentials(String p0,byte[] p1){
       super();
       this.username = p0;
       this.authBlob = p1;
    }
    public void UnencryptedCredentials(String p0,byte[] p1,int p2,DefaultConstructorMarker p3){
       if ((p2 & 0x01)) {
          p0 = null;
       }
       if ((p2 & 0x02)) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static UnencryptedCredentials copy$default(UnencryptedCredentials p0,String p1,byte[] p2,int p3,Object p4){
       UnencryptedCredentials username;
       UnencryptedCredentials authBlob;
       if ((p3 & 0x01)) {
          username = p0.username;
       }
       if ((p3 & 0x02)) {
          authBlob = p0.authBlob;
       }
       return p0.copy(username, authBlob);
    }
    public final String component1(){
       return this.username;
    }
    public final byte[] component2(){
       return this.authBlob;
    }
    public final UnencryptedCredentials copy(String p0,byte[] p1){
       return new UnencryptedCredentials(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof UnencryptedCredentials) {
          return false;
       }
       if (!co5.c(this.username, p0.username)) {
          return false;
       }
       if (!co5.c(this.authBlob, p0.authBlob)) {
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
       UnencryptedCredentials tauthBlob;
       UnencryptedCredentials tusername = this.username;
       int i = 0;
       int i1 = (tusername == null)? 0: tusername.hashCode();
       i1 = i1 * 31;
       if ((tauthBlob = this.authBlob) != null) {
          i = Arrays.hashCode(tauthBlob);
       }
       return (i1 + i);
    }
    public String toString(){
       return "UnencryptedCredentials\(username="+this.username+", authBlob="+Arrays.toString(this.authBlob)+')';
    }
}
