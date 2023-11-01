package com.spotify.collection2.v2.proto.Collection2V2$CollectionItem;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.si0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Collection2V2$CollectionItem extends c implements u74	// class@000596 from classes.dex
{
    private long addedAt_;
    private boolean isRemoved_;
    private String uri_;
    public static final int ADDED_AT_FIELD_NUMBER = 2;
    private static final Collection2V2$CollectionItem DEFAULT_INSTANCE;
    public static final int IS_REMOVED_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int URI_FIELD_NUMBER;

    static {
       Collection2V2$CollectionItem uCollectionI = new Collection2V2$CollectionItem();
       Collection2V2$CollectionItem.DEFAULT_INSTANCE = uCollectionI;
       c.registerDefaultInstance(Collection2V2$CollectionItem.class, uCollectionI);
    }
    private void Collection2V2$CollectionItem(){
       super();
       this.uri_ = "";
    }
    public static Collection2V2$CollectionItem e(){
       return Collection2V2$CollectionItem.DEFAULT_INSTANCE;
    }
    public static void f(Collection2V2$CollectionItem p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.uri_ = p1;
    }
    public static void g(Collection2V2$CollectionItem p0,boolean p1){
       p0.isRemoved_ = p1;
    }
    public static si0 h(){
       return Collection2V2$CollectionItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Collection2V2$CollectionItem.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"uri_","addedAt_","isRemoved_"};
             return c.newMessageInfo(Collection2V2$CollectionItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x07", objArray);
           case 3:
             return new Collection2V2$CollectionItem();
           case 4:
             return new si0();
           case 5:
             return Collection2V2$CollectionItem.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Collection2V2$CollectionItem.PARSER) == null) {
                _monitor_enter(Collection2V2$CollectionItem.class);
                if ((pARSER = Collection2V2$CollectionItem.PARSER) == null) {
                   pARSER = new ii2(Collection2V2$CollectionItem.DEFAULT_INSTANCE);
                   Collection2V2$CollectionItem.PARSER = pARSER;
                }
                _monitor_exit(Collection2V2$CollectionItem.class);
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
