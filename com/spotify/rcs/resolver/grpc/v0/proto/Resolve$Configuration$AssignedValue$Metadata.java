package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue$Metadata;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.proto.e;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Resolve$Configuration$AssignedValue$Metadata extends c implements u74	// class@000be1 from classes.dex
{
    private long externalRealmId_;
    private String externalRealm_;
    private long policyId_;
    private static final Resolve$Configuration$AssignedValue$Metadata DEFAULT_INSTANCE;
    public static final int EXTERNAL_REALM_FIELD_NUMBER;
    public static final int EXTERNAL_REALM_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POLICY_ID_FIELD_NUMBER;

    static {
       Resolve$Configuration$AssignedValue$Metadata uConfigurati = new Resolve$Configuration$AssignedValue$Metadata();
       Resolve$Configuration$AssignedValue$Metadata.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(Resolve$Configuration$AssignedValue$Metadata.class, uConfigurati);
    }
    private void Resolve$Configuration$AssignedValue$Metadata(){
       super();
       this.externalRealm_ = "";
    }
    public static Resolve$Configuration$AssignedValue$Metadata e(){
       return Resolve$Configuration$AssignedValue$Metadata.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Resolve$Configuration$AssignedValue$Metadata.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"policyId_","externalRealm_","externalRealmId_"};
             return c.newMessageInfo(Resolve$Configuration$AssignedValue$Metadata.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x02", objArray);
           case 3:
             return new Resolve$Configuration$AssignedValue$Metadata();
           case 4:
             return new e();
           case 5:
             return Resolve$Configuration$AssignedValue$Metadata.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Configuration$AssignedValue$Metadata.PARSER) == null) {
                _monitor_enter(Resolve$Configuration$AssignedValue$Metadata.class);
                if ((pARSER = Resolve$Configuration$AssignedValue$Metadata.PARSER) == null) {
                   pARSER = new ii2(Resolve$Configuration$AssignedValue$Metadata.DEFAULT_INSTANCE);
                   Resolve$Configuration$AssignedValue$Metadata.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Configuration$AssignedValue$Metadata.class);
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
