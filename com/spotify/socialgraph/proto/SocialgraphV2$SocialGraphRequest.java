package com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.cn6;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class SocialgraphV2$SocialGraphRequest extends c implements u74	// class@000c34 from classes.dex
{
    private int bitField0_;
    private String sourceUri_;
    private bc3 targetUris_;
    private static final SocialgraphV2$SocialGraphRequest DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SOURCE_URI_FIELD_NUMBER;
    public static final int TARGET_URIS_FIELD_NUMBER;

    static {
       SocialgraphV2$SocialGraphRequest socialGraphR = new SocialgraphV2$SocialGraphRequest();
       SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE = socialGraphR;
       c.registerDefaultInstance(SocialgraphV2$SocialGraphRequest.class, socialGraphR);
    }
    private void SocialgraphV2$SocialGraphRequest(){
       super();
       this.targetUris_ = c.emptyProtobufList();
       this.sourceUri_ = "";
    }
    public static SocialgraphV2$SocialGraphRequest e(){
       return SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE;
    }
    public static void f(SocialgraphV2$SocialGraphRequest p0,String p1){
       p0.getClass();
       p1.getClass();
       SocialgraphV2$SocialGraphRequest targetUris_ = p0.targetUris_;
       if (targetUris_.a == null) {
          p0.targetUris_ = c.mutableCopy(targetUris_);
       }
       p0.targetUris_.add(p1);
       return;
    }
    public static cn6 g(){
       return SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","targetUris_","sourceUri_"};
             return c.newMessageInfo(SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1a\x02\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new SocialgraphV2$SocialGraphRequest();
           case 4:
             return new cn6();
           case 5:
             return SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SocialgraphV2$SocialGraphRequest.PARSER) == null) {
                _monitor_enter(SocialgraphV2$SocialGraphRequest.class);
                if ((pARSER = SocialgraphV2$SocialGraphRequest.PARSER) == null) {
                   pARSER = new ii2(SocialgraphV2$SocialGraphRequest.DEFAULT_INSTANCE);
                   SocialgraphV2$SocialGraphRequest.PARSER = pARSER;
                }
                _monitor_exit(SocialgraphV2$SocialGraphRequest.class);
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
