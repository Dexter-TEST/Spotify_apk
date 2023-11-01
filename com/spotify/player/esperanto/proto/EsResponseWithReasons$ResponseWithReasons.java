package com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.pp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.gr1;

public final class EsResponseWithReasons$ResponseWithReasons extends c implements u74	// class@000b07 from classes.dex
{
    private int error_;
    private String reasons_;
    private static final EsResponseWithReasons$ResponseWithReasons DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REASONS_FIELD_NUMBER;

    static {
       EsResponseWithReasons$ResponseWithReasons responseWith = new EsResponseWithReasons$ResponseWithReasons();
       EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE = responseWith;
       c.registerDefaultInstance(EsResponseWithReasons$ResponseWithReasons.class, responseWith);
    }
    private void EsResponseWithReasons$ResponseWithReasons(){
       super();
       this.reasons_ = "";
    }
    public static EsResponseWithReasons$ResponseWithReasons e(){
       return EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE;
    }
    public static EsResponseWithReasons$ResponseWithReasons h(byte[] p0){
       return c.parseFrom(EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"error_","reasons_"};
             return c.newMessageInfo(EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02", objArray);
           case 3:
             return new EsResponseWithReasons$ResponseWithReasons();
           case 4:
             return new fq1(p2);
           case 5:
             return EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsResponseWithReasons$ResponseWithReasons.PARSER) == null) {
                _monitor_enter(EsResponseWithReasons$ResponseWithReasons.class);
                if ((pARSER = EsResponseWithReasons$ResponseWithReasons.PARSER) == null) {
                   pARSER = new ii2(EsResponseWithReasons$ResponseWithReasons.DEFAULT_INSTANCE);
                   EsResponseWithReasons$ResponseWithReasons.PARSER = pARSER;
                }
                _monitor_exit(EsResponseWithReasons$ResponseWithReasons.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final gr1 f(){
       EsResponseWithReasons$ResponseWithReasons terror_;
       gr1 ogr1;
       if ((terror_ = this.error_) != null) {
          if (terror_ != 1) {
             if (terror_ != 2) {
                ogr1 = (terror_ != 3)? null: gr1.v;
             }else {
                ogr1 = gr1.t;
             }
          }else {
             ogr1 = gr1.c;
          }
       }else {
          ogr1 = gr1.b;
       }
       if (ogr1 == null) {
          ogr1 = gr1.w;
       }
       return ogr1;
    }
    public final String g(){
       return this.reasons_;
    }
}
