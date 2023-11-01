package com.spotify.ucs.proto.v0.UcsRequest$AccountAttributesRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.ucs.proto.v0.a;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class UcsRequest$AccountAttributesRequest extends c implements u74	// class@000c3e from classes.dex
{
    private static final UcsRequest$AccountAttributesRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       UcsRequest$AccountAttributesRequest uAccountAttr = new UcsRequest$AccountAttributesRequest();
       UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE = uAccountAttr;
       c.registerDefaultInstance(UcsRequest$AccountAttributesRequest.class, uAccountAttr);
    }
    private void UcsRequest$AccountAttributesRequest(){
       super();
    }
    public static UcsRequest$AccountAttributesRequest e(){
       return UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE;
    }
    public static a f(){
       return UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new UcsRequest$AccountAttributesRequest();
           case 4:
             return new a();
           case 5:
             return UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsRequest$AccountAttributesRequest.PARSER) == null) {
                _monitor_enter(UcsRequest$AccountAttributesRequest.class);
                if ((pARSER = UcsRequest$AccountAttributesRequest.PARSER) == null) {
                   pARSER = new ii2(UcsRequest$AccountAttributesRequest.DEFAULT_INSTANCE);
                   UcsRequest$AccountAttributesRequest.PARSER = pARSER;
                }
                _monitor_exit(UcsRequest$AccountAttributesRequest.class);
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
