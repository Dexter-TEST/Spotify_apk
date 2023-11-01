package com.spotify.ucs.proto.v0.UcsRequest$CallerInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.spotify.ucs.proto.v0.c;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class UcsRequest$CallerInfo extends c implements u74	// class@000c3f from classes.dex
{
    private String reason_;
    private String requestOrginVersion_;
    private String requestOriginId_;
    private static final UcsRequest$CallerInfo DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int REASON_FIELD_NUMBER;
    public static final int REQUEST_ORGIN_VERSION_FIELD_NUMBER;
    public static final int REQUEST_ORIGIN_ID_FIELD_NUMBER;

    static {
       UcsRequest$CallerInfo uCallerInfo = new UcsRequest$CallerInfo();
       UcsRequest$CallerInfo.DEFAULT_INSTANCE = uCallerInfo;
       c.registerDefaultInstance(UcsRequest$CallerInfo.class, uCallerInfo);
    }
    private void UcsRequest$CallerInfo(){
       super();
       this.requestOriginId_ = "";
       this.requestOrginVersion_ = "";
       this.reason_ = "";
    }
    public static UcsRequest$CallerInfo e(){
       return UcsRequest$CallerInfo.DEFAULT_INSTANCE;
    }
    public static void f(UcsRequest$CallerInfo p0){
       p0.getClass();
       p0.requestOriginId_ = "com.spotify.lite";
    }
    public static void g(UcsRequest$CallerInfo p0){
       p0.getClass();
       p0.requestOrginVersion_ = "8.8.80.328";
    }
    public static void h(UcsRequest$CallerInfo p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.reason_ = p1;
    }
    public static c i(){
       return UcsRequest$CallerInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return UcsRequest$CallerInfo.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"requestOriginId_","requestOrginVersion_","reason_"};
             return c.newMessageInfo(UcsRequest$CallerInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new UcsRequest$CallerInfo();
           case 4:
             return new c();
           case 5:
             return UcsRequest$CallerInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsRequest$CallerInfo.PARSER) == null) {
                _monitor_enter(UcsRequest$CallerInfo.class);
                if ((pARSER = UcsRequest$CallerInfo.PARSER) == null) {
                   pARSER = new ii2(UcsRequest$CallerInfo.DEFAULT_INSTANCE);
                   UcsRequest$CallerInfo.PARSER = pARSER;
                }
                _monitor_exit(UcsRequest$CallerInfo.class);
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
