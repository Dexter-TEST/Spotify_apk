package com.spotify.ucs.proto.v0.UcsResponseWrapper$AccountAttributesResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.proto.v0.e;
import com.spotify.ucs.proto.v0.d;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.Map;
import java.util.Collections;
import p.r74;
import com.google.protobuf.b;

public final class UcsResponseWrapper$AccountAttributesResponse extends c implements u74	// class@000c41 from classes.dex
{
    private g14 accountAttributes_;
    public static final int ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 1;
    private static final UcsResponseWrapper$AccountAttributesResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       UcsResponseWrapper$AccountAttributesResponse uAccountAttr = new UcsResponseWrapper$AccountAttributesResponse();
       UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE = uAccountAttr;
       c.registerDefaultInstance(UcsResponseWrapper$AccountAttributesResponse.class, uAccountAttr);
    }
    private void UcsResponseWrapper$AccountAttributesResponse(){
       super();
       this.accountAttributes_ = g14.b;
    }
    public static UcsResponseWrapper$AccountAttributesResponse e(){
       return UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE;
    }
    public static UcsResponseWrapper$AccountAttributesResponse g(){
       return UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"accountAttributes_",d.a};
             return c.newMessageInfo(UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new UcsResponseWrapper$AccountAttributesResponse();
           case 4:
             return new e();
           case 5:
             return UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsResponseWrapper$AccountAttributesResponse.PARSER) == null) {
                _monitor_enter(UcsResponseWrapper$AccountAttributesResponse.class);
                if ((pARSER = UcsResponseWrapper$AccountAttributesResponse.PARSER) == null) {
                   pARSER = new ii2(UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE);
                   UcsResponseWrapper$AccountAttributesResponse.PARSER = pARSER;
                }
                _monitor_exit(UcsResponseWrapper$AccountAttributesResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Map f(){
       return Collections.unmodifiableMap(this.accountAttributes_);
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
