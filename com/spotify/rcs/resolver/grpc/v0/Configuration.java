package com.spotify.rcs.resolver.grpc.v0.Configuration;
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
import com.spotify.rcs.resolver.grpc.v0.g;
import com.spotify.rcs.resolver.grpc.v0.Configuration$AssignedValue;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Configuration extends c implements u74	// class@000bcf from classes.dex
{
    private bc3 assignedValues_;
    private String configurationAssignmentId_;
    private long fetchTimeMillis_;
    private long policySnapshotId_;
    public static final int ASSIGNED_VALUES_FIELD_NUMBER = 3;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 1;
    private static final Configuration DEFAULT_INSTANCE;
    public static final int FETCH_TIME_MILLIS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER;

    static {
       Configuration uConfigurati = new Configuration();
       Configuration.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(Configuration.class, uConfigurati);
    }
    private void Configuration(){
       super();
       this.configurationAssignmentId_ = "";
       this.assignedValues_ = c.emptyProtobufList();
    }
    public static Configuration e(){
       return Configuration.DEFAULT_INSTANCE;
    }
    public static Configuration h(){
       return Configuration.DEFAULT_INSTANCE;
    }
    public static Configuration k(byte[] p0){
       return c.parseFrom(Configuration.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return Configuration.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"configurationAssignmentId_","fetchTimeMillis_","assignedValues_",Configuration$AssignedValue.class,"policySnapshotId_"};
             return c.newMessageInfo(Configuration.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x1b\x04\x02", objArray);
           case 3:
             return new Configuration();
           case 4:
             return new g();
           case 5:
             return Configuration.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Configuration.PARSER) == null) {
                _monitor_enter(Configuration.class);
                if ((pARSER = Configuration.PARSER) == null) {
                   pARSER = new ii2(Configuration.DEFAULT_INSTANCE);
                   Configuration.PARSER = pARSER;
                }
                _monitor_exit(Configuration.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.assignedValues_;
    }
    public final String g(){
       return this.configurationAssignmentId_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final long i(){
       return this.fetchTimeMillis_;
    }
    public final long j(){
       return this.policySnapshotId_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
