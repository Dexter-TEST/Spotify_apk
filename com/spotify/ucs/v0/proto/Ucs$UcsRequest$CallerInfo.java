package com.spotify.ucs.v0.proto.Ucs$UcsRequest$CallerInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.spotify.ucs.v0.proto.c;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Ucs$UcsRequest$CallerInfo extends c implements u74	// class@000c50 from classes.dex
{
    private String reason_;
    private String requestOrginVersion_;
    private String requestOriginId_;
    private static final Ucs$UcsRequest$CallerInfo DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int REASON_FIELD_NUMBER;
    public static final int REQUEST_ORGIN_VERSION_FIELD_NUMBER;
    public static final int REQUEST_ORIGIN_ID_FIELD_NUMBER;

    static {
       Ucs$UcsRequest$CallerInfo ucsRequest$C = new Ucs$UcsRequest$CallerInfo();
       Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE = ucsRequest$C;
       c.registerDefaultInstance(Ucs$UcsRequest$CallerInfo.class, ucsRequest$C);
    }
    private void Ucs$UcsRequest$CallerInfo(){
       super();
       this.requestOriginId_ = "";
       this.requestOrginVersion_ = "";
       this.reason_ = "";
    }
    public static Ucs$UcsRequest$CallerInfo e(){
       return Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE;
    }
    public static void f(Ucs$UcsRequest$CallerInfo p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.requestOriginId_ = p1;
    }
    public static void g(Ucs$UcsRequest$CallerInfo p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.requestOrginVersion_ = p1;
    }
    public static void h(Ucs$UcsRequest$CallerInfo p0){
       p0.getClass();
       p0.reason_ = "BLOCKING";
    }
    public static c i(){
       return Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new Ucs$UcsRequest$CallerInfo();
           case 4:
             return new c();
           case 5:
             return Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Ucs$UcsRequest$CallerInfo.PARSER) == null) {
                _monitor_enter(Ucs$UcsRequest$CallerInfo.class);
                if ((pARSER = Ucs$UcsRequest$CallerInfo.PARSER) == null) {
                   pARSER = new ii2(Ucs$UcsRequest$CallerInfo.DEFAULT_INSTANCE);
                   Ucs$UcsRequest$CallerInfo.PARSER = pARSER;
                }
                _monitor_exit(Ucs$UcsRequest$CallerInfo.class);
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
