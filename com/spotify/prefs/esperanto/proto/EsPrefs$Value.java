package com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Long;
import p.xq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsPrefs$Value extends c implements u74	// class@000ba3 from classes.dex
{
    private int valueCase_;
    private Object value_;
    public static final int BOOL_FIELD_NUMBER = 2;
    private static final EsPrefs$Value DEFAULT_INSTANCE;
    public static final int NUMBER_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STRING_FIELD_NUMBER;

    static {
       EsPrefs$Value value = new EsPrefs$Value();
       EsPrefs$Value.DEFAULT_INSTANCE = value;
       c.registerDefaultInstance(EsPrefs$Value.class, value);
    }
    private void EsPrefs$Value(){
       super();
       this.valueCase_ = 0;
    }
    public static void e(EsPrefs$Value p0,boolean p1){
       p0.valueCase_ = 2;
       p0.value_ = Boolean.valueOf(p1);
    }
    public static void f(EsPrefs$Value p0,long p1){
       p0.valueCase_ = 1;
       p0.value_ = Long.valueOf(p1);
    }
    public static EsPrefs$Value g(){
       return EsPrefs$Value.DEFAULT_INSTANCE;
    }
    public static EsPrefs$Value h(){
       return EsPrefs$Value.DEFAULT_INSTANCE;
    }
    public static xq1 i(){
       return EsPrefs$Value.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsPrefs$Value.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"value_","valueCase_"};
             return c.newMessageInfo(EsPrefs$Value.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\x01\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x015\xff\x02\xff\x02\x02:\xff\x02\xff\x02\x03\x02\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsPrefs$Value();
           case 4:
             return new xq1();
           case 5:
             return EsPrefs$Value.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPrefs$Value.PARSER) == null) {
                _monitor_enter(EsPrefs$Value.class);
                if ((pARSER = EsPrefs$Value.PARSER) == null) {
                   pARSER = new ii2(EsPrefs$Value.DEFAULT_INSTANCE);
                   EsPrefs$Value.PARSER = pARSER;
                }
                _monitor_exit(EsPrefs$Value.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
