package com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.bootstrap.v1.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess extends c implements u74	// class@00053d from classes.dex
{
    private static final Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess trialsFacade = new Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess();
       Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.DEFAULT_INSTANCE = trialsFacade;
       c.registerDefaultInstance(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.class, trialsFacade);
    }
    private void Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess(){
       super();
    }
    public static Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess e(){
       return Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       p1 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(1);
           case 1:
             return p1;
           case 2:
             return c.newMessageInfo(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess();
           case 4:
             return new c();
           case 5:
             return Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.PARSER) == null) {
                _monitor_enter(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.class);
                if ((pARSER = Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.DEFAULT_INSTANCE);
                   Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperSuccess.class);
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
