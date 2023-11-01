package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Context$ContextEntry;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.spotify.rcs.resolver.grpc.v0.proto.h;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Resolve$Context$ContextEntry extends c implements u74	// class@000be4 from classes.dex
{
    private int contextCase_;
    private Object context_;
    private String value_;
    private static final Resolve$Context$ContextEntry DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int POLICY_INPUT_NAME_FIELD_NUMBER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       Resolve$Context$ContextEntry uContext$Con = new Resolve$Context$ContextEntry();
       Resolve$Context$ContextEntry.DEFAULT_INSTANCE = uContext$Con;
       c.registerDefaultInstance(Resolve$Context$ContextEntry.class, uContext$Con);
    }
    private void Resolve$Context$ContextEntry(){
       super();
       this.contextCase_ = 0;
       this.value_ = "";
    }
    public static Resolve$Context$ContextEntry e(){
       return Resolve$Context$ContextEntry.DEFAULT_INSTANCE;
    }
    public static void f(Resolve$Context$ContextEntry p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.contextCase_ = 2;
       p0.context_ = p1;
    }
    public static void g(Resolve$Context$ContextEntry p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.value_ = p1;
    }
    public static h h(){
       return Resolve$Context$ContextEntry.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Resolve$Context$ContextEntry.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"context_","contextCase_","value_"};
             return c.newMessageInfo(Resolve$Context$ContextEntry.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x02\n\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02\x02\x02\xff\x02\xff\x02\n\x02\x02", objArray);
           case 3:
             return new Resolve$Context$ContextEntry();
           case 4:
             return new h();
           case 5:
             return Resolve$Context$ContextEntry.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Context$ContextEntry.PARSER) == null) {
                _monitor_enter(Resolve$Context$ContextEntry.class);
                if ((pARSER = Resolve$Context$ContextEntry.PARSER) == null) {
                   pARSER = new ii2(Resolve$Context$ContextEntry.DEFAULT_INSTANCE);
                   Resolve$Context$ContextEntry.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Context$ContextEntry.class);
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
