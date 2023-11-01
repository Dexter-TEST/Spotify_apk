package com.spotify.connectivity.httpclienttoken.ClientTokenSuccess;
import com.spotify.connectivity.httpclienttoken.ClientToken;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class ClientTokenSuccess extends ClientToken	// class@000738 from classes.dex
{
    private final String clientDataHash;
    private final String clientToken;
    private final List domains;
    private final long expiresAtTime;
    private final long refreshAtTime;

    public void ClientTokenSuccess(String p0,long p1,long p2,String p3,List p4){
       co5.o(p0, "clientToken");
       co5.o(p3, "clientDataHash");
       co5.o(p4, "domains");
       super(null);
       this.clientToken = p0;
       this.expiresAtTime = p1;
       this.refreshAtTime = p2;
       this.clientDataHash = p3;
       this.domains = p4;
    }
    public static ClientTokenSuccess copy$default(ClientTokenSuccess p0,String p1,long p2,long p3,String p4,List p5,int p6,Object p7){
       ClientTokenSuccess clientToken;
       ClientTokenSuccess expiresAtTim;
       ClientTokenSuccess refreshAtTim;
       ClientTokenSuccess clientDataHa;
       ClientTokenSuccess domains;
       if ((p6 & 0x01)) {
          clientToken = p0.clientToken;
       }
       if ((p6 & 0x02)) {
          expiresAtTim = p0.expiresAtTime;
       }
       ClientTokenSuccess uClientToken = expiresAtTim;
       if ((p6 & 0x04)) {
          refreshAtTim = p0.refreshAtTime;
       }
       ClientTokenSuccess uClientToken1 = refreshAtTim;
       if ((p6 & 0x08)) {
          clientDataHa = p0.clientDataHash;
       }
       p7 = clientDataHa;
       if ((p6 & 0x10)) {
          domains = p0.domains;
       }
       return p0.copy(clientToken, uClientToken, uClientToken1, p7, domains);
    }
    public final String component1(){
       return this.clientToken;
    }
    public final long component2(){
       return this.expiresAtTime;
    }
    public final long component3(){
       return this.refreshAtTime;
    }
    public final String component4(){
       return this.clientDataHash;
    }
    public final List component5(){
       return this.domains;
    }
    public final ClientTokenSuccess copy(String p0,long p1,long p2,String p3,List p4){
       co5.o(p0, "clientToken");
       co5.o(p3, "clientDataHash");
       Object obj = p4;
       co5.o(obj, "domains");
       ClientTokenSuccess v0 = new ClientTokenSuccess(p0, p1, p2, p3, obj);
       return v0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ClientTokenSuccess) {
          return false;
       }
       if (!co5.c(this.clientToken, p0.clientToken)) {
          return false;
       }
       if (this.expiresAtTime - p0.expiresAtTime) {
          return false;
       }
       if (this.refreshAtTime - p0.refreshAtTime) {
          return false;
       }
       if (!co5.c(this.clientDataHash, p0.clientDataHash)) {
          return false;
       }
       if (!co5.c(this.domains, p0.domains)) {
          return false;
       }
       return true;
    }
    public final String getClientDataHash(){
       return this.clientDataHash;
    }
    public final String getClientToken(){
       return this.clientToken;
    }
    public final List getDomains(){
       return this.domains;
    }
    public final long getExpiresAtTime(){
       return this.expiresAtTime;
    }
    public final long getRefreshAtTime(){
       return this.refreshAtTime;
    }
    public int hashCode(){
       ClientTokenSuccess texpiresAtTi = this.expiresAtTime;
       texpiresAtTi = this.refreshAtTime;
       return (this.domains.hashCode() + tp2.g(this.clientDataHash, (((((this.clientToken.hashCode() * 31) + (int)(texpiresAtTi ^ (texpiresAtTi >> 32))) * 31) + (int)(texpiresAtTi ^ (texpiresAtTi >> 32))) * 31), 31));
    }
    public String toString(){
       return kg4.o("ClientTokenSuccess\(clientToken="+this.clientToken+", expiresAtTime="+this.expiresAtTime+", refreshAtTime="+this.refreshAtTime+", clientDataHash="+this.clientDataHash+", domains=", this.domains, ')');
    }
}
