package com.spotify.allboarding.model.v2.proto.SearchConfiguration;
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
import p.bk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class SearchConfiguration extends c implements u74	// class@00052f from classes.dex
{
    private String initialText_;
    private String placeholder_;
    private String searchUrl_;
    private static final SearchConfiguration DEFAULT_INSTANCE;
    public static final int INITIAL_TEXT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLACEHOLDER_FIELD_NUMBER;
    public static final int SEARCH_URL_FIELD_NUMBER;

    static {
       SearchConfiguration searchConfig = new SearchConfiguration();
       SearchConfiguration.DEFAULT_INSTANCE = searchConfig;
       c.registerDefaultInstance(SearchConfiguration.class, searchConfig);
    }
    private void SearchConfiguration(){
       super();
       this.searchUrl_ = "";
       this.placeholder_ = "";
       this.initialText_ = "";
    }
    public static SearchConfiguration e(){
       return SearchConfiguration.DEFAULT_INSTANCE;
    }
    public static SearchConfiguration f(){
       return SearchConfiguration.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SearchConfiguration.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"searchUrl_","placeholder_","initialText_"};
             return c.newMessageInfo(SearchConfiguration.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new SearchConfiguration();
           case 4:
             return new cl1(p2);
           case 5:
             return SearchConfiguration.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SearchConfiguration.PARSER) == null) {
                _monitor_enter(SearchConfiguration.class);
                if ((pARSER = SearchConfiguration.PARSER) == null) {
                   pARSER = new ii2(SearchConfiguration.DEFAULT_INSTANCE);
                   SearchConfiguration.PARSER = pARSER;
                }
                _monitor_exit(SearchConfiguration.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.initialText_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.placeholder_;
    }
    public final String i(){
       return this.searchUrl_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
