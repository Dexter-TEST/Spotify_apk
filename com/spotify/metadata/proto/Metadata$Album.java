package com.spotify.metadata.proto.Metadata$Album;
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
import p.o30;
import com.spotify.metadata.proto.Metadata$Artist;
import p.d84;
import com.spotify.metadata.proto.Metadata$Image;
import com.spotify.metadata.proto.Metadata$ExternalId;
import com.spotify.metadata.proto.Metadata$Disc;
import com.spotify.metadata.proto.Metadata$Copyright;
import com.spotify.metadata.proto.Metadata$Restriction;
import com.spotify.metadata.proto.Metadata$SalePeriod;
import com.spotify.metadata.proto.Metadata$Availability;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.metadata.proto.Metadata$ImageGroup;

public final class Metadata$Album extends c implements u74	// class@000a61 from classes.dex
{
    private bc3 artist_;
    private bc3 availability_;
    private int bitField0_;
    private bc3 copyright_;
    private Metadata$ImageGroup coverGroup_;
    private bc3 cover_;
    private Metadata$Date date_;
    private bc3 disc_;
    private bc3 externalId_;
    private bc3 genre_;
    private i80 gid_;
    private String label_;
    private String name_;
    private String originalTitle_;
    private int popularity_;
    private bc3 related_;
    private bc3 restriction_;
    private bc3 review_;
    private bc3 salePeriod_;
    private String typeStr_;
    private int type_;
    private String versionTitle_;
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int AVAILABILITY_FIELD_NUMBER = 23;
    public static final int COPYRIGHT_FIELD_NUMBER = 13;
    public static final int COVER_FIELD_NUMBER = 9;
    public static final int COVER_GROUP_FIELD_NUMBER = 17;
    public static final int DATE_FIELD_NUMBER = 6;
    private static final Metadata$Album DEFAULT_INSTANCE;
    public static final int DISC_FIELD_NUMBER;
    public static final int EXTERNAL_ID_FIELD_NUMBER;
    public static final int GENRE_FIELD_NUMBER;
    public static final int GID_FIELD_NUMBER;
    public static final int LABEL_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POPULARITY_FIELD_NUMBER;
    public static final int RELATED_FIELD_NUMBER;
    public static final int RESTRICTION_FIELD_NUMBER;
    public static final int REVIEW_FIELD_NUMBER;
    public static final int SALE_PERIOD_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int TYPE_STR_FIELD_NUMBER;
    public static final int VERSION_TITLE_FIELD_NUMBER;

    static {
       Metadata$Album uAlbum = new Metadata$Album();
       Metadata$Album.DEFAULT_INSTANCE = uAlbum;
       c.registerDefaultInstance(Metadata$Album.class, uAlbum);
    }
    private void Metadata$Album(){
       super();
       this.gid_ = i80.b;
       this.name_ = "";
       this.artist_ = c.emptyProtobufList();
       this.type_ = 1;
       this.label_ = "";
       this.genre_ = c.emptyProtobufList();
       this.cover_ = c.emptyProtobufList();
       this.externalId_ = c.emptyProtobufList();
       this.disc_ = c.emptyProtobufList();
       this.review_ = c.emptyProtobufList();
       this.copyright_ = c.emptyProtobufList();
       this.restriction_ = c.emptyProtobufList();
       this.related_ = c.emptyProtobufList();
       this.salePeriod_ = c.emptyProtobufList();
       this.originalTitle_ = "";
       this.versionTitle_ = "";
       this.typeStr_ = "";
       this.availability_ = c.emptyProtobufList();
    }
    public static Metadata$Album e(){
       return Metadata$Album.DEFAULT_INSTANCE;
    }
    public static Metadata$Album h(){
       return Metadata$Album.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Album.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[32];
             objArray[0] = "bitField0_";
             objArray[b] = "gid_";
             objArray[2] = "name_";
             objArray[3] = "artist_";
             objArray[4] = Metadata$Artist.class;
             objArray[5] = "type_";
             objArray[6] = d84.a;
             objArray[7] = "label_";
             objArray[8] = "date_";
             objArray[9] = "popularity_";
             objArray[10] = "genre_";
             objArray[11] = "cover_";
             objArray[12] = Metadata$Image.class;
             objArray[13] = "externalId_";
             objArray[14] = Metadata$ExternalId.class;
             objArray[15] = "disc_";
             objArray[16] = Metadata$Disc.class;
             objArray[17] = "review_";
             objArray[18] = "copyright_";
             objArray[19] = Metadata$Copyright.class;
             objArray[20] = "restriction_";
             objArray[21] = Metadata$Restriction.class;
             objArray[22] = "related_";
             objArray[23] = Metadata$Album.class;
             objArray[24] = "salePeriod_";
             objArray[25] = Metadata$SalePeriod.class;
             objArray[26] = "coverGroup_";
             objArray[27] = "originalTitle_";
             objArray[28] = "versionTitle_";
             objArray[29] = "typeStr_";
             objArray[30] = "availability_";
             objArray[31] = Metadata$Availability.class;
             return c.newMessageInfo(Metadata$Album.DEFAULT_INSTANCE, "\x01\x15\xff\x02\xff\x02\x01\x01\x17\x15\xff\x02\xff\x02\x0b\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x1b\x04\x10\x02\x02\x05\x10\x02\x03\x06\x10\x02\x04\x07\x10\x02\x05\b\x1a\t\x1b\n\x1b\x0b\x1b\f\x1a\r\x1b\x0e\x1b\x0f\x1b\x10\x1b\x11\x10\x02\x06\x12\x10\x02\x07\x13\x10\x02\b\x14\x10\x02\t\x17\x1b", objArray);
           case 3:
             return new Metadata$Album();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$Album.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Album.PARSER) == null) {
                _monitor_enter(Metadata$Album.class);
                if ((pARSER = Metadata$Album.PARSER) == null) {
                   pARSER = new ii2(Metadata$Album.DEFAULT_INSTANCE);
                   Metadata$Album.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Album.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.artist_;
    }
    public final Metadata$ImageGroup g(){
       Metadata$Album tcoverGroup_;
       if ((tcoverGroup_ = this.coverGroup_) == null) {
          tcoverGroup_ = Metadata$ImageGroup.f();
       }
       return tcoverGroup_;
    }
    public final String getName(){
       return this.name_;
    }
    public final i80 i(){
       return this.gid_;
    }
    public final boolean j(){
       boolean b = ((this.bitField0_ & 0x40))? true: false;
       return b;
    }
    public final boolean k(){
       boolean b = ((this.bitField0_ & 0x02))? true: false;
       return b;
    }
}
