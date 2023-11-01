package com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeRequestV1;
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
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$TrialsFacadeRequestV1 extends c implements u74	// class@00053b from classes.dex
{
    private static final Bootstrap$TrialsFacadeRequestV1 DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Bootstrap$TrialsFacadeRequestV1 trialsFacade = new Bootstrap$TrialsFacadeRequestV1();
       Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE = trialsFacade;
       c.registerDefaultInstance(Bootstrap$TrialsFacadeRequestV1.class, trialsFacade);
    }
    private void Bootstrap$TrialsFacadeRequestV1(){
       super();
    }
    public static Bootstrap$TrialsFacadeRequestV1 e(){
       return Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE;
    }
    public static Bootstrap$TrialsFacadeRequestV1 f(){
       return Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             return c.newMessageInfo(Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p2);
           case 3:
             return new Bootstrap$TrialsFacadeRequestV1();
           case 4:
             return new h40(b, 0);
           case 5:
             return Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$TrialsFacadeRequestV1.PARSER) == null) {
                _monitor_enter(Bootstrap$TrialsFacadeRequestV1.class);
                if ((pARSER = Bootstrap$TrialsFacadeRequestV1.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$TrialsFacadeRequestV1.DEFAULT_INSTANCE);
                   Bootstrap$TrialsFacadeRequestV1.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$TrialsFacadeRequestV1.class);
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
