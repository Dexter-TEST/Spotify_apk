package com.spotify.login.signupapi.services.model.UserData;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody$Gender;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.k73;
import java.util.Locale;
import java.lang.Integer;
import java.lang.StringBuilder;
import p.hr7;

public final class UserData	// class@0009cb from classes.dex
{
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final EmailSignupRequestBody$Gender gender;
    private final String name;

    public void UserData(EmailSignupRequestBody$Gender p0,int p1,int p2,int p3,String p4){
       co5.o(p0, "gender");
       super();
       this.gender = p0;
       this.birthDay = p1;
       this.birthMonth = p2;
       this.birthYear = p3;
       this.name = p4;
    }
    public static UserData copy$default(UserData p0,EmailSignupRequestBody$Gender p1,int p2,int p3,int p4,String p5,int p6,Object p7){
       UserData gender;
       UserData birthDay;
       UserData birthMonth;
       UserData birthYear;
       UserData name;
       if ((p6 & 0x01)) {
          gender = p0.gender;
       }
       if ((p6 & 0x02)) {
          birthDay = p0.birthDay;
       }
       p7 = birthDay;
       if ((p6 & 0x04)) {
          birthMonth = p0.birthMonth;
       }
       UserData userData = birthMonth;
       if ((p6 & 0x08)) {
          birthYear = p0.birthYear;
       }
       UserData userData1 = birthYear;
       if ((p6 & 0x10)) {
          name = p0.name;
       }
       return p0.copy(gender, p7, userData, userData1, name);
    }
    public final EmailSignupRequestBody$Gender component1(){
       return this.gender;
    }
    public final int component2(){
       return this.birthDay;
    }
    public final int component3(){
       return this.birthMonth;
    }
    public final int component4(){
       return this.birthYear;
    }
    public final String component5(){
       return this.name;
    }
    public final UserData copy(EmailSignupRequestBody$Gender p0,int p1,int p2,int p3,String p4){
       co5.o(p0, "gender");
       UserData v0 = new UserData(p0, p1, p2, p3, p4);
       return v0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof UserData) {
          return false;
       }
       if (this.gender != p0.gender) {
          return false;
       }
       if (this.birthDay != p0.birthDay) {
          return false;
       }
       if (this.birthMonth != p0.birthMonth) {
          return false;
       }
       if (this.birthYear != p0.birthYear) {
          return false;
       }
       if (!co5.c(this.name, p0.name)) {
          return false;
       }
       return true;
    }
    public final int getBirthDay(){
       return this.birthDay;
    }
    public final int getBirthMonth(){
       return this.birthMonth;
    }
    public final int getBirthYear(){
       return this.birthYear;
    }
    public final EmailSignupRequestBody$Gender getGender(){
       return this.gender;
    }
    public final String getName(){
       return this.name;
    }
    public int hashCode(){
       UserData tname;
       int i = ((((((this.gender.hashCode() * 31) + this.birthDay) * 31) + this.birthMonth) * 31) + this.birthYear) * 31;
       int i1 = ((tname = this.name) == null)? 0: tname.hashCode();
       return (i + i1);
    }
    public final void setFields(k73 p0){
       UserData tname;
       co5.o(p0, "paramBuilder");
       Locale eNGLISH = Locale.ENGLISH;
       co5.l(eNGLISH, "ENGLISH");
       String str = this.gender.toString().toLowerCase(eNGLISH);
       co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
       p0.d("gender", str);
       p0.d("birth_day", Integer.valueOf(this.birthDay));
       p0.d("birth_month", Integer.valueOf(this.birthMonth));
       p0.d("birth_year", Integer.valueOf(this.birthYear));
       if ((tname = this.name) != null) {
          p0.d("displayname", tname);
       }
       return;
    }
    public String toString(){
       return hr7.a("UserData\(gender="+this.gender+", birthDay="+this.birthDay+", birthMonth="+this.birthMonth+", birthYear="+this.birthYear+", name=", this.name, ')');
    }
}
