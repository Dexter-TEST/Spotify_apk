package com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$BoolValue;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.a;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Configuration$AssignedValue$BoolValue extends c implements u74	// class@000bca from classes.dex
{
    private boolean value_;
    private static final Configuration$AssignedValue$BoolValue DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       Configuration$AssignedValue$BoolValue uAssignedVal = new Configuration$AssignedValue$BoolValue();
       Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE = uAssignedVal;
       c.registerDefaultInstance(Configuration$AssignedValue$BoolValue.class, uAssignedVal);
    }
    private void Configuration$AssignedValue$BoolValue(){
       super();
    }
    public static Configuration$AssignedValue$BoolValue e(){
       return Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE;
    }
    public static Configuration$AssignedValue$BoolValue f(){
       return Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new Configuration$AssignedValue$BoolValue();
           case 4:
             return new a();
           case 5:
             return Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Configuration$AssignedValue$BoolValue.PARSER) == null) {
                _monitor_enter(Configuration$AssignedValue$BoolValue.class);
                if ((pARSER = Configuration$AssignedValue$BoolValue.PARSER) == null) {
                   pARSER = new ii2(Configuration$AssignedValue$BoolValue.DEFAULT_INSTANCE);
                   Configuration$AssignedValue$BoolValue.PARSER = pARSER;
                }
                _monitor_exit(Configuration$AssignedValue$BoolValue.class);
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
    public final boolean getValue(){
       return this.value_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
