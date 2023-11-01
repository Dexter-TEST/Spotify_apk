package com.spotify.offline_esperanto.proto.EsOffline$Item;
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
import p.mq1;

public final class EsOffline$Item extends c implements u74	// class@000ac0 from classes.dex
{
    private int state_;
    private String uri_;
    private static final EsOffline$Item DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int STATE_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       EsOffline$Item item = new EsOffline$Item();
       EsOffline$Item.DEFAULT_INSTANCE = item;
       c.registerDefaultInstance(EsOffline$Item.class, item);
    }
    private void EsOffline$Item(){
       super();
       this.uri_ = "";
    }
    public static EsOffline$Item e(){
       return EsOffline$Item.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOffline$Item.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","state_"};
             return c.newMessageInfo(EsOffline$Item.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f", objArray);
           case 3:
             return new EsOffline$Item();
           case 4:
             return new sq1(22);
           case 5:
             return EsOffline$Item.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$Item.PARSER) == null) {
                _monitor_enter(EsOffline$Item.class);
                if ((pARSER = EsOffline$Item.PARSER) == null) {
                   pARSER = new ii2(EsOffline$Item.DEFAULT_INSTANCE);
                   EsOffline$Item.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$Item.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final mq1 f(){
       mq1 omq1;
       if ((omq1 = mq1.a(this.state_)) == null) {
          omq1 = mq1.A;
       }
       return omq1;
    }
    public final String g(){
       return this.uri_;
    }
}
