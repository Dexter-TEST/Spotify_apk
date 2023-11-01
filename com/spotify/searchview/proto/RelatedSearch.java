package com.spotify.searchview.proto.RelatedSearch;
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
import p.d04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class RelatedSearch extends c implements u74	// class@000c13 from classes.dex
{
    private String text_;
    private String uri_;
    private static final RelatedSearch DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       RelatedSearch relatedSearc = new RelatedSearch();
       RelatedSearch.DEFAULT_INSTANCE = relatedSearc;
       c.registerDefaultInstance(RelatedSearch.class, relatedSearc);
    }
    private void RelatedSearch(){
       super();
       this.text_ = "";
       this.uri_ = "";
    }
    public static RelatedSearch e(){
       return RelatedSearch.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return RelatedSearch.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"text_","uri_"};
             return c.newMessageInfo(RelatedSearch.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new RelatedSearch();
           case 4:
             return new q04(p2);
           case 5:
             return RelatedSearch.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = RelatedSearch.PARSER) == null) {
                _monitor_enter(RelatedSearch.class);
                if ((pARSER = RelatedSearch.PARSER) == null) {
                   pARSER = new ii2(RelatedSearch.DEFAULT_INSTANCE);
                   RelatedSearch.PARSER = pARSER;
                }
                _monitor_exit(RelatedSearch.class);
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
