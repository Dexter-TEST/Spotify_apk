package com.spotify.storage.esperanto.proto.EsStorage$GetStatsParams;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.p04;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsStorage$GetStatsParams extends c implements u74	// class@000c37 from classes.dex
{
    private static final EsStorage$GetStatsParams DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsStorage$GetStatsParams getStatsPara = new EsStorage$GetStatsParams();
       EsStorage$GetStatsParams.DEFAULT_INSTANCE = getStatsPara;
       c.registerDefaultInstance(EsStorage$GetStatsParams.class, getStatsPara);
    }
    private void EsStorage$GetStatsParams(){
       super();
    }
    public static EsStorage$GetStatsParams e(){
       return EsStorage$GetStatsParams.DEFAULT_INSTANCE;
    }
    public static EsStorage$GetStatsParams f(){
       return EsStorage$GetStatsParams.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsStorage$GetStatsParams.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       p1 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(1);
           case 1:
             return p1;
           case 2:
             return c.newMessageInfo(EsStorage$GetStatsParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new EsStorage$GetStatsParams();
           case 4:
             return new q04(p1);
           case 5:
             return EsStorage$GetStatsParams.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStorage$GetStatsParams.PARSER) == null) {
                _monitor_enter(EsStorage$GetStatsParams.class);
                if ((pARSER = EsStorage$GetStatsParams.PARSER) == null) {
                   pARSER = new ii2(EsStorage$GetStatsParams.DEFAULT_INSTANCE);
                   EsStorage$GetStatsParams.PARSER = pARSER;
                }
                _monitor_exit(EsStorage$GetStatsParams.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
