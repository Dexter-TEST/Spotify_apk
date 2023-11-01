package com.spotify.collection2.v2.proto.Collection2V2$WriteRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import com.spotify.collection2.v2.proto.Collection2V2$CollectionItem;
import p.f2;
import java.util.List;
import p.ti0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Collection2V2$WriteRequest extends c implements u74	// class@000597 from classes.dex
{
    private String clientUpdateId_;
    private bc3 items_;
    private String set_;
    private String username_;
    public static final int CLIENT_UPDATE_ID_FIELD_NUMBER = 4;
    private static final Collection2V2$WriteRequest DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SET_FIELD_NUMBER;
    public static final int USERNAME_FIELD_NUMBER;

    static {
       Collection2V2$WriteRequest writeRequest = new Collection2V2$WriteRequest();
       Collection2V2$WriteRequest.DEFAULT_INSTANCE = writeRequest;
       c.registerDefaultInstance(Collection2V2$WriteRequest.class, writeRequest);
    }
    private void Collection2V2$WriteRequest(){
       super();
       this.username_ = "";
       this.set_ = "";
       this.items_ = c.emptyProtobufList();
       this.clientUpdateId_ = "";
    }
    public static Collection2V2$WriteRequest e(){
       return Collection2V2$WriteRequest.DEFAULT_INSTANCE;
    }
    public static void f(Collection2V2$WriteRequest p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.username_ = p1;
    }
    public static void g(Collection2V2$WriteRequest p0,String p1){
       p0.getClass();
       p0.set_ = p1;
    }
    public static void h(Collection2V2$WriteRequest p0,Collection2V2$CollectionItem p1){
       p0.getClass();
       p1.getClass();
       Collection2V2$WriteRequest items_ = p0.items_;
       if (items_.a == null) {
          p0.items_ = c.mutableCopy(items_);
       }
       p0.items_.add(p1);
       return;
    }
    public static ti0 i(){
       return Collection2V2$WriteRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Collection2V2$WriteRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"username_","set_","items_",Collection2V2$CollectionItem.class,"clientUpdateId_"};
             return c.newMessageInfo(Collection2V2$WriteRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x1b\x04\x02\x02", objArray);
           case 3:
             return new Collection2V2$WriteRequest();
           case 4:
             return new ti0();
           case 5:
             return Collection2V2$WriteRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Collection2V2$WriteRequest.PARSER) == null) {
                _monitor_enter(Collection2V2$WriteRequest.class);
                if ((pARSER = Collection2V2$WriteRequest.PARSER) == null) {
                   pARSER = new ii2(Collection2V2$WriteRequest.DEFAULT_INSTANCE);
                   Collection2V2$WriteRequest.PARSER = pARSER;
                }
                _monitor_exit(Collection2V2$WriteRequest.class);
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
