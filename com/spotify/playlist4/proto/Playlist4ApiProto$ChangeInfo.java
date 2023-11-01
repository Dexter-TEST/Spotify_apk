package com.spotify.playlist4.proto.Playlist4ApiProto$ChangeInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.playlist4.proto.Playlist4ApiProto$SourceInfo;
import java.lang.Object;
import p.fg5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$ChangeInfo extends c implements u74	// class@000b8f from classes.dex
{
    private boolean admin_;
    private int bitField0_;
    private boolean compressed_;
    private boolean merge_;
    private boolean migration_;
    private boolean redo_;
    private Playlist4ApiProto$SourceInfo source_;
    private int splitId_;
    private long timestamp_;
    private boolean undo_;
    private String user_;
    public static final int ADMIN_FIELD_NUMBER = 3;
    public static final int COMPRESSED_FIELD_NUMBER = 7;
    private static final Playlist4ApiProto$ChangeInfo DEFAULT_INSTANCE;
    public static final int MERGE_FIELD_NUMBER;
    public static final int MIGRATION_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REDO_FIELD_NUMBER;
    public static final int SOURCE_FIELD_NUMBER;
    public static final int SPLIT_ID_FIELD_NUMBER;
    public static final int TIMESTAMP_FIELD_NUMBER;
    public static final int UNDO_FIELD_NUMBER;
    public static final int USER_FIELD_NUMBER;

    static {
       Playlist4ApiProto$ChangeInfo uChangeInfo = new Playlist4ApiProto$ChangeInfo();
       Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE = uChangeInfo;
       c.registerDefaultInstance(Playlist4ApiProto$ChangeInfo.class, uChangeInfo);
    }
    private void Playlist4ApiProto$ChangeInfo(){
       super();
       this.user_ = "";
    }
    public static Playlist4ApiProto$ChangeInfo e(){
       return Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$ChangeInfo p0){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.admin_ = true;
    }
    public static void g(Playlist4ApiProto$ChangeInfo p0,Playlist4ApiProto$SourceInfo p1){
       p0.getClass();
       p1.getClass();
       p0.source_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x0200;
    }
    public static fg5 h(){
       return Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[11];
             objArray[0] = "bitField0_";
             objArray[b] = "user_";
             objArray[2] = "timestamp_";
             objArray[3] = "admin_";
             objArray[4] = "undo_";
             objArray[5] = "redo_";
             objArray[6] = "merge_";
             objArray[7] = "compressed_";
             objArray[8] = "migration_";
             objArray[9] = "splitId_";
             objArray[10] = "source_";
             return c.newMessageInfo(Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE, "\x01\n\xff\x02\xff\x02\x01\x01\n\n\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b\n\x10\x02\t", objArray);
           case 3:
             return new Playlist4ApiProto$ChangeInfo();
           case 4:
             return new fg5();
           case 5:
             return Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$ChangeInfo.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$ChangeInfo.class);
                if ((pARSER = Playlist4ApiProto$ChangeInfo.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$ChangeInfo.DEFAULT_INSTANCE);
                   Playlist4ApiProto$ChangeInfo.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$ChangeInfo.class);
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
