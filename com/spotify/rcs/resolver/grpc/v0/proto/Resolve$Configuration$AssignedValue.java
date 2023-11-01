package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.proto.b;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue$BoolValue;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue$IntValue;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue$EnumValue;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Resolve$Configuration$AssignedValue extends c implements u74	// class@000be2 from classes.dex
{
    private Resolve$Configuration$AssignedValue$Metadata metadata_;
    private Publish$PropertyDefinition$Identifier propertyId_;
    private int structuredValueCase_;
    private Object structuredValue_;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    private static final Resolve$Configuration$AssignedValue DEFAULT_INSTANCE;
    public static final int ENUM_VALUE_FIELD_NUMBER;
    public static final int INT_VALUE_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROPERTY_ID_FIELD_NUMBER;

    static {
       Resolve$Configuration$AssignedValue uConfigurati = new Resolve$Configuration$AssignedValue();
       Resolve$Configuration$AssignedValue.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(Resolve$Configuration$AssignedValue.class, uConfigurati);
    }
    private void Resolve$Configuration$AssignedValue(){
       super();
       this.structuredValueCase_ = 0;
    }
    public static Resolve$Configuration$AssignedValue e(){
       return Resolve$Configuration$AssignedValue.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Resolve$Configuration$AssignedValue.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"structuredValue_","structuredValueCase_","propertyId_","metadata_",Resolve$Configuration$AssignedValue$BoolValue.class,Resolve$Configuration$AssignedValue$IntValue.class,Resolve$Configuration$AssignedValue$EnumValue.class};
             return c.newMessageInfo(Resolve$Configuration$AssignedValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\x01\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03<\xff\x02\xff\x02\x04<\xff\x02\xff\x02\x05<\xff\x02\xff\x02", objArray);
           case 3:
             return new Resolve$Configuration$AssignedValue();
           case 4:
             return new b();
           case 5:
             return Resolve$Configuration$AssignedValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Configuration$AssignedValue.PARSER) == null) {
                _monitor_enter(Resolve$Configuration$AssignedValue.class);
                if ((pARSER = Resolve$Configuration$AssignedValue.PARSER) == null) {
                   pARSER = new ii2(Resolve$Configuration$AssignedValue.DEFAULT_INSTANCE);
                   Resolve$Configuration$AssignedValue.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Configuration$AssignedValue.class);
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
