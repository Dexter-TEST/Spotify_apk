package com.spotify.useraccount.v1.AccountAttribute;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.j04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.lang.Boolean;
import java.lang.Long;
import p.r4;
import p.r74;
import com.google.protobuf.b;

public final class AccountAttribute extends c implements u74	// class@000c5e from classes.dex
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
    public static AccountAttribute g(){
       return AccountAttribute.DEFAULT_INSTANCE;
    }
    public static AccountAttribute k(byte[] p0){
       return c.parseFrom(AccountAttribute.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return AccountAttribute.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[]{"value_","valueCase_"};
             return c.newMessageInfo(AccountAttribute.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\x01\xff\x02\xff\x02\x02\x04\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02:\xff\x02\xff\x02\x035\xff\x02\xff\x02\x04\x02\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new AccountAttribute();
           case 4:
             return new q04(p2);
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
    public final boolean f(){
       if (this.valueCase_ == 2) {
          return this.value_.booleanValue();
       }
       return false;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final long h(){
       if (this.valueCase_ == 3) {
          return this.value_.longValue();
       }
       return 0;
    }
    public final String i(){
       AccountAttribute tvalue_ = (this.valueCase_ == 4)? this.value_: "";
       return tvalue_;
    }
    public final r4 j(){
       AccountAttribute tvalueCase_;
       r4 or4;
       if ((tvalueCase_ = this.valueCase_) != null) {
          if (tvalueCase_ != 2) {
             if (tvalueCase_ != 3) {
                or4 = (tvalueCase_ != 4)? null: r4.c;
             }else {
                or4 = r4.b;
             }
          }else {
             or4 = r4.a;
          }
       }else {
          or4 = r4.t;
       }
       return or4;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
