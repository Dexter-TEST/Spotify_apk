package com.spotify.storage.esperanto.proto.EsStorage$Stats;
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
import p.q04;
import p.a04;
import com.spotify.storage.esperanto.proto.EsStorage$RealmStats;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsStorage$Stats extends c implements u74	// class@000c3a from classes.dex
{
    private String cacheId_;
    private long creationDateSec_;
    private long currentLockedSize_;
    private long currentNumfiles_;
    private long currentSize_;
    private long freeSpace_;
    private long maxCacheSize_;
    private bc3 realmStats_;
    private long totalSpace_;
    public static final int CACHE_ID_FIELD_NUMBER = 1;
    public static final int CREATION_DATE_SEC_FIELD_NUMBER = 2;
    public static final int CURRENT_LOCKED_SIZE_FIELD_NUMBER = 5;
    public static final int CURRENT_NUMFILES_FIELD_NUMBER = 8;
    public static final int CURRENT_SIZE_FIELD_NUMBER = 4;
    private static final EsStorage$Stats DEFAULT_INSTANCE;
    public static final int FREE_SPACE_FIELD_NUMBER;
    public static final int MAX_CACHE_SIZE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REALM_STATS_FIELD_NUMBER;
    public static final int TOTAL_SPACE_FIELD_NUMBER;

    static {
       EsStorage$Stats stats = new EsStorage$Stats();
       EsStorage$Stats.DEFAULT_INSTANCE = stats;
       c.registerDefaultInstance(EsStorage$Stats.class, stats);
    }
    private void EsStorage$Stats(){
       super();
       this.cacheId_ = "";
       this.realmStats_ = c.emptyProtobufList();
    }
    public static EsStorage$Stats e(){
       return EsStorage$Stats.DEFAULT_INSTANCE;
    }
    public static EsStorage$Stats g(byte[] p0){
       return c.parseFrom(EsStorage$Stats.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsStorage$Stats.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[10];
             objArray[0] = "cacheId_";
             objArray[b] = "creationDateSec_";
             objArray[2] = "maxCacheSize_";
             objArray[3] = "currentSize_";
             objArray[4] = "currentLockedSize_";
             objArray[5] = "freeSpace_";
             objArray[6] = "totalSpace_";
             objArray[7] = "currentNumfiles_";
             objArray[8] = "realmStats_";
             objArray[9] = EsStorage$RealmStats.class;
             return c.newMessageInfo(EsStorage$Stats.DEFAULT_INSTANCE, "\xff\x02\xff\x02\t\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\t\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x02\x04\x02\x05\x02\x06\x02\x07\x02\b\x02\t\x1b", objArray);
           case 3:
             return new EsStorage$Stats();
           case 4:
             return new q04(p2);
           case 5:
             return EsStorage$Stats.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStorage$Stats.PARSER) == null) {
                _monitor_enter(EsStorage$Stats.class);
                if ((pARSER = EsStorage$Stats.PARSER) == null) {
                   pARSER = new ii2(EsStorage$Stats.DEFAULT_INSTANCE);
                   EsStorage$Stats.PARSER = pARSER;
                }
                _monitor_exit(EsStorage$Stats.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final long f(){
       return this.currentLockedSize_;
    }
}
