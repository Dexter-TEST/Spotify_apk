package com.spotify.metadata.proto.Metadata$Artist;
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
import p.h40;
import p.c40;
import com.spotify.metadata.proto.Metadata$TopTracks;
import com.spotify.metadata.proto.Metadata$AlbumGroup;
import com.spotify.metadata.proto.Metadata$ExternalId;
import com.spotify.metadata.proto.Metadata$Image;
import com.spotify.metadata.proto.Metadata$Biography;
import com.spotify.metadata.proto.Metadata$ActivityPeriod;
import com.spotify.metadata.proto.Metadata$Restriction;
import com.spotify.metadata.proto.Metadata$SalePeriod;
import com.spotify.metadata.proto.Metadata$Availability;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.metadata.proto.Metadata$ImageGroup;

public final class Metadata$Artist extends c implements u74	// class@000a63 from classes.dex
{
    private bc3 activityPeriod_;
    private bc3 albumGroup_;
    private bc3 appearsOnGroup_;
    private bc3 availability_;
    private bc3 biography_;
    private int bitField0_;
    private bc3 compilationGroup_;
    private bc3 externalId_;
    private bc3 genre_;
    private i80 gid_;
    private boolean isPortraitAlbumCover_;
    private String name_;
    private int popularity_;
    private Metadata$ImageGroup portraitGroup_;
    private bc3 portrait_;
    private bc3 related_;
    private bc3 restriction_;
    private bc3 salePeriod_;
    private bc3 singleGroup_;
    private bc3 topTrack_;
    public static final int ACTIVITY_PERIOD_FIELD_NUMBER = 13;
    public static final int ALBUM_GROUP_FIELD_NUMBER = 5;
    public static final int APPEARS_ON_GROUP_FIELD_NUMBER = 8;
    public static final int AVAILABILITY_FIELD_NUMBER = 20;
    public static final int BIOGRAPHY_FIELD_NUMBER = 12;
    public static final int COMPILATION_GROUP_FIELD_NUMBER = 7;
    private static final Metadata$Artist DEFAULT_INSTANCE;
    public static final int EXTERNAL_ID_FIELD_NUMBER;
    public static final int GENRE_FIELD_NUMBER;
    public static final int GID_FIELD_NUMBER;
    public static final int IS_PORTRAIT_ALBUM_COVER_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POPULARITY_FIELD_NUMBER;
    public static final int PORTRAIT_FIELD_NUMBER;
    public static final int PORTRAIT_GROUP_FIELD_NUMBER;
    public static final int RELATED_FIELD_NUMBER;
    public static final int RESTRICTION_FIELD_NUMBER;
    public static final int SALE_PERIOD_FIELD_NUMBER;
    public static final int SINGLE_GROUP_FIELD_NUMBER;
    public static final int TOP_TRACK_FIELD_NUMBER;

    static {
       Metadata$Artist uArtist = new Metadata$Artist();
       Metadata$Artist.DEFAULT_INSTANCE = uArtist;
       c.registerDefaultInstance(Metadata$Artist.class, uArtist);
    }
    private void Metadata$Artist(){
       super();
       this.gid_ = i80.b;
       this.name_ = "";
       this.topTrack_ = c.emptyProtobufList();
       this.albumGroup_ = c.emptyProtobufList();
       this.singleGroup_ = c.emptyProtobufList();
       this.compilationGroup_ = c.emptyProtobufList();
       this.appearsOnGroup_ = c.emptyProtobufList();
       this.genre_ = c.emptyProtobufList();
       this.externalId_ = c.emptyProtobufList();
       this.portrait_ = c.emptyProtobufList();
       this.biography_ = c.emptyProtobufList();
       this.activityPeriod_ = c.emptyProtobufList();
       this.restriction_ = c.emptyProtobufList();
       this.related_ = c.emptyProtobufList();
       this.salePeriod_ = c.emptyProtobufList();
       this.availability_ = c.emptyProtobufList();
    }
    public static Metadata$Artist e(){
       return Metadata$Artist.DEFAULT_INSTANCE;
    }
    public static Metadata$Artist f(){
       return Metadata$Artist.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Artist.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[33];
             objArray[0] = "bitField0_";
             objArray[b] = "gid_";
             objArray[2] = "name_";
             objArray[3] = "popularity_";
             objArray[4] = "topTrack_";
             objArray[5] = Metadata$TopTracks.class;
             objArray[6] = "albumGroup_";
             objArray[7] = Metadata$AlbumGroup.class;
             objArray[8] = "singleGroup_";
             objArray[9] = Metadata$AlbumGroup.class;
             objArray[10] = "compilationGroup_";
             objArray[11] = Metadata$AlbumGroup.class;
             objArray[12] = "appearsOnGroup_";
             objArray[13] = Metadata$AlbumGroup.class;
             objArray[14] = "genre_";
             objArray[15] = "externalId_";
             objArray[16] = Metadata$ExternalId.class;
             objArray[17] = "portrait_";
             objArray[18] = Metadata$Image.class;
             objArray[19] = "biography_";
             objArray[20] = Metadata$Biography.class;
             objArray[21] = "activityPeriod_";
             objArray[22] = Metadata$ActivityPeriod.class;
             objArray[23] = "restriction_";
             objArray[24] = Metadata$Restriction.class;
             objArray[25] = "related_";
             objArray[26] = Metadata$Artist.class;
             objArray[27] = "isPortraitAlbumCover_";
             objArray[28] = "portraitGroup_";
             objArray[29] = "salePeriod_";
             objArray[30] = Metadata$SalePeriod.class;
             objArray[31] = "availability_";
             objArray[32] = Metadata$Availability.class;
             return c.newMessageInfo(Metadata$Artist.DEFAULT_INSTANCE, "\x01\x13\xff\x02\xff\x02\x01\x01\x14\x13\xff\x02\xff\x02\x0e\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x1b\x05\x1b\x06\x1b\x07\x1b\b\x1b\t\x1a\n\x1b\x0b\x1b\f\x1b\r\x1b\x0e\x1b\x0f\x1b\x10\x10\x02\x03\x11\x10\x02\x04\x12\x1b\x14\x1b", objArray);
           case 3:
             return new Metadata$Artist();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$Artist.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Artist.PARSER) == null) {
                _monitor_enter(Metadata$Artist.class);
                if ((pARSER = Metadata$Artist.PARSER) == null) {
                   pARSER = new ii2(Metadata$Artist.DEFAULT_INSTANCE);
                   Metadata$Artist.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Artist.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final i80 g(){
       return this.gid_;
    }
    public final String getName(){
       return this.name_;
    }
    public final Metadata$ImageGroup h(){
       Metadata$Artist tportraitGro;
       if ((tportraitGro = this.portraitGroup_) == null) {
          tportraitGro = Metadata$ImageGroup.f();
       }
       return tportraitGro;
    }
    public final boolean i(){
       boolean b = ((this.bitField0_ & 0x02))? true: false;
       return b;
    }
    public final boolean j(){
       boolean b = ((this.bitField0_ & 0x10))? true: false;
       return b;
    }
}
