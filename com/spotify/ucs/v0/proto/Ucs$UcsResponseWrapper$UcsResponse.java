package com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$UcsResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.v0.proto.h;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$ResolveResponse;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$Error;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$AccountAttributesResponse;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Ucs$UcsResponseWrapper$UcsResponse extends c implements u74	// class@000c54 from classes.dex
{
    private int accountAttributesResultCase_;
    private Object accountAttributesResult_;
    private long fetchTimeMillis_;
    private int resolveResultCase_;
    private Object resolveResult_;
    public static final int ACCOUNT_ATTRIBUTES_ERROR_FIELD_NUMBER = 4;
    public static final int ACCOUNT_ATTRIBUTES_SUCCESS_FIELD_NUMBER = 3;
    private static final Ucs$UcsResponseWrapper$UcsResponse DEFAULT_INSTANCE;
    public static final int FETCH_TIME_MILLIS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RESOLVE_ERROR_FIELD_NUMBER;
    public static final int RESOLVE_SUCCESS_FIELD_NUMBER;

    static {
       Ucs$UcsResponseWrapper$UcsResponse ucsResponseW = new Ucs$UcsResponseWrapper$UcsResponse();
       Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Ucs$UcsResponseWrapper$UcsResponse.class, ucsResponseW);
    }
    private void Ucs$UcsResponseWrapper$UcsResponse(){
       super();
       this.resolveResultCase_ = 0;
       this.accountAttributesResultCase_ = 0;
    }
    public static Ucs$UcsResponseWrapper$UcsResponse e(){
       return Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE;
    }
    public static Ucs$UcsResponseWrapper$UcsResponse g(){
       return Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[9];
             objArray[0] = "resolveResult_";
             objArray[b] = "resolveResultCase_";
             objArray[2] = "accountAttributesResult_";
             objArray[3] = "accountAttributesResultCase_";
             objArray[4] = Resolve$ResolveResponse.class;
             objArray[5] = Ucs$UcsResponseWrapper$Error.class;
             objArray[6] = Ucs$UcsResponseWrapper$AccountAttributesResponse.class;
             objArray[7] = Ucs$UcsResponseWrapper$Error.class;
             objArray[8] = "fetchTimeMillis_";
             return c.newMessageInfo(Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\x01\x04<\x01\x05\x02", objArray);
           case 3:
             return new Ucs$UcsResponseWrapper$UcsResponse();
           case 4:
             return new h();
           case 5:
             return Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Ucs$UcsResponseWrapper$UcsResponse.PARSER) == null) {
                _monitor_enter(Ucs$UcsResponseWrapper$UcsResponse.class);
                if ((pARSER = Ucs$UcsResponseWrapper$UcsResponse.PARSER) == null) {
                   pARSER = new ii2(Ucs$UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE);
                   Ucs$UcsResponseWrapper$UcsResponse.PARSER = pARSER;
                }
                _monitor_exit(Ucs$UcsResponseWrapper$UcsResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Ucs$UcsResponseWrapper$AccountAttributesResponse f(){
       if (this.accountAttributesResultCase_ == 3) {
          return this.accountAttributesResult_;
       }
       return Ucs$UcsResponseWrapper$AccountAttributesResponse.g();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Resolve$ResolveResponse h(){
       if (this.resolveResultCase_ == 1) {
          return this.resolveResult_;
       }
       return Resolve$ResolveResponse.g();
    }
    public final boolean i(){
       boolean b = (this.accountAttributesResultCase_ == 3)? true: false;
       return b;
    }
    public final boolean j(){
       boolean b = true;
       if (this.resolveResultCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
