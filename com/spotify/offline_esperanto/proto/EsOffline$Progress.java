package com.spotify.offline_esperanto.proto.EsOffline$Progress;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOffline$Progress extends c implements u74	// class@000ac1 from classes.dex
{
    private long downloadSpeed_;
    private long downloadedBytes_;
    private long downloadedTracks_;
    private boolean downloading_;
    private float percentComplete_;
    private long queuedBytes_;
    private long queuedTracks_;
    private long secondsLeft_;
    private long totalBytes_;
    private long totalTracks_;
    private static final EsOffline$Progress DEFAULT_INSTANCE;
    public static final int DOWNLOADED_BYTES_FIELD_NUMBER;
    public static final int DOWNLOADED_TRACKS_FIELD_NUMBER;
    public static final int DOWNLOADING_FIELD_NUMBER;
    public static final int DOWNLOAD_SPEED_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PERCENT_COMPLETE_FIELD_NUMBER;
    public static final int QUEUED_BYTES_FIELD_NUMBER;
    public static final int QUEUED_TRACKS_FIELD_NUMBER;
    public static final int SECONDS_LEFT_FIELD_NUMBER;
    public static final int TOTAL_BYTES_FIELD_NUMBER;
    public static final int TOTAL_TRACKS_FIELD_NUMBER;

    static {
       EsOffline$Progress progress = new EsOffline$Progress();
       EsOffline$Progress.DEFAULT_INSTANCE = progress;
       c.registerDefaultInstance(EsOffline$Progress.class, progress);
    }
    private void EsOffline$Progress(){
       super();
    }
    public static EsOffline$Progress e(){
       return EsOffline$Progress.DEFAULT_INSTANCE;
    }
    public static EsOffline$Progress f(){
       return EsOffline$Progress.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOffline$Progress.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[10];
             objArray[0] = "queuedTracks_";
             objArray[b] = "queuedBytes_";
             objArray[2] = "downloadedTracks_";
             objArray[3] = "downloadedBytes_";
             objArray[4] = "totalTracks_";
             objArray[5] = "totalBytes_";
             objArray[6] = "downloading_";
             objArray[7] = "downloadSpeed_";
             objArray[8] = "percentComplete_";
             objArray[9] = "secondsLeft_";
             return c.newMessageInfo(EsOffline$Progress.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\n\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x03\x02\x04\x02\x05\x02\x06\x02\x07\x07\b\x02\t\x01\n\x02", objArray);
           case 3:
             return new EsOffline$Progress();
           case 4:
             return new sq1(23);
           case 5:
             return EsOffline$Progress.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$Progress.PARSER) == null) {
                _monitor_enter(EsOffline$Progress.class);
                if ((pARSER = EsOffline$Progress.PARSER) == null) {
                   pARSER = new ii2(EsOffline$Progress.DEFAULT_INSTANCE);
                   EsOffline$Progress.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$Progress.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final long g(){
       return this.downloadSpeed_;
    }
    public final long h(){
       return this.downloadedBytes_;
    }
    public final long i(){
       return this.downloadedTracks_;
    }
    public final boolean j(){
       return this.downloading_;
    }
    public final float k(){
       return this.percentComplete_;
    }
    public final long l(){
       return this.queuedBytes_;
    }
    public final long m(){
       return this.queuedTracks_;
    }
    public final long n(){
       return this.secondsLeft_;
    }
    public final long o(){
       return this.totalBytes_;
    }
    public final long p(){
       return this.totalTracks_;
    }
}
