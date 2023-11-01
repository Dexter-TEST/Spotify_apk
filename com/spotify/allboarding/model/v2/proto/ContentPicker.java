package com.spotify.allboarding.model.v2.proto.ContentPicker;
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
import p.jk1;
import com.spotify.allboarding.model.v2.proto.Section;
import com.spotify.allboarding.model.v1.proto.Tag;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import com.spotify.allboarding.model.v2.proto.SearchConfiguration;
import p.r74;
import com.google.protobuf.b;

public final class ContentPicker extends c implements u74	// class@000527 from classes.dex
{
    private bc3 filters_;
    private int minSelections_;
    private NullableString primaryButtonLabel_;
    private SearchConfiguration search_;
    private NullableString secondaryButtonLabel_;
    private bc3 sections_;
    private NullableString title_;
    private static final ContentPicker DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER;
    public static final int MIN_SELECTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PRIMARY_BUTTON_LABEL_FIELD_NUMBER;
    public static final int SEARCH_FIELD_NUMBER;
    public static final int SECONDARY_BUTTON_LABEL_FIELD_NUMBER;
    public static final int SECTIONS_FIELD_NUMBER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       ContentPicker uContentPick = new ContentPicker();
       ContentPicker.DEFAULT_INSTANCE = uContentPick;
       c.registerDefaultInstance(ContentPicker.class, uContentPick);
    }
    private void ContentPicker(){
       super();
       this.sections_ = c.emptyProtobufList();
       this.filters_ = c.emptyProtobufList();
    }
    public static ContentPicker e(){
       return ContentPicker.DEFAULT_INSTANCE;
    }
    public static ContentPicker f(){
       return ContentPicker.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ContentPicker.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[9];
             objArray[0] = "title_";
             objArray[b] = "minSelections_";
             objArray[2] = "sections_";
             objArray[3] = Section.class;
             objArray[4] = "search_";
             objArray[5] = "filters_";
             objArray[6] = Tag.class;
             objArray[7] = "primaryButtonLabel_";
             objArray[8] = "secondaryButtonLabel_";
             return c.newMessageInfo(ContentPicker.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\t\x02\x04\x03\x1b\x04\t\x05\x1b\x06\t\x07\t", objArray);
           case 3:
             return new ContentPicker();
           case 4:
             return new cl1(p2);
           case 5:
             return ContentPicker.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ContentPicker.PARSER) == null) {
                _monitor_enter(ContentPicker.class);
                if ((pARSER = ContentPicker.PARSER) == null) {
                   pARSER = new ii2(ContentPicker.DEFAULT_INSTANCE);
                   ContentPicker.PARSER = pARSER;
                }
                _monitor_exit(ContentPicker.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 g(){
       return this.filters_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int h(){
       return this.minSelections_;
    }
    public final NullableString i(){
       ContentPicker tprimaryButt;
       if ((tprimaryButt = this.primaryButtonLabel_) == null) {
          tprimaryButt = NullableString.f();
       }
       return tprimaryButt;
    }
    public final SearchConfiguration j(){
       ContentPicker tsearch_;
       if ((tsearch_ = this.search_) == null) {
          tsearch_ = SearchConfiguration.f();
       }
       return tsearch_;
    }
    public final NullableString k(){
       ContentPicker tsecondaryBu;
       if ((tsecondaryBu = this.secondaryButtonLabel_) == null) {
          tsecondaryBu = NullableString.f();
       }
       return tsecondaryBu;
    }
    public final bc3 l(){
       return this.sections_;
    }
    public final NullableString m(){
       ContentPicker ttitle_;
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
