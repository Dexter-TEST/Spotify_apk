package com.spotify.messages.StorageUsageReport;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.xt6;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class StorageUsageReport extends c implements u74	// class@000a09 from classes.dex
{
    private int bitField0_;
    private long externalStorageFreeBytes_;
    private long externalStorageTotalBytes_;
    private long externalStorageUsedBytes_;
    private long internalStorageFreeBytes_;
    private long internalStorageTotalBytes_;
    private long internalStorageUsedBytes_;
    private static final StorageUsageReport DEFAULT_INSTANCE;
    public static final int EXTERNAL_STORAGE_FREE_BYTES_FIELD_NUMBER;
    public static final int EXTERNAL_STORAGE_TOTAL_BYTES_FIELD_NUMBER;
    public static final int EXTERNAL_STORAGE_USED_BYTES_FIELD_NUMBER;
    public static final int INTERNAL_STORAGE_FREE_BYTES_FIELD_NUMBER;
    public static final int INTERNAL_STORAGE_TOTAL_BYTES_FIELD_NUMBER;
    public static final int INTERNAL_STORAGE_USED_BYTES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       StorageUsageReport storageUsage = new StorageUsageReport();
       StorageUsageReport.DEFAULT_INSTANCE = storageUsage;
       c.registerDefaultInstance(StorageUsageReport.class, storageUsage);
    }
    private void StorageUsageReport(){
       super();
    }
    public static StorageUsageReport e(){
       return StorageUsageReport.DEFAULT_INSTANCE;
    }
    public static void f(StorageUsageReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.internalStorageTotalBytes_ = p1;
    }
    public static void g(StorageUsageReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.externalStorageUsedBytes_ = p1;
    }
    public static void h(StorageUsageReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.internalStorageFreeBytes_ = p1;
    }
    public static void i(StorageUsageReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.internalStorageUsedBytes_ = p1;
    }
    public static void j(StorageUsageReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.externalStorageTotalBytes_ = p1;
    }
    public static void k(StorageUsageReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.externalStorageFreeBytes_ = p1;
    }
    public static xt6 l(){
       return StorageUsageReport.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return StorageUsageReport.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","internalStorageTotalBytes_","internalStorageFreeBytes_","internalStorageUsedBytes_","externalStorageTotalBytes_","externalStorageFreeBytes_","externalStorageUsedBytes_"};
             return c.newMessageInfo(StorageUsageReport.DEFAULT_INSTANCE, "\x01\x06\xff\x02\xff\x02\x01\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05", objArray);
           case 3:
             return new StorageUsageReport();
           case 4:
             return new xt6();
           case 5:
             return StorageUsageReport.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = StorageUsageReport.PARSER) == null) {
                _monitor_enter(StorageUsageReport.class);
                if ((pARSER = StorageUsageReport.PARSER) == null) {
                   pARSER = new ii2(StorageUsageReport.DEFAULT_INSTANCE);
                   StorageUsageReport.PARSER = pARSER;
                }
                _monitor_exit(StorageUsageReport.class);
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
