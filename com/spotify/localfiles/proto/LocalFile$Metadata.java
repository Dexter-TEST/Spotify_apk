package com.spotify.localfiles.proto.LocalFile$Metadata;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.spotify.localfiles.proto.c;
import com.spotify.localfiles.proto.b;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LocalFile$Metadata extends c implements u74	// class@000984 from classes.dex
{
    private String album_;
    private String artist_;
    private int duration_;
    private int imageState_;
    private String title_;
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTIST_FIELD_NUMBER = 3;
    private static final LocalFile$Metadata DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER;
    public static final int IMAGE_STATE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       LocalFile$Metadata metadata = new LocalFile$Metadata();
       LocalFile$Metadata.DEFAULT_INSTANCE = metadata;
       c.registerDefaultInstance(LocalFile$Metadata.class, metadata);
    }
    private void LocalFile$Metadata(){
       super();
       this.title_ = "";
       this.album_ = "";
       this.artist_ = "";
    }
    public static LocalFile$Metadata e(){
       return LocalFile$Metadata.DEFAULT_INSTANCE;
    }
    public static void f(LocalFile$Metadata p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.title_ = p1;
    }
    public static void g(LocalFile$Metadata p0,int p1){
       p0.duration_ = p1;
    }
    public static void h(LocalFile$Metadata p0,c p1){
       p0.getClass();
       p0.imageState_ = p1.getNumber();
    }
    public static void i(LocalFile$Metadata p0,String p1){
       p0.getClass();
       p0.album_ = p1;
    }
    public static void j(LocalFile$Metadata p0,String p1){
       p0.getClass();
       p0.artist_ = p1;
    }
    public static b k(){
       return LocalFile$Metadata.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LocalFile$Metadata.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"title_","album_","artist_","duration_","imageState_"};
             return c.newMessageInfo(LocalFile$Metadata.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x04\x05\f", objArray);
           case 3:
             return new LocalFile$Metadata();
           case 4:
             return new b();
           case 5:
             return LocalFile$Metadata.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LocalFile$Metadata.PARSER) == null) {
                _monitor_enter(LocalFile$Metadata.class);
                if ((pARSER = LocalFile$Metadata.PARSER) == null) {
                   pARSER = new ii2(LocalFile$Metadata.DEFAULT_INSTANCE);
                   LocalFile$Metadata.PARSER = pARSER;
                }
                _monitor_exit(LocalFile$Metadata.class);
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
