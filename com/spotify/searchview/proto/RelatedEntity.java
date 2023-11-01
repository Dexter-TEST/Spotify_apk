package com.spotify.searchview.proto.RelatedEntity;
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
import p.c04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class RelatedEntity extends c implements u74	// class@000c12 from classes.dex
{
    private String name_;
    private String uri_;
    private static final RelatedEntity DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int URI_FIELD_NUMBER;

    static {
       RelatedEntity relatedEntit = new RelatedEntity();
       RelatedEntity.DEFAULT_INSTANCE = relatedEntit;
       c.registerDefaultInstance(RelatedEntity.class, relatedEntit);
    }
    private void RelatedEntity(){
       super();
       this.uri_ = "";
       this.name_ = "";
    }
    public static RelatedEntity e(){
       return RelatedEntity.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return RelatedEntity.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","name_"};
             return c.newMessageInfo(RelatedEntity.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new RelatedEntity();
           case 4:
             return new q04(p2);
           case 5:
             return RelatedEntity.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = RelatedEntity.PARSER) == null) {
                _monitor_enter(RelatedEntity.class);
                if ((pARSER = RelatedEntity.PARSER) == null) {
                   pARSER = new ii2(RelatedEntity.DEFAULT_INSTANCE);
                   RelatedEntity.PARSER = pARSER;
                }
                _monitor_exit(RelatedEntity.class);
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
    public final String getName(){
       return this.name_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
