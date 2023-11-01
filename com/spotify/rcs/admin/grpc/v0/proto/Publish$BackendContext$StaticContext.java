package com.spotify.rcs.admin.grpc.v0.proto.Publish$BackendContext$StaticContext;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.admin.grpc.v0.proto.b;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Publish$BackendContext$StaticContext extends c implements u74	// class@000ba6 from classes.dex
{
    private String serviceName_;
    private String system_;
    private static final Publish$BackendContext$StaticContext DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SERVICE_NAME_FIELD_NUMBER;
    public static final int SYSTEM_FIELD_NUMBER;

    static {
       Publish$BackendContext$StaticContext uBackendCont = new Publish$BackendContext$StaticContext();
       Publish$BackendContext$StaticContext.DEFAULT_INSTANCE = uBackendCont;
       c.registerDefaultInstance(Publish$BackendContext$StaticContext.class, uBackendCont);
    }
    private void Publish$BackendContext$StaticContext(){
       super();
       this.system_ = "";
       this.serviceName_ = "";
    }
    public static Publish$BackendContext$StaticContext e(){
       return Publish$BackendContext$StaticContext.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Publish$BackendContext$StaticContext.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"system_","serviceName_"};
             return c.newMessageInfo(Publish$BackendContext$StaticContext.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new Publish$BackendContext$StaticContext();
           case 4:
             return new b();
           case 5:
             return Publish$BackendContext$StaticContext.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Publish$BackendContext$StaticContext.PARSER) == null) {
                _monitor_enter(Publish$BackendContext$StaticContext.class);
                if ((pARSER = Publish$BackendContext$StaticContext.PARSER) == null) {
                   pARSER = new ii2(Publish$BackendContext$StaticContext.DEFAULT_INSTANCE);
                   Publish$BackendContext$StaticContext.PARSER = pARSER;
                }
                _monitor_exit(Publish$BackendContext$StaticContext.class);
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
