package com.spotify.allboarding.model.v1.proto.SelectedItem;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.ca6;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class SelectedItem extends c implements u74	// class@00051f from classes.dex
{
    private String uri_;
    private static final SelectedItem DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int URI_FIELD_NUMBER;

    static {
       SelectedItem selectedItem = new SelectedItem();
       SelectedItem.DEFAULT_INSTANCE = selectedItem;
       c.registerDefaultInstance(SelectedItem.class, selectedItem);
    }
    private void SelectedItem(){
       super();
       this.uri_ = "";
    }
    public static SelectedItem e(){
       return SelectedItem.DEFAULT_INSTANCE;
    }
    public static void f(SelectedItem p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.uri_ = p1;
    }
    public static ca6 g(){
       return SelectedItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return SelectedItem.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "uri_";
             return c.newMessageInfo(SelectedItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new SelectedItem();
           case 4:
             return new ca6();
           case 5:
             return SelectedItem.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SelectedItem.PARSER) == null) {
                _monitor_enter(SelectedItem.class);
                if ((pARSER = SelectedItem.PARSER) == null) {
                   pARSER = new ii2(SelectedItem.DEFAULT_INSTANCE);
                   SelectedItem.PARSER = pARSER;
                }
                _monitor_exit(SelectedItem.class);
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
