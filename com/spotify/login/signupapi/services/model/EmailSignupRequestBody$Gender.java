package com.spotify.login.signupapi.services.model.EmailSignupRequestBody$Gender;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EmailSignupRequestBody$Gender extends Enum	// class@00099b from classes.dex
{
    private static final EmailSignupRequestBody$Gender[] $VALUES;
    public static final EmailSignupRequestBody$Gender FEMALE;
    public static final EmailSignupRequestBody$Gender MALE;
    public static final EmailSignupRequestBody$Gender NEUTRAL;
    public static final EmailSignupRequestBody$Gender OTHER;
    public static final EmailSignupRequestBody$Gender PREFER_NOT_TO_SAY;

    private static final EmailSignupRequestBody$Gender[] $values(){
       EmailSignupRequestBody$Gender[] genderArray = new EmailSignupRequestBody$Gender[]{EmailSignupRequestBody$Gender.MALE,EmailSignupRequestBody$Gender.FEMALE,EmailSignupRequestBody$Gender.NEUTRAL,EmailSignupRequestBody$Gender.OTHER,EmailSignupRequestBody$Gender.PREFER_NOT_TO_SAY};
       return genderArray;
    }
    static {
       EmailSignupRequestBody$Gender.MALE = new EmailSignupRequestBody$Gender("MALE", 0);
       EmailSignupRequestBody$Gender.FEMALE = new EmailSignupRequestBody$Gender("FEMALE", 1);
       EmailSignupRequestBody$Gender.NEUTRAL = new EmailSignupRequestBody$Gender("NEUTRAL", 2);
       EmailSignupRequestBody$Gender.OTHER = new EmailSignupRequestBody$Gender("OTHER", 3);
       EmailSignupRequestBody$Gender.PREFER_NOT_TO_SAY = new EmailSignupRequestBody$Gender("PREFER_NOT_TO_SAY", 4);
       EmailSignupRequestBody$Gender.$VALUES = EmailSignupRequestBody$Gender.$values();
    }
    private void EmailSignupRequestBody$Gender(String p0,int p1){
       super(p0, p1);
    }
    public static EmailSignupRequestBody$Gender valueOf(String p0){
       return Enum.valueOf(EmailSignupRequestBody$Gender.class, p0);
    }
    public static EmailSignupRequestBody$Gender[] values(){
       return EmailSignupRequestBody$Gender.$VALUES.clone();
    }
}
