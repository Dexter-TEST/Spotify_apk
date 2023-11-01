package p.q04;
import p.u74;
import com.google.protobuf.b;
import com.spotify.zorro.telco.v2.proto.TelcoResponse;
import com.google.protobuf.c;
import com.spotify.useraccount.v1.proto.Useraccount$AccountAttribute;
import com.spotify.useraccount.v1.AccountAttribute;
import com.spotify.storage.esperanto.proto.EsStorage$Stats;
import com.spotify.storage.esperanto.proto.EsStorage$RealmStats;
import com.spotify.storage.esperanto.proto.EsStorage$GetStatsParams;
import com.spotify.storage.esperanto.proto.EsStorage$DeleteUnlockedItemsParams;
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphReply;
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphEntity;
import com.spotify.shoreline.esperanto.proto.EsShorelineLogger$SetContextValueRequest;
import com.spotify.shoreline.esperanto.proto.EsShorelineLogger$PlaybackIds;
import com.spotify.share.linkgeneration.proto.UtmParameters;
import com.spotify.share.linkgeneration.proto.LinkPreview;
import com.spotify.share.linkgeneration.proto.GenerateUrlRequest;
import com.spotify.share.linkgeneration.proto.CustomData;
import com.spotify.searchview.proto.Track;
import com.spotify.searchview.proto.RelatedSearch;
import com.spotify.searchview.proto.RelatedEntity;
import com.spotify.searchview.proto.Recommendations;
import com.spotify.searchview.proto.Profile;
import com.spotify.searchview.proto.Playlist;
import com.spotify.searchview.proto.OnDemand;
import com.spotify.searchview.proto.MainViewResponse;
import java.lang.Object;
import p.a04;
import p.b04;
import p.c04;
import p.d04;
import p.e04;
import p.f04;
import p.g04;
import p.h04;
import p.i04;
import p.j04;
import p.k04;
import p.l04;
import p.m04;
import p.n04;
import p.o04;
import p.p04;
import p.tp2;
import p.yz3;
import p.zz3;
import p.s74;
import p.r74;
import p.v1;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.i80;
import p.sh0;

public final class q04 extends b implements u74	// class@002308 from classes.dex
{
    public final int a;

