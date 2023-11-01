package com.spotify.lyrics.endpointretrofit.proto.LyricsResponse;
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
import com.spotify.lyrics.endpointretrofit.proto.d;
import com.spotify.lyrics.endpointretrofit.proto.LyricsResponse$LyricsLine;
import com.spotify.lyrics.endpointretrofit.proto.LyricsResponse$Alternative;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.zy3;
import p.r74;
import com.google.protobuf.b;

public final class LyricsResponse extends c implements u74	// class@0009ee from classes.dex
{
    private bc3 alternatives_;
    private boolean isRtlLanguage_;
    private String language_;
    private bc3 lines_;
    private String providerDisplayName_;
    private String providerLyricsId_;
    private String provider_;
    private boolean showUpsell_;
    private String syncLyricsUri_;
    private int syncType_;
    public static final int ALTERNATIVES_FIELD_NUMBER = 9;
    private static final LyricsResponse DEFAULT_INSTANCE;
    public static final int IS_RTL_LANGUAGE_FIELD_NUMBER;
    public static final int LANGUAGE_FIELD_NUMBER;
    public static final int LINES_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROVIDER_DISPLAY_NAME_FIELD_NUMBER;
    public static final int PROVIDER_FIELD_NUMBER;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER;
    public static final int SHOW_UPSELL_FIELD_NUMBER;
    public static final int SYNC_LYRICS_URI_FIELD_NUMBER;
    public static final int SYNC_TYPE_FIELD_NUMBER;

    static {
       LyricsResponse lyricsRespon = new LyricsResponse();
       LyricsResponse.DEFAULT_INSTANCE = lyricsRespon;
       c.registerDefaultInstance(LyricsResponse.class, lyricsRespon);
    }
    private void LyricsResponse(){
       super();
       this.lines_ = c.emptyProtobufList();
       this.provider_ = "";
       this.providerLyricsId_ = "";
       this.providerDisplayName_ = "";
       this.syncLyricsUri_ = "";
       this.alternatives_ = c.emptyProtobufList();
       this.language_ = "";
    }
    public static LyricsResponse e(){
       return LyricsResponse.DEFAULT_INSTANCE;
    }
    public static LyricsResponse g(){
       return LyricsResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LyricsResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[12];
             objArray[0] = "syncType_";
             objArray[b] = "lines_";
             objArray[2] = LyricsResponse$LyricsLine.class;
             objArray[3] = "provider_";
             objArray[4] = "providerLyricsId_";
             objArray[5] = "providerDisplayName_";
             objArray[6] = "syncLyricsUri_";
             objArray[7] = "alternatives_";
             objArray[8] = LyricsResponse$Alternative.class;
             objArray[9] = "language_";
             objArray[10] = "isRtlLanguage_";
             objArray[11] = "showUpsell_";
             return c.newMessageInfo(LyricsResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\r\n\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\f\x02\x1b\x03\x02\x02\x04\x02\x02\x05\x02\x02\x07\x02\x02\t\x1b\n\x02\x02\x0b\x07\r\x07", objArray);
           case 3:
             return new LyricsResponse();
           case 4:
             return new d();
           case 5:
             return LyricsResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LyricsResponse.PARSER) == null) {
                _monitor_enter(LyricsResponse.class);
                if ((pARSER = LyricsResponse.PARSER) == null) {
                   pARSER = new ii2(LyricsResponse.DEFAULT_INSTANCE);
                   LyricsResponse.PARSER = pARSER;
                }
                _monitor_exit(LyricsResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.alternatives_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final boolean h(){
       return this.isRtlLanguage_;
    }
    public final String i(){
       return this.language_;
    }
    public final bc3 j(){
       return this.lines_;
    }
    public final String k(){
       return this.providerDisplayName_;
    }
    public final String l(){
       return this.providerLyricsId_;
    }
    public final boolean m(){
       return this.showUpsell_;
    }
    public final zy3 n(){
       LyricsResponse tsyncType_;
       zy3 ozy3;
       if ((tsyncType_ = this.syncType_) != null) {
          if (tsyncType_ != 1) {
             ozy3 = (tsyncType_ != 2)? null: zy3.t;
          }else {
             ozy3 = zy3.c;
          }
       }else {
          ozy3 = zy3.b;
       }
       if (ozy3 == null) {
          ozy3 = zy3.v;
       }
       return ozy3;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
