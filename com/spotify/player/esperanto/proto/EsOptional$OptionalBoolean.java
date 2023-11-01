package com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.nq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOptional$OptionalBoolean extends c implements u74	// class@000afb from classes.dex
{
    private boolean value_;
    private static final EsOptional$OptionalBoolean DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsOptional$OptionalBoolean optionalBool = new EsOptional$OptionalBoolean();
       EsOptional$OptionalBoolean.DEFAULT_INSTANCE = optionalBool;
       c.registerDefaultInstance(EsOptional$OptionalBoolean.class, optionalBool);
    }
    private void EsOptional$OptionalBoolean(){
       super();
    }
    public static void e(EsOptional$OptionalBoolean p0,boolean p1){
       p0.value_ = p1;
    }
    public static EsOptional$OptionalBoolean f(){
       return EsOptional$OptionalBoolean.DEFAULT_INSTANCE;
    }
    public static nq1 g(){
       return EsOptional$OptionalBoolean.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsOptional$OptionalBoolean.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "value_";
             return c.newMessageInfo(EsOptional$OptionalBoolean.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new EsOptional$OptionalBoolean();
           case 4:
             return new nq1();
           case 5:
             return EsOptional$OptionalBoolean.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOptional$OptionalBoolean.PARSER) == null) {
                _monitor_enter(EsOptional$OptionalBoolean.class);
                if ((pARSER = EsOptional$OptionalBoolean.PARSER) == null) {
                   pARSER = new ii2(EsOptional$OptionalBoolean.DEFAULT_INSTANCE);
                   EsOptional$OptionalBoolean.PARSER = pARSER;
                }
                _monitor_exit(EsOptional$OptionalBoolean.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
