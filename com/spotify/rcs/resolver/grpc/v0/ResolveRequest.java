package com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Object;
import com.spotify.rcs.resolver.grpc.v0.Fetch;
import com.spotify.rcs.resolver.grpc.v0.Context;
import p.aw5;
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

public final class ResolveRequest extends c implements u74	// class@000bd3 from classes.dex
{
    private Context context_;
    private Fetch fetchType_;
    private String propertySetId_;
    public static final int CONTEXT_FIELD_NUMBER = 11;
    private static final ResolveRequest DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER;

    static {
       ResolveRequest resolveReque = new ResolveRequest();
       ResolveRequest.DEFAULT_INSTANCE = resolveReque;
       c.registerDefaultInstance(ResolveRequest.class, resolveReque);
    }
    private void ResolveRequest(){
       super();
       this.propertySetId_ = "";
    }
    public static ResolveRequest e(){
       return ResolveRequest.DEFAULT_INSTANCE;
    }
    public static void f(ResolveRequest p0){
       p0.getClass();
       p0.propertySetId_ = "35ce984288e048b77569527ac392fb22820c4fa8bffb9500d0c8995981d9533e";
    }
    public static void g(ResolveRequest p0,Fetch p1){
       p0.getClass();
       p0.fetchType_ = p1;
    }
    public static void h(ResolveRequest p0,Context p1){
       p0.getClass();
       p1.getClass();
       p0.context_ = p1;
    }
    public static aw5 i(){
       return ResolveRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ResolveRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"propertySetId_","fetchType_","context_"};
             return c.newMessageInfo(ResolveRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x0b\t", objArray);
           case 3:
             return new ResolveRequest();
           case 4:
             return new aw5();
           case 5:
             return ResolveRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ResolveRequest.PARSER) == null) {
                _monitor_enter(ResolveRequest.class);
                if ((pARSER = ResolveRequest.PARSER) == null) {
                   pARSER = new ii2(ResolveRequest.DEFAULT_INSTANCE);
                   ResolveRequest.PARSER = pARSER;
                }
                _monitor_exit(ResolveRequest.class);
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
