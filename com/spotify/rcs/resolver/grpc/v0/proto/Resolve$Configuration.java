package com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.resolver.grpc.v0.proto.f;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration$AssignedValue;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Resolve$Configuration extends c implements u74	// class@000be3 from classes.dex
{
    private bc3 assignedValues_;
    private String configurationAssignmentId_;
    private long fetchTimeMillis_;
    private long policySnapshotId_;
    public static final int ASSIGNED_VALUES_FIELD_NUMBER = 3;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 1;
    private static final Resolve$Configuration DEFAULT_INSTANCE;
    public static final int FETCH_TIME_MILLIS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER;

    static {
       Resolve$Configuration uConfigurati = new Resolve$Configuration();
       Resolve$Configuration.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(Resolve$Configuration.class, uConfigurati);
    }
    private void Resolve$Configuration(){
       super();
       this.configurationAssignmentId_ = "";
       this.assignedValues_ = c.emptyProtobufList();
    }
    public static Resolve$Configuration e(){
       return Resolve$Configuration.DEFAULT_INSTANCE;
    }
    public static Resolve$Configuration f(){
       return Resolve$Configuration.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Resolve$Configuration.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"configurationAssignmentId_","fetchTimeMillis_","assignedValues_",Resolve$Configuration$AssignedValue.class,"policySnapshotId_"};
             return c.newMessageInfo(Resolve$Configuration.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x1b\x04\x02", objArray);
           case 3:
             return new Resolve$Configuration();
           case 4:
             return new f();
           case 5:
             return Resolve$Configuration.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Resolve$Configuration.PARSER) == null) {
                _monitor_enter(Resolve$Configuration.class);
                if ((pARSER = Resolve$Configuration.PARSER) == null) {
                   pARSER = new ii2(Resolve$Configuration.DEFAULT_INSTANCE);
                   Resolve$Configuration.PARSER = pARSER;
                }
                _monitor_exit(Resolve$Configuration.class);
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
