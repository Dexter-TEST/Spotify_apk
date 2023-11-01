package com.spotify.connectivity.auth.SignupRequiredInfo;
import java.lang.String;
import com.spotify.connectivity.auth.AuthUserInfoGender;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class SignupRequiredInfo	// class@000614 from classes.dex
{
    private final String birthdate;
    private final String email;
    private final AuthUserInfoGender gender;
    private final String identifierToken;
    private final boolean isEmailAlreadyRegistered;
    private final boolean isEmailVerified;
    private final boolean isPhoneNumberVerified;
    private final String name;
    private final String phoneNumber;

    public void SignupRequiredInfo(String p0,String p1,boolean p2,String p3,AuthUserInfoGender p4,String p5,boolean p6,boolean p7,String p8){
       co5.o(p0, "name");
       co5.o(p1, "email");
       co5.o(p3, "birthdate");
       co5.o(p4, "gender");
       co5.o(p5, "phoneNumber");
       co5.o(p8, "identifierToken");
       super();
       this.name = p0;
       this.email = p1;
       this.isEmailVerified = p2;
       this.birthdate = p3;
       this.gender = p4;
       this.phoneNumber = p5;
       this.isPhoneNumberVerified = p6;
       this.isEmailAlreadyRegistered = p7;
       this.identifierToken = p8;
    }
    public static SignupRequiredInfo copy$default(SignupRequiredInfo p0,String p1,String p2,boolean p3,String p4,AuthUserInfoGender p5,String p6,boolean p7,boolean p8,String p9,int p10,Object p11){
       SignupRequiredInfo signupRequir = p0;
       int i = p10;
       SignupRequiredInfo name = ((i & 0x01))? signupRequir.name: p1;
       SignupRequiredInfo email = ((i & 0x02))? signupRequir.email: p2;
       SignupRequiredInfo isEmailVerif = ((i & 0x04))? signupRequir.isEmailVerified: p3;
       SignupRequiredInfo birthdate = ((i & 0x08))? signupRequir.birthdate: p4;
       SignupRequiredInfo gender = ((i & 0x10))? signupRequir.gender: p5;
       SignupRequiredInfo phoneNumber = ((i & 0x20))? signupRequir.phoneNumber: p6;
       SignupRequiredInfo isPhoneNumbe = ((i & 0x40))? signupRequir.isPhoneNumberVerified: p7;
       SignupRequiredInfo isEmailAlrea = ((i & 0x0080))? signupRequir.isEmailAlreadyRegistered: p8;
       SignupRequiredInfo identifierTo = ((i & 0x0100))? signupRequir.identifierToken: p9;
       return p0.copy(name, email, isEmailVerif, birthdate, gender, phoneNumber, isPhoneNumbe, isEmailAlrea, identifierTo);
    }
    public final String component1(){
       return this.name;
    }
    public final String component2(){
       return this.email;
    }
    public final boolean component3(){
       return this.isEmailVerified;
    }
    public final String component4(){
       return this.birthdate;
    }
    public final AuthUserInfoGender component5(){
       return this.gender;
    }
    public final String component6(){
       return this.phoneNumber;
    }
    public final boolean component7(){
       return this.isPhoneNumberVerified;
    }
    public final boolean component8(){
       return this.isEmailAlreadyRegistered;
    }
    public final String component9(){
       return this.identifierToken;
    }
    public final SignupRequiredInfo copy(String p0,String p1,boolean p2,String p3,AuthUserInfoGender p4,String p5,boolean p6,boolean p7,String p8){
       co5.o(p0, "name");
       co5.o(p1, "email");
       co5.o(p3, "birthdate");
       Object obj = p4;
       co5.o(obj, "gender");
       Object obj1 = p5;
       co5.o(obj1, "phoneNumber");
       Object obj2 = p8;
       co5.o(obj2, "identifierToken");
       SignupRequiredInfo v0 = new SignupRequiredInfo(p0, p1, p2, p3, obj, obj1, p6, p7, obj2);
       return v0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof SignupRequiredInfo) {
          return false;
       }
       if (!co5.c(this.name, p0.name)) {
          return false;
       }
       if (!co5.c(this.email, p0.email)) {
          return false;
       }
       if (this.isEmailVerified != p0.isEmailVerified) {
          return false;
       }
       if (!co5.c(this.birthdate, p0.birthdate)) {
          return false;
       }
       if (this.gender != p0.gender) {
          return false;
       }
       if (!co5.c(this.phoneNumber, p0.phoneNumber)) {
          return false;
       }
       if (this.isPhoneNumberVerified != p0.isPhoneNumberVerified) {
          return false;
       }
       if (this.isEmailAlreadyRegistered != p0.isEmailAlreadyRegistered) {
          return false;
       }
       if (!co5.c(this.identifierToken, p0.identifierToken)) {
          return false;
       }
       return true;
    }
    public final String getBirthdate(){
       return this.birthdate;
    }
    public final String getEmail(){
       return this.email;
    }
    public final AuthUserInfoGender getGender(){
       return this.gender;
    }
    public final String getIdentifierToken(){
       return this.identifierToken;
    }
    public final String getName(){
       return this.name;
    }
    public final String getPhoneNumber(){
       return this.phoneNumber;
    }
    public int hashCode(){
       int i2;
       int i = tp2.g(this.email, (this.name.hashCode() * 31), 31);
       SignupRequiredInfo tisEmailVeri = this.isEmailVerified;
       int i1 = 1;
       if (tisEmailVeri != null) {
          tisEmailVeri = 1;
       }
       i = tp2.g(this.phoneNumber, ((this.gender.hashCode() + tp2.g(this.birthdate, ((i + tisEmailVeri) * 31), 31)) * 31), 31);
       if ((tisEmailVeri = this.isPhoneNumberVerified) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       if ((tisEmailVeri = this.isEmailAlreadyRegistered) == null) {
          i1 = tisEmailVeri;
       }
       return (this.identifierToken.hashCode() + ((i + i1) * 31));
    }
    public final boolean isEmailAlreadyRegistered(){
       return this.isEmailAlreadyRegistered;
    }
    public final boolean isEmailVerified(){
       return this.isEmailVerified;
    }
    public final boolean isPhoneNumberVerified(){
       return this.isPhoneNumberVerified;
    }
    public String toString(){
       return hr7.a("SignupRequiredInfo\(name="+this.name+", email="+this.email+", isEmailVerified="+this.isEmailVerified+", birthdate="+this.birthdate+", gender="+this.gender+", phoneNumber="+this.phoneNumber+", isPhoneNumberVerified="+this.isPhoneNumberVerified+", isEmailAlreadyRegistered="+this.isEmailAlreadyRegistered+", identifierToken=", this.identifierToken, ')');
    }
}
