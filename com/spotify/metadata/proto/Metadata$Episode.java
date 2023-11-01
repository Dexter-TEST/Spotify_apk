package com.spotify.metadata.proto.Metadata$Episode;
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
import com.spotify.metadata.proto.Metadata$AudioFile;
import com.spotify.metadata.proto.Metadata$VideoFile;
import com.spotify.metadata.proto.Metadata$Restriction;
import com.spotify.metadata.proto.Metadata$Availability;
import p.l84;
import com.spotify.metadata.proto.Metadata$ContentRating;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import com.spotify.metadata.proto.Metadata$Date;
import com.spotify.metadata.proto.Metadata$Show;

public final class Metadata$Episode extends c implements u74	// class@000a6d from classes.dex
{
    private boolean allowBackgroundPlayback_;
    private bc3 audioPreview_;
    private bc3 audio_;
    private bc3 availability_;
    private int bitField0_;
    private bc3 contentRating_;
    private Metadata$ImageGroup coverImage_;
    private int deprecatedPopularity_;
    private String description_;
    private int duration_;
    private boolean explicit_;
    private String externalUrl_;
    private Metadata$ImageGroup freezeFrame_;
    private i80 gid_;
    private boolean isAudiobookChapter_;
    private boolean isPodcastShort_;
    private bc3 keyword_;
    private String language_;
    private boolean musicAndTalk_;
    private String name_;
    private int number_;
    private Metadata$Audio originalAudio_;
    private Metadata$Date publishTime_;
    private bc3 restriction_;
    private Metadata$Show show_;
    private int type_;
    private bc3 videoPreview_;
    private bc3 video_;
    public static final int ALLOW_BACKGROUND_PLAYBACK_FIELD_NUMBER = 81;
    public static final int AUDIO_FIELD_NUMBER = 12;
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 74;
    public static final int AVAILABILITY_FIELD_NUMBER = 82;
    public static final int CONTENT_RATING_FIELD_NUMBER = 95;
    public static final int COVER_IMAGE_FIELD_NUMBER = 68;
    private static final Metadata$Episode DEFAULT_INSTANCE;
    public static final int DEPRECATED_POPULARITY_FIELD_NUMBER;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int DURATION_FIELD_NUMBER;
    public static final int EXPLICIT_FIELD_NUMBER;
    public static final int EXTERNAL_URL_FIELD_NUMBER;
    public static final int FREEZE_FRAME_FIELD_NUMBER;
    public static final int GID_FIELD_NUMBER;
    public static final int IS_AUDIOBOOK_CHAPTER_FIELD_NUMBER;
    public static final int IS_PODCAST_SHORT_FIELD_NUMBER;
    public static final int KEYWORD_FIELD_NUMBER;
    public static final int LANGUAGE_FIELD_NUMBER;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    public static final int NUMBER_FIELD_NUMBER;
    public static final int ORIGINAL_AUDIO_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PUBLISH_TIME_FIELD_NUMBER;
    public static final int RESTRICTION_FIELD_NUMBER;
    public static final int SHOW_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int VIDEO_FIELD_NUMBER;
    public static final int VIDEO_PREVIEW_FIELD_NUMBER;

