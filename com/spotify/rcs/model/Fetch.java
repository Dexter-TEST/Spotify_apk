package com.spotify.rcs.model.Fetch;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.model.Fetch$Builder;
import com.spotify.rcs.model.Fetch$1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Fetch extends c implements u74	// class@000bb6 from classes.dex
{
    private static final Fetch DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Fetch uFetch = new Fetch();
       Fetch.DEFAULT_INSTANCE = uFetch;
       c.registerDefaultInstance(Fetch.class, uFetch);
    }
    private void Fetch(){
       super();
    }
    public static Fetch e(){
       return Fetch.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Fetch.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Fetch.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new Fetch();
           case 4:
             return new Fetch$Builder(p1);
           case 5:
             return Fetch.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Fetch.PARSER) == null) {
                _monitor_enter(Fetch.class);
                if ((pARSER = Fetch.PARSER) == null) {
                   pARSER = new ii2(Fetch.DEFAULT_INSTANCE);
                   Fetch.PARSER = pARSER;
                }
                _monitor_exit(Fetch.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
