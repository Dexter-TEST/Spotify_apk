package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue$EnumValue;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Resolve$Configuration$AssignedValue$EnumValue extends c implements u74	// class@000bdf from classes.dex
{
    private String value_;
    private static final Resolve$Configuration$AssignedValue$EnumValue DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       Resolve$Configuration$AssignedValue$EnumValue uConfigurati = new Resolve$Configuration$AssignedValue$EnumValue();
       Resolve$Configuration$AssignedValue$EnumValue.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(Resolve$Configuration$AssignedValue$EnumValue.class, uConfigurati);
    }
    private void Resolve$Configuration$AssignedValue$EnumValue(){
       super();
       this.value_ = "";
    }
    public static Resolve$Configuration$AssignedValue$EnumValue e(){
       return Resolve$Configuration$AssignedValue$EnumValue.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Resolve$Configuration$AssignedValue$EnumValue.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Resolve$Configuration$AssignedValue$EnumValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new Resolve$Configuration$AssignedValue$EnumValue();
           case 4:
             return new c();
           case 5:
             return Resolve$Configuration$AssignedValue$EnumValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Configuration$AssignedValue$EnumValue.PARSER) == null) {
                _monitor_enter(Resolve$Configuration$AssignedValue$EnumValue.class);
                if ((pARSER = Resolve$Configuration$AssignedValue$EnumValue.PARSER) == null) {
                   pARSER = new ii2(Resolve$Configuration$AssignedValue$EnumValue.DEFAULT_INSTANCE);
                   Resolve$Configuration$AssignedValue$EnumValue.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Configuration$AssignedValue$EnumValue.class);
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
