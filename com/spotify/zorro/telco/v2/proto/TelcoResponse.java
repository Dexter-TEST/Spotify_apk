package com.spotify.zorro.telco.v2.proto.TelcoResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.b04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class TelcoResponse extends c implements u74	// class@000cdc from classes.dex
{
    private String action_;
    private String callbackUrl_;
    private String name_;
    private String sessionId_;
    private String url_;
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int CALLBACK_URL_FIELD_NUMBER = 4;
    private static final TelcoResponse DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SESSION_ID_FIELD_NUMBER;
    public static final int URL_FIELD_NUMBER;

    static {
       TelcoResponse telcoRespons = new TelcoResponse();
       TelcoResponse.DEFAULT_INSTANCE = telcoRespons;
       c.registerDefaultInstance(TelcoResponse.class, telcoRespons);
    }
    private void TelcoResponse(){
       super();
       this.name_ = "";
       this.action_ = "";
       this.url_ = "";
       this.callbackUrl_ = "";
       this.sessionId_ = "";
    }
    public static TelcoResponse e(){
       return TelcoResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return TelcoResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"name_","action_","url_","callbackUrl_","sessionId_"};
             return c.newMessageInfo(TelcoResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02", objArray);
           case 3:
             return new TelcoResponse();
           case 4:
             return new q04(p2);
           case 5:
             return TelcoResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = TelcoResponse.PARSER) == null) {
                _monitor_enter(TelcoResponse.class);
                if ((pARSER = TelcoResponse.PARSER) == null) {
                   pARSER = new ii2(TelcoResponse.DEFAULT_INSTANCE);
                   TelcoResponse.PARSER = pARSER;
                }
                _monitor_exit(TelcoResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.action_;
    }
    public final String g(){
       return this.callbackUrl_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.sessionId_;
    }
    public final String i(){
       return this.url_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
