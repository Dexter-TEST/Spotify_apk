package com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.bc3;
import p.ac3;
import com.spotify.playlist4.proto.Playlist4ApiProto$Delta;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.og5;
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

public final class Playlist4ApiProto$ListChanges extends c implements u74	// class@000b98 from classes.dex
{
    private i80 baseRevision_;
    private int bitField0_;
    private bc3 deltas_;
    private byte memoizedIsInitialized;
    private ac3 nonces_;
    private boolean wantResultingRevisions_;
    private boolean wantSyncResult_;
    public static final int BASE_REVISION_FIELD_NUMBER = 1;
    private static final Playlist4ApiProto$ListChanges DEFAULT_INSTANCE;
    public static final int DELTAS_FIELD_NUMBER;
    public static final int NONCES_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int WANT_RESULTING_REVISIONS_FIELD_NUMBER;
    public static final int WANT_SYNC_RESULT_FIELD_NUMBER;

    static {
       Playlist4ApiProto$ListChanges listChanges = new Playlist4ApiProto$ListChanges();
       Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE = listChanges;
       c.registerDefaultInstance(Playlist4ApiProto$ListChanges.class, listChanges);
    }
    private void Playlist4ApiProto$ListChanges(){
       super();
       this.memoizedIsInitialized = 2;
       this.baseRevision_ = i80.b;
       this.deltas_ = c.emptyProtobufList();
       this.nonces_ = c.emptyLongList();
    }
    public static Playlist4ApiProto$ListChanges e(){
       return Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$ListChanges p0,Playlist4ApiProto$Delta p1){
       p0.getClass();
       p1.getClass();
       Playlist4ApiProto$ListChanges deltas_ = p0.deltas_;
       if (deltas_.a == null) {
          p0.deltas_ = c.mutableCopy(deltas_);
       }
       p0.deltas_.add(p1);
       return;
    }
    public static og5 g(){
       return Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(this.memoizedIsInitialized);
           case 1:
             if (p1 == null) {
                i = 0;
             }
             this.memoizedIsInitialized = (byte)i;
             return null;
             break;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","baseRevision_","deltas_",Playlist4ApiProto$Delta.class,"wantResultingRevisions_","wantSyncResult_","nonces_"};
             return c.newMessageInfo(Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE, "\x01\x05\xff\x02\xff\x02\x01\x01\x06\x05\xff\x02\xff\x02\x02\x01\x01\x10\x02\xff\x02\xff\x02\x02\x04\x02\x03\x10\x02\x01\x04\x10\x02\x02\x06\x14", objArray);
           case 3:
             return new Playlist4ApiProto$ListChanges();
           case 4:
             return new og5();
           case 5:
             return Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$ListChanges.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$ListChanges.class);
                if ((pARSER = Playlist4ApiProto$ListChanges.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$ListChanges.DEFAULT_INSTANCE);
                   Playlist4ApiProto$ListChanges.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$ListChanges.class);
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
