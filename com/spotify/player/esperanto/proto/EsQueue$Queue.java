package com.spotify.player.esperanto.proto.EsQueue$Queue;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.aq1;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;

public final class EsQueue$Queue extends c implements u74	// class@000b06 from classes.dex
{
    private bc3 nextTracks_;
    private bc3 prevTracks_;
    private long queueRevision_;
    private EsProvidedTrack$ProvidedTrack track_;
    private static final EsQueue$Queue DEFAULT_INSTANCE;
    public static final int NEXT_TRACKS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PREV_TRACKS_FIELD_NUMBER;
    public static final int QUEUE_REVISION_FIELD_NUMBER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       EsQueue$Queue queue = new EsQueue$Queue();
       EsQueue$Queue.DEFAULT_INSTANCE = queue;
       c.registerDefaultInstance(EsQueue$Queue.class, queue);
    }
    private void EsQueue$Queue(){
       super();
       this.nextTracks_ = c.emptyProtobufList();
       this.prevTracks_ = c.emptyProtobufList();
    }
    public static EsQueue$Queue e(){
       return EsQueue$Queue.DEFAULT_INSTANCE;
    }
    public static EsQueue$Queue m(byte[] p0){
       return c.parseFrom(EsQueue$Queue.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsQueue$Queue.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"queueRevision_","track_","nextTracks_",EsProvidedTrack$ProvidedTrack.class,"prevTracks_",EsProvidedTrack$ProvidedTrack.class};
             return c.newMessageInfo(EsQueue$Queue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x03\x02\t\x03\x1b\x04\x1b", objArray);
           case 3:
             return new EsQueue$Queue();
           case 4:
             return new fq1(p2);
           case 5:
             return EsQueue$Queue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsQueue$Queue.PARSER) == null) {
                _monitor_enter(EsQueue$Queue.class);
                if ((pARSER = EsQueue$Queue.PARSER) == null) {
                   pARSER = new ii2(EsQueue$Queue.DEFAULT_INSTANCE);
                   EsQueue$Queue.PARSER = pARSER;
                }
                _monitor_exit(EsQueue$Queue.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.nextTracks_.size();
    }
    public final bc3 g(){
       return this.nextTracks_;
    }
    public final int h(){
       return this.prevTracks_.size();
    }
    public final bc3 i(){
       return this.prevTracks_;
    }
    public final long j(){
       return this.queueRevision_;
    }
    public final EsProvidedTrack$ProvidedTrack k(){
       EsQueue$Queue ttrack_;
       if ((ttrack_ = this.track_) == null) {
          ttrack_ = EsProvidedTrack$ProvidedTrack.g();
       }
       return ttrack_;
    }
    public final boolean l(){
       boolean b = (this.track_ != null)? true: false;
       return b;
    }
}
