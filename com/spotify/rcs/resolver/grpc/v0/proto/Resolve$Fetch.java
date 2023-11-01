package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Fetch;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.yv5;
import java.lang.Object;
import p.xv5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Resolve$Fetch extends c implements u74	// class@000be6 from classes.dex
{
    private int type_;
    private static final Resolve$Fetch DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;

    static {
       Resolve$Fetch uFetch = new Resolve$Fetch();
       Resolve$Fetch.DEFAULT_INSTANCE = uFetch;
       c.registerDefaultInstance(Resolve$Fetch.class, uFetch);
    }
    private void Resolve$Fetch(){
       super();
    }
    public static Resolve$Fetch e(){
       return Resolve$Fetch.DEFAULT_INSTANCE;
    }
    public static void f(Resolve$Fetch p0){
       p0.getClass();
       p0.type_ = yv5.b.getNumber();
    }
    public static xv5 g(){
       return Resolve$Fetch.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Resolve$Fetch.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "type_";
             return c.newMessageInfo(Resolve$Fetch.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f", objArray);
           case 3:
             return new Resolve$Fetch();
           case 4:
             return new xv5();
           case 5:
             return Resolve$Fetch.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Fetch.PARSER) == null) {
                _monitor_enter(Resolve$Fetch.class);
                if ((pARSER = Resolve$Fetch.PARSER) == null) {
                   pARSER = new ii2(Resolve$Fetch.DEFAULT_INSTANCE);
                   Resolve$Fetch.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Fetch.class);
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
