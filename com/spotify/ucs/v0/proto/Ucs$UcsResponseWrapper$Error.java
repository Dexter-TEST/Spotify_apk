package com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$Error;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.v0.proto.g;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Ucs$UcsResponseWrapper$Error extends c implements u74	// class@000c53 from classes.dex
{
    private int errorCode_;
    private String errorMessage_;
    private static final Ucs$UcsResponseWrapper$Error DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int ERROR_MESSAGE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Ucs$UcsResponseWrapper$Error ucsResponseW = new Ucs$UcsResponseWrapper$Error();
       Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Ucs$UcsResponseWrapper$Error.class, ucsResponseW);
    }
    private void Ucs$UcsResponseWrapper$Error(){
       super();
       this.errorMessage_ = "";
    }
    public static Ucs$UcsResponseWrapper$Error e(){
       return Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE;
    }
    public static Ucs$UcsResponseWrapper$Error f(){
       return Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x02\x02", objArray);
           case 3:
             return new Ucs$UcsResponseWrapper$Error();
           case 4:
             return new g();
           case 5:
             return Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Ucs$UcsResponseWrapper$Error.PARSER) == null) {
                _monitor_enter(Ucs$UcsResponseWrapper$Error.class);
                if ((pARSER = Ucs$UcsResponseWrapper$Error.PARSER) == null) {
                   pARSER = new ii2(Ucs$UcsResponseWrapper$Error.DEFAULT_INSTANCE);
                   Ucs$UcsResponseWrapper$Error.PARSER = pARSER;
                }
                _monitor_exit(Ucs$UcsResponseWrapper$Error.class);
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
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
