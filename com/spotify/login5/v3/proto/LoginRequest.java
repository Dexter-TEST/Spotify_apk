package com.spotify.login5.v3.proto.LoginRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import com.spotify.login5.v3.credentials.proto.StoredCredential;
import java.lang.Object;
import com.spotify.login5.v3.credentials.proto.Password;
import com.spotify.login5.v3.credentials.proto.FacebookAccessToken;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import com.spotify.login5.v3.proto.ClientInfo;
import com.spotify.login5.v3.credentials.proto.OneTimeToken;
import com.spotify.login5.v3.proto.ChallengeSolutions;
import p.uu3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.login5.v3.credentials.proto.ParentChildCredential;
import com.spotify.login5.v3.credentials.proto.AppleSignInCredential;
import com.spotify.login5.v3.credentials.proto.SamsungSignInCredential;
import com.spotify.login5.v3.credentials.proto.GoogleSignInCredential;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class LoginRequest extends c implements u74	// class@0009e1 from classes.dex
{
    private ChallengeSolutions challengeSolutions_;
    private ClientInfo clientInfo_;
    private i80 loginContext_;
    private int loginMethodCase_;
    private Object loginMethod_;
    public static final int APPLE_SIGN_IN_CREDENTIAL_FIELD_NUMBER = 106;
    public static final int CHALLENGE_SOLUTIONS_FIELD_NUMBER = 3;
    public static final int CLIENT_INFO_FIELD_NUMBER = 1;
    private static final LoginRequest DEFAULT_INSTANCE;
    public static final int FACEBOOK_ACCESS_TOKEN_FIELD_NUMBER;
    public static final int GOOGLE_SIGN_IN_CREDENTIAL_FIELD_NUMBER;
    public static final int LOGIN_CONTEXT_FIELD_NUMBER;
    public static final int ONE_TIME_TOKEN_FIELD_NUMBER;
    public static final int PARENT_CHILD_CREDENTIAL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PASSWORD_FIELD_NUMBER;
    public static final int PHONE_NUMBER_FIELD_NUMBER;
    public static final int SAMSUNG_SIGN_IN_CREDENTIAL_FIELD_NUMBER;
    public static final int STORED_CREDENTIAL_FIELD_NUMBER;

    static {
       LoginRequest loginRequest = new LoginRequest();
       LoginRequest.DEFAULT_INSTANCE = loginRequest;
       c.registerDefaultInstance(LoginRequest.class, loginRequest);
    }
    private void LoginRequest(){
       super();
       this.loginMethodCase_ = 0;
       this.loginContext_ = i80.b;
    }
    public static LoginRequest e(){
       return LoginRequest.DEFAULT_INSTANCE;
    }
    public static void f(LoginRequest p0,StoredCredential p1){
       p0.getClass();
       p1.getClass();
       p0.loginMethod_ = p1;
       p0.loginMethodCase_ = 100;
    }
    public static void g(LoginRequest p0,Password p1){
       p0.getClass();
       p1.getClass();
       p0.loginMethod_ = p1;
       p0.loginMethodCase_ = 101;
    }
    public static void h(LoginRequest p0,FacebookAccessToken p1){
       p0.getClass();
       p1.getClass();
       p0.loginMethod_ = p1;
       p0.loginMethodCase_ = 102;
    }
    public static void i(LoginRequest p0,PhoneNumber p1){
       p0.getClass();
       p1.getClass();
       p0.loginMethod_ = p1;
       p0.loginMethodCase_ = 103;
    }
    public static void j(LoginRequest p0,ClientInfo p1){
       p0.getClass();
       p1.getClass();
       p0.clientInfo_ = p1;
    }
    public static void k(LoginRequest p0,OneTimeToken p1){
       p0.getClass();
       p1.getClass();
       p0.loginMethod_ = p1;
       p0.loginMethodCase_ = 104;
    }
    public static void l(LoginRequest p0,i80 p1){
       p0.getClass();
       p1.getClass();
       p0.loginContext_ = p1;
    }
    public static void m(LoginRequest p0,ChallengeSolutions p1){
       p0.getClass();
       p1.getClass();
       p0.challengeSolutions_ = p1;
    }
    public static uu3 p(){
       return LoginRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LoginRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[14];
             objArray[0] = "loginMethod_";
             objArray[b] = "loginMethodCase_";
             objArray[2] = "clientInfo_";
             objArray[3] = "loginContext_";
             objArray[4] = "challengeSolutions_";
             objArray[5] = StoredCredential.class;
             objArray[6] = Password.class;
             objArray[7] = FacebookAccessToken.class;
             objArray[8] = PhoneNumber.class;
             objArray[9] = OneTimeToken.class;
             objArray[10] = ParentChildCredential.class;
             objArray[11] = AppleSignInCredential.class;
             objArray[12] = SamsungSignInCredential.class;
             objArray[13] = GoogleSignInCredential.class;
             return c.newMessageInfo(LoginRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\f\x01\xff\x02\xff\x02\x01l\f\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\n\x03\td<\xff\x02\xff\x02e<\xff\x02\xff\x02f<\xff\x02\xff\x02g<\xff\x02\xff\x02h<\xff\x02\xff\x02i<\xff\x02\xff\x02j<\xff\x02\xff\x02k<\xff\x02\xff\x02l<\xff\x02\xff\x02", objArray);
           case 3:
             return new LoginRequest();
           case 4:
             return new uu3();
           case 5:
             return LoginRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LoginRequest.PARSER) == null) {
                _monitor_enter(LoginRequest.class);
                if ((pARSER = LoginRequest.PARSER) == null) {
                   pARSER = new ii2(LoginRequest.DEFAULT_INSTANCE);
                   LoginRequest.PARSER = pARSER;
                }
                _monitor_exit(LoginRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final i80 n(){
       return this.loginContext_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final PhoneNumber o(){
       if (this.loginMethodCase_ == 103) {
          return this.loginMethod_;
       }
       return PhoneNumber.i();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
