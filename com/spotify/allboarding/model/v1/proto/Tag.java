package com.spotify.allboarding.model.v1.proto.Tag;
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
import p.al1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Tag extends c implements u74	// class@000524 from classes.dex
{
    private String title_;
    private String uri_;
    private static final Tag DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TITLE_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       Tag tag = new Tag();
       Tag.DEFAULT_INSTANCE = tag;
       c.registerDefaultInstance(Tag.class, tag);
    }
    private void Tag(){
       super();
       this.uri_ = "";
       this.title_ = "";
    }
    public static Tag e(){
       return Tag.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Tag.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","title_"};
             return c.newMessageInfo(Tag.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new Tag();
           case 4:
             return new cl1(p2);
           case 5:
             return Tag.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Tag.PARSER) == null) {
                _monitor_enter(Tag.class);
                if ((pARSER = Tag.PARSER) == null) {
                   pARSER = new ii2(Tag.DEFAULT_INSTANCE);
                   Tag.PARSER = pARSER;
                }
                _monitor_exit(Tag.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.title_;
    }
    public final String g(){
       return this.uri_;
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
