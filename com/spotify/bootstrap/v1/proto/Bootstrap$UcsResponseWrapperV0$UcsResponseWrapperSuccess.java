package com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.bootstrap.v1.proto.f;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess extends c implements u74	// class@000540 from classes.dex
{
    private Ucs$UcsResponseWrapper customization_;
    public static final int CUSTOMIZATION_FIELD_NUMBER = 1;
    private static final Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess ucsResponseW = new Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess();
       Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.class, ucsResponseW);
    }
    private void Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess(){
       super();
    }
    public static Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess e(){
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE;
    }
    public static Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess g(){
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "customization_";
             return c.newMessageInfo(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t", objArray);
           case 3:
             return new Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess();
           case 4:
             return new f();
           case 5:
             return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.PARSER) == null) {
                _monitor_enter(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.class);
                if ((pARSER = Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.DEFAULT_INSTANCE);
                   Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Ucs$UcsResponseWrapper f(){
       Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess tcustomizati;
       if ((tcustomizati = this.customization_) == null) {
          tcustomizati = Ucs$UcsResponseWrapper.f();
       }
       return tcustomizati;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final boolean h(){
       boolean b = (this.customization_ != null)? true: false;
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
