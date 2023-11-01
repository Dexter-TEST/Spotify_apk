package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Context;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.util.ArrayList;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import com.spotify.rcs.resolver.grpc.v0.proto.g;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Context$ContextEntry;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Resolve$Context extends c implements u74	// class@000be5 from classes.dex
{
    private bc3 context_;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final Resolve$Context DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Resolve$Context uContext = new Resolve$Context();
       Resolve$Context.DEFAULT_INSTANCE = uContext;
       c.registerDefaultInstance(Resolve$Context.class, uContext);
    }
    private void Resolve$Context(){
       super();
       this.context_ = c.emptyProtobufList();
    }
    public static Resolve$Context e(){
       return Resolve$Context.DEFAULT_INSTANCE;
    }
    public static void f(Resolve$Context p0,ArrayList p1){
       Resolve$Context context_ = p0.context_;
       if (context_.a == null) {
          p0.context_ = c.mutableCopy(context_);
       }
       a.addAll(p1, p0.context_);
       return;
    }
    public static g g(){
       return Resolve$Context.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Resolve$Context.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"context_",Resolve$Context$ContextEntry.class};
             return c.newMessageInfo(Resolve$Context.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Resolve$Context();
           case 4:
             return new g();
           case 5:
             return Resolve$Context.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Context.PARSER) == null) {
                _monitor_enter(Resolve$Context.class);
                if ((pARSER = Resolve$Context.PARSER) == null) {
                   pARSER = new ii2(Resolve$Context.DEFAULT_INSTANCE);
                   Resolve$Context.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Context.class);
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
