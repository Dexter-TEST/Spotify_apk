package com.spotify.bootstrap.v1.proto.Bootstrap$BootstrapRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.ucs.v0.proto.Ucs$UcsRequest;
import java.lang.Object;
import com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeRequestV1;
import p.l30;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Bootstrap$BootstrapRequest extends c implements u74	// class@000539 from classes.dex
{
    private int trialsFacadeRequestCase_;
    private Object trialsFacadeRequest_;
    private int ucsRequestCase_;
    private Object ucsRequest_;
    private static final Bootstrap$BootstrapRequest DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRIALS_FACADE_REQUEST_V1_FIELD_NUMBER;
    public static final int UCS_REQUEST_V0_FIELD_NUMBER;

    static {
       Bootstrap$BootstrapRequest uBootstrapRe = new Bootstrap$BootstrapRequest();
       Bootstrap$BootstrapRequest.DEFAULT_INSTANCE = uBootstrapRe;
       c.registerDefaultInstance(Bootstrap$BootstrapRequest.class, uBootstrapRe);
    }
    private void Bootstrap$BootstrapRequest(){
       super();
       this.ucsRequestCase_ = 0;
       this.trialsFacadeRequestCase_ = 0;
    }
    public static Bootstrap$BootstrapRequest e(){
       return Bootstrap$BootstrapRequest.DEFAULT_INSTANCE;
    }
    public static void f(Bootstrap$BootstrapRequest p0,Ucs$UcsRequest p1){
       p0.getClass();
       p1.getClass();
       p0.ucsRequest_ = p1;
       p0.ucsRequestCase_ = 2;
    }
    public static void g(Bootstrap$BootstrapRequest p0,Bootstrap$TrialsFacadeRequestV1 p1){
       p0.getClass();
       p1.getClass();
       p0.trialsFacadeRequest_ = p1;
       p0.trialsFacadeRequestCase_ = 3;
    }
    public static l30 h(){
       return Bootstrap$BootstrapRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Bootstrap$BootstrapRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"ucsRequest_","ucsRequestCase_","trialsFacadeRequest_","trialsFacadeRequestCase_",Ucs$UcsRequest.class,Bootstrap$TrialsFacadeRequestV1.class};
             return c.newMessageInfo(Bootstrap$BootstrapRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x02\xff\x02\xff\x02\x02\x03\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\x01", objArray);
           case 3:
             return new Bootstrap$BootstrapRequest();
           case 4:
             return new l30();
           case 5:
             return Bootstrap$BootstrapRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$BootstrapRequest.PARSER) == null) {
                _monitor_enter(Bootstrap$BootstrapRequest.class);
                if ((pARSER = Bootstrap$BootstrapRequest.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$BootstrapRequest.DEFAULT_INSTANCE);
                   Bootstrap$BootstrapRequest.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$BootstrapRequest.class);
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
