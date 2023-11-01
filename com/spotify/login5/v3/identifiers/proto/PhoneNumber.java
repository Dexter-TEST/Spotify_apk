package com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.ma5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class PhoneNumber extends c implements u74	// class@0009da from classes.dex
{
    private String countryCallingCode_;
    private String isoCountryCode_;
    private String number_;
    public static final int COUNTRY_CALLING_CODE_FIELD_NUMBER = 3;
    private static final PhoneNumber DEFAULT_INSTANCE;
    public static final int ISO_COUNTRY_CODE_FIELD_NUMBER;
    public static final int NUMBER_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       PhoneNumber phoneNumber = new PhoneNumber();
       PhoneNumber.DEFAULT_INSTANCE = phoneNumber;
       c.registerDefaultInstance(PhoneNumber.class, phoneNumber);
    }
    private void PhoneNumber(){
       super();
       this.number_ = "";
       this.isoCountryCode_ = "";
       this.countryCallingCode_ = "";
    }
    public static PhoneNumber e(){
       return PhoneNumber.DEFAULT_INSTANCE;
    }
    public static void f(PhoneNumber p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.number_ = p1;
    }
    public static void g(PhoneNumber p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.isoCountryCode_ = p1;
    }
    public static void h(PhoneNumber p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.countryCallingCode_ = p1;
    }
    public static PhoneNumber i(){
       return PhoneNumber.DEFAULT_INSTANCE;
    }
    public static ma5 j(){
       return PhoneNumber.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return PhoneNumber.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"number_","isoCountryCode_","countryCallingCode_"};
             return c.newMessageInfo(PhoneNumber.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new PhoneNumber();
           case 4:
             return new ma5();
           case 5:
             return PhoneNumber.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PhoneNumber.PARSER) == null) {
                _monitor_enter(PhoneNumber.class);
                if ((pARSER = PhoneNumber.PARSER) == null) {
                   pARSER = new ii2(PhoneNumber.DEFAULT_INSTANCE);
                   PhoneNumber.PARSER = pARSER;
                }
                _monitor_exit(PhoneNumber.class);
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
