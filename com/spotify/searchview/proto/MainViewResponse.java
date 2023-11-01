package com.spotify.searchview.proto.MainViewResponse;
import p.u74;
import com.google.protobuf.c;
import p.pc;
import java.lang.Class;
import p.bc3;
import p.xb3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.RelatedSearch;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.zb3;
import p.yb3;
import java.util.List;
import com.spotify.searchview.proto.Recommendations;
import p.r74;
import com.google.protobuf.b;

public final class MainViewResponse extends c implements u74	// class@000c0d from classes.dex
{
    private BannerContent bannerContent_;
    private int entityTypesMemoizedSerializedSize;
    private xb3 entityTypes_;
    private bc3 hits_;
    private String nextPageToken_;
    private Recommendations recommendations_;
    private bc3 relatedSearches_;
    public static final int BANNER_CONTENT_FIELD_NUMBER = 5;
    private static final MainViewResponse DEFAULT_INSTANCE;
    public static final int ENTITY_TYPES_FIELD_NUMBER;
    public static final int HITS_FIELD_NUMBER;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RECOMMENDATIONS_FIELD_NUMBER;
    public static final int RELATED_SEARCHES_FIELD_NUMBER;
    private static final yb3 entityTypes_converter_;

    static {
       MainViewResponse.entityTypes_converter_ = new pc(3);
       MainViewResponse mainViewResp = new MainViewResponse();
       MainViewResponse.DEFAULT_INSTANCE = mainViewResp;
       c.registerDefaultInstance(MainViewResponse.class, mainViewResp);
    }
    private void MainViewResponse(){
       super();
       this.hits_ = c.emptyProtobufList();
       this.entityTypes_ = c.emptyIntList();
       this.nextPageToken_ = "";
       this.relatedSearches_ = c.emptyProtobufList();
    }
    public static MainViewResponse e(){
       return MainViewResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return MainViewResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"hits_",Entity.class,"recommendations_","entityTypes_","nextPageToken_","bannerContent_","relatedSearches_",RelatedSearch.class};
             return c.newMessageInfo(MainViewResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x1b\x02\t\x03,\x04\x02\x02\x05\t\x06\x1b", objArray);
           case 3:
             return new MainViewResponse();
           case 4:
             return new q04();
           case 5:
             return MainViewResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MainViewResponse.PARSER) == null) {
                _monitor_enter(MainViewResponse.class);
                if ((pARSER = MainViewResponse.PARSER) == null) {
                   pARSER = new ii2(MainViewResponse.DEFAULT_INSTANCE);
                   MainViewResponse.PARSER = pARSER;
                }
                _monitor_exit(MainViewResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final zb3 f(){
       return new zb3(this.entityTypes_, MainViewResponse.entityTypes_converter_);
    }
    public final Entity g(int p0){
       return this.hits_.get(p0);
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int h(){
       return this.hits_.size();
    }
    public final Recommendations i(){
       MainViewResponse trecommendat;
       if ((trecommendat = this.recommendations_) == null) {
          trecommendat = Recommendations.f();
       }
       return trecommendat;
    }
    public final boolean j(){
       boolean b = (this.recommendations_ != null)? true: false;
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
