package com.spotify.login5.v3.credentials.proto.StoredCredential;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import java.lang.Object;
import p.h80;
import p.lu6;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class StoredCredential extends c implements u74	// class@0009d9 from classes.dex
{
    private i80 data_;
    private String username_;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final StoredCredential DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int USERNAME_FIELD_NUMBER;

    static {
       StoredCredential storedCreden = new StoredCredential();
       StoredCredential.DEFAULT_INSTANCE = storedCreden;
       c.registerDefaultInstance(StoredCredential.class, storedCreden);
    }
    private void StoredCredential(){
       super();
       this.username_ = "";
       this.data_ = i80.b;
    }
    public static StoredCredential e(){
       return StoredCredential.DEFAULT_INSTANCE;
    }
    public static void f(StoredCredential p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.username_ = p1;
    }
    public static void g(StoredCredential p0,h80 p1){
       p0.getClass();
       p0.data_ = p1;
    }
    public static lu6 h(){
       return StoredCredential.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return StoredCredential.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"username_","data_"};
             return c.newMessageInfo(StoredCredential.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\n", objArray);
           case 3:
             return new StoredCredential();
           case 4:
             return new lu6();
           case 5:
             return StoredCredential.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = StoredCredential.PARSER) == null) {
                _monitor_enter(StoredCredential.class);
                if ((pARSER = StoredCredential.PARSER) == null) {
                   pARSER = new ii2(StoredCredential.DEFAULT_INSTANCE);
                   StoredCredential.PARSER = pARSER;
                }
                _monitor_exit(StoredCredential.class);
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
