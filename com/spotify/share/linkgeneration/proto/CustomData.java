package com.spotify.share.linkgeneration.proto.CustomData;
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
import p.g04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class CustomData extends c implements u74	// class@000c1e from classes.dex
{
    private String key_;
    private String value_;
    private static final CustomData DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       CustomData uCustomData = new CustomData();
       CustomData.DEFAULT_INSTANCE = uCustomData;
       c.registerDefaultInstance(CustomData.class, uCustomData);
    }
    private void CustomData(){
       super();
       this.key_ = "";
       this.value_ = "";
    }
    public static CustomData e(){
       return CustomData.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return CustomData.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"key_","value_"};
             return c.newMessageInfo(CustomData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new CustomData();
           case 4:
             return new q04(p2);
           case 5:
             return CustomData.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = CustomData.PARSER) == null) {
                _monitor_enter(CustomData.class);
                if ((pARSER = CustomData.PARSER) == null) {
                   pARSER = new ii2(CustomData.DEFAULT_INSTANCE);
                   CustomData.PARSER = pARSER;
                }
                _monitor_exit(CustomData.class);
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
