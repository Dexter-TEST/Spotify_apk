package com.spotify.login.signupapi.services.model.CallingCode;
import android.os.Parcelable;
import com.spotify.login.signupapi.services.model.CallingCode$Creator;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class CallingCode implements Parcelable	// class@000995 from classes.dex
{
    private final String callingCode;
    private final String countryCode;
    public static final Parcelable$Creator CREATOR;

    static {
       CallingCode.CREATOR = new CallingCode$Creator();
    }
    public void CallingCode(String p0,String p1){
       co5.o(p0, "countryCode");
       co5.o(p1, "callingCode");
       super();
       this.countryCode = p0;
       this.callingCode = p1;
    }
    public static CallingCode copy$default(CallingCode p0,String p1,String p2,int p3,Object p4){
       CallingCode countryCode;
       CallingCode callingCode;
       if ((p3 & 0x01)) {
          countryCode = p0.countryCode;
       }
       if ((p3 & 0x02)) {
          callingCode = p0.callingCode;
       }
       return p0.copy(countryCode, callingCode);
    }
    public final String component1(){
       return this.countryCode;
    }
    public final String component2(){
       return this.callingCode;
    }
    public final CallingCode copy(String p0,String p1){
       co5.o(p0, "countryCode");
       co5.o(p1, "callingCode");
       return new CallingCode(p0, p1);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof CallingCode) {
          return false;
       }
       if (!co5.c(this.countryCode, p0.countryCode)) {
          return false;
       }
       if (!co5.c(this.callingCode, p0.callingCode)) {
          return false;
       }
       return true;
    }
    public final String getCallingCode(){
       return this.callingCode;
    }
    public final String getCountryCode(){
       return this.countryCode;
    }
    public int hashCode(){
       return (this.callingCode.hashCode() + (this.countryCode.hashCode() * 31));
    }
    public String toString(){
       return hr7.a("CallingCode\(countryCode="+this.countryCode+", callingCode=", this.callingCode, ')');
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.countryCode);
       p0.writeString(this.callingCode);
    }
}
