package com.spotify.prefs.esperanto.proto.EsPrefs$SetParams;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.vq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.wq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsPrefs$SetParams extends c implements u74	// class@000ba2 from classes.dex
{
    private g14 entries_;
    private static final EsPrefs$SetParams DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsPrefs$SetParams setParams = new EsPrefs$SetParams();
       EsPrefs$SetParams.DEFAULT_INSTANCE = setParams;
       c.registerDefaultInstance(EsPrefs$SetParams.class, setParams);
    }
    private void EsPrefs$SetParams(){
       super();
       this.entries_ = g14.b;
    }
    public static g14 e(EsPrefs$SetParams p0){
       EsPrefs$SetParams entries_ = p0.entries_;
       if (entries_.a == null) {
          p0.entries_ = entries_.d();
       }
       return p0.entries_;
    }
    public static EsPrefs$SetParams f(){
       return EsPrefs$SetParams.DEFAULT_INSTANCE;
    }
    public static vq1 g(){
       return EsPrefs$SetParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsPrefs$SetParams.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"entries_",wq1.a};
             return c.newMessageInfo(EsPrefs$SetParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new EsPrefs$SetParams();
           case 4:
             return new vq1();
           case 5:
             return EsPrefs$SetParams.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPrefs$SetParams.PARSER) == null) {
                _monitor_enter(EsPrefs$SetParams.class);
                if ((pARSER = EsPrefs$SetParams.PARSER) == null) {
                   pARSER = new ii2(EsPrefs$SetParams.DEFAULT_INSTANCE);
                   EsPrefs$SetParams.PARSER = pARSER;
                }
                _monitor_exit(EsPrefs$SetParams.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
