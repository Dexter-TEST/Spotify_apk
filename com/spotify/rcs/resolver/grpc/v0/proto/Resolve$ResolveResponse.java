package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$ResolveResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.cq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration;
import p.r74;
import com.google.protobuf.b;

public final class Resolve$ResolveResponse extends c implements u74	// class@000be8 from classes.dex
{
    private Resolve$Configuration configuration_;
    public static final int CONFIGURATION_FIELD_NUMBER = 1;
    private static final Resolve$ResolveResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Resolve$ResolveResponse resolveRespo = new Resolve$ResolveResponse();
       Resolve$ResolveResponse.DEFAULT_INSTANCE = resolveRespo;
       c.registerDefaultInstance(Resolve$ResolveResponse.class, resolveRespo);
    }
    private void Resolve$ResolveResponse(){
       super();
    }
    public static Resolve$ResolveResponse e(){
       return Resolve$ResolveResponse.DEFAULT_INSTANCE;
    }
    public static Resolve$ResolveResponse g(){
       return Resolve$ResolveResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Resolve$ResolveResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "configuration_";
             return c.newMessageInfo(Resolve$ResolveResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t", objArray);
           case 3:
             return new Resolve$ResolveResponse();
           case 4:
             return new fq1(p2);
           case 5:
             return Resolve$ResolveResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$ResolveResponse.PARSER) == null) {
                _monitor_enter(Resolve$ResolveResponse.class);
                if ((pARSER = Resolve$ResolveResponse.PARSER) == null) {
                   pARSER = new ii2(Resolve$ResolveResponse.DEFAULT_INSTANCE);
                   Resolve$ResolveResponse.PARSER = pARSER;
                }
                _monitor_exit(Resolve$ResolveResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Resolve$Configuration f(){
       Resolve$ResolveResponse tconfigurati;
       if ((tconfigurati = this.configuration_) == null) {
          tconfigurati = Resolve$Configuration.f();
       }
       return tconfigurati;
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
