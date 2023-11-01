package com.spotify.login5.v3.proto.UserInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.u30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class UserInfo extends c implements u74	// class@0009e3 from classes.dex
{
    private String birthdate_;
    private boolean emailAlreadyRegistered_;
    private boolean emailVerified_;
    private String email_;
    private int gender_;
    private String name_;
    private boolean phoneNumberVerified_;
    private String phoneNumber_;
    public static final int BIRTHDATE_FIELD_NUMBER = 4;
    private static final UserInfo DEFAULT_INSTANCE;
    public static final int EMAIL_ALREADY_REGISTERED_FIELD_NUMBER;
    public static final int EMAIL_FIELD_NUMBER;
    public static final int EMAIL_VERIFIED_FIELD_NUMBER;
    public static final int GENDER_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PHONE_NUMBER_FIELD_NUMBER;
    public static final int PHONE_NUMBER_VERIFIED_FIELD_NUMBER;

    static {
       UserInfo userInfo = new UserInfo();
       UserInfo.DEFAULT_INSTANCE = userInfo;
       c.registerDefaultInstance(UserInfo.class, userInfo);
    }
    private void UserInfo(){
       super();
       this.name_ = "";
       this.email_ = "";
       this.birthdate_ = "";
       this.phoneNumber_ = "";
    }
    public static UserInfo e(){
       return UserInfo.DEFAULT_INSTANCE;
    }
    public static UserInfo f(){
       return UserInfo.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return UserInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[]{"name_","email_","emailVerified_","birthdate_","gender_","phoneNumber_","phoneNumberVerified_","emailAlreadyRegistered_"};
             return c.newMessageInfo(UserInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\x02\x02\x05\f\x06\x02\x02\x07\x07\b\x07", objArray);
           case 3:
             return new UserInfo();
           case 4:
             return new h40(p2);
           case 5:
             return UserInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UserInfo.PARSER) == null) {
                _monitor_enter(UserInfo.class);
                if ((pARSER = UserInfo.PARSER) == null) {
                   pARSER = new ii2(UserInfo.DEFAULT_INSTANCE);
                   UserInfo.PARSER = pARSER;
                }
                _monitor_exit(UserInfo.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final boolean g(){
       return this.emailAlreadyRegistered_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
