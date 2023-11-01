package com.spotify.allboarding.model.v1.proto.NullableString;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.nk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class NullableString extends c implements u74	// class@000519 from classes.dex
{
    private String value_;
    private static final NullableString DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       NullableString nullableStri = new NullableString();
       NullableString.DEFAULT_INSTANCE = nullableStri;
       c.registerDefaultInstance(NullableString.class, nullableStri);
    }
    private void NullableString(){
       super();
       this.value_ = "";
    }
    public static NullableString e(){
       return NullableString.DEFAULT_INSTANCE;
    }
    public static NullableString f(){
       return NullableString.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return NullableString.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "value_";
             return c.newMessageInfo(NullableString.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new NullableString();
           case 4:
             return new cl1(p2);
           case 5:
             return NullableString.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = NullableString.PARSER) == null) {
                _monitor_enter(NullableString.class);
                if ((pARSER = NullableString.PARSER) == null) {
                   pARSER = new ii2(NullableString.DEFAULT_INSTANCE);
                   NullableString.PARSER = pARSER;
                }
                _monitor_exit(NullableString.class);
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
    public final String getValue(){
       return this.value_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
