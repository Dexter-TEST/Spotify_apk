package com.spotify.connectivity.auth.AuthUserInfoGender;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AuthUserInfoGender extends Enum	// class@0005ea from classes.dex
{
    private static final AuthUserInfoGender[] $VALUES;
    public static final AuthUserInfoGender FEMALE;
    public static final AuthUserInfoGender MALE;
    public static final AuthUserInfoGender NEUTRAL;
    public static final AuthUserInfoGender UNKNOWN;

    private static final AuthUserInfoGender[] $values(){
       AuthUserInfoGender[] uAuthUserInf = new AuthUserInfoGender[]{AuthUserInfoGender.UNKNOWN,AuthUserInfoGender.MALE,AuthUserInfoGender.FEMALE,AuthUserInfoGender.NEUTRAL};
       return uAuthUserInf;
    }
    static {
       AuthUserInfoGender.UNKNOWN = new AuthUserInfoGender("UNKNOWN", 0);
       AuthUserInfoGender.MALE = new AuthUserInfoGender("MALE", 1);
       AuthUserInfoGender.FEMALE = new AuthUserInfoGender("FEMALE", 2);
       AuthUserInfoGender.NEUTRAL = new AuthUserInfoGender("NEUTRAL", 3);
       AuthUserInfoGender.$VALUES = AuthUserInfoGender.$values();
    }
    private void AuthUserInfoGender(String p0,int p1){
       super(p0, p1);
    }
    public static AuthUserInfoGender valueOf(String p0){
       return Enum.valueOf(AuthUserInfoGender.class, p0);
    }
    public static AuthUserInfoGender[] values(){
       return AuthUserInfoGender.$VALUES.clone();
    }
}
