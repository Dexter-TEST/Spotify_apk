package com.spotify.bootstrap.v1.proto.Bootstrap$BootstrapResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0;
import com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeResponseWrapperV1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$BootstrapResponse extends c implements u74	// class@00053a from classes.dex
{
    private int trialsFacadeResponseCase_;
    private Object trialsFacadeResponse_;
    private int ucsResponseCase_;
    private Object ucsResponse_;
    private static final Bootstrap$BootstrapResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRIALS_FACADE_RESPONSE_V1_FIELD_NUMBER;
    public static final int UCS_RESPONSE_V0_FIELD_NUMBER;

    static {
       Bootstrap$BootstrapResponse uBootstrapRe = new Bootstrap$BootstrapResponse();
       Bootstrap$BootstrapResponse.DEFAULT_INSTANCE = uBootstrapRe;
       c.registerDefaultInstance(Bootstrap$BootstrapResponse.class, uBootstrapRe);
    }
    private void Bootstrap$BootstrapResponse(){
       super();
       this.ucsResponseCase_ = 0;
       this.trialsFacadeResponseCase_ = 0;
    }
    public static Bootstrap$BootstrapResponse e(){
       return Bootstrap$BootstrapResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$BootstrapResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 0;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"ucsResponse_","ucsResponseCase_","trialsFacadeResponse_","trialsFacadeResponseCase_",Bootstrap$UcsResponseWrapperV0.class,Bootstrap$TrialsFacadeResponseWrapperV1.class};
             return c.newMessageInfo(Bootstrap$BootstrapResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x02\xff\x02\xff\x02\x02\x03\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\x01", objArray);
           case 3:
             return new Bootstrap$BootstrapResponse();
           case 4:
             return new h40(i, i);
           case 5:
             return Bootstrap$BootstrapResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$BootstrapResponse.PARSER) == null) {
                _monitor_enter(Bootstrap$BootstrapResponse.class);
                if ((pARSER = Bootstrap$BootstrapResponse.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$BootstrapResponse.DEFAULT_INSTANCE);
                   Bootstrap$BootstrapResponse.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$BootstrapResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       Bootstrap$BootstrapResponse tucsResponse = this.ucsResponseCase_;
       int i = 2;
       if (tucsResponse != null) {
          i = (tucsResponse != i)? 0: 1;
       }
       return i;
    }
    public final Bootstrap$UcsResponseWrapperV0 g(){
       if (this.ucsResponseCase_ == 2) {
          return this.ucsResponse_;
       }
       return Bootstrap$UcsResponseWrapperV0.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final boolean h(){
       boolean b = (this.ucsResponseCase_ == 2)? true: false;
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
