package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$ResolveRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Fetch;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Context;
import p.zv5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.admin.grpc.v0.proto.Publish$BackendContext;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Resolve$ResolveRequest extends c implements u74	// class@000be7 from classes.dex
{
    private Resolve$Context context_;
    private Resolve$Fetch fetchType_;
    private String propertySetId_;
    private int resolutionContextCase_;
    private Object resolutionContext_;
    public static final int BACKEND_CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTEXT_FIELD_NUMBER = 11;
    private static final Resolve$ResolveRequest DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER;

    static {
       Resolve$ResolveRequest resolveReque = new Resolve$ResolveRequest();
       Resolve$ResolveRequest.DEFAULT_INSTANCE = resolveReque;
       c.registerDefaultInstance(Resolve$ResolveRequest.class, resolveReque);
    }
    private void Resolve$ResolveRequest(){
       super();
       this.resolutionContextCase_ = 0;
       this.propertySetId_ = "";
    }
    public static Resolve$ResolveRequest e(){
       return Resolve$ResolveRequest.DEFAULT_INSTANCE;
    }
    public static void f(Resolve$ResolveRequest p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.propertySetId_ = p1;
    }
    public static void g(Resolve$ResolveRequest p0,Resolve$Fetch p1){
       p0.getClass();
       p1.getClass();
       p0.fetchType_ = p1;
    }
    public static void h(Resolve$ResolveRequest p0,Resolve$Context p1){
       p0.getClass();
       p1.getClass();
       p0.context_ = p1;
    }
    public static zv5 i(){
       return Resolve$ResolveRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Resolve$ResolveRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"resolutionContext_","resolutionContextCase_","propertySetId_","fetchType_","context_",Publish$BackendContext.class};
             return c.newMessageInfo(Resolve$ResolveRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\x01\xff\x02\xff\x02\x01\f\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x0b\t\f<\xff\x02\xff\x02", objArray);
           case 3:
             return new Resolve$ResolveRequest();
           case 4:
             return new zv5();
           case 5:
             return Resolve$ResolveRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$ResolveRequest.PARSER) == null) {
                _monitor_enter(Resolve$ResolveRequest.class);
                if ((pARSER = Resolve$ResolveRequest.PARSER) == null) {
                   pARSER = new ii2(Resolve$ResolveRequest.DEFAULT_INSTANCE);
                   Resolve$ResolveRequest.PARSER = pARSER;
                }
                _monitor_exit(Resolve$ResolveRequest.class);
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
