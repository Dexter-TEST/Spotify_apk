package com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.qp1;
import p.uq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsPrefs$PrefValues extends c implements u74	// class@000ba1 from classes.dex
{
    private g14 entries_;
    private static final EsPrefs$PrefValues DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsPrefs$PrefValues prefValues = new EsPrefs$PrefValues();
       EsPrefs$PrefValues.DEFAULT_INSTANCE = prefValues;
       c.registerDefaultInstance(EsPrefs$PrefValues.class, prefValues);
    }
    private void EsPrefs$PrefValues(){
       super();
       this.entries_ = g14.b;
    }
    public static EsPrefs$PrefValues e(){
       return EsPrefs$PrefValues.DEFAULT_INSTANCE;
    }
    public static EsPrefs$PrefValues f(byte[] p0){
       return c.parseFrom(EsPrefs$PrefValues.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsPrefs$PrefValues.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"entries_",uq1.a};
             return c.newMessageInfo(EsPrefs$PrefValues.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new EsPrefs$PrefValues();
           case 4:
             return new fq1(p2);
           case 5:
             return EsPrefs$PrefValues.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPrefs$PrefValues.PARSER) == null) {
                _monitor_enter(EsPrefs$PrefValues.class);
                if ((pARSER = EsPrefs$PrefValues.PARSER) == null) {
                   pARSER = new ii2(EsPrefs$PrefValues.DEFAULT_INSTANCE);
                   EsPrefs$PrefValues.PARSER = pARSER;
                }
                _monitor_exit(EsPrefs$PrefValues.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
