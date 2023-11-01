package com.spotify.login5.v3.proto.LoginOk;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.s30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class LoginOk extends c implements u74	// class@0009e0 from classes.dex
{
    private int accessTokenExpiresIn_;
    private String accessToken_;
    private i80 storedCredential_;
    private String username_;
    public static final int ACCESS_TOKEN_EXPIRES_IN_FIELD_NUMBER = 4;
    public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;
    private static final LoginOk DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int STORED_CREDENTIAL_FIELD_NUMBER;
    public static final int USERNAME_FIELD_NUMBER;

    static {
       LoginOk loginOk = new LoginOk();
       LoginOk.DEFAULT_INSTANCE = loginOk;
       c.registerDefaultInstance(LoginOk.class, loginOk);
    }
    private void LoginOk(){
       super();
       this.username_ = "";
       this.accessToken_ = "";
       this.storedCredential_ = i80.b;
    }
    public static LoginOk e(){
       return LoginOk.DEFAULT_INSTANCE;
    }
    public static LoginOk g(){
       return LoginOk.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LoginOk.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"username_","accessToken_","storedCredential_","accessTokenExpiresIn_"};
             return c.newMessageInfo(LoginOk.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\n\x04\x04", objArray);
           case 3:
             return new LoginOk();
           case 4:
             return new h40(p2);
           case 5:
             return LoginOk.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LoginOk.PARSER) == null) {
                _monitor_enter(LoginOk.class);
                if ((pARSER = LoginOk.PARSER) == null) {
                   pARSER = new ii2(LoginOk.DEFAULT_INSTANCE);
                   LoginOk.PARSER = pARSER;
                }
                _monitor_exit(LoginOk.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.accessToken_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String getUsername(){
       return this.username_;
    }
    public final i80 h(){
       return this.storedCredential_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
