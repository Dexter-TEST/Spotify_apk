package com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphEntity;
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
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class SocialgraphV2$SocialGraphEntity extends c implements u74	// class@000c32 from classes.dex
{
    private String artistUri_;
    private int bitField0_;
    private long blockedAt_;
    private long dismissedAt_;
    private long followedAt_;
    private int followersCount_;
    private long followingAt_;
    private int followingCount_;
    private boolean isBlocked_;
    private boolean isDismissed_;
    private boolean isFollowed_;
    private boolean isFollowing_;
    private int status_;
    private String userUri_;
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    public static final int BLOCKED_AT_FIELD_NUMBER = 13;
    private static final SocialgraphV2$SocialGraphEntity DEFAULT_INSTANCE;
    public static final int DISMISSED_AT_FIELD_NUMBER;
    public static final int FOLLOWED_AT_FIELD_NUMBER;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER;
    public static final int FOLLOWING_AT_FIELD_NUMBER;
    public static final int FOLLOWING_COUNT_FIELD_NUMBER;
    public static final int IS_BLOCKED_FIELD_NUMBER;
    public static final int IS_DISMISSED_FIELD_NUMBER;
    public static final int IS_FOLLOWED_FIELD_NUMBER;
    public static final int IS_FOLLOWING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STATUS_FIELD_NUMBER;
    public static final int USER_URI_FIELD_NUMBER;

    static {
       SocialgraphV2$SocialGraphEntity socialGraphE = new SocialgraphV2$SocialGraphEntity();
       SocialgraphV2$SocialGraphEntity.DEFAULT_INSTANCE = socialGraphE;
       c.registerDefaultInstance(SocialgraphV2$SocialGraphEntity.class, socialGraphE);
    }
    private void SocialgraphV2$SocialGraphEntity(){
       super();
       this.userUri_ = "";
       this.artistUri_ = "";
    }
    public static SocialgraphV2$SocialGraphEntity e(){
       return SocialgraphV2$SocialGraphEntity.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SocialgraphV2$SocialGraphEntity.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       int i1 = 14;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[i1];
             objArray[i] = "bitField0_";
             objArray[b] = "userUri_";
             objArray[2] = "artistUri_";
             objArray[3] = "followersCount_";
             objArray[4] = "followingCount_";
             objArray[5] = "status_";
             objArray[6] = "isFollowing_";
             objArray[7] = "isFollowed_";
             objArray[8] = "isDismissed_";
             objArray[9] = "isBlocked_";
             objArray[10] = "followingAt_";
             objArray[11] = "followedAt_";
             objArray[12] = "dismissedAt_";
             objArray[13] = "blockedAt_";
             return c.newMessageInfo(SocialgraphV2$SocialGraphEntity.DEFAULT_INSTANCE, "\x01\r\xff\x02\xff\x02\x01\x01\r\r\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b\n\x10\x02\t\x0b\x10\x02\n\f\x10\x02\x0b\r\x10\x02\f", objArray);
           case 3:
             return new SocialgraphV2$SocialGraphEntity();
           case 4:
             return new q04(i1, i);
           case 5:
             return SocialgraphV2$SocialGraphEntity.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SocialgraphV2$SocialGraphEntity.PARSER) == null) {
                _monitor_enter(SocialgraphV2$SocialGraphEntity.class);
                if ((pARSER = SocialgraphV2$SocialGraphEntity.PARSER) == null) {
                   pARSER = new ii2(SocialgraphV2$SocialGraphEntity.DEFAULT_INSTANCE);
                   SocialgraphV2$SocialGraphEntity.PARSER = pARSER;
                }
                _monitor_exit(SocialgraphV2$SocialGraphEntity.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.userUri_;
    }
    public final boolean g(){
       int i = 1;
       if ((this.bitField0_ & i)) {
       }else {
          i = false;
       }
       return i;
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
