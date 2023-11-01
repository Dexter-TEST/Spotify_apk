package com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase extends Enum	// class@000659 from classes.dex
{
    private final int value;
    private static final EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase[] $VALUES;
    public static final EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase NULL;
    public static final EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase STORED_USER_INFO;
    public static final EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase USERINFO_NOT_SET;

    static {
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase nullableStor = new EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase("STORED_USER_INFO", 0, 1);
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.STORED_USER_INFO = nullableStor;
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase nullableStor1 = new EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase("NULL", 1, 2);
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.NULL = nullableStor1;
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase nullableStor2 = new EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase("USERINFO_NOT_SET", 2, 0);
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.USERINFO_NOT_SET = nullableStor2;
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase[] nullableStor3 = new EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase[]{nullableStor,nullableStor1,nullableStor2};
       EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.$VALUES = nullableStor3;
    }
    private void EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase forNumber(int p0){
       if (!p0) {
          return EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.USERINFO_NOT_SET;
       }
       if (p0 == 1) {
          return EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.STORED_USER_INFO;
       }
       if (p0 != 2) {
          return null;
       }
       return EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.NULL;
    }
    public static EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase valueOf(int p0){
       return EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.forNumber(p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase valueOf(String p0){
       return Enum.valueOf(EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.class, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase[] values(){
       return EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.$VALUES.clone();
    }
    public int getNumber(){
       return this.value;
    }
}
