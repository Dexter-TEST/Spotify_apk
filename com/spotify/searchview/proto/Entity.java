package com.spotify.searchview.proto.Entity;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.np1;
import com.spotify.searchview.proto.Artist;
import com.spotify.searchview.proto.Track;
import com.spotify.searchview.proto.Album;
import com.spotify.searchview.proto.Playlist;
import com.spotify.searchview.proto.Genre;
import com.spotify.searchview.proto.AudioShow;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Profile;
import com.spotify.searchview.proto.Audiobook;
import com.spotify.searchview.proto.AutocompleteQuery;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Entity extends c implements u74	// class@000c0b from classes.dex
{
    private int entityCase_;
    private Object entity_;
    private String imageUri_;
    private String name_;
    private String serpMetadata_;
    private String uri_;
    public static final int ALBUM_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int AUDIOBOOK_FIELD_NUMBER = 13;
    public static final int AUDIO_EPISODE_FIELD_NUMBER = 10;
    public static final int AUDIO_SHOW_FIELD_NUMBER = 9;
    public static final int AUTOCOMPLETE_FIELD_NUMBER = 2046;
    private static final Entity DEFAULT_INSTANCE;
    public static final int GENRE_FIELD_NUMBER;
    public static final int IMAGE_URI_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYLIST_FIELD_NUMBER;
    public static final int PROFILE_FIELD_NUMBER;
    public static final int SERP_METADATA_FIELD_NUMBER;
    public static final int TRACK_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       Entity uEntity = new Entity();
       Entity.DEFAULT_INSTANCE = uEntity;
       c.registerDefaultInstance(Entity.class, uEntity);
    }
    private void Entity(){
       super();
       this.entityCase_ = 0;
       this.uri_ = "";
       this.name_ = "";
       this.imageUri_ = "";
       this.serpMetadata_ = "";
    }
    public static Entity e(){
       return Entity.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Entity.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[16];
             objArray[0] = "entity_";
             objArray[b] = "entityCase_";
             objArray[2] = "uri_";
             objArray[3] = "name_";
             objArray[4] = "imageUri_";
             objArray[5] = Artist.class;
             objArray[6] = Track.class;
             objArray[7] = Album.class;
             objArray[8] = Playlist.class;
             objArray[9] = Genre.class;
             objArray[10] = AudioShow.class;
             objArray[11] = AudioEpisode.class;
             objArray[12] = Profile.class;
             objArray[13] = Audiobook.class;
             objArray[14] = AutocompleteQuery.class;
             objArray[15] = "serpMetadata_";
             return c.newMessageInfo(Entity.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0e\x01\xff\x02\xff\x02\x01\x07\x02\x0e\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04<\xff\x02\xff\x02\x05<\xff\x02\xff\x02\x06<\xff\x02\xff\x02\x07<\xff\x02\xff\x02\b<\xff\x02\xff\x02\t<\xff\x02\xff\x02\n<\xff\x02\xff\x02\x0b<\xff\x02\xff\x02\r<\xff\x02\xff\x02\x07\x02<\xff\x02\xff\x02\x07\x02\x02\x02", objArray);
           case 3:
             return new Entity();
           case 4:
             return new fq1(p2);
           case 5:
             return Entity.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Entity.PARSER) == null) {
                _monitor_enter(Entity.class);
                if ((pARSER = Entity.PARSER) == null) {
                   pARSER = new ii2(Entity.DEFAULT_INSTANCE);
                   Entity.PARSER = pARSER;
                }
                _monitor_exit(Entity.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Album f(){
       if (this.entityCase_ == 6) {
          return this.entity_;
       }
       return Album.g();
    }
    public final AudioEpisode g(){
       if (this.entityCase_ == 10) {
          return this.entity_;
       }
       return AudioEpisode.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String getName(){
       return this.name_;
    }
    public final AudioShow h(){
       if (this.entityCase_ == 9) {
          return this.entity_;
       }
       return AudioShow.f();
    }
    public final String i(){
       return this.imageUri_;
    }
    public final Track j(){
       if (this.entityCase_ == 5) {
          return this.entity_;
       }
       return Track.f();
    }
    public final String k(){
       return this.uri_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
