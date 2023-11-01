package com.spotify.connectivity.auth.CredentialsStorage$StoredCredentialsAndUsername;
import com.spotify.connectivity.auth.SerializableCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class CredentialsStorage$StoredCredentialsAndUsername	// class@0005f1 from classes.dex
{
    private String canonicalUsername;
    private SerializableCredentials credentials;
    private boolean rememberMe;

    public void CredentialsStorage$StoredCredentialsAndUsername(SerializableCredentials p0,String p1,boolean p2){
       co5.o(p0, "credentials");
       co5.o(p1, "canonicalUsername");
       super();
       this.credentials = p0;
       this.canonicalUsername = p1;
       this.rememberMe = p2;
    }
    public static CredentialsStorage$StoredCredentialsAndUsername copy$default(CredentialsStorage$StoredCredentialsAndUsername p0,SerializableCredentials p1,String p2,boolean p3,int p4,Object p5){
       CredentialsStorage$StoredCredentialsAndUsername credentials;
       CredentialsStorage$StoredCredentialsAndUsername canonicalUse;
       CredentialsStorage$StoredCredentialsAndUsername rememberMe;
       if ((p4 & 0x01)) {
          credentials = p0.credentials;
       }
       if ((p4 & 0x02)) {
          canonicalUse = p0.canonicalUsername;
       }
       if ((p4 & 0x04)) {
          rememberMe = p0.rememberMe;
       }
       return p0.copy(credentials, canonicalUse, rememberMe);
    }
    public final SerializableCredentials component1(){
       return this.credentials;
    }
    public final String component2(){
       return this.canonicalUsername;
    }
    public final boolean component3(){
       return this.rememberMe;
    }
    public final CredentialsStorage$StoredCredentialsAndUsername copy(SerializableCredentials p0,String p1,boolean p2){
       co5.o(p0, "credentials");
       co5.o(p1, "canonicalUsername");
       return new CredentialsStorage$StoredCredentialsAndUsername(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof CredentialsStorage$StoredCredentialsAndUsername) {
          return false;
       }
       if (!co5.c(this.credentials, p0.credentials)) {
          return false;
       }
       if (!co5.c(this.canonicalUsername, p0.canonicalUsername)) {
          return false;
       }
       if (this.rememberMe != p0.rememberMe) {
          return false;
       }
       return true;
    }
    public final String getCanonicalUsername(){
       return this.canonicalUsername;
    }
    public final SerializableCredentials getCredentials(){
       return this.credentials;
    }
    public final boolean getRememberMe(){
       return this.rememberMe;
    }
    public int hashCode(){
       CredentialsStorage$StoredCredentialsAndUsername trememberMe;
       int i = tp2.g(this.canonicalUsername, (this.credentials.hashCode() * 31), 31);
       if ((trememberMe = this.rememberMe) != null) {
          trememberMe = 1;
       }
       return (i + trememberMe);
    }
    public final void setCanonicalUsername(String p0){
       co5.o(p0, "<set-?>");
       this.canonicalUsername = p0;
    }
    public final void setCredentials(SerializableCredentials p0){
       co5.o(p0, "<set-?>");
       this.credentials = p0;
    }
    public final void setRememberMe(boolean p0){
       this.rememberMe = p0;
    }
    public String toString(){
       return kg4.p("StoredCredentialsAndUsername\(credentials="+this.credentials+", canonicalUsername="+this.canonicalUsername+", rememberMe=", this.rememberMe, ')');
    }
}
