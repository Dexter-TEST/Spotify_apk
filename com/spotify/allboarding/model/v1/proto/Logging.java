package com.spotify.allboarding.model.v1.proto.Logging;
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
import p.ik1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Logging extends c implements u74	// class@000517 from classes.dex
{
    private String contentSource_;
    private String section_;
    public static final int CONTENT_SOURCE_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SECTION_FIELD_NUMBER;

    static {
       Logging logging = new Logging();
       Logging.DEFAULT_INSTANCE = logging;
       c.registerDefaultInstance(Logging.class, logging);
    }
    private void Logging(){
       super();
       this.section_ = "";
       this.contentSource_ = "";
    }
    public static Logging e(){
       return Logging.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Logging.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"section_","contentSource_"};
             return c.newMessageInfo(Logging.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new Logging();
           case 4:
             return new cl1(p2);
           case 5:
             return Logging.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Logging.PARSER) == null) {
                _monitor_enter(Logging.class);
                if ((pARSER = Logging.PARSER) == null) {
                   pARSER = new ii2(Logging.DEFAULT_INSTANCE);
                   Logging.PARSER = pARSER;
                }
                _monitor_exit(Logging.class);
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
