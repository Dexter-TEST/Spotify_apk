package com.spotify.login5.v3.credentials.proto.GoogleSignInCredential;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sl2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class GoogleSignInCredential extends c implements u74	// class@0009d4 from classes.dex
{
    private String authCode_;
    private String redirectUri_;
    public static final int AUTH_CODE_FIELD_NUMBER = 1;
    private static final GoogleSignInCredential DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int REDIRECT_URI_FIELD_NUMBER;

    static {
       GoogleSignInCredential googleSignIn = new GoogleSignInCredential();
       GoogleSignInCredential.DEFAULT_INSTANCE = googleSignIn;
       c.registerDefaultInstance(GoogleSignInCredential.class, googleSignIn);
    }
    private void GoogleSignInCredential(){
       super();
       this.authCode_ = "";
       this.redirectUri_ = "";
    }
    public static GoogleSignInCredential e(){
       return GoogleSignInCredential.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return GoogleSignInCredential.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"authCode_","redirectUri_"};
             return c.newMessageInfo(GoogleSignInCredential.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new GoogleSignInCredential();
           case 4:
             return new sl2();
           case 5:
             return GoogleSignInCredential.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GoogleSignInCredential.PARSER) == null) {
                _monitor_enter(GoogleSignInCredential.class);
                if ((pARSER = GoogleSignInCredential.PARSER) == null) {
                   pARSER = new ii2(GoogleSignInCredential.DEFAULT_INSTANCE);
                   GoogleSignInCredential.PARSER = pARSER;
                }
                _monitor_exit(GoogleSignInCredential.class);
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
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
