package com.spotify.storage.esperanto.proto.EsStorage$RealmStats;
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
import p.i04;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsStorage$RealmStats extends c implements u74	// class@000c38 from classes.dex
{
    private long numCompleteEntries_;
    private long numEntries_;
    private int realm_;
    private long size_;
    private static final EsStorage$RealmStats DEFAULT_INSTANCE;
    public static final int NUM_COMPLETE_ENTRIES_FIELD_NUMBER;
    public static final int NUM_ENTRIES_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REALM_FIELD_NUMBER;
    public static final int SIZE_FIELD_NUMBER;

    static {
       EsStorage$RealmStats realmStats = new EsStorage$RealmStats();
       EsStorage$RealmStats.DEFAULT_INSTANCE = realmStats;
       c.registerDefaultInstance(EsStorage$RealmStats.class, realmStats);
    }
    private void EsStorage$RealmStats(){
       super();
    }
    public static EsStorage$RealmStats e(){
       return EsStorage$RealmStats.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsStorage$RealmStats.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"realm_","size_","numEntries_","numCompleteEntries_"};
             return c.newMessageInfo(EsStorage$RealmStats.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x03\x02\x04\x02", objArray);
           case 3:
             return new EsStorage$RealmStats();
           case 4:
             return new q04(p2);
           case 5:
             return EsStorage$RealmStats.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStorage$RealmStats.PARSER) == null) {
                _monitor_enter(EsStorage$RealmStats.class);
                if ((pARSER = EsStorage$RealmStats.PARSER) == null) {
                   pARSER = new ii2(EsStorage$RealmStats.DEFAULT_INSTANCE);
                   EsStorage$RealmStats.PARSER = pARSER;
                }
                _monitor_exit(EsStorage$RealmStats.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
