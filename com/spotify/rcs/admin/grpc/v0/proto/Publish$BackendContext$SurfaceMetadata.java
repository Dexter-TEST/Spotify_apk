package com.spotify.rcs.admin.grpc.v0.proto.Publish$BackendContext$SurfaceMetadata;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.admin.grpc.v0.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Publish$BackendContext$SurfaceMetadata extends c implements u74	// class@000ba7 from classes.dex
{
    private String backendSdkVersion_;
    public static final int BACKEND_SDK_VERSION_FIELD_NUMBER = 1;
    private static final Publish$BackendContext$SurfaceMetadata DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Publish$BackendContext$SurfaceMetadata uBackendCont = new Publish$BackendContext$SurfaceMetadata();
       Publish$BackendContext$SurfaceMetadata.DEFAULT_INSTANCE = uBackendCont;
       c.registerDefaultInstance(Publish$BackendContext$SurfaceMetadata.class, uBackendCont);
    }
    private void Publish$BackendContext$SurfaceMetadata(){
       super();
       this.backendSdkVersion_ = "";
    }
    public static Publish$BackendContext$SurfaceMetadata e(){
       return Publish$BackendContext$SurfaceMetadata.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Publish$BackendContext$SurfaceMetadata.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "backendSdkVersion_";
             return c.newMessageInfo(Publish$BackendContext$SurfaceMetadata.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new Publish$BackendContext$SurfaceMetadata();
           case 4:
             return new c();
           case 5:
             return Publish$BackendContext$SurfaceMetadata.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Publish$BackendContext$SurfaceMetadata.PARSER) == null) {
                _monitor_enter(Publish$BackendContext$SurfaceMetadata.class);
                if ((pARSER = Publish$BackendContext$SurfaceMetadata.PARSER) == null) {
                   pARSER = new ii2(Publish$BackendContext$SurfaceMetadata.DEFAULT_INSTANCE);
                   Publish$BackendContext$SurfaceMetadata.PARSER = pARSER;
                }
                _monitor_exit(Publish$BackendContext$SurfaceMetadata.class);
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
