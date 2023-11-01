package com.spotify.rcs.admin.grpc.v0.proto.Publish$DynamicContext;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.admin.grpc.v0.proto.d;
import com.spotify.rcs.admin.grpc.v0.proto.Publish$DynamicContext$ContextDefinition;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Publish$DynamicContext extends c implements u74	// class@000baa from classes.dex
{
    private bc3 contextDefinition_;
    public static final int CONTEXT_DEFINITION_FIELD_NUMBER = 1;
    private static final Publish$DynamicContext DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Publish$DynamicContext uDynamicCont = new Publish$DynamicContext();
       Publish$DynamicContext.DEFAULT_INSTANCE = uDynamicCont;
       c.registerDefaultInstance(Publish$DynamicContext.class, uDynamicCont);
    }
    private void Publish$DynamicContext(){
       super();
       this.contextDefinition_ = c.emptyProtobufList();
    }
    public static Publish$DynamicContext e(){
       return Publish$DynamicContext.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Publish$DynamicContext.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"contextDefinition_",Publish$DynamicContext$ContextDefinition.class};
             return c.newMessageInfo(Publish$DynamicContext.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Publish$DynamicContext();
           case 4:
             return new d();
           case 5:
             return Publish$DynamicContext.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Publish$DynamicContext.PARSER) == null) {
                _monitor_enter(Publish$DynamicContext.class);
                if ((pARSER = Publish$DynamicContext.PARSER) == null) {
                   pARSER = new ii2(Publish$DynamicContext.DEFAULT_INSTANCE);
                   Publish$DynamicContext.PARSER = pARSER;
                }
                _monitor_exit(Publish$DynamicContext.class);
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
