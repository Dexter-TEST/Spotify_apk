package com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeResponseWrapperV1;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.bootstrap.v1.proto.a;
import com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess;
import com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$TrialsFacadeResponseWrapperV1 extends c implements u74	// class@00053e from classes.dex
{
    private int resultCase_;
    private Object result_;
    private static final Bootstrap$TrialsFacadeResponseWrapperV1 DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUCCESS_FIELD_NUMBER;

    static {
       Bootstrap$TrialsFacadeResponseWrapperV1 trialsFacade = new Bootstrap$TrialsFacadeResponseWrapperV1();
       Bootstrap$TrialsFacadeResponseWrapperV1.DEFAULT_INSTANCE = trialsFacade;
       c.registerDefaultInstance(Bootstrap$TrialsFacadeResponseWrapperV1.class, trialsFacade);
    }
    private void Bootstrap$TrialsFacadeResponseWrapperV1(){
       super();
       this.resultCase_ = 0;
    }
    public static Bootstrap$TrialsFacadeResponseWrapperV1 e(){
       return Bootstrap$TrialsFacadeResponseWrapperV1.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$TrialsFacadeResponseWrapperV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"result_","resultCase_",Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.class,Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.class};
             return c.newMessageInfo(Bootstrap$TrialsFacadeResponseWrapperV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02", objArray);
           case 3:
             return new Bootstrap$TrialsFacadeResponseWrapperV1();
           case 4:
             return new a();
           case 5:
             return Bootstrap$TrialsFacadeResponseWrapperV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$TrialsFacadeResponseWrapperV1.PARSER) == null) {
                _monitor_enter(Bootstrap$TrialsFacadeResponseWrapperV1.class);
                if ((pARSER = Bootstrap$TrialsFacadeResponseWrapperV1.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$TrialsFacadeResponseWrapperV1.DEFAULT_INSTANCE);
                   Bootstrap$TrialsFacadeResponseWrapperV1.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$TrialsFacadeResponseWrapperV1.class);
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
