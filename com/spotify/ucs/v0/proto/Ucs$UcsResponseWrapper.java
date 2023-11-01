package com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.v0.proto.f;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$UcsResponse;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$Error;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Ucs$UcsResponseWrapper extends c implements u74	// class@000c55 from classes.dex
{
    private int resultCase_;
    private Object result_;
    private static final Ucs$UcsResponseWrapper DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUCCESS_FIELD_NUMBER;

    static {
       Ucs$UcsResponseWrapper ucsResponseW = new Ucs$UcsResponseWrapper();
       Ucs$UcsResponseWrapper.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Ucs$UcsResponseWrapper.class, ucsResponseW);
    }
    private void Ucs$UcsResponseWrapper(){
       super();
       this.resultCase_ = 0;
    }
    public static Ucs$UcsResponseWrapper e(){
       return Ucs$UcsResponseWrapper.DEFAULT_INSTANCE;
    }
    public static Ucs$UcsResponseWrapper f(){
       return Ucs$UcsResponseWrapper.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Ucs$UcsResponseWrapper.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"result_","resultCase_",Ucs$UcsResponseWrapper$UcsResponse.class,Ucs$UcsResponseWrapper$Error.class};
             return c.newMessageInfo(Ucs$UcsResponseWrapper.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02", objArray);
           case 3:
             return new Ucs$UcsResponseWrapper();
           case 4:
             return new f();
           case 5:
             return Ucs$UcsResponseWrapper.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Ucs$UcsResponseWrapper.PARSER) == null) {
                _monitor_enter(Ucs$UcsResponseWrapper.class);
                if ((pARSER = Ucs$UcsResponseWrapper.PARSER) == null) {
                   pARSER = new ii2(Ucs$UcsResponseWrapper.DEFAULT_INSTANCE);
                   Ucs$UcsResponseWrapper.PARSER = pARSER;
                }
                _monitor_exit(Ucs$UcsResponseWrapper.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Ucs$UcsResponseWrapper$Error g(){
       if (this.resultCase_ == 2) {
          return this.result_;
       }
       return Ucs$UcsResponseWrapper$Error.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Ucs$UcsResponseWrapper$UcsResponse h(){
       if (this.resultCase_ == 1) {
          return this.result_;
       }
       return Ucs$UcsResponseWrapper$UcsResponse.g();
    }
    public final boolean i(){
       boolean b = (this.resultCase_ == 2)? true: false;
       return b;
    }
    public final boolean j(){
       boolean b = true;
       if (this.resultCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
