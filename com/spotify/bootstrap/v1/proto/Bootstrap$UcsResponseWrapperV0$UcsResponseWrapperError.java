package com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.bootstrap.v1.proto.e;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError extends c implements u74	// class@00053f from classes.dex
{
    private int errorCode_;
    private String logId_;
    private String message_;
    private static final Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int LOG_ID_FIELD_NUMBER;
    public static final int MESSAGE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError ucsResponseW = new Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError();
       Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.class, ucsResponseW);
    }
    private void Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError(){
       super();
       this.message_ = "";
       this.logId_ = "";
    }
    public static Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError e(){
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE;
    }
    public static Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError f(){
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"errorCode_","message_","logId_"};
             return c.newMessageInfo(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError();
           case 4:
             return new e();
           case 5:
             return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.PARSER) == null) {
                _monitor_enter(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.class);
                if ((pARSER = Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.DEFAULT_INSTANCE);
                   Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.message_;
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
