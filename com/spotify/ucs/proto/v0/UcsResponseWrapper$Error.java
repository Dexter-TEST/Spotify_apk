package com.spotify.ucs.proto.v0.UcsResponseWrapper$Error;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.proto.v0.g;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class UcsResponseWrapper$Error extends c implements u74	// class@000c42 from classes.dex
{
    private int errorCode_;
    private String errorMessage_;
    private static final UcsResponseWrapper$Error DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int ERROR_MESSAGE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       UcsResponseWrapper$Error uError = new UcsResponseWrapper$Error();
       UcsResponseWrapper$Error.DEFAULT_INSTANCE = uError;
       c.registerDefaultInstance(UcsResponseWrapper$Error.class, uError);
    }
    private void UcsResponseWrapper$Error(){
       super();
       this.errorMessage_ = "";
    }
    public static UcsResponseWrapper$Error e(){
       return UcsResponseWrapper$Error.DEFAULT_INSTANCE;
    }
    public static UcsResponseWrapper$Error f(){
       return UcsResponseWrapper$Error.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return UcsResponseWrapper$Error.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"errorCode_","errorMessage_"};
             return c.newMessageInfo(UcsResponseWrapper$Error.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x02\x02", objArray);
           case 3:
             return new UcsResponseWrapper$Error();
           case 4:
             return new g();
           case 5:
             return UcsResponseWrapper$Error.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsResponseWrapper$Error.PARSER) == null) {
                _monitor_enter(UcsResponseWrapper$Error.class);
                if ((pARSER = UcsResponseWrapper$Error.PARSER) == null) {
                   pARSER = new ii2(UcsResponseWrapper$Error.DEFAULT_INSTANCE);
                   UcsResponseWrapper$Error.PARSER = pARSER;
                }
                _monitor_exit(UcsResponseWrapper$Error.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.errorMessage_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int getErrorCode(){
       return this.errorCode_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
