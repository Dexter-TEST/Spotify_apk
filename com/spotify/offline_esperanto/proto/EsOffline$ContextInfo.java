package com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import com.spotify.offline_esperanto.proto.EsOffline$Item;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.offline_esperanto.proto.EsOffline$Context;

public final class EsOffline$ContextInfo extends c implements u74	// class@000ab7 from classes.dex
{
    private EsOffline$Context context_;
    private bc3 items_;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsOffline$ContextInfo DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsOffline$ContextInfo uContextInfo = new EsOffline$ContextInfo();
       EsOffline$ContextInfo.DEFAULT_INSTANCE = uContextInfo;
       c.registerDefaultInstance(EsOffline$ContextInfo.class, uContextInfo);
    }
    private void EsOffline$ContextInfo(){
       super();
       this.items_ = c.emptyProtobufList();
    }
    public static EsOffline$ContextInfo e(){
       return EsOffline$ContextInfo.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOffline$ContextInfo.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"context_","items_",EsOffline$Item.class};
             return c.newMessageInfo(EsOffline$ContextInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\x1b", objArray);
           case 3:
             return new EsOffline$ContextInfo();
           case 4:
             return new sq1(17);
           case 5:
             return EsOffline$ContextInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$ContextInfo.PARSER) == null) {
                _monitor_enter(EsOffline$ContextInfo.class);
                if ((pARSER = EsOffline$ContextInfo.PARSER) == null) {
                   pARSER = new ii2(EsOffline$ContextInfo.DEFAULT_INSTANCE);
                   EsOffline$ContextInfo.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$ContextInfo.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final EsOffline$Context f(){
       EsOffline$ContextInfo tcontext_;
       if ((tcontext_ = this.context_) == null) {
          tcontext_ = EsOffline$Context.f();
       }
       return tcontext_;
    }
    public final bc3 g(){
       return this.items_;
    }
}
