package com.spotify.useraccount.v1.proto.Useraccount$AccountAttribute;
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
import p.zz3;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Useraccount$AccountAttribute extends c implements u74	// class@000c5f from classes.dex
{
    private int valueCase_;
    private Object value_;
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    private static final Useraccount$AccountAttribute DEFAULT_INSTANCE;
    public static final int LONG_VALUE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER;

    static {
       Useraccount$AccountAttribute uAccountAttr = new Useraccount$AccountAttribute();
       Useraccount$AccountAttribute.DEFAULT_INSTANCE = uAccountAttr;
       c.registerDefaultInstance(Useraccount$AccountAttribute.class, uAccountAttr);
    }
    private void Useraccount$AccountAttribute(){
       super();
       this.valueCase_ = 0;
    }
    public static Useraccount$AccountAttribute e(){
       return Useraccount$AccountAttribute.DEFAULT_INSTANCE;
    }
    public static Useraccount$AccountAttribute f(){
       return Useraccount$AccountAttribute.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Useraccount$AccountAttribute.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(Useraccount$AccountAttribute.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\x01\xff\x02\xff\x02\x02\x04\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02:\xff\x02\xff\x02\x035\xff\x02\xff\x02\x04\x02\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new Useraccount$AccountAttribute();
           case 4:
             return new q04(p2);
           case 5:
             return Useraccount$AccountAttribute.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Useraccount$AccountAttribute.PARSER) == null) {
                _monitor_enter(Useraccount$AccountAttribute.class);
                if ((pARSER = Useraccount$AccountAttribute.PARSER) == null) {
                   pARSER = new ii2(Useraccount$AccountAttribute.DEFAULT_INSTANCE);
                   Useraccount$AccountAttribute.PARSER = pARSER;
                }
                _monitor_exit(Useraccount$AccountAttribute.class);
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
