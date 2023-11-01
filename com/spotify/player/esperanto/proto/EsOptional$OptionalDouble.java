package com.spotify.player.esperanto.proto.EsOptional$OptionalDouble;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.et0;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOptional$OptionalDouble extends c implements u74	// class@000afc from classes.dex
{
    private double value_;
    private static final EsOptional$OptionalDouble DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsOptional$OptionalDouble optionalDoub = new EsOptional$OptionalDouble();
       EsOptional$OptionalDouble.DEFAULT_INSTANCE = optionalDoub;
       c.registerDefaultInstance(EsOptional$OptionalDouble.class, optionalDoub);
    }
    private void EsOptional$OptionalDouble(){
       super();
    }
    public static EsOptional$OptionalDouble e(){
       return EsOptional$OptionalDouble.DEFAULT_INSTANCE;
    }
    public static EsOptional$OptionalDouble f(){
       return EsOptional$OptionalDouble.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOptional$OptionalDouble.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[b];
             objArray[0] = "value_";
             return c.newMessageInfo(EsOptional$OptionalDouble.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02", objArray);
           case 3:
             return new EsOptional$OptionalDouble();
           case 4:
             return new fq1(p2);
           case 5:
             return EsOptional$OptionalDouble.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOptional$OptionalDouble.PARSER) == null) {
                _monitor_enter(EsOptional$OptionalDouble.class);
                if ((pARSER = EsOptional$OptionalDouble.PARSER) == null) {
                   pARSER = new ii2(EsOptional$OptionalDouble.DEFAULT_INSTANCE);
                   EsOptional$OptionalDouble.PARSER = pARSER;
                }
                _monitor_exit(EsOptional$OptionalDouble.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final double g(){
       return this.value_;
    }
}
