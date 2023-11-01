package com.spotify.allboarding.model.v2.proto.SingleItemPicker;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.zk1;
import com.spotify.allboarding.model.v1.proto.TitleBox;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.r74;
import com.google.protobuf.b;

public final class SingleItemPicker extends c implements u74	// class@000531 from classes.dex
{
    private boolean isSelectionRequired_;
    private bc3 items_;
    private NullableString primaryButtonLabel_;
    private NullableString title_;
    private static final SingleItemPicker DEFAULT_INSTANCE;
    public static final int IS_SELECTION_REQUIRED_FIELD_NUMBER;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PRIMARY_BUTTON_LABEL_FIELD_NUMBER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       SingleItemPicker singleItemPi = new SingleItemPicker();
       SingleItemPicker.DEFAULT_INSTANCE = singleItemPi;
       c.registerDefaultInstance(SingleItemPicker.class, singleItemPi);
    }
    private void SingleItemPicker(){
       super();
       this.items_ = c.emptyProtobufList();
    }
    public static SingleItemPicker e(){
       return SingleItemPicker.DEFAULT_INSTANCE;
    }
    public static SingleItemPicker f(){
       return SingleItemPicker.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SingleItemPicker.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"title_","isSelectionRequired_","items_",TitleBox.class,"primaryButtonLabel_"};
             return c.newMessageInfo(SingleItemPicker.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\x07\x03\x1b\x04\t", objArray);
           case 3:
             return new SingleItemPicker();
           case 4:
             return new cl1(p2);
           case 5:
             return SingleItemPicker.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SingleItemPicker.PARSER) == null) {
                _monitor_enter(SingleItemPicker.class);
                if ((pARSER = SingleItemPicker.PARSER) == null) {
                   pARSER = new ii2(SingleItemPicker.DEFAULT_INSTANCE);
                   SingleItemPicker.PARSER = pARSER;
                }
                _monitor_exit(SingleItemPicker.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final boolean g(){
       return this.isSelectionRequired_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final bc3 h(){
       return this.items_;
    }
    public final NullableString i(){
       SingleItemPicker tprimaryButt;
       if ((tprimaryButt = this.primaryButtonLabel_) == null) {
          tprimaryButt = NullableString.f();
       }
       return tprimaryButt;
    }
    public final NullableString j(){
       SingleItemPicker ttitle_;
       if ((ttitle_ = this.title_) == null) {
          ttitle_ = NullableString.f();
       }
       return ttitle_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
