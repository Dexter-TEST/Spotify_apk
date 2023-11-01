package com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.jq1;
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

public final class EsOffline$ContextInfoPolicy extends c implements u74	// class@000ab8 from classes.dex
{
    private boolean items_;
    private static final EsOffline$ContextInfoPolicy DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsOffline$ContextInfoPolicy uContextInfo = new EsOffline$ContextInfoPolicy();
       EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE = uContextInfo;
       c.registerDefaultInstance(EsOffline$ContextInfoPolicy.class, uContextInfo);
    }
    private void EsOffline$ContextInfoPolicy(){
       super();
    }
    public static void e(EsOffline$ContextInfoPolicy p0,boolean p1){
       p0.items_ = p1;
    }
    public static EsOffline$ContextInfoPolicy f(){
       return EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE;
    }
    public static jq1 g(){
       return EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "items_";
             return c.newMessageInfo(EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new EsOffline$ContextInfoPolicy();
           case 4:
             return new jq1();
           case 5:
             return EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$ContextInfoPolicy.PARSER) == null) {
                _monitor_enter(EsOffline$ContextInfoPolicy.class);
                if ((pARSER = EsOffline$ContextInfoPolicy.PARSER) == null) {
                   pARSER = new ii2(EsOffline$ContextInfoPolicy.DEFAULT_INSTANCE);
                   EsOffline$ContextInfoPolicy.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$ContextInfoPolicy.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
