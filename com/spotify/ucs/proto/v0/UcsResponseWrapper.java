package com.spotify.ucs.proto.v0.UcsResponseWrapper;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.ucs.proto.v0.f;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$UcsResponse;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$Error;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.rb7;
import p.r74;
import com.google.protobuf.b;

public final class UcsResponseWrapper extends c implements u74	// class@000c44 from classes.dex
{
    private int resultCase_;
    private Object result_;
    private static final UcsResponseWrapper DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUCCESS_FIELD_NUMBER;

    static {
       UcsResponseWrapper ucsResponseW = new UcsResponseWrapper();
       UcsResponseWrapper.DEFAULT_INSTANCE = ucsResponseW;
       c.registerDefaultInstance(UcsResponseWrapper.class, ucsResponseW);
    }
    private void UcsResponseWrapper(){
       super();
       this.resultCase_ = 0;
    }
    public static UcsResponseWrapper e(){
       return UcsResponseWrapper.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return UcsResponseWrapper.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"result_","resultCase_",UcsResponseWrapper$UcsResponse.class,UcsResponseWrapper$Error.class};
             return c.newMessageInfo(UcsResponseWrapper.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02", objArray);
           case 3:
             return new UcsResponseWrapper();
           case 4:
             return new f();
           case 5:
             return UcsResponseWrapper.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UcsResponseWrapper.PARSER) == null) {
                _monitor_enter(UcsResponseWrapper.class);
                if ((pARSER = UcsResponseWrapper.PARSER) == null) {
                   pARSER = new ii2(UcsResponseWrapper.DEFAULT_INSTANCE);
                   UcsResponseWrapper.PARSER = pARSER;
                }
                _monitor_exit(UcsResponseWrapper.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final UcsResponseWrapper$Error f(){
       if (this.resultCase_ == 2) {
          return this.result_;
       }
       return UcsResponseWrapper$Error.f();
    }
    public final rb7 g(){
       UcsResponseWrapper tresultCase_;
       rb7 orb7;
       if ((tresultCase_ = this.resultCase_) != null) {
          if (tresultCase_ != 1) {
             orb7 = (tresultCase_ != 2)? null: rb7.b;
          }else {
             orb7 = rb7.a;
          }
       }else {
          orb7 = rb7.c;
       }
       return orb7;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final UcsResponseWrapper$UcsResponse h(){
       if (this.resultCase_ == 1) {
          return this.result_;
       }
       return UcsResponseWrapper$UcsResponse.i();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
