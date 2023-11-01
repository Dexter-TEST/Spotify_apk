package com.spotify.allboarding.model.v1.proto.SearchResponse;
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
import p.rk1;
import com.spotify.allboarding.model.v1.proto.SearchItem;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class SearchResponse extends c implements u74	// class@00051e from classes.dex
{
    private bc3 items_;
    private static final SearchResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       SearchResponse searchRespon = new SearchResponse();
       SearchResponse.DEFAULT_INSTANCE = searchRespon;
       c.registerDefaultInstance(SearchResponse.class, searchRespon);
    }
    private void SearchResponse(){
       super();
       this.items_ = c.emptyProtobufList();
    }
    public static SearchResponse e(){
       return SearchResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SearchResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"items_",SearchItem.class};
             return c.newMessageInfo(SearchResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new SearchResponse();
           case 4:
             return new cl1(p2);
           case 5:
             return SearchResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SearchResponse.PARSER) == null) {
                _monitor_enter(SearchResponse.class);
                if ((pARSER = SearchResponse.PARSER) == null) {
                   pARSER = new ii2(SearchResponse.DEFAULT_INSTANCE);
                   SearchResponse.PARSER = pARSER;
                }
                _monitor_exit(SearchResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.items_;
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
