package com.spotify.connectivity.auth.AuthCredentials$PhoneNumber;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class AuthCredentials$PhoneNumber extends AuthCredentials	// class@0005d9 from classes.dex
{
    private final String countryCallingCode;
    private final String isoCountryCode;
    private final String number;

    public void AuthCredentials$PhoneNumber(String p0,String p1,String p2){
       co5.o(p0, "number");
       super(null);
       this.number = p0;
       this.isoCountryCode = p1;
       this.countryCallingCode = p2;
    }
    public static AuthCredentials$PhoneNumber copy$default(AuthCredentials$PhoneNumber p0,String p1,String p2,String p3,int p4,Object p5){
       AuthCredentials$PhoneNumber number;
       AuthCredentials$PhoneNumber isoCountryCo;
       AuthCredentials$PhoneNumber countryCalli;
       if ((p4 & 0x01)) {
          number = p0.number;
       }
       if ((p4 & 0x02)) {
          isoCountryCo = p0.isoCountryCode;
       }
       if ((p4 & 0x04)) {
          countryCalli = p0.countryCallingCode;
       }
       return p0.copy(number, isoCountryCo, countryCalli);
    }
    public final String component1(){
       return this.number;
    }
    public final String component2(){
       return this.isoCountryCode;
    }
    public final String component3(){
       return this.countryCallingCode;
    }
    public final AuthCredentials$PhoneNumber copy(String p0,String p1,String p2){
       co5.o(p0, "number");
       return new AuthCredentials$PhoneNumber(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$PhoneNumber) {
          return false;
       }
       if (!co5.c(this.number, p0.number)) {
          return false;
       }
       if (!co5.c(this.isoCountryCode, p0.isoCountryCode)) {
          return false;
       }
       if (!co5.c(this.countryCallingCode, p0.countryCallingCode)) {
          return false;
       }
       return true;
    }
    public final String getCountryCallingCode(){
       return this.countryCallingCode;
    }
    public final String getIsoCountryCode(){
       return this.isoCountryCode;
    }
    public final String getNumber(){
       return this.number;
    }
    public int hashCode(){
       int i = this.number.hashCode() * 31;
       AuthCredentials$PhoneNumber tisoCountryC = this.isoCountryCode;
       int i1 = 0;
       int i2 = (tisoCountryC == null)? 0: tisoCountryC.hashCode();
       i = (i + i2) * 31;
       if ((tisoCountryC = this.countryCallingCode) != null) {
          i1 = tisoCountryC.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return hr7.a("PhoneNumber\(number="+this.number+", isoCountryCode="+this.isoCountryCode+", countryCallingCode=", this.countryCallingCode, ')');
    }
}
