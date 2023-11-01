package com.spotify.offline_esperanto.proto.EsOffline$Context;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.iq1;

public final class EsOffline$Context extends c implements u74	// class@000ab6 from classes.dex
{
    private float percentComplete_;
    private int state_;
    private String uri_;
    private static final EsOffline$Context DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PERCENT_COMPLETE_FIELD_NUMBER;
    public static final int STATE_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       EsOffline$Context uContext = new EsOffline$Context();
       EsOffline$Context.DEFAULT_INSTANCE = uContext;
       c.registerDefaultInstance(EsOffline$Context.class, uContext);
    }
    private void EsOffline$Context(){
       super();
       this.uri_ = "";
    }
    public static EsOffline$Context e(){
       return EsOffline$Context.DEFAULT_INSTANCE;
    }
    public static EsOffline$Context f(){
       return EsOffline$Context.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOffline$Context.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","state_","percentComplete_"};
             return c.newMessageInfo(EsOffline$Context.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x01", objArray);
           case 3:
             return new EsOffline$Context();
           case 4:
             return new sq1(16);
           case 5:
             return EsOffline$Context.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$Context.PARSER) == null) {
                _monitor_enter(EsOffline$Context.class);
                if ((pARSER = EsOffline$Context.PARSER) == null) {
                   pARSER = new ii2(EsOffline$Context.DEFAULT_INSTANCE);
                   EsOffline$Context.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$Context.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final iq1 g(){
       iq1 oiq1;
       if ((oiq1 = iq1.a(this.state_)) == null) {
          oiq1 = iq1.y;
       }
       return oiq1;
    }
    public final String h(){
       return this.uri_;
    }
}
