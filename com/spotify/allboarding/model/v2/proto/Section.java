package com.spotify.allboarding.model.v2.proto.Section;
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
import p.wk1;
import com.spotify.allboarding.model.v1.proto.Item;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.r74;
import com.google.protobuf.b;

public final class Section extends c implements u74	// class@000530 from classes.dex
{
    private String identifier_;
    private bc3 items_;
    private NullableString subtitle_;
    private NullableString title_;
    private static final Section DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUBTITLE_FIELD_NUMBER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       Section section = new Section();
       Section.DEFAULT_INSTANCE = section;
       c.registerDefaultInstance(Section.class, section);
    }
    private void Section(){
       super();
       this.items_ = c.emptyProtobufList();
       this.identifier_ = "";
    }
    public static Section e(){
       return Section.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Section.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"title_","items_",Item.class,"subtitle_","identifier_"};
             return c.newMessageInfo(Section.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\x1b\x03\t\x04\x02\x02", objArray);
           case 3:
             return new Section();
           case 4:
             return new cl1(p2);
           case 5:
             return Section.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Section.PARSER) == null) {
                _monitor_enter(Section.class);
                if ((pARSER = Section.PARSER) == null) {
                   pARSER = new ii2(Section.DEFAULT_INSTANCE);
                   Section.PARSER = pARSER;
                }
                _monitor_exit(Section.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.identifier_;
    }
    public final bc3 g(){
       return this.items_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final NullableString h(){
       Section tsubtitle_;
       if ((tsubtitle_ = this.subtitle_) == null) {
          tsubtitle_ = NullableString.f();
       }
       return tsubtitle_;
    }
    public final NullableString i(){
       Section ttitle_;
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
