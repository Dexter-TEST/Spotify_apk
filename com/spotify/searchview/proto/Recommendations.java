package com.spotify.searchview.proto.Recommendations;
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
import p.q04;
import p.m04;
import com.spotify.searchview.proto.Entity;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.oq5;
import p.r74;
import com.google.protobuf.b;

public final class Recommendations extends c implements u74	// class@000c11 from classes.dex
{
    private bc3 entities_;
    private int type_;
    private static final Recommendations DEFAULT_INSTANCE;
    public static final int ENTITIES_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;

    static {
       Recommendations recommendati = new Recommendations();
       Recommendations.DEFAULT_INSTANCE = recommendati;
       c.registerDefaultInstance(Recommendations.class, recommendati);
    }
    private void Recommendations(){
       super();
       this.entities_ = c.emptyProtobufList();
    }
    public static Recommendations e(){
       return Recommendations.DEFAULT_INSTANCE;
    }
    public static Recommendations f(){
       return Recommendations.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Recommendations.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"type_","entities_",Entity.class};
             return c.newMessageInfo(Recommendations.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\f\x02\x1b", objArray);
           case 3:
             return new Recommendations();
           case 4:
             return new q04(p2);
           case 5:
             return Recommendations.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Recommendations.PARSER) == null) {
                _monitor_enter(Recommendations.class);
                if ((pARSER = Recommendations.PARSER) == null) {
                   pARSER = new ii2(Recommendations.DEFAULT_INSTANCE);
                   Recommendations.PARSER = pARSER;
                }
                _monitor_exit(Recommendations.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 g(){
       return this.entities_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final oq5 h(){
       oq5 ooq5;
       if ((ooq5 = oq5.a(this.type_)) == null) {
          ooq5 = oq5.y;
       }
       return ooq5;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
