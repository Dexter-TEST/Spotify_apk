package com.spotify.metadata.proto.Metadata$Show;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.metadata.proto.Metadata$Copyright;
import com.spotify.metadata.proto.Metadata$Restriction;
import p.w84;
import p.t84;
import com.spotify.metadata.proto.Metadata$Availability;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.metadata.proto.Metadata$ImageGroup;

public final class Metadata$Show extends c implements u74	// class@000a74 from classes.dex
{
    private bc3 availability_;
    private int bitField0_;
    private int consumptionOrder_;
    private bc3 copyright_;
    private Metadata$ImageGroup coverImage_;
    private int deprecatedPopularity_;
    private String description_;
    private bc3 episode_;
    private boolean explicit_;
    private i80 gid_;
    private boolean isAudiobook_;
    private boolean isCreatorChannel_;
    private bc3 keyword_;
    private String language_;
    private int mediaType_;
    private boolean musicAndTalk_;
    private String name_;
    private String publisher_;
    private bc3 restriction_;
    private String trailerUri_;
    public static final int AVAILABILITY_FIELD_NUMBER = 78;
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 75;
    public static final int COPYRIGHT_FIELD_NUMBER = 71;
    public static final int COVER_IMAGE_FIELD_NUMBER = 69;
    private static final Metadata$Show DEFAULT_INSTANCE;
    public static final int DEPRECATED_POPULARITY_FIELD_NUMBER;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int EPISODE_FIELD_NUMBER;
    public static final int EXPLICIT_FIELD_NUMBER;
    public static final int GID_FIELD_NUMBER;
    public static final int IS_AUDIOBOOK_FIELD_NUMBER;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER;
    public static final int KEYWORD_FIELD_NUMBER;
    public static final int LANGUAGE_FIELD_NUMBER;
    public static final int MEDIA_TYPE_FIELD_NUMBER;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PUBLISHER_FIELD_NUMBER;
    public static final int RESTRICTION_FIELD_NUMBER;
    public static final int TRAILER_URI_FIELD_NUMBER;

    static {
       Metadata$Show show = new Metadata$Show();
       Metadata$Show.DEFAULT_INSTANCE = show;
       c.registerDefaultInstance(Metadata$Show.class, show);
    }
    private void Metadata$Show(){
       super();
       this.gid_ = i80.b;
       this.name_ = "";
       this.description_ = "";
       this.publisher_ = "";
       this.language_ = "";
       this.episode_ = c.emptyProtobufList();
       this.copyright_ = c.emptyProtobufList();
       this.restriction_ = c.emptyProtobufList();
       this.keyword_ = c.emptyProtobufList();
       this.consumptionOrder_ = 1;
       this.availability_ = c.emptyProtobufList();
       this.trailerUri_ = "";
    }
    public static Metadata$Show e(){
       return Metadata$Show.DEFAULT_INSTANCE;
    }
    public static Metadata$Show g(){
       return Metadata$Show.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Show.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 12;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[26];
             objArray[0] = "bitField0_";
             objArray[b] = "gid_";
             objArray[2] = "name_";
             objArray[3] = "description_";
             objArray[4] = "deprecatedPopularity_";
             objArray[5] = "publisher_";
             objArray[6] = "language_";
             objArray[7] = "explicit_";
             objArray[8] = "coverImage_";
             objArray[9] = "episode_";
             objArray[10] = Metadata$Episode.class;
             objArray[11] = "copyright_";
             objArray[i] = Metadata$Copyright.class;
             objArray[13] = "restriction_";
             objArray[14] = Metadata$Restriction.class;
             objArray[15] = "keyword_";
             objArray[16] = "mediaType_";
             objArray[17] = w84.a;
             objArray[18] = "consumptionOrder_";
             objArray[19] = t84.a;
             objArray[20] = "availability_";
             objArray[21] = Metadata$Availability.class;
             objArray[22] = "trailerUri_";
             objArray[23] = "musicAndTalk_";
             objArray[24] = "isAudiobook_";
             objArray[25] = "isCreatorChannel_";
             return c.newMessageInfo(Metadata$Show.DEFAULT_INSTANCE, "\x01\x13\xff\x02\xff\x02\x01\x01Z\x13\xff\x02\xff\x02\x05\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01@\x10\x02\x02A\x10\x02\x03B\x10\x02\x04C\x10\x02\x05D\x10\x02\x06E\x10\x02\x07F\x1bG\x1bH\x1bI\x1aJ\x10\x02\bK\x10\x02\tN\x1bS\x10\x02\nU\x10\x02\x0bY\x10\x02\fZ\x10\x02\r", objArray);
           case 3:
             return new Metadata$Show();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Show.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Show.PARSER) == null) {
                _monitor_enter(Metadata$Show.class);
                if ((pARSER = Metadata$Show.PARSER) == null) {
                   pARSER = new ii2(Metadata$Show.DEFAULT_INSTANCE);
                   Metadata$Show.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Show.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Metadata$ImageGroup f(){
       Metadata$Show tcoverImage_;
       if ((tcoverImage_ = this.coverImage_) == null) {
          tcoverImage_ = Metadata$ImageGroup.f();
       }
       return tcoverImage_;
    }
    public final String getName(){
       return this.name_;
    }
    public final String h(){
       return this.description_;
    }
    public final boolean i(){
       return this.explicit_;
    }
    public final i80 j(){
       return this.gid_;
    }
    public final String k(){
       return this.publisher_;
    }
    public final boolean l(){
       boolean b = ((this.bitField0_ & 0x0080))? true: false;
       return b;
    }
    public final boolean m(){
       boolean b = ((this.bitField0_ & 0x40))? true: false;
       return b;
    }
}
