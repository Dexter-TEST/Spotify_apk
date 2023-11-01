package com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.tr1;
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

public final class EsStorage$CacheSizeLimit extends c implements u74	// class@000c35 from classes.dex
{
    private long size_;
    private static final EsStorage$CacheSizeLimit DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SIZE_FIELD_NUMBER;

    static {
       EsStorage$CacheSizeLimit uCacheSizeLi = new EsStorage$CacheSizeLimit();
       EsStorage$CacheSizeLimit.DEFAULT_INSTANCE = uCacheSizeLi;
       c.registerDefaultInstance(EsStorage$CacheSizeLimit.class, uCacheSizeLi);
    }
    private void EsStorage$CacheSizeLimit(){
       super();
    }
    public static void e(EsStorage$CacheSizeLimit p0,long p1){
       p0.size_ = p1;
    }
    public static EsStorage$CacheSizeLimit f(){
       return EsStorage$CacheSizeLimit.DEFAULT_INSTANCE;
    }
    public static tr1 g(){
       return EsStorage$CacheSizeLimit.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsStorage$CacheSizeLimit.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "size_";
             return c.newMessageInfo(EsStorage$CacheSizeLimit.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02", objArray);
           case 3:
             return new EsStorage$CacheSizeLimit();
           case 4:
             return new tr1();
           case 5:
             return EsStorage$CacheSizeLimit.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStorage$CacheSizeLimit.PARSER) == null) {
                _monitor_enter(EsStorage$CacheSizeLimit.class);
                if ((pARSER = EsStorage$CacheSizeLimit.PARSER) == null) {
                   pARSER = new ii2(EsStorage$CacheSizeLimit.DEFAULT_INSTANCE);
                   EsStorage$CacheSizeLimit.PARSER = pARSER;
                }
                _monitor_exit(EsStorage$CacheSizeLimit.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
