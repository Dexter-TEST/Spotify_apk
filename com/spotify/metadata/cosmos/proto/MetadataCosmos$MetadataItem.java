package com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Integer;
import p.r75;
import p.c94;
import com.google.protobuf.b;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$Episode;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class MetadataCosmos$MetadataItem extends c implements u74	// class@000a5d from classes.dex
{
    private int bitField0_;
    private int itemCase_;
    private Object item_;
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final MetadataCosmos$MetadataItem DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SHOW_FIELD_NUMBER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       MetadataCosmos$MetadataItem metadataItem = new MetadataCosmos$MetadataItem();
       MetadataCosmos$MetadataItem.DEFAULT_INSTANCE = metadataItem;
       c.registerDefaultInstance(MetadataCosmos$MetadataItem.class, metadataItem);
    }
    private void MetadataCosmos$MetadataItem(){
       super();
       this.itemCase_ = 0;
    }
    public static void e(MetadataCosmos$MetadataItem p0){
       p0.itemCase_ = 1;
       p0.item_ = Integer.valueOf(400);
    }
    public static MetadataCosmos$MetadataItem f(){
       return MetadataCosmos$MetadataItem.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return MetadataCosmos$MetadataItem.DEFAULT_INSTANCE.getParserForType();
    }
    public static c94 q(){
       return MetadataCosmos$MetadataItem.DEFAULT_INSTANCE.createBuilder();
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
             Object[] objArray = new Object[]{"item_","itemCase_","bitField0_",Metadata$Artist.class,Metadata$Album.class,Metadata$Track.class,Metadata$Show.class,Metadata$Episode.class};
             return c.newMessageInfo(MetadataCosmos$MetadataItem.DEFAULT_INSTANCE, "\x01\x06\x01\x01\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\xff\x02\xff\x02\x03\x10\x02\xff\x02\xff\x02\x04\x10\x02\xff\x02\xff\x02\x05\x10\x02\xff\x02\xff\x02\x06\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new MetadataCosmos$MetadataItem();
           case 4:
             return new c94();
           case 5:
             return MetadataCosmos$MetadataItem.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MetadataCosmos$MetadataItem.PARSER) == null) {
                _monitor_enter(MetadataCosmos$MetadataItem.class);
                if ((pARSER = MetadataCosmos$MetadataItem.PARSER) == null) {
                   pARSER = new ii2(MetadataCosmos$MetadataItem.DEFAULT_INSTANCE);
                   MetadataCosmos$MetadataItem.PARSER = pARSER;
                }
                _monitor_exit(MetadataCosmos$MetadataItem.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Metadata$Album g(){
       if (this.itemCase_ == 3) {
          return this.item_;
       }
       return Metadata$Album.h();
    }
    public final Metadata$Artist h(){
       if (this.itemCase_ == 2) {
          return this.item_;
       }
       return Metadata$Artist.f();
    }
    public final Metadata$Episode i(){
       if (this.itemCase_ == 6) {
          return this.item_;
       }
       return Metadata$Episode.i();
    }
    public final Metadata$Show j(){
       if (this.itemCase_ == 5) {
          return this.item_;
       }
       return Metadata$Show.g();
    }
    public final Metadata$Track k(){
       if (this.itemCase_ == 4) {
          return this.item_;
       }
       return Metadata$Track.i();
    }
    public final boolean l(){
       boolean b = (this.itemCase_ == 3)? true: false;
       return b;
    }
    public final boolean m(){
       boolean b = (this.itemCase_ == 2)? true: false;
       return b;
    }
    public final boolean n(){
       boolean b = (this.itemCase_ == 6)? true: false;
       return b;
    }
    public final boolean o(){
       boolean b = (this.itemCase_ == 5)? true: false;
       return b;
    }
    public final boolean p(){
       boolean b = (this.itemCase_ == 4)? true: false;
       return b;
    }
}
