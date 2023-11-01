package com.spotify.metadata.proto.Metadata$Track;
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
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$ExternalId;
import com.spotify.metadata.proto.Metadata$Restriction;
import com.spotify.metadata.proto.Metadata$AudioFile;
import com.spotify.metadata.proto.Metadata$SalePeriod;
import com.spotify.metadata.proto.Metadata$Availability;
import com.spotify.metadata.proto.Metadata$ContentRating;
import com.spotify.metadata.proto.Metadata$ArtistWithRole;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.metadata.proto.Metadata$Album;

public final class Metadata$Track extends c implements u74	// class@000a76 from classes.dex
{
    private Metadata$Album album_;
    private bc3 alternative_;
    private bc3 artistWithRole_;
    private bc3 artist_;
    private bc3 availability_;
    private int bitField0_;
    private bc3 contentRating_;
    private int discNumber_;
    private int duration_;
    private long earliestLiveTimestamp_;
    private boolean explicit_;
    private bc3 externalId_;
    private bc3 file_;
    private i80 gid_;
    private boolean hasLyrics_;
    private bc3 languageOfPerformance_;
    private Metadata$Licensor licensor_;
    private String name_;
    private int number_;
    private Metadata$Audio originalAudio_;
    private String originalTitle_;
    private int popularity_;
    private bc3 preview_;
    private bc3 restriction_;
    private bc3 salePeriod_;
    private bc3 tags_;
    private String versionTitle_;
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_FIELD_NUMBER = 13;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int ARTIST_WITH_ROLE_FIELD_NUMBER = 32;
    public static final int AVAILABILITY_FIELD_NUMBER = 19;
    public static final int CONTENT_RATING_FIELD_NUMBER = 25;
    private static final Metadata$Track DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER;
    public static final int DURATION_FIELD_NUMBER;
    public static final int EARLIEST_LIVE_TIMESTAMP_FIELD_NUMBER;
    public static final int EXPLICIT_FIELD_NUMBER;
    public static final int EXTERNAL_ID_FIELD_NUMBER;
    public static final int FILE_FIELD_NUMBER;
    public static final int GID_FIELD_NUMBER;
    public static final int HAS_LYRICS_FIELD_NUMBER;
    public static final int LANGUAGE_OF_PERFORMANCE_FIELD_NUMBER;
    public static final int LICENSOR_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    public static final int NUMBER_FIELD_NUMBER;
    public static final int ORIGINAL_AUDIO_FIELD_NUMBER;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POPULARITY_FIELD_NUMBER;
    public static final int PREVIEW_FIELD_NUMBER;
    public static final int RESTRICTION_FIELD_NUMBER;
    public static final int SALE_PERIOD_FIELD_NUMBER;
    public static final int TAGS_FIELD_NUMBER;
    public static final int VERSION_TITLE_FIELD_NUMBER;

    static {
       Metadata$Track track = new Metadata$Track();
       Metadata$Track.DEFAULT_INSTANCE = track;
       c.registerDefaultInstance(Metadata$Track.class, track);
    }
    private void Metadata$Track(){
       super();
       this.gid_ = i80.b;
       this.name_ = "";
       this.artist_ = c.emptyProtobufList();
       this.externalId_ = c.emptyProtobufList();
       this.restriction_ = c.emptyProtobufList();
       this.file_ = c.emptyProtobufList();
       this.alternative_ = c.emptyProtobufList();
       this.salePeriod_ = c.emptyProtobufList();
       this.preview_ = c.emptyProtobufList();
       this.tags_ = c.emptyProtobufList();
       this.availability_ = c.emptyProtobufList();
       this.languageOfPerformance_ = c.emptyProtobufList();
       this.contentRating_ = c.emptyProtobufList();
       this.originalTitle_ = "";
       this.versionTitle_ = "";
       this.artistWithRole_ = c.emptyProtobufList();
    }
    public static Metadata$Track e(){
       return Metadata$Track.DEFAULT_INSTANCE;
    }
    public static Metadata$Track i(){
       return Metadata$Track.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Track.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 14;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[37];
             objArray[0] = "bitField0_";
             objArray[b] = "gid_";
             objArray[2] = "name_";
             objArray[3] = "album_";
             objArray[4] = "artist_";
             objArray[5] = Metadata$Artist.class;
             objArray[6] = "number_";
             objArray[7] = "discNumber_";
             objArray[8] = "duration_";
             objArray[9] = "popularity_";
             objArray[10] = "explicit_";
             objArray[11] = "externalId_";
             objArray[12] = Metadata$ExternalId.class;
             objArray[13] = "restriction_";
             objArray[i] = Metadata$Restriction.class;
             objArray[15] = "file_";
             objArray[16] = Metadata$AudioFile.class;
             objArray[17] = "alternative_";
             objArray[18] = Metadata$Track.class;
             objArray[19] = "salePeriod_";
             objArray[20] = Metadata$SalePeriod.class;
             objArray[21] = "preview_";
             objArray[22] = Metadata$AudioFile.class;
             objArray[23] = "tags_";
             objArray[24] = "earliestLiveTimestamp_";
             objArray[25] = "hasLyrics_";
             objArray[26] = "availability_";
             objArray[27] = Metadata$Availability.class;
             objArray[28] = "licensor_";
             objArray[29] = "languageOfPerformance_";
             objArray[30] = "originalAudio_";
             objArray[31] = "contentRating_";
             objArray[32] = Metadata$ContentRating.class;
             objArray[33] = "originalTitle_";
             objArray[34] = "versionTitle_";
             objArray[35] = "artistWithRole_";
             objArray[36] = Metadata$ArtistWithRole.class;
             return c.newMessageInfo(Metadata$Track.DEFAULT_INSTANCE, "\x01\x1a\xff\x02\xff\x02\x01\x01 \x1a\xff\x02\xff\x02\f\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x1b\x05\x10\x02\x03\x06\x10\x02\x04\x07\x10\x02\x05\b\x10\x02\x06\t\x10\x02\x07\n\x1b\x0b\x1b\f\x1b\r\x1b\x0e\x1b\x0f\x1b\x10\x1a\x11\x10\x02\b\x12\x10\x02\t\x13\x1b\x15\x10\x02\n\x16\x1a\x18\x10\x02\x0b\x19\x1b\x1b\x10\x02\f\x1c\x10\x02\r \x1b", objArray);
           case 3:
             return new Metadata$Track();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Track.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Track.PARSER) == null) {
                _monitor_enter(Metadata$Track.class);
                if ((pARSER = Metadata$Track.PARSER) == null) {
                   pARSER = new ii2(Metadata$Track.DEFAULT_INSTANCE);
                   Metadata$Track.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Track.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Metadata$Album f(){
       Metadata$Track talbum_;
       if ((talbum_ = this.album_) == null) {
          talbum_ = Metadata$Album.h();
       }
       return talbum_;
    }
    public final bc3 g(){
       return this.alternative_;
    }
    public final String getName(){
       return this.name_;
    }
    public final bc3 h(){
       return this.artist_;
    }
    public final boolean j(){
       return this.explicit_;
    }
    public final bc3 k(){
       return this.preview_;
    }
    public final bc3 l(){
       return this.restriction_;
    }
    public final boolean m(){
       boolean b = ((this.bitField0_ & 0x0080))? true: false;
       return b;
    }
}
