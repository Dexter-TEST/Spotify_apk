package com.spotify.storage.esperanto.proto.EsStorage$SetCacheSizeLimitParams;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit;
import java.lang.Object;
import p.ur1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsStorage$SetCacheSizeLimitParams extends c implements u74	// class@000c39 from classes.dex
{
    private EsStorage$CacheSizeLimit limit_;
    private static final EsStorage$SetCacheSizeLimitParams DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsStorage$SetCacheSizeLimitParams setCacheSize = new EsStorage$SetCacheSizeLimitParams();
       EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE = setCacheSize;
       c.registerDefaultInstance(EsStorage$SetCacheSizeLimitParams.class, setCacheSize);
    }
    private void EsStorage$SetCacheSizeLimitParams(){
       super();
    }
    public static void e(EsStorage$SetCacheSizeLimitParams p0,EsStorage$CacheSizeLimit p1){
       p0.getClass();
       p1.getClass();
       p0.limit_ = p1;
    }
    public static EsStorage$SetCacheSizeLimitParams f(){
       return EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE;
    }
    public static ur1 g(){
       return EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "limit_";
             return c.newMessageInfo(EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t", objArray);
           case 3:
             return new EsStorage$SetCacheSizeLimitParams();
           case 4:
             return new ur1();
           case 5:
             return EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStorage$SetCacheSizeLimitParams.PARSER) == null) {
                _monitor_enter(EsStorage$SetCacheSizeLimitParams.class);
                if ((pARSER = EsStorage$SetCacheSizeLimitParams.PARSER) == null) {
                   pARSER = new ii2(EsStorage$SetCacheSizeLimitParams.DEFAULT_INSTANCE);
                   EsStorage$SetCacheSizeLimitParams.PARSER = pARSER;
                }
                _monitor_exit(EsStorage$SetCacheSizeLimitParams.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
