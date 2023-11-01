package com.spotify.storage.esperanto.proto.EsStorage$DeleteUnlockedItemsParams;
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
import p.k04;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsStorage$DeleteUnlockedItemsParams extends c implements u74	// class@000c36 from classes.dex
{
    private static final EsStorage$DeleteUnlockedItemsParams DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsStorage$DeleteUnlockedItemsParams uDeleteUnloc = new EsStorage$DeleteUnlockedItemsParams();
       EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE = uDeleteUnloc;
       c.registerDefaultInstance(EsStorage$DeleteUnlockedItemsParams.class, uDeleteUnloc);
    }
    private void EsStorage$DeleteUnlockedItemsParams(){
       super();
    }
    public static EsStorage$DeleteUnlockedItemsParams e(){
       return EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE;
    }
    public static EsStorage$DeleteUnlockedItemsParams f(){
       return EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new EsStorage$DeleteUnlockedItemsParams();
           case 4:
             return new q04(p1);
           case 5:
             return EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStorage$DeleteUnlockedItemsParams.PARSER) == null) {
                _monitor_enter(EsStorage$DeleteUnlockedItemsParams.class);
                if ((pARSER = EsStorage$DeleteUnlockedItemsParams.PARSER) == null) {
                   pARSER = new ii2(EsStorage$DeleteUnlockedItemsParams.DEFAULT_INSTANCE);
                   EsStorage$DeleteUnlockedItemsParams.PARSER = pARSER;
                }
                _monitor_exit(EsStorage$DeleteUnlockedItemsParams.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
