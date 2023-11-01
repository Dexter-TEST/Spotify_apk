package com.spotify.login5.v3.credentials.proto.FacebookAccessToken;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.gy1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class FacebookAccessToken extends c implements u74	// class@0009d3 from classes.dex
{
    private String accessToken_;
    private String fbUid_;
    public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;
    private static final FacebookAccessToken DEFAULT_INSTANCE;
    public static final int FB_UID_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       FacebookAccessToken uFacebookAcc = new FacebookAccessToken();
       FacebookAccessToken.DEFAULT_INSTANCE = uFacebookAcc;
       c.registerDefaultInstance(FacebookAccessToken.class, uFacebookAcc);
    }
    private void FacebookAccessToken(){
       super();
       this.fbUid_ = "";
       this.accessToken_ = "";
    }
    public static FacebookAccessToken e(){
       return FacebookAccessToken.DEFAULT_INSTANCE;
    }
    public static void f(FacebookAccessToken p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.fbUid_ = p1;
    }
    public static void g(FacebookAccessToken p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.accessToken_ = p1;
    }
    public static gy1 h(){
       return FacebookAccessToken.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return FacebookAccessToken.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"fbUid_","accessToken_"};
             return c.newMessageInfo(FacebookAccessToken.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new FacebookAccessToken();
           case 4:
             return new gy1();
           case 5:
             return FacebookAccessToken.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = FacebookAccessToken.PARSER) == null) {
                _monitor_enter(FacebookAccessToken.class);
                if ((pARSER = FacebookAccessToken.PARSER) == null) {
                   pARSER = new ii2(FacebookAccessToken.DEFAULT_INSTANCE);
                   FacebookAccessToken.PARSER = pARSER;
                }
                _monitor_exit(FacebookAccessToken.class);
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
