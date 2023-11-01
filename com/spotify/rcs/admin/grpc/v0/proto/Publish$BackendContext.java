package com.spotify.rcs.admin.grpc.v0.proto.Publish$BackendContext;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.admin.grpc.v0.proto.a;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Publish$BackendContext extends c implements u74	// class@000ba8 from classes.dex
{
    private Publish$DynamicContext dynamicContext_;
    private String serviceName_;
    private Publish$BackendContext$StaticContext staticContext_;
    private Publish$BackendContext$SurfaceMetadata surfaceMetadata_;
    private String system_;
    private static final Publish$BackendContext DEFAULT_INSTANCE;
    public static final int DYNAMIC_CONTEXT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SERVICE_NAME_FIELD_NUMBER;
    public static final int STATIC_CONTEXT_FIELD_NUMBER;
    public static final int SURFACE_METADATA_FIELD_NUMBER;
    public static final int SYSTEM_FIELD_NUMBER;

    static {
       Publish$BackendContext uBackendCont = new Publish$BackendContext();
       Publish$BackendContext.DEFAULT_INSTANCE = uBackendCont;
       c.registerDefaultInstance(Publish$BackendContext.class, uBackendCont);
    }
    private void Publish$BackendContext(){
       super();
       this.system_ = "";
       this.serviceName_ = "";
    }
    public static Publish$BackendContext e(){
       return Publish$BackendContext.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Publish$BackendContext.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"system_","serviceName_","staticContext_","dynamicContext_","surfaceMetadata_"};
             return c.newMessageInfo(Publish$BackendContext.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\t\x04\t\n\t", objArray);
           case 3:
             return new Publish$BackendContext();
           case 4:
             return new a();
           case 5:
             return Publish$BackendContext.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Publish$BackendContext.PARSER) == null) {
                _monitor_enter(Publish$BackendContext.class);
                if ((pARSER = Publish$BackendContext.PARSER) == null) {
                   pARSER = new ii2(Publish$BackendContext.DEFAULT_INSTANCE);
                   Publish$BackendContext.PARSER = pARSER;
                }
                _monitor_exit(Publish$BackendContext.class);
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
