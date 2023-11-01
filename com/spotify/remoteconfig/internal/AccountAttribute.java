package com.spotify.remoteconfig.internal.AccountAttribute;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import p.q4;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class AccountAttribute extends c implements u74	// class@000bfb from classes.dex
{
    private int valueCase_;
    private Object value_;
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    private static final AccountAttribute DEFAULT_INSTANCE;
    public static final int LONG_VALUE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER;

    static {
       AccountAttribute uAccountAttr = new AccountAttribute();
       AccountAttribute.DEFAULT_INSTANCE = uAccountAttr;
       c.registerDefaultInstance(AccountAttribute.class, uAccountAttr);
    }
    private void AccountAttribute(){
       super();
       this.valueCase_ = 0;
    }
    public static AccountAttribute e(){
       return AccountAttribute.DEFAULT_INSTANCE;
    }
    public static void f(AccountAttribute p0,boolean p1){
       p0.valueCase_ = 2;
       p0.value_ = Boolean.valueOf(p1);
    }
    public static void g(AccountAttribute p0,long p1){
       p0.valueCase_ = 3;
       p0.value_ = Long.valueOf(p1);
    }
    public static void h(AccountAttribute p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.valueCase_ = 4;
       p0.value_ = p1;
    }
    public static AccountAttribute i(){
       return AccountAttribute.DEFAULT_INSTANCE;
    }
    public static q4 j(){
       return AccountAttribute.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return AccountAttribute.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"value_","valueCase_"};
             return c.newMessageInfo(AccountAttribute.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\x01\xff\x02\xff\x02\x02\x04\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02:\xff\x02\xff\x02\x035\xff\x02\xff\x02\x04\x02\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new AccountAttribute();
           case 4:
             return new q4();
           case 5:
             return AccountAttribute.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AccountAttribute.PARSER) == null) {
                _monitor_enter(AccountAttribute.class);
                if ((pARSER = AccountAttribute.PARSER) == null) {
                   pARSER = new ii2(AccountAttribute.DEFAULT_INSTANCE);
                   AccountAttribute.PARSER = pARSER;
                }
                _monitor_exit(AccountAttribute.class);
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