    public void q04(){
       this.a = 0;
       super(0);
    }
    public void q04(int p0){
       this.a = p0;
       switch (p0){
           case 1:
             super(OnDemand.e());
             return;
           case 2:
             super(Playlist.e());
             return;
           case 3:
             super(Profile.e());
             return;
           case 4:
             super(Recommendations.e());
             return;
           case 5:
             super(RelatedEntity.e());
             return;
           case 6:
             super(RelatedSearch.e());
             return;
           case 7:
             super(Track.e());
             return;
           case 8:
             super(CustomData.e());
             return;
           case 9:
             super(GenerateUrlRequest.e());
             return;
           case 10:
             super(LinkPreview.e());
             return;
           case 11:
             super(UtmParameters.e());
             return;
           case 12:
             super(EsShorelineLogger$PlaybackIds.e());
             return;
           case 13:
             super(EsShorelineLogger$SetContextValueRequest.e());
             return;
           case 14:
             super(SocialgraphV2$SocialGraphEntity.e());
             return;
           case 15:
             super(SocialgraphV2$SocialGraphReply.e());
             return;
           case 16:
             super(EsStorage$DeleteUnlockedItemsParams.e());
             return;
           case 17:
             super(EsStorage$GetStatsParams.e());
             return;
           case 18:
             super(EsStorage$RealmStats.e());
             return;
           case 19:
             super(EsStorage$Stats.e());
             return;
           case 20:
             super(AccountAttribute.e());
             return;
           case 21:
             super(Useraccount$AccountAttribute.e());
             return;
           case 22:
             super(TelcoResponse.e());
             return;
           default:
             super(MainViewResponse.e());
             return;
       }
    }
    public void q04(int p0,int p1){
       this.a = p0;
       if (p0 != 15) {
          super(14);
          return;
       }else {
          super(15);
          return;
       }
    }
    public void q04(Object p0){
       this.a = 1;
       super(1);
    }
    public void q04(a04 p0){
       this.a = 19;
       super(19);
    }
    public void q04(b04 p0){
       this.a = 22;
       super(22);
    }
    public void q04(c04 p0){
       this.a = 5;
       super(5);
    }
    public void q04(d04 p0){
       this.a = 6;
       super(6);
    }
    public void q04(e04 p0){
       this.a = 13;
       super(13);
    }
    public void q04(f04 p0){
       this.a = 12;
       super(12);
    }
    public void q04(g04 p0){
       this.a = 8;
       super(8);
    }
    public void q04(h04 p0){
       this.a = 10;
       super(10);
    }
    public void q04(i04 p0){
       this.a = 18;
       super(18);
    }
    public void q04(j04 p0){
       this.a = 20;
       super(20);
    }
    public void q04(k04 p0){
       this.a = 16;
       super(16);
    }
    public void q04(l04 p0){
       this.a = 3;
       super(3);
    }
    public void q04(m04 p0){
       this.a = 4;
       super(4);
    }
    public void q04(n04 p0){
       this.a = 7;
       super(7);
    }
    public void q04(o04 p0){
       this.a = 9;
       super(9);
    }
    public void q04(p04 p0){
       this.a = 17;
       super(17);
    }
    public void q04(tp2 p0){
       this.a = 2;
       super(2);
    }
    public void q04(yz3 p0){
       this.a = 11;
       super(11);
    }
    public void q04(zz3 p0){
       this.a = 21;
       super(21);
    }
    public final s74 build(){
       switch (this.a){
           case 0:
             return super.build();
           case 1:
             return super.build();
           case 2:
             return super.build();
           case 3:
             return super.build();
           case 4:
             return super.build();
           case 5:
             return super.build();
           case 6:
             return super.build();
           case 7:
             return super.build();
           case 8:
             return super.build();
           case 9:
             return super.build();
           case 10:
             return super.build();
           case 11:
             return super.build();
           case 14:
             return super.build();
           case 15:
             return super.build();
           case 20:
             return super.build();
           case 21:
             return super.build();
           case 22:
             return super.build();
           default:
             return super.build();
       }
    }
    public final s74 buildPartial(){
       switch (this.a){
           case 0:
             return super.buildPartial();
           case 1:
             return super.buildPartial();
           case 2:
             return super.buildPartial();
           case 3:
             return super.buildPartial();
           case 4:
             return super.buildPartial();
           case 5:
             return super.buildPartial();
           case 6:
             return super.buildPartial();
           case 7:
             return super.buildPartial();
           case 8:
             return super.buildPartial();
           case 9:
             return super.buildPartial();
           case 10:
             return super.buildPartial();
           case 11:
             return super.buildPartial();
           case 14:
             return super.buildPartial();
           case 15:
             return super.buildPartial();
           case 20:
             return super.buildPartial();
           case 21:
             return super.buildPartial();
           case 22:
             return super.buildPartial();
           default:
             return super.buildPartial();
       }
    }
    public final r74 clear(){
       switch (this.a){
           case 0:
             return super.clear();
           case 1:
             return super.clear();
           case 2:
             return super.clear();
           case 3:
             return super.clear();
           case 4:
             return super.clear();
           case 5:
             return super.clear();
           case 6:
             return super.clear();
           case 7:
             return super.clear();
           case 8:
             return super.clear();
           case 9:
             return super.clear();
           case 10:
             return super.clear();
           case 11:
             return super.clear();
           case 14:
             return super.clear();
           case 15:
             return super.clear();
           case 20:
             return super.clear();
           case 21:
             return super.clear();
           case 22:
             return super.clear();
           default:
             return super.clear();
       }
    }
    public final Object clone(){
       switch (this.a){
           case 0:
             return super.clone();
           case 1:
             return super.clone();
           case 2:
             return super.clone();
           case 3:
             return super.clone();
           case 4:
             return super.clone();
           case 5:
             return super.clone();
           case 6:
             return super.clone();
           case 7:
             return super.clone();
           case 8:
             return super.clone();
           case 9:
             return super.clone();
           case 10:
             return super.clone();
           case 11:
             return super.clone();
           case 14:
             return super.clone();
           case 15:
             return super.clone();
           case 20:
             return super.clone();
           case 21:
             return super.clone();
           case 22:
             return super.clone();
           default:
             return super.clone();
       }
    }
    public final r74 clone(){
       switch (this.a){
           case 0:
             return super.clone();
           case 1:
             return super.clone();
           case 2:
             return super.clone();
           case 3:
             return super.clone();
           case 4:
             return super.clone();
           case 5:
             return super.clone();
           case 6:
             return super.clone();
           case 7:
             return super.clone();
           case 8:
             return super.clone();
           case 9:
             return super.clone();
           case 10:
             return super.clone();
           case 11:
             return super.clone();
           case 14:
             return super.clone();
           case 15:
             return super.clone();
           case 20:
             return super.clone();
           case 21:
             return super.clone();
           case 22:
             return super.clone();
           default:
             return super.clone();
       }
    }
    public final v1 clone(){
       switch (this.a){
           case 0:
             return super.clone();
           case 1:
             return super.clone();
           case 2:
             return super.clone();
           case 3:
             return super.clone();
           case 4:
             return super.clone();
           case 5:
             return super.clone();
           case 6:
             return super.clone();
           case 7:
             return super.clone();
           case 8:
             return super.clone();
           case 9:
             return super.clone();
           case 10:
             return super.clone();
           case 11:
             return super.clone();
           case 14:
             return super.clone();
           case 15:
             return super.clone();
           case 20:
             return super.clone();
           case 21:
             return super.clone();
           case 22:
             return super.clone();
           default:
             return super.clone();
       }
    }
    public final s74 getDefaultInstanceForType(){
       switch (this.a){
           case 0:
             return super.getDefaultInstanceForType();
           case 1:
             return super.getDefaultInstanceForType();
           case 2:
             return super.getDefaultInstanceForType();
           case 3:
             return super.getDefaultInstanceForType();
           case 4:
             return super.getDefaultInstanceForType();
           case 5:
             return super.getDefaultInstanceForType();
           case 6:
             return super.getDefaultInstanceForType();
           case 7:
             return super.getDefaultInstanceForType();
           case 8:
             return super.getDefaultInstanceForType();
           case 9:
             return super.getDefaultInstanceForType();
           case 10:
             return super.getDefaultInstanceForType();
           case 11:
             return super.getDefaultInstanceForType();
           case 14:
             return super.getDefaultInstanceForType();
           case 15:
             return super.getDefaultInstanceForType();
           case 20:
             return super.getDefaultInstanceForType();
           case 21:
             return super.getDefaultInstanceForType();
           case 22:
             return super.getDefaultInstanceForType();
           default:
             return super.getDefaultInstanceForType();
       }
    }
    public final v1 internalMergeFrom(a p0){
       switch (this.a){
           case 0:
             return super.internalMergeFrom(p0);
           case 1:
             return super.internalMergeFrom(p0);
           case 2:
             return super.internalMergeFrom(p0);
           case 3:
             return super.internalMergeFrom(p0);
           case 4:
             return super.internalMergeFrom(p0);
           case 5:
             return super.internalMergeFrom(p0);
           case 6:
             return super.internalMergeFrom(p0);
           case 7:
             return super.internalMergeFrom(p0);
           case 8:
             return super.internalMergeFrom(p0);
           case 9:
             return super.internalMergeFrom(p0);
           case 10:
             return super.internalMergeFrom(p0);
           case 11:
             return super.internalMergeFrom(p0);
           case 14:
             return super.internalMergeFrom(p0);
           case 15:
             return super.internalMergeFrom(p0);
           case 20:
             return super.internalMergeFrom(p0);
           case 21:
             return super.internalMergeFrom(p0);
           case 22:
             return super.internalMergeFrom(p0);
           default:
             return super.internalMergeFrom(p0);
       }
    }
    public final r74 mergeFrom(InputStream p0){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0);
           case 1:
             return super.mergeFrom(p0);
           case 2:
             return super.mergeFrom(p0);
           case 3:
             return super.mergeFrom(p0);
           case 4:
             return super.mergeFrom(p0);
           case 5:
             return super.mergeFrom(p0);
           case 6:
             return super.mergeFrom(p0);
           case 7:
             return super.mergeFrom(p0);
           case 8:
             return super.mergeFrom(p0);
           case 9:
             return super.mergeFrom(p0);
           case 10:
             return super.mergeFrom(p0);
           case 11:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 20:
             return super.mergeFrom(p0);
           case 21:
             return super.mergeFrom(p0);
           case 22:
             return super.mergeFrom(p0);
           default:
             return super.mergeFrom(p0);
       }
    }
    public final r74 mergeFrom(InputStream p0,yx1 p1){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1);
           case 1:
             return super.mergeFrom(p0, p1);
           case 2:
             return super.mergeFrom(p0, p1);
           case 3:
             return super.mergeFrom(p0, p1);
           case 4:
             return super.mergeFrom(p0, p1);
           case 5:
             return super.mergeFrom(p0, p1);
           case 6:
             return super.mergeFrom(p0, p1);
           case 7:
             return super.mergeFrom(p0, p1);
           case 8:
             return super.mergeFrom(p0, p1);
           case 9:
             return super.mergeFrom(p0, p1);
           case 10:
             return super.mergeFrom(p0, p1);
           case 11:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 20:
             return super.mergeFrom(p0, p1);
           case 21:
             return super.mergeFrom(p0, p1);
           case 22:
             return super.mergeFrom(p0, p1);
           default:
             return super.mergeFrom(p0, p1);
       }
    }
    public final r74 mergeFrom(i80 p0){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0);
           case 1:
             return super.mergeFrom(p0);
           case 2:
             return super.mergeFrom(p0);
           case 3:
             return super.mergeFrom(p0);
           case 4:
             return super.mergeFrom(p0);
           case 5:
             return super.mergeFrom(p0);
           case 6:
             return super.mergeFrom(p0);
           case 7:
             return super.mergeFrom(p0);
           case 8:
             return super.mergeFrom(p0);
           case 9:
             return super.mergeFrom(p0);
           case 10:
             return super.mergeFrom(p0);
           case 11:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 20:
             return super.mergeFrom(p0);
           case 21:
             return super.mergeFrom(p0);
           case 22:
             return super.mergeFrom(p0);
           default:
             return super.mergeFrom(p0);
       }
    }
    public final r74 mergeFrom(i80 p0,yx1 p1){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1);
           case 1:
             return super.mergeFrom(p0, p1);
           case 2:
             return super.mergeFrom(p0, p1);
           case 3:
             return super.mergeFrom(p0, p1);
           case 4:
             return super.mergeFrom(p0, p1);
           case 5:
             return super.mergeFrom(p0, p1);
           case 6:
             return super.mergeFrom(p0, p1);
           case 7:
             return super.mergeFrom(p0, p1);
           case 8:
             return super.mergeFrom(p0, p1);
           case 9:
             return super.mergeFrom(p0, p1);
           case 10:
             return super.mergeFrom(p0, p1);
           case 11:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 20:
             return super.mergeFrom(p0, p1);
           case 21:
             return super.mergeFrom(p0, p1);
           case 22:
             return super.mergeFrom(p0, p1);
           default:
             return super.mergeFrom(p0, p1);
       }
    }
    public final r74 mergeFrom(s74 p0){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0);
           case 1:
             return super.mergeFrom(p0);
           case 2:
             return super.mergeFrom(p0);
           case 3:
             return super.mergeFrom(p0);
           case 4:
             return super.mergeFrom(p0);
           case 5:
             return super.mergeFrom(p0);
           case 6:
             return super.mergeFrom(p0);
           case 7:
             return super.mergeFrom(p0);
           case 8:
             return super.mergeFrom(p0);
           case 9:
             return super.mergeFrom(p0);
           case 10:
             return super.mergeFrom(p0);
           case 11:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 20:
             return super.mergeFrom(p0);
           case 21:
             return super.mergeFrom(p0);
           case 22:
             return super.mergeFrom(p0);
           default:
             return super.mergeFrom(p0);
       }
    }
    public final r74 mergeFrom(sh0 p0){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0);
           case 1:
             return super.mergeFrom(p0);
           case 2:
             return super.mergeFrom(p0);
           case 3:
             return super.mergeFrom(p0);
           case 4:
             return super.mergeFrom(p0);
           case 5:
             return super.mergeFrom(p0);
           case 6:
             return super.mergeFrom(p0);
           case 7:
             return super.mergeFrom(p0);
           case 8:
             return super.mergeFrom(p0);
           case 9:
             return super.mergeFrom(p0);
           case 10:
             return super.mergeFrom(p0);
           case 11:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 20:
             return super.mergeFrom(p0);
           case 21:
             return super.mergeFrom(p0);
           case 22:
             return super.mergeFrom(p0);
           default:
             return super.mergeFrom(p0);
       }
    }
    public final r74 mergeFrom(sh0 p0,yx1 p1){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1);
           case 1:
             return super.mergeFrom(p0, p1);
           case 2:
             return super.mergeFrom(p0, p1);
           case 3:
             return super.mergeFrom(p0, p1);
           case 4:
             return super.mergeFrom(p0, p1);
           case 5:
             return super.mergeFrom(p0, p1);
           case 6:
             return super.mergeFrom(p0, p1);
           case 7:
             return super.mergeFrom(p0, p1);
           case 8:
             return super.mergeFrom(p0, p1);
           case 9:
             return super.mergeFrom(p0, p1);
           case 10:
             return super.mergeFrom(p0, p1);
           case 11:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 20:
             return super.mergeFrom(p0, p1);
           case 21:
             return super.mergeFrom(p0, p1);
           case 22:
             return super.mergeFrom(p0, p1);
           default:
             return super.mergeFrom(p0, p1);
       }
    }
    public final r74 mergeFrom(byte[] p0){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0);
           case 1:
             return super.mergeFrom(p0);
           case 2:
             return super.mergeFrom(p0);
           case 3:
             return super.mergeFrom(p0);
           case 4:
             return super.mergeFrom(p0);
           case 5:
             return super.mergeFrom(p0);
           case 6:
             return super.mergeFrom(p0);
           case 7:
             return super.mergeFrom(p0);
           case 8:
             return super.mergeFrom(p0);
           case 9:
             return super.mergeFrom(p0);
           case 10:
             return super.mergeFrom(p0);
           case 11:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 20:
             return super.mergeFrom(p0);
           case 21:
             return super.mergeFrom(p0);
           case 22:
             return super.mergeFrom(p0);
           default:
             return super.mergeFrom(p0);
       }
    }
    public final r74 mergeFrom(byte[] p0,int p1,int p2){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1, p2);
           case 1:
             return super.mergeFrom(p0, p1, p2);
           case 2:
             return super.mergeFrom(p0, p1, p2);
           case 3:
             return super.mergeFrom(p0, p1, p2);
           case 4:
             return super.mergeFrom(p0, p1, p2);
           case 5:
             return super.mergeFrom(p0, p1, p2);
           case 6:
             return super.mergeFrom(p0, p1, p2);
           case 7:
             return super.mergeFrom(p0, p1, p2);
           case 8:
             return super.mergeFrom(p0, p1, p2);
           case 9:
             return super.mergeFrom(p0, p1, p2);
           case 10:
             return super.mergeFrom(p0, p1, p2);
           case 11:
             return super.mergeFrom(p0, p1, p2);
           case 14:
             return super.mergeFrom(p0, p1, p2);
           case 15:
             return super.mergeFrom(p0, p1, p2);
           case 20:
             return super.mergeFrom(p0, p1, p2);
           case 21:
             return super.mergeFrom(p0, p1, p2);
           case 22:
             return super.mergeFrom(p0, p1, p2);
           default:
             return super.mergeFrom(p0, p1, p2);
       }
    }
    public final r74 mergeFrom(byte[] p0,int p1,int p2,yx1 p3){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1, p2, p3);
           case 1:
             return super.mergeFrom(p0, p1, p2, p3);
           case 2:
             return super.mergeFrom(p0, p1, p2, p3);
           case 3:
             return super.mergeFrom(p0, p1, p2, p3);
           case 4:
             return super.mergeFrom(p0, p1, p2, p3);
           case 5:
             return super.mergeFrom(p0, p1, p2, p3);
           case 6:
             return super.mergeFrom(p0, p1, p2, p3);
           case 7:
             return super.mergeFrom(p0, p1, p2, p3);
           case 8:
             return super.mergeFrom(p0, p1, p2, p3);
           case 9:
             return super.mergeFrom(p0, p1, p2, p3);
           case 10:
             return super.mergeFrom(p0, p1, p2, p3);
           case 11:
             return super.mergeFrom(p0, p1, p2, p3);
           case 14:
             return super.mergeFrom(p0, p1, p2, p3);
           case 15:
             return super.mergeFrom(p0, p1, p2, p3);
           case 20:
             return super.mergeFrom(p0, p1, p2, p3);
           case 21:
             return super.mergeFrom(p0, p1, p2, p3);
           case 22:
             return super.mergeFrom(p0, p1, p2, p3);
           default:
             return super.mergeFrom(p0, p1, p2, p3);
       }
    }
    public final r74 mergeFrom(byte[] p0,yx1 p1){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1);
           case 1:
             return super.mergeFrom(p0, p1);
           case 2:
             return super.mergeFrom(p0, p1);
           case 3:
             return super.mergeFrom(p0, p1);
           case 4:
             return super.mergeFrom(p0, p1);
           case 5:
             return super.mergeFrom(p0, p1);
           case 6:
             return super.mergeFrom(p0, p1);
           case 7:
             return super.mergeFrom(p0, p1);
           case 8:
             return super.mergeFrom(p0, p1);
           case 9:
             return super.mergeFrom(p0, p1);
           case 10:
             return super.mergeFrom(p0, p1);
           case 11:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 20:
             return super.mergeFrom(p0, p1);
           case 21:
             return super.mergeFrom(p0, p1);
           case 22:
             return super.mergeFrom(p0, p1);
           default:
             return super.mergeFrom(p0, p1);
       }
    }
    public final v1 mergeFrom(sh0 p0,yx1 p1){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1);
           case 1:
             return super.mergeFrom(p0, p1);
           case 2:
             return super.mergeFrom(p0, p1);
           case 3:
             return super.mergeFrom(p0, p1);
           case 4:
             return super.mergeFrom(p0, p1);
           case 5:
             return super.mergeFrom(p0, p1);
           case 6:
             return super.mergeFrom(p0, p1);
           case 7:
             return super.mergeFrom(p0, p1);
           case 8:
             return super.mergeFrom(p0, p1);
           case 9:
             return super.mergeFrom(p0, p1);
           case 10:
             return super.mergeFrom(p0, p1);
           case 11:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 20:
             return super.mergeFrom(p0, p1);
           case 21:
             return super.mergeFrom(p0, p1);
           case 22:
             return super.mergeFrom(p0, p1);
           default:
             return super.mergeFrom(p0, p1);
       }
    }
    public final v1 mergeFrom(byte[] p0,int p1,int p2){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1, p2);
           case 1:
             return super.mergeFrom(p0, p1, p2);
           case 2:
             return super.mergeFrom(p0, p1, p2);
           case 3:
             return super.mergeFrom(p0, p1, p2);
           case 4:
             return super.mergeFrom(p0, p1, p2);
           case 5:
             return super.mergeFrom(p0, p1, p2);
           case 6:
             return super.mergeFrom(p0, p1, p2);
           case 7:
             return super.mergeFrom(p0, p1, p2);
           case 8:
             return super.mergeFrom(p0, p1, p2);
           case 9:
             return super.mergeFrom(p0, p1, p2);
           case 10:
             return super.mergeFrom(p0, p1, p2);
           case 11:
             return super.mergeFrom(p0, p1, p2);
           case 14:
             return super.mergeFrom(p0, p1, p2);
           case 15:
             return super.mergeFrom(p0, p1, p2);
           case 20:
             return super.mergeFrom(p0, p1, p2);
           case 21:
             return super.mergeFrom(p0, p1, p2);
           case 22:
             return super.mergeFrom(p0, p1, p2);
           default:
             return super.mergeFrom(p0, p1, p2);
       }
    }
    public final v1 mergeFrom(byte[] p0,int p1,int p2,yx1 p3){
       switch (this.a){
           case 0:
             return super.mergeFrom(p0, p1, p2, p3);
           case 1:
             return super.mergeFrom(p0, p1, p2, p3);
           case 2:
             return super.mergeFrom(p0, p1, p2, p3);
           case 3:
             return super.mergeFrom(p0, p1, p2, p3);
           case 4:
             return super.mergeFrom(p0, p1, p2, p3);
           case 5:
             return super.mergeFrom(p0, p1, p2, p3);
           case 6:
             return super.mergeFrom(p0, p1, p2, p3);
           case 7:
             return super.mergeFrom(p0, p1, p2, p3);
           case 8:
             return super.mergeFrom(p0, p1, p2, p3);
           case 9:
             return super.mergeFrom(p0, p1, p2, p3);
           case 10:
             return super.mergeFrom(p0, p1, p2, p3);
           case 11:
             return super.mergeFrom(p0, p1, p2, p3);
           case 14:
             return super.mergeFrom(p0, p1, p2, p3);
           case 15:
             return super.mergeFrom(p0, p1, p2, p3);
           case 20:
             return super.mergeFrom(p0, p1, p2, p3);
           case 21:
             return super.mergeFrom(p0, p1, p2, p3);
           case 22:
             return super.mergeFrom(p0, p1, p2, p3);
           default:
             return super.mergeFrom(p0, p1, p2, p3);
       }
    }
}
