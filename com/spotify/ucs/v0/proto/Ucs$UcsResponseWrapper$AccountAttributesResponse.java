package com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$AccountAttributesResponse;
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
import com.spotify.ucs.v0.proto.e;
import com.spotify.ucs.v0.proto.d;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.Map;
import java.util.Collections;
import p.r74;
import com.google.protobuf.b;

public final class Ucs$UcsResponseWrapper$AccountAttributesResponse extends c implements u74	// class@000c52 from classes.dex
{
    private g14 accountAttributes_;
    public static final int ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 1;
    private static final Ucs$UcsResponseWrapper$AccountAttributesResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Ucs$UcsResponseWrapper$AccountAttributesResponse ucsResponseW = new Ucs$UcsResponseWrapper$AccountAttributesResponse();
       Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Ucs$UcsResponseWrapper$AccountAttributesResponse.class, ucsResponseW);
    }
    private void Ucs$UcsResponseWrapper$AccountAttributesResponse(){
       super();
       this.accountAttributes_ = g14.b;
    }
    public static Ucs$UcsResponseWrapper$AccountAttributesResponse e(){
       return Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE;
    }
    public static Ucs$UcsResponseWrapper$AccountAttributesResponse g(){
       return Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new Ucs$UcsResponseWrapper$AccountAttributesResponse();
           case 4:
             return new e();
           case 5:
             return Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Ucs$UcsResponseWrapper$AccountAttributesResponse.PARSER) == null) {
                _monitor_enter(Ucs$UcsResponseWrapper$AccountAttributesResponse.class);
                if ((pARSER = Ucs$UcsResponseWrapper$AccountAttributesResponse.PARSER) == null) {
                   pARSER = new ii2(Ucs$UcsResponseWrapper$AccountAttributesResponse.DEFAULT_INSTANCE);
                   Ucs$UcsResponseWrapper$AccountAttributesResponse.PARSER = pARSER;
                }
                _monitor_exit(Ucs$UcsResponseWrapper$AccountAttributesResponse.class);
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
