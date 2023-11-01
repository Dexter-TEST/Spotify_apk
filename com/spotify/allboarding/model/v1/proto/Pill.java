package com.spotify.allboarding.model.v1.proto.Pill;
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
import p.yk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Pill extends c implements u74	// class@00051b from classes.dex
{
    private String color_;
    private Logging logging_;
    private boolean selected_;
    private String text_;
    private String uri_;
    public static final int COLOR_FIELD_NUMBER = 4;
    private static final Pill DEFAULT_INSTANCE;
    public static final int LOGGING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SELECTED_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       Pill pill = new Pill();
       Pill.DEFAULT_INSTANCE = pill;
       c.registerDefaultInstance(Pill.class, pill);
    }
    private void Pill(){
       super();
       this.uri_ = "";
       this.text_ = "";
       this.color_ = "";
    }
    public static Pill e(){
       return Pill.DEFAULT_INSTANCE;
    }
    public static Pill g(){
       return Pill.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Pill.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","text_","selected_","color_","logging_"};
             return c.newMessageInfo(Pill.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\x02\x02\x05\t", objArray);
           case 3:
             return new Pill();
           case 4:
             return new cl1(p2);
           case 5:
             return Pill.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Pill.PARSER) == null) {
                _monitor_enter(Pill.class);
                if ((pARSER = Pill.PARSER) == null) {
                   pARSER = new ii2(Pill.DEFAULT_INSTANCE);
                   Pill.PARSER = pARSER;
                }
                _monitor_exit(Pill.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.color_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final boolean h(){
       return this.selected_;
    }
    public final String i(){
       return this.text_;
    }
    public final String j(){
       return this.uri_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
