package com.spotify.connectivity.authtoken.Token;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class Token	// class@000679 from classes.dex
{
    private final String accessToken;
    private final long expiresAtTime;
    private final String tokenType;

    public void Token(String p0,String p1,long p2){
       co5.o(p0, "accessToken");
       co5.o(p1, "tokenType");
       super();
       this.accessToken = p0;
       this.tokenType = p1;
       this.expiresAtTime = p2;
    }
    public static Token copy$default(Token p0,String p1,String p2,long p3,int p4,Object p5){
       Token accessToken;
       Token tokenType;
       Token expiresAtTim;
       if ((p4 & 0x01)) {
          accessToken = p0.accessToken;
       }
       if ((p4 & 0x02)) {
          tokenType = p0.tokenType;
       }
       if ((p4 & 0x04)) {
          expiresAtTim = p0.expiresAtTime;
       }
       return p0.copy(accessToken, tokenType, expiresAtTim);
    }
    public final String component1(){
       return this.accessToken;
    }
    public final String component2(){
       return this.tokenType;
    }
    public final long component3(){
       return this.expiresAtTime;
    }
    public final Token copy(String p0,String p1,long p2){
       co5.o(p0, "accessToken");
       co5.o(p1, "tokenType");
       return new Token(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Token) {
          return false;
       }
       if (!co5.c(this.accessToken, p0.accessToken)) {
          return false;
       }
       if (!co5.c(this.tokenType, p0.tokenType)) {
          return false;
       }
       if (this.expiresAtTime - p0.expiresAtTime) {
          return false;
       }
       return true;
    }
    public final String getAccessToken(){
       return this.accessToken;
    }
    public final long getExpiresAtTime(){
       return this.expiresAtTime;
    }
    public final String getTokenType(){
       return this.tokenType;
    }
    public int hashCode(){
       Token texpiresAtTi = this.expiresAtTime;
       return (tp2.g(this.tokenType, (this.accessToken.hashCode() * 31), 31) + (int)(texpiresAtTi ^ (texpiresAtTi >> 32)));
    }
    public String toString(){
       return tp2.o("Token\(accessToken="+this.accessToken+", tokenType="+this.tokenType+", expiresAtTime=", this.expiresAtTime, ')');
    }
}
