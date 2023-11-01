package com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.b;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$BoolValue;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$IntValue;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$EnumValue;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue$Metadata;
import com.spotify.rcs.admin.grpc.v0.PropertyDefinition$Identifier;
import com.spotify.rcs.resolver.grpc.v0.f;
import p.r74;
import com.google.protobuf.b;

public final class Configuration$AssignedValue extends c implements u74	// class@000bce from classes.dex
{
    private Configuration$AssignedValue$Metadata metadata_;
    private PropertyDefinition$Identifier propertyId_;
    private int structuredValueCase_;
    private Object structuredValue_;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    private static final Configuration$AssignedValue DEFAULT_INSTANCE;
    public static final int ENUM_VALUE_FIELD_NUMBER;
    public static final int INT_VALUE_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROPERTY_ID_FIELD_NUMBER;

    static {
       Configuration$AssignedValue uAssignedVal = new Configuration$AssignedValue();
       Configuration$AssignedValue.DEFAULT_INSTANCE = uAssignedVal;
       c.registerDefaultInstance(Configuration$AssignedValue.class, uAssignedVal);
    }
    private void Configuration$AssignedValue(){
       super();
       this.structuredValueCase_ = 0;
    }
    public static Configuration$AssignedValue e(){
       return Configuration$AssignedValue.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Configuration$AssignedValue.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"structuredValue_","structuredValueCase_","propertyId_","metadata_",Configuration$AssignedValue$BoolValue.class,Configuration$AssignedValue$IntValue.class,Configuration$AssignedValue$EnumValue.class};
             return c.newMessageInfo(Configuration$AssignedValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\x01\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03<\xff\x02\xff\x02\x04<\xff\x02\xff\x02\x05<\xff\x02\xff\x02", objArray);
           case 3:
             return new Configuration$AssignedValue();
           case 4:
             return new b();
           case 5:
             return Configuration$AssignedValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Configuration$AssignedValue.PARSER) == null) {
                _monitor_enter(Configuration$AssignedValue.class);
                if ((pARSER = Configuration$AssignedValue.PARSER) == null) {
                   pARSER = new ii2(Configuration$AssignedValue.DEFAULT_INSTANCE);
                   Configuration$AssignedValue.PARSER = pARSER;
                }
                _monitor_exit(Configuration$AssignedValue.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Configuration$AssignedValue$BoolValue f(){
       if (this.structuredValueCase_ == 3) {
          return this.structuredValue_;
       }
       return Configuration$AssignedValue$BoolValue.f();
    }
    public final Configuration$AssignedValue$EnumValue g(){
       if (this.structuredValueCase_ == 5) {
          return this.structuredValue_;
       }
       return Configuration$AssignedValue$EnumValue.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Configuration$AssignedValue$IntValue h(){
       if (this.structuredValueCase_ == 4) {
          return this.structuredValue_;
       }
       return Configuration$AssignedValue$IntValue.f();
    }
    public final Configuration$AssignedValue$Metadata i(){
       Configuration$AssignedValue tmetadata_;
       if ((tmetadata_ = this.metadata_) == null) {
          tmetadata_ = Configuration$AssignedValue$Metadata.f();
       }
       return tmetadata_;
    }
    public final PropertyDefinition$Identifier j(){
       Configuration$AssignedValue tpropertyId_;
       if ((tpropertyId_ = this.propertyId_) == null) {
          tpropertyId_ = PropertyDefinition$Identifier.f();
       }
       return tpropertyId_;
    }
    public final f k(){
       Configuration$AssignedValue tstructuredV;
       f uof;
       if ((tstructuredV = this.structuredValueCase_) != null) {
          if (tstructuredV != 3) {
             if (tstructuredV != 4) {
                uof = (tstructuredV != 5)? null: f.c;
             }else {
                uof = f.b;
             }
          }else {
             uof = f.a;
          }
       }else {
          uof = f.t;
       }
       return uof;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
