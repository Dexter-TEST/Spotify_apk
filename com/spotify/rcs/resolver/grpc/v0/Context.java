package com.spotify.rcs.resolver.grpc.v0.Context;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.util.ArrayList;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import com.spotify.rcs.resolver.grpc.v0.h;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.Context$ContextEntry;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Context extends c implements u74	// class@000bd1 from classes.dex
{
    private bc3 context_;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final Context DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Context uContext = new Context();
       Context.DEFAULT_INSTANCE = uContext;
       c.registerDefaultInstance(Context.class, uContext);
    }
    private void Context(){
       super();
       this.context_ = c.emptyProtobufList();
    }
    public static void e(Context p0,ArrayList p1){
       Context context_ = p0.context_;
       if (context_.a == null) {
          p0.context_ = c.mutableCopy(context_);
       }
       a.addAll(p1, p0.context_);
       return;
    }
    public static Context f(){
       return Context.DEFAULT_INSTANCE;
    }
    public static h g(){
       return Context.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Context.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"context_",Context$ContextEntry.class};
             return c.newMessageInfo(Context.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Context();
           case 4:
             return new h();
           case 5:
             return Context.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Context.PARSER) == null) {
                _monitor_enter(Context.class);
                if ((pARSER = Context.PARSER) == null) {
                   pARSER = new ii2(Context.DEFAULT_INSTANCE);
                   Context.PARSER = pARSER;
                }
                _monitor_exit(Context.class);
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
