package com.spotify.allboarding.model.v2.proto.PushOptIn;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.sk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class PushOptIn extends c implements u74	// class@00052d from classes.dex
{
    private static final PushOptIn DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       PushOptIn pushOptIn = new PushOptIn();
       PushOptIn.DEFAULT_INSTANCE = pushOptIn;
       c.registerDefaultInstance(PushOptIn.class, pushOptIn);
    }
    private void PushOptIn(){
       super();
    }
    public static PushOptIn e(){
       return PushOptIn.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return PushOptIn.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(PushOptIn.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new PushOptIn();
           case 4:
             return new cl1(p1);
           case 5:
             return PushOptIn.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PushOptIn.PARSER) == null) {
                _monitor_enter(PushOptIn.class);
                if ((pARSER = PushOptIn.PARSER) == null) {
                   pARSER = new ii2(PushOptIn.DEFAULT_INSTANCE);
                   PushOptIn.PARSER = pARSER;
                }
                _monitor_exit(PushOptIn.class);
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
