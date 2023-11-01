package com.spotify.messages.StorageOperationNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.String;
import java.lang.Object;
import p.pt6;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.qt6;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class StorageOperationNonAuth extends c implements u74	// class@000a08 from classes.dex
{
    private int bitField0_;
    private String component_;
    private long dataSizeBytes_;
    private long durationMs_;
    private g14 error_;
    private String location_;
    private String operationType_;
    private long unixTimestamp_;
    public static final int COMPONENT_FIELD_NUMBER = 5;
    public static final int DATA_SIZE_BYTES_FIELD_NUMBER = 2;
    private static final StorageOperationNonAuth DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER;
    public static final int ERROR_FIELD_NUMBER;
    public static final int LOCATION_FIELD_NUMBER;
    public static final int OPERATION_TYPE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int UNIX_TIMESTAMP_FIELD_NUMBER;

    static {
       StorageOperationNonAuth storageOpera = new StorageOperationNonAuth();
       StorageOperationNonAuth.DEFAULT_INSTANCE = storageOpera;
       c.registerDefaultInstance(StorageOperationNonAuth.class, storageOpera);
    }
    private void StorageOperationNonAuth(){
       super();
       this.error_ = g14.b;
       this.operationType_ = "";
       this.component_ = "";
       this.location_ = "";
    }
    public static StorageOperationNonAuth e(){
       return StorageOperationNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(StorageOperationNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.operationType_ = p1;
    }
    public static void g(StorageOperationNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.component_ = p1;
    }
    public static void h(StorageOperationNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.location_ = p1;
    }
    public static g14 i(StorageOperationNonAuth p0){
       StorageOperationNonAuth error_ = p0.error_;
       if (error_.a == null) {
          p0.error_ = error_.d();
       }
       return p0.error_;
    }
    public static void j(StorageOperationNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.dataSizeBytes_ = p1;
    }
    public static void k(StorageOperationNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.durationMs_ = p1;
    }
    public static void l(StorageOperationNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.unixTimestamp_ = p1;
    }
    public static pt6 m(){
       return StorageOperationNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return StorageOperationNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[9];
             objArray[0] = "bitField0_";
             objArray[b] = "operationType_";
             objArray[2] = "dataSizeBytes_";
             objArray[3] = "durationMs_";
             objArray[4] = "unixTimestamp_";
             objArray[5] = "component_";
             objArray[6] = "location_";
             objArray[7] = "error_";
             objArray[8] = qt6.a;
             return c.newMessageInfo(StorageOperationNonAuth.DEFAULT_INSTANCE, "\x01\x07\xff\x02\xff\x02\x01\x01\x07\x07\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x072", objArray);
           case 3:
             return new StorageOperationNonAuth();
           case 4:
             return new pt6();
           case 5:
             return StorageOperationNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = StorageOperationNonAuth.PARSER) == null) {
                _monitor_enter(StorageOperationNonAuth.class);
                if ((pARSER = StorageOperationNonAuth.PARSER) == null) {
                   pARSER = new ii2(StorageOperationNonAuth.DEFAULT_INSTANCE);
                   StorageOperationNonAuth.PARSER = pARSER;
                }
                _monitor_exit(StorageOperationNonAuth.class);
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
