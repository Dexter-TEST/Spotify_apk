package com.spotify.allboarding.model.v1.proto.SearchItem;
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
import p.lk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.Item;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.x76;
import p.r74;
import com.google.protobuf.b;

public final class SearchItem extends c implements u74	// class@00051d from classes.dex
{
    private Item contentPickerItem_;
    private NullableString imageUrl_;
    private Logging logging_;
    private String sectionIdentifier_;
    private NullableString subtitle_;
    private String title_;
    private int type_;
    private String uri_;
    public static final int CONTENT_PICKER_ITEM_FIELD_NUMBER = 6;
    private static final SearchItem DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER;
    public static final int LOGGING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SECTION_IDENTIFIER_FIELD_NUMBER;
    public static final int SUBTITLE_FIELD_NUMBER;
    public static final int TITLE_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       SearchItem searchItem = new SearchItem();
       SearchItem.DEFAULT_INSTANCE = searchItem;
       c.registerDefaultInstance(SearchItem.class, searchItem);
    }
    private void SearchItem(){
       super();
       this.uri_ = "";
       this.title_ = "";
       this.sectionIdentifier_ = "";
    }
    public static SearchItem e(){
       return SearchItem.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SearchItem.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"type_","uri_","title_","subtitle_","imageUrl_","contentPickerItem_","logging_","sectionIdentifier_"};
             return c.newMessageInfo(SearchItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x02\x02\x04\t\x05\t\x06\t\x07\t\b\x02\x02", objArray);
           case 3:
             return new SearchItem();
           case 4:
             return new cl1(p2);
           case 5:
             return SearchItem.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SearchItem.PARSER) == null) {
                _monitor_enter(SearchItem.class);
                if ((pARSER = SearchItem.PARSER) == null) {
                   pARSER = new ii2(SearchItem.DEFAULT_INSTANCE);
                   SearchItem.PARSER = pARSER;
                }
                _monitor_exit(SearchItem.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Item f(){
       SearchItem tcontentPick;
       if ((tcontentPick = this.contentPickerItem_) == null) {
          tcontentPick = Item.g();
       }
       return tcontentPick;
    }
    public final NullableString g(){
       SearchItem timageUrl_;
       if ((timageUrl_ = this.imageUrl_) == null) {
          timageUrl_ = NullableString.f();
       }
       return timageUrl_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.sectionIdentifier_;
    }
    public final NullableString i(){
       SearchItem tsubtitle_;
       if ((tsubtitle_ = this.subtitle_) == null) {
          tsubtitle_ = NullableString.f();
       }
       return tsubtitle_;
    }
    public final String j(){
       return this.title_;
    }
    public final x76 k(){
       SearchItem ttype_;
       x76 ox76;
       if ((ttype_ = this.type_) != null) {
          if (ttype_ != 1) {
             ox76 = (ttype_ != 2)? null: x76.t;
          }else {
             ox76 = x76.c;
          }
       }else {
          ox76 = x76.b;
       }
       if (ox76 == null) {
          ox76 = x76.v;
       }
       return ox76;
    }
    public final String l(){
       return this.uri_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
