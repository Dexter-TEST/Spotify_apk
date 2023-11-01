package com.spotify.login5.v3.credentials.proto.AppleSignInCredential;
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
import p.w30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class AppleSignInCredential extends c implements u74	// class@0009d2 from classes.dex
{
    private String authCode_;
    private String bundleId_;
    private String redirectUri_;
    public static final int AUTH_CODE_FIELD_NUMBER = 1;
    public static final int BUNDLE_ID_FIELD_NUMBER = 3;
    private static final AppleSignInCredential DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int REDIRECT_URI_FIELD_NUMBER;

    static {
       AppleSignInCredential uAppleSignIn = new AppleSignInCredential();
       AppleSignInCredential.DEFAULT_INSTANCE = uAppleSignIn;
       c.registerDefaultInstance(AppleSignInCredential.class, uAppleSignIn);
    }
    private void AppleSignInCredential(){
       super();
       this.authCode_ = "";
       this.redirectUri_ = "";
       this.bundleId_ = "";
    }
    public static AppleSignInCredential e(){
       return AppleSignInCredential.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return AppleSignInCredential.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"authCode_","redirectUri_","bundleId_"};
             return c.newMessageInfo(AppleSignInCredential.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new AppleSignInCredential();
           case 4:
             return new h40(p2);
           case 5:
             return AppleSignInCredential.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AppleSignInCredential.PARSER) == null) {
                _monitor_enter(AppleSignInCredential.class);
                if ((pARSER = AppleSignInCredential.PARSER) == null) {
                   pARSER = new ii2(AppleSignInCredential.DEFAULT_INSTANCE);
                   AppleSignInCredential.PARSER = pARSER;
                }
                _monitor_exit(AppleSignInCredential.class);
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
