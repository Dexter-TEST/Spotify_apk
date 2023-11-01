package com.spotify.ucs.proto.v0.UcsResponseWrapper$UcsResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.proto.v0.i;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$Error;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$AccountAttributesResponse;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.ucs.proto.v0.h;
import com.spotify.ucs.proto.v0.j;
import p.r74;
import com.google.protobuf.b;

public final class UcsResponseWrapper$UcsResponse extends c implements u74	// class@000c43 from classes.dex
{
    private int accountAttributesResultCase_;
    private Object accountAttributesResult_;
    private long fetchTimeMillis_;
    private int resolveResultCase_;
    private Object resolveResult_;
    public static final int ACCOUNT_ATTRIBUTES_ERROR_FIELD_NUMBER = 4;
    public static final int ACCOUNT_ATTRIBUTES_SUCCESS_FIELD_NUMBER = 3;
    private static final UcsResponseWrapper$UcsResponse DEFAULT_INSTANCE;
    public static final int FETCH_TIME_MILLIS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RESOLVE_ERROR_FIELD_NUMBER;
    public static final int RESOLVE_SUCCESS_FIELD_NUMBER;

    static {
       UcsResponseWrapper$UcsResponse ucsResponse = new UcsResponseWrapper$UcsResponse();
       UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE = ucsResponse;
       c.registerDefaultInstance(UcsResponseWrapper$UcsResponse.class, ucsResponse);
    }
    private void UcsResponseWrapper$UcsResponse(){
       super();
       this.resolveResultCase_ = 0;
       this.accountAttributesResultCase_ = 0;
    }
    public static UcsResponseWrapper$UcsResponse e(){
       return UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE;
    }
    public static UcsResponseWrapper$UcsResponse i(){
       return UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE.getParserForType();
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
             objArray[4] = ResolveResponse.class;
             objArray[5] = UcsResponseWrapper$Error.class;
             objArray[6] = UcsResponseWrapper$AccountAttributesResponse.class;
             objArray[7] = UcsResponseWrapper$Error.class;
             objArray[8] = "fetchTimeMillis_";
             return c.newMessageInfo(UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\x01\x04<\x01\x05\x02", objArray);
           case 3:
             return new UcsResponseWrapper$UcsResponse();
           case 4:
             return new i();
           case 5:
             return UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsResponseWrapper$UcsResponse.PARSER) == null) {
                _monitor_enter(UcsResponseWrapper$UcsResponse.class);
                if ((pARSER = UcsResponseWrapper$UcsResponse.PARSER) == null) {
                   pARSER = new ii2(UcsResponseWrapper$UcsResponse.DEFAULT_INSTANCE);
                   UcsResponseWrapper$UcsResponse.PARSER = pARSER;
                }
                _monitor_exit(UcsResponseWrapper$UcsResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final UcsResponseWrapper$Error f(){
       if (this.accountAttributesResultCase_ == 4) {
          return this.accountAttributesResult_;
       }
       return UcsResponseWrapper$Error.f();
    }
    public final h g(){
       UcsResponseWrapper$UcsResponse taccountAttr;
       h oh;
       if ((taccountAttr = this.accountAttributesResultCase_) != null) {
          if (taccountAttr != 3) {
             oh = (taccountAttr != 4)? null: h.b;
          }else {
             oh = h.a;
          }
       }else {
          oh = h.c;
       }
       return oh;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final UcsResponseWrapper$AccountAttributesResponse h(){
       if (this.accountAttributesResultCase_ == 3) {
          return this.accountAttributesResult_;
       }
       return UcsResponseWrapper$AccountAttributesResponse.g();
    }
    public final long j(){
       return this.fetchTimeMillis_;
    }
    public final UcsResponseWrapper$Error k(){
       if (this.resolveResultCase_ == 2) {
          return this.resolveResult_;
       }
       return UcsResponseWrapper$Error.f();
    }
    public final j l(){
       UcsResponseWrapper$UcsResponse tresolveResu;
       j oj;
       if ((tresolveResu = this.resolveResultCase_) != null) {
          if (tresolveResu != 1) {
             oj = (tresolveResu != 2)? null: j.b;
          }else {
             oj = j.a;
          }
       }else {
          oj = j.c;
       }
       return oj;
    }
    public final ResolveResponse m(){
       if (this.resolveResultCase_ == 1) {
          return this.resolveResult_;
       }
       return ResolveResponse.g();
    }
    public final boolean n(){
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
