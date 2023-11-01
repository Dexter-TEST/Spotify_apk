package com.spotify.searchview.proto.AutocompleteQuery;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.yp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class AutocompleteQuery extends c implements u74	// class@000c08 from classes.dex
{
    private String chipText_;
    private Snippet snippet_;
    private String uri_;
    public static final int CHIP_TEXT_FIELD_NUMBER = 100;
    private static final AutocompleteQuery DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SNIPPET_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       AutocompleteQuery uAutocomplet = new AutocompleteQuery();
       AutocompleteQuery.DEFAULT_INSTANCE = uAutocomplet;
       c.registerDefaultInstance(AutocompleteQuery.class, uAutocomplet);
    }
    private void AutocompleteQuery(){
       super();
       this.uri_ = "";
       this.chipText_ = "";
    }
    public static AutocompleteQuery e(){
       return AutocompleteQuery.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return AutocompleteQuery.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","snippet_","chipText_"};
             return c.newMessageInfo(AutocompleteQuery.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01d\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\td\x02\x02", objArray);
           case 3:
             return new AutocompleteQuery();
           case 4:
             return new fq1(p2);
           case 5:
             return AutocompleteQuery.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AutocompleteQuery.PARSER) == null) {
                _monitor_enter(AutocompleteQuery.class);
                if ((pARSER = AutocompleteQuery.PARSER) == null) {
                   pARSER = new ii2(AutocompleteQuery.DEFAULT_INSTANCE);
                   AutocompleteQuery.PARSER = pARSER;
                }
                _monitor_exit(AutocompleteQuery.class);
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
