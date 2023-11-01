package com.spotify.contexts.InstallationId;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.h80;
import java.lang.Object;
import p.pa3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class InstallationId extends c implements u74	// class@00083a from classes.dex
{
    private int bitField0_;
    private i80 value_;
    private static final InstallationId DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       InstallationId installation = new InstallationId();
       InstallationId.DEFAULT_INSTANCE = installation;
       c.registerDefaultInstance(InstallationId.class, installation);
    }
    private void InstallationId(){
       super();
       this.value_ = i80.b;
    }
    public static InstallationId e(){
       return InstallationId.DEFAULT_INSTANCE;
    }
    public static void f(InstallationId p0,h80 p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.value_ = p1;
    }
    public static pa3 g(){
       return InstallationId.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InstallationId.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","value_"};
             return c.newMessageInfo(InstallationId.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new InstallationId();
           case 4:
             return new pa3();
           case 5:
             return InstallationId.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InstallationId.PARSER) == null) {
                _monitor_enter(InstallationId.class);
                if ((pARSER = InstallationId.PARSER) == null) {
                   pARSER = new ii2(InstallationId.DEFAULT_INSTANCE);
                   InstallationId.PARSER = pARSER;
                }
                _monitor_exit(InstallationId.class);
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