    static {
       Metadata$Episode uEpisode = new Metadata$Episode();
       Metadata$Episode.DEFAULT_INSTANCE = uEpisode;
       c.registerDefaultInstance(Metadata$Episode.class, uEpisode);
    }
    private void Metadata$Episode(){
       super();
       this.gid_ = i80.b;
       this.name_ = "";
       this.audio_ = c.emptyProtobufList();
       this.description_ = "";
       this.language_ = "";
       this.video_ = c.emptyProtobufList();
       this.videoPreview_ = c.emptyProtobufList();
       this.audioPreview_ = c.emptyProtobufList();
       this.restriction_ = c.emptyProtobufList();
       this.keyword_ = c.emptyProtobufList();
       this.availability_ = c.emptyProtobufList();
       this.externalUrl_ = "";
       this.contentRating_ = c.emptyProtobufList();
    }
    public static Metadata$Episode e(){
       return Metadata$Episode.DEFAULT_INSTANCE;
    }
    public static Metadata$Episode i(){
       return Metadata$Episode.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Episode.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 5;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[36];
             objArray[0] = "bitField0_";
             objArray[b] = "gid_";
             objArray[2] = "name_";
             objArray[3] = "duration_";
             objArray[4] = "audio_";
             objArray[i] = Metadata$AudioFile.class;
             objArray[6] = "description_";
             objArray[7] = "number_";
             objArray[8] = "publishTime_";
             objArray[9] = "deprecatedPopularity_";
             objArray[10] = "coverImage_";
             objArray[11] = "language_";
             objArray[12] = "explicit_";
             objArray[13] = "show_";
             objArray[14] = "video_";
             objArray[15] = Metadata$VideoFile.class;
             objArray[16] = "videoPreview_";
             objArray[17] = Metadata$VideoFile.class;
             objArray[18] = "audioPreview_";
             objArray[19] = Metadata$AudioFile.class;
             objArray[20] = "restriction_";
             objArray[21] = Metadata$Restriction.class;
             objArray[22] = "freezeFrame_";
             objArray[23] = "keyword_";
             objArray[24] = "allowBackgroundPlayback_";
             objArray[25] = "availability_";
             objArray[26] = Metadata$Availability.class;
             objArray[27] = "externalUrl_";
             objArray[28] = "originalAudio_";
             objArray[29] = "type_";
             objArray[30] = l84.a;
             objArray[31] = "musicAndTalk_";
             objArray[32] = "contentRating_";
             objArray[33] = Metadata$ContentRating.class;
             objArray[34] = "isAudiobookChapter_";
             objArray[35] = "isPodcastShort_";
             return c.newMessageInfo(Metadata$Episode.DEFAULT_INSTANCE, "\x01\x1b\xff\x02\xff\x02\x01\x01a\x1b\xff\x02\xff\x02\b\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x07\x10\x02\x02\f\x1b@\x10\x02\x03A\x10\x02\x04B\x10\x02\x05C\x10\x02\x06D\x10\x02\x07E\x10\x02\bF\x10\x02\tG\x10\x02\nH\x1bI\x1bJ\x1bK\x1bL\x10\x02\x0bM\x1aQ\x10\x02\fR\x1bS\x10\x02\rT\x10\x02\x0eW\x10\x02\x0f[\x10\x02\x10_\x1b`\x10\x02\x11a\x10\x02\x12", objArray);
           case 3:
             return new Metadata$Episode();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Episode.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Episode.PARSER) == null) {
                _monitor_enter(Metadata$Episode.class);
                if ((pARSER = Metadata$Episode.PARSER) == null) {
                   pARSER = new ii2(Metadata$Episode.DEFAULT_INSTANCE);
                   Metadata$Episode.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Episode.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.audio_;
    }
    public final bc3 g(){
       return this.audioPreview_;
    }
    public final String getName(){
       return this.name_;
    }
    public final Metadata$ImageGroup h(){
       Metadata$Episode tcoverImage_;
       if ((tcoverImage_ = this.coverImage_) == null) {
          tcoverImage_ = Metadata$ImageGroup.f();
       }
       return tcoverImage_;
    }
    public final String j(){
       return this.description_;
    }
    public final int k(){
       return this.duration_;
    }
    public final boolean l(){
       return this.explicit_;
    }
    public final Metadata$Date m(){
       Metadata$Episode tpublishTime;
       if ((tpublishTime = this.publishTime_) == null) {
          tpublishTime = Metadata$Date.g();
       }
       return tpublishTime;
    }
    public final bc3 n(){
       return this.restriction_;
    }
    public final Metadata$Show o(){
       Metadata$Episode tshow_;
       if ((tshow_ = this.show_) == null) {
          tshow_ = Metadata$Show.g();
       }
       return tshow_;
    }
    public final boolean p(){
       boolean b = ((this.bitField0_ & 0x0080))? true: false;
       return b;
    }
    public final boolean q(){
       boolean b = ((this.bitField0_ & 0x0200))? true: false;
       return b;
    }
}
