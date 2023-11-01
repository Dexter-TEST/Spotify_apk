package com.spotify.rcs.admin.grpc.v0.proto.Publish$DynamicContext$ContextDefinition;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.admin.grpc.v0.proto.e;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Publish$DynamicContext$ContextDefinition extends c implements u74	// class@000ba9 from classes.dex
{
    private int contextCase_;
    private Object context_;
    private static final Publish$DynamicContext$ContextDefinition DEFAULT_INSTANCE;
    public static final int KNOWN_CONTEXT_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Publish$DynamicContext$ContextDefinition uDynamicCont = new Publish$DynamicContext$ContextDefinition();
       Publish$DynamicContext$ContextDefinition.DEFAULT_INSTANCE = uDynamicCont;
       c.registerDefaultInstance(Publish$DynamicContext$ContextDefinition.class, uDynamicCont);
    }
    private void Publish$DynamicContext$ContextDefinition(){
       super();
       this.contextCase_ = 0;
    }
    public static Publish$DynamicContext$ContextDefinition e(){
       return Publish$DynamicContext$ContextDefinition.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Publish$DynamicContext$ContextDefinition.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"context_","contextCase_"};
             return c.newMessageInfo(Publish$DynamicContext$ContextDefinition.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\x01\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01?\xff\x02\xff\x02", objArray);
           case 3:
             return new Publish$DynamicContext$ContextDefinition();
           case 4:
             return new e();
           case 5:
             return Publish$DynamicContext$ContextDefinition.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Publish$DynamicContext$ContextDefinition.PARSER) == null) {
                _monitor_enter(Publish$DynamicContext$ContextDefinition.class);
                if ((pARSER = Publish$DynamicContext$ContextDefinition.PARSER) == null) {
                   pARSER = new ii2(Publish$DynamicContext$ContextDefinition.DEFAULT_INSTANCE);
                   Publish$DynamicContext$ContextDefinition.PARSER = pARSER;
                }
                _monitor_exit(Publish$DynamicContext$ContextDefinition.class);
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
