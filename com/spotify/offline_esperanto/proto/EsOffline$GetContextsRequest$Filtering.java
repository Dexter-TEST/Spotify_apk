package com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest$Filtering;
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
import com.spotify.offline_esperanto.proto.b;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOffline$GetContextsRequest$Filtering extends c implements u74	// class@000abd from classes.dex
{
    private bc3 itemUris_;
    private static final EsOffline$GetContextsRequest$Filtering DEFAULT_INSTANCE;
    public static final int ITEM_URIS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsOffline$GetContextsRequest$Filtering getContextsR = new EsOffline$GetContextsRequest$Filtering();
       EsOffline$GetContextsRequest$Filtering.DEFAULT_INSTANCE = getContextsR;
       c.registerDefaultInstance(EsOffline$GetContextsRequest$Filtering.class, getContextsR);
    }
    private void EsOffline$GetContextsRequest$Filtering(){
       super();
       this.itemUris_ = c.emptyProtobufList();
    }
    public static EsOffline$GetContextsRequest$Filtering e(){
       return EsOffline$GetContextsRequest$Filtering.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOffline$GetContextsRequest$Filtering.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "itemUris_";
             return c.newMessageInfo(EsOffline$GetContextsRequest$Filtering.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new EsOffline$GetContextsRequest$Filtering();
           case 4:
             return new b();
           case 5:
             return EsOffline$GetContextsRequest$Filtering.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$GetContextsRequest$Filtering.PARSER) == null) {
                _monitor_enter(EsOffline$GetContextsRequest$Filtering.class);
                if ((pARSER = EsOffline$GetContextsRequest$Filtering.PARSER) == null) {
                   pARSER = new ii2(EsOffline$GetContextsRequest$Filtering.DEFAULT_INSTANCE);
                   EsOffline$GetContextsRequest$Filtering.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$GetContextsRequest$Filtering.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
