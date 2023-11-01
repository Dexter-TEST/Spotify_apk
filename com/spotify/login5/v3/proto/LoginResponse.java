package com.spotify.login5.v3.proto.LoginResponse;
import p.u74;
import com.google.protobuf.c;
import p.cr0;
import java.lang.Class;
import p.xb3;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.g40;
import com.spotify.login5.v3.proto.LoginOk;
import com.spotify.login5.v3.proto.Challenges;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.rt3;
import java.lang.Integer;
import com.spotify.login5.v3.proto.UserInfo;
import p.r74;
import com.google.protobuf.b;

public final class LoginResponse extends c implements u74	// class@0009e2 from classes.dex
{
    private String identifierToken_;
    private i80 loginContext_;
    private int responseCase_;
    private Object response_;
    private UserInfo userInfo_;
    private int warningsMemoizedSerializedSize;
    private xb3 warnings_;
    public static final int CHALLENGES_FIELD_NUMBER = 3;
    private static final LoginResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    public static final int IDENTIFIER_TOKEN_FIELD_NUMBER;
    public static final int LOGIN_CONTEXT_FIELD_NUMBER;
    public static final int OK_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int USER_INFO_FIELD_NUMBER;
    public static final int WARNINGS_FIELD_NUMBER;
    private static final yb3 warnings_converter_;

    static {
       LoginResponse.warnings_converter_ = new cr0(3);
       LoginResponse loginRespons = new LoginResponse();
       LoginResponse.DEFAULT_INSTANCE = loginRespons;
       c.registerDefaultInstance(LoginResponse.class, loginRespons);
    }
    private void LoginResponse(){
       super();
       this.responseCase_ = 0;
       this.warnings_ = c.emptyIntList();
       this.loginContext_ = i80.b;
       this.identifierToken_ = "";
    }
    public static LoginResponse e(){
       return LoginResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LoginResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"response_","responseCase_",LoginOk.class,Challenges.class,"warnings_","loginContext_","identifierToken_","userInfo_"};
             return c.newMessageInfo(LoginResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\x01\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02?\xff\x02\xff\x02\x03<\xff\x02\xff\x02\x04,\x05\n\x06\x02\x02\x07\t", objArray);
           case 3:
             return new LoginResponse();
           case 4:
             return new h40(p2);
           case 5:
             return LoginResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LoginResponse.PARSER) == null) {
                _monitor_enter(LoginResponse.class);
                if ((pARSER = LoginResponse.PARSER) == null) {
                   pARSER = new ii2(LoginResponse.DEFAULT_INSTANCE);
                   LoginResponse.PARSER = pARSER;
                }
                _monitor_exit(LoginResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Challenges f(){
       if (this.responseCase_ == 3) {
          return this.response_;
       }
       return Challenges.g();
    }
    public final rt3 g(){
       rt3 ort3;
       if (this.responseCase_ != 2) {
          return rt3.b;
       }
       if ((ort3 = rt3.a(this.response_.intValue())) == null) {
          ort3 = rt3.B;
       }
       return ort3;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.identifierToken_;
    }
    public final i80 i(){
       return this.loginContext_;
    }
    public final LoginOk j(){
       if (this.responseCase_ == 1) {
          return this.response_;
       }
       return LoginOk.g();
    }
    public final int k(){
       LoginResponse tresponseCas;
       int i;
       if ((tresponseCas = this.responseCase_) != null) {
          i = 1;
          if (tresponseCas != i) {
             i = 2;
             if (tresponseCas != i) {
                i = 3;
                if (tresponseCas != i) {
                   i = 0;
                }
             }
          }
       }else {
          i = 4;
       }
       return i;
    }
    public final UserInfo l(){
       LoginResponse tuserInfo_;
       if ((tuserInfo_ = this.userInfo_) == null) {
          tuserInfo_ = UserInfo.f();
       }
       return tuserInfo_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
