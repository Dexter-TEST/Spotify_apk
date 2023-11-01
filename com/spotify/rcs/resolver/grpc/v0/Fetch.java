package com.spotify.rcs.resolver.grpc.v0.Fetch;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.z12;
import java.lang.Object;
import p.y12;
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

public final class Fetch extends c implements u74	// class@000bd2 from classes.dex
{
    private int type_;
    private static final Fetch DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;

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
    public static void f(Fetch p0,z12 p1){
       p0.getClass();
       p0.type_ = p1.getNumber();
    }
    public static y12 g(){
       return Fetch.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Fetch.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Fetch.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f", objArray);
           case 3:
             return new Fetch();
           case 4:
             return new y12();
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
