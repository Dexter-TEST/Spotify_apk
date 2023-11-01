package com.spotify.eventsender.Fragment;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import java.lang.Object;
import p.bd2;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Fragment extends c implements u74	// class@00089f from classes.dex
{
    private int bitField0_;
    private i80 data_;
    private String name_;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final Fragment DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Fragment uFragment = new Fragment();
       Fragment.DEFAULT_INSTANCE = uFragment;
       c.registerDefaultInstance(Fragment.class, uFragment);
    }
    private void Fragment(){
       super();
       this.name_ = "";
       this.data_ = i80.b;
    }
    public static Fragment e(){
       return Fragment.DEFAULT_INSTANCE;
    }
    public static void f(Fragment p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.name_ = p1;
    }
    public static void g(Fragment p0,i80 p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.data_ = p1;
    }
    public static bd2 i(){
       return Fragment.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Fragment.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","name_","data_"};
             return c.newMessageInfo(Fragment.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Fragment();
           case 4:
             return new bd2();
           case 5:
             return Fragment.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Fragment.PARSER) == null) {
                _monitor_enter(Fragment.class);
                if ((pARSER = Fragment.PARSER) == null) {
                   pARSER = new ii2(Fragment.DEFAULT_INSTANCE);
                   Fragment.PARSER = pARSER;
                }
                _monitor_exit(Fragment.class);
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
    public final String getName(){
       return this.name_;
    }
    public final i80 h(){
       return this.data_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
