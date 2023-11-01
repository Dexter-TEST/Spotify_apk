package com.spotify.ucs.proto.v0.UcsRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.ucs.proto.v0.UcsRequest$CallerInfo;
import java.lang.Object;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.ucs.proto.v0.UcsRequest$AccountAttributesRequest;
import com.spotify.ucs.proto.v0.b;
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

public final class UcsRequest extends c implements u74	// class@000c40 from classes.dex
{
    private UcsRequest$AccountAttributesRequest accountAttributesRequest_;
    private UcsRequest$CallerInfo callerInfo_;
    private ResolveRequest resolveRequest_;
    public static final int ACCOUNT_ATTRIBUTES_REQUEST_FIELD_NUMBER = 3;
    public static final int CALLER_INFO_FIELD_NUMBER = 1;
    private static final UcsRequest DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int RESOLVE_REQUEST_FIELD_NUMBER;

    static {
       UcsRequest ucsRequest = new UcsRequest();
       UcsRequest.DEFAULT_INSTANCE = ucsRequest;
       c.registerDefaultInstance(UcsRequest.class, ucsRequest);
    }
    private void UcsRequest(){
       super();
    }
    public static UcsRequest e(){
       return UcsRequest.DEFAULT_INSTANCE;
    }
    public static void f(UcsRequest p0,UcsRequest$CallerInfo p1){
       p0.getClass();
       p1.getClass();
       p0.callerInfo_ = p1;
    }
    public static void g(UcsRequest p0,ResolveRequest p1){
       p0.getClass();
       p0.resolveRequest_ = p1;
    }
    public static void h(UcsRequest p0,UcsRequest$AccountAttributesRequest p1){
       p0.getClass();
       p1.getClass();
       p0.accountAttributesRequest_ = p1;
    }
    public static b i(){
       return UcsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return UcsRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"callerInfo_","resolveRequest_","accountAttributesRequest_"};
             return c.newMessageInfo(UcsRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t", objArray);
           case 3:
             return new UcsRequest();
           case 4:
             return new b();
           case 5:
             return UcsRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsRequest.PARSER) == null) {
                _monitor_enter(UcsRequest.class);
                if ((pARSER = UcsRequest.PARSER) == null) {
                   pARSER = new ii2(UcsRequest.DEFAULT_INSTANCE);
                   UcsRequest.PARSER = pARSER;
                }
                _monitor_exit(UcsRequest.class);
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
