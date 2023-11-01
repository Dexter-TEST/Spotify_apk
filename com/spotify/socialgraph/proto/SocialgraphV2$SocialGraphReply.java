package com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphReply;
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
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphEntity;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;
import p.r74;
import com.google.protobuf.b;

public final class SocialgraphV2$SocialGraphReply extends c implements u74	// class@000c33 from classes.dex
{
    private int bitField0_;
    private bc3 entities_;
    private int numTotalEntities_;
    private static final SocialgraphV2$SocialGraphReply DEFAULT_INSTANCE;
    public static final int ENTITIES_FIELD_NUMBER;
    public static final int NUM_TOTAL_ENTITIES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       SocialgraphV2$SocialGraphReply socialGraphR = new SocialgraphV2$SocialGraphReply();
       SocialgraphV2$SocialGraphReply.DEFAULT_INSTANCE = socialGraphR;
       c.registerDefaultInstance(SocialgraphV2$SocialGraphReply.class, socialGraphR);
    }
    private void SocialgraphV2$SocialGraphReply(){
       super();
       this.entities_ = c.emptyProtobufList();
    }
    public static SocialgraphV2$SocialGraphReply e(){
       return SocialgraphV2$SocialGraphReply.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SocialgraphV2$SocialGraphReply.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","entities_",SocialgraphV2$SocialGraphEntity.class,"numTotalEntities_"};
             return c.newMessageInfo(SocialgraphV2$SocialGraphReply.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new SocialgraphV2$SocialGraphReply();
           case 4:
             return new q04(15, i);
           case 5:
             return SocialgraphV2$SocialGraphReply.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SocialgraphV2$SocialGraphReply.PARSER) == null) {
                _monitor_enter(SocialgraphV2$SocialGraphReply.class);
                if ((pARSER = SocialgraphV2$SocialGraphReply.PARSER) == null) {
                   pARSER = new ii2(SocialgraphV2$SocialGraphReply.DEFAULT_INSTANCE);
                   SocialgraphV2$SocialGraphReply.PARSER = pARSER;
                }
                _monitor_exit(SocialgraphV2$SocialGraphReply.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.entities_.size();
    }
    public final bc3 g(){
       return this.entities_;
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
