package com.spotify.allboarding.model.v1.proto.MoreResponse;
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
import p.cl1;
import p.fk1;
import com.spotify.allboarding.model.v1.proto.Item;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class MoreResponse extends c implements u74	// class@000518 from classes.dex
{
    private bc3 items_;
    private static final MoreResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       MoreResponse moreResponse = new MoreResponse();
       MoreResponse.DEFAULT_INSTANCE = moreResponse;
       c.registerDefaultInstance(MoreResponse.class, moreResponse);
    }
    private void MoreResponse(){
       super();
       this.items_ = c.emptyProtobufList();
    }
    public static MoreResponse e(){
       return MoreResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return MoreResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"items_",Item.class};
             return c.newMessageInfo(MoreResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new MoreResponse();
           case 4:
             return new cl1(p2);
           case 5:
             return MoreResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MoreResponse.PARSER) == null) {
                _monitor_enter(MoreResponse.class);
                if ((pARSER = MoreResponse.PARSER) == null) {
                   pARSER = new ii2(MoreResponse.DEFAULT_INSTANCE);
                   MoreResponse.PARSER = pARSER;
                }
                _monitor_exit(MoreResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.items_;
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
