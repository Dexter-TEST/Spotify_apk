package com.spotify.zorro.telco.v2.proto.CallbackBody;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.ea0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fa0;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class CallbackBody extends c implements u74	// class@000cdb from classes.dex
{
    private g14 parameters_;
    private static final CallbackBody DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       CallbackBody uCallbackBod = new CallbackBody();
       CallbackBody.DEFAULT_INSTANCE = uCallbackBod;
       c.registerDefaultInstance(CallbackBody.class, uCallbackBod);
    }
    private void CallbackBody(){
       super();
       this.parameters_ = g14.b;
    }
    public static CallbackBody e(){
       return CallbackBody.DEFAULT_INSTANCE;
    }
    public static g14 f(CallbackBody p0){
       CallbackBody parameters_ = p0.parameters_;
       if (parameters_.a == null) {
          p0.parameters_ = parameters_.d();
       }
       return p0.parameters_;
    }
    public static ea0 g(){
       return CallbackBody.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return CallbackBody.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"parameters_",fa0.a};
             return c.newMessageInfo(CallbackBody.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new CallbackBody();
           case 4:
             return new ea0();
           case 5:
             return CallbackBody.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = CallbackBody.PARSER) == null) {
                _monitor_enter(CallbackBody.class);
                if ((pARSER = CallbackBody.PARSER) == null) {
                   pARSER = new ii2(CallbackBody.DEFAULT_INSTANCE);
                   CallbackBody.PARSER = pARSER;
                }
                _monitor_exit(CallbackBody.class);
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
