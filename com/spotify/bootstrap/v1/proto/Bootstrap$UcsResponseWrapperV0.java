package com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.bootstrap.v1.proto.d;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$UcsResponseWrapperV0 extends c implements u74	// class@000541 from classes.dex
{
    private int resultCase_;
    private Object result_;
    private static final Bootstrap$UcsResponseWrapperV0 DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUCCESS_FIELD_NUMBER;

    static {
       Bootstrap$UcsResponseWrapperV0 ucsResponseW = new Bootstrap$UcsResponseWrapperV0();
       Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(Bootstrap$UcsResponseWrapperV0.class, ucsResponseW);
    }
    private void Bootstrap$UcsResponseWrapperV0(){
       super();
       this.resultCase_ = 0;
    }
    public static Bootstrap$UcsResponseWrapperV0 e(){
       return Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE;
    }
    public static Bootstrap$UcsResponseWrapperV0 f(){
       return Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"result_","resultCase_",Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.class,Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.class};
             return c.newMessageInfo(Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02", objArray);
           case 3:
             return new Bootstrap$UcsResponseWrapperV0();
           case 4:
             return new d();
           case 5:
             return Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$UcsResponseWrapperV0.PARSER) == null) {
                _monitor_enter(Bootstrap$UcsResponseWrapperV0.class);
                if ((pARSER = Bootstrap$UcsResponseWrapperV0.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$UcsResponseWrapperV0.DEFAULT_INSTANCE);
                   Bootstrap$UcsResponseWrapperV0.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$UcsResponseWrapperV0.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError g(){
       if (this.resultCase_ == 2) {
          return this.result_;
       }
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int h(){
       Bootstrap$UcsResponseWrapperV0 tresultCase_;
       int i;
       if ((tresultCase_ = this.resultCase_) != null) {
          i = 1;
          if (tresultCase_ != i) {
             i = 2;
             if (tresultCase_ != i) {
                i = 0;
             }
          }
       }else {
          i = 3;
       }
       return i;
    }
    public final Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess i(){
       if (this.resultCase_ == 1) {
          return this.result_;
       }
       return Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess.g();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
