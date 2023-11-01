package com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$IntValue;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.d;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Configuration$AssignedValue$IntValue extends c implements u74	// class@000bcc from classes.dex
{
    private int value_;
    private static final Configuration$AssignedValue$IntValue DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       Configuration$AssignedValue$IntValue uAssignedVal = new Configuration$AssignedValue$IntValue();
       Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE = uAssignedVal;
       c.registerDefaultInstance(Configuration$AssignedValue$IntValue.class, uAssignedVal);
    }
    private void Configuration$AssignedValue$IntValue(){
       super();
    }
    public static Configuration$AssignedValue$IntValue e(){
       return Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE;
    }
    public static Configuration$AssignedValue$IntValue f(){
       return Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04", objArray);
           case 3:
             return new Configuration$AssignedValue$IntValue();
           case 4:
             return new d();
           case 5:
             return Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Configuration$AssignedValue$IntValue.PARSER) == null) {
                _monitor_enter(Configuration$AssignedValue$IntValue.class);
                if ((pARSER = Configuration$AssignedValue$IntValue.PARSER) == null) {
                   pARSER = new ii2(Configuration$AssignedValue$IntValue.DEFAULT_INSTANCE);
                   Configuration$AssignedValue$IntValue.PARSER = pARSER;
                }
                _monitor_exit(Configuration$AssignedValue$IntValue.class);
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
    public final int getValue(){
       return this.value_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
