package com.spotify.allboarding.model.v1.proto.TitleBox;
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
import p.bl1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class TitleBox extends c implements u74	// class@000525 from classes.dex
{
    private Logging logging_;
    private boolean selected_;
    private String text_;
    private String uri_;
    private static final TitleBox DEFAULT_INSTANCE;
    public static final int LOGGING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SELECTED_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       TitleBox titleBox = new TitleBox();
       TitleBox.DEFAULT_INSTANCE = titleBox;
       c.registerDefaultInstance(TitleBox.class, titleBox);
    }
    private void TitleBox(){
       super();
       this.uri_ = "";
       this.text_ = "";
    }
    public static TitleBox e(){
       return TitleBox.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return TitleBox.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","text_","selected_","logging_"};
             return c.newMessageInfo(TitleBox.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\t", objArray);
           case 3:
             return new TitleBox();
           case 4:
             return new cl1(p2);
           case 5:
             return TitleBox.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = TitleBox.PARSER) == null) {
                _monitor_enter(TitleBox.class);
                if ((pARSER = TitleBox.PARSER) == null) {
                   pARSER = new ii2(TitleBox.DEFAULT_INSTANCE);
                   TitleBox.PARSER = pARSER;
                }
                _monitor_exit(TitleBox.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final boolean f(){
       return this.selected_;
    }
    public final String g(){
       return this.text_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.uri_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
