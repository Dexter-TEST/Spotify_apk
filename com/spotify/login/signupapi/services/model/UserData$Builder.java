package com.spotify.login.signupapi.services.model.UserData$Builder;
import com.spotify.login.signupapi.services.model.UserData;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody$Gender;

public final class UserData$Builder	// class@0009ca from classes.dex
{
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private EmailSignupRequestBody$Gender gender;
    private String name;

    public void UserData$Builder(UserData p0){
       co5.o(p0, "origin");
       super();
       this.gender = p0.getGender();
       this.birthDay = p0.getBirthDay();
       this.birthMonth = p0.getBirthMonth();
       this.birthYear = p0.getBirthYear();
       this.name = p0.getName();
    }
    public final UserData$Builder birthDay(int p0){
       this.birthDay = p0;
       return this;
    }
    public final UserData$Builder birthMonth(int p0){
       this.birthMonth = p0;
       return this;
    }
    public final UserData$Builder birthYear(int p0){
       this.birthYear = p0;
       return this;
    }
    public final UserData build(){
       UserData v6 = new UserData(this.gender, this.birthDay, this.birthMonth, this.birthYear, this.name);
       return v6;
    }
    public final UserData$Builder gender(EmailSignupRequestBody$Gender p0){
       co5.o(p0, "value");
       this.gender = p0;
       return this;
    }
    public final UserData$Builder name(String p0){
       this.name = p0;
       return this;
    }
}
