package com.spotify.login5.v3.credentials.proto.SamsungSignInCredential;
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
import p.d40;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class SamsungSignInCredential extends c implements u74	// class@0009d8 from classes.dex
{
    private String authCode_;
    private String idToken_;
    private String redirectUri_;
    private String tokenEndpointUrl_;
    public static final int AUTH_CODE_FIELD_NUMBER = 1;
    private static final SamsungSignInCredential DEFAULT_INSTANCE;
    public static final int ID_TOKEN_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REDIRECT_URI_FIELD_NUMBER;
    public static final int TOKEN_ENDPOINT_URL_FIELD_NUMBER;

    static {
       SamsungSignInCredential samsungSignI = new SamsungSignInCredential();
       SamsungSignInCredential.DEFAULT_INSTANCE = samsungSignI;
       c.registerDefaultInstance(SamsungSignInCredential.class, samsungSignI);
    }
    private void SamsungSignInCredential(){
       super();
       this.authCode_ = "";
       this.redirectUri_ = "";
       this.idToken_ = "";
       this.tokenEndpointUrl_ = "";
    }
    public static SamsungSignInCredential e(){
       return SamsungSignInCredential.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SamsungSignInCredential.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"authCode_","redirectUri_","idToken_","tokenEndpointUrl_"};
             return c.newMessageInfo(SamsungSignInCredential.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02", objArray);
           case 3:
             return new SamsungSignInCredential();
           case 4:
             return new h40(p2);
           case 5:
             return SamsungSignInCredential.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SamsungSignInCredential.PARSER) == null) {
                _monitor_enter(SamsungSignInCredential.class);
                if ((pARSER = SamsungSignInCredential.PARSER) == null) {
                   pARSER = new ii2(SamsungSignInCredential.DEFAULT_INSTANCE);
                   SamsungSignInCredential.PARSER = pARSER;
                }
                _monitor_exit(SamsungSignInCredential.class);
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
