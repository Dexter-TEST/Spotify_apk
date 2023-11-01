package p.h40;
import p.u74;
import com.google.protobuf.b;
import com.spotify.metadata.proto.Metadata$Availability;
import com.google.protobuf.c;
import com.spotify.metadata.proto.Metadata$AudioFile;
import com.spotify.metadata.proto.Metadata$Audio;
import com.spotify.metadata.proto.Metadata$ArtistWithRole;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$AlbumGroup;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$ActivityPeriod;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiResponse;
import com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerV1;
import com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerResponseV1;
import com.spotify.messaging.inappmessagingsdk.proto.Preview$PreviewResponseV1;
import com.spotify.messaging.inappmessagingsdk.proto.Messages$MessageV1;
import com.spotify.messaging.inappmessagingsdk.proto.Messages$MessageResponseV1;
import com.spotify.messaging.inappmessagingsdk.proto.ClickActions$ClickActionV1;
import com.spotify.login5.v3.proto.UserInfo;
import com.spotify.login5.v3.proto.LoginResponse;
import com.spotify.login5.v3.proto.LoginOk;
import com.spotify.login5.v3.proto.Challenges;
import com.spotify.login5.v3.proto.Challenge;
import com.spotify.login5.v3.credentials.proto.SamsungSignInCredential;
import com.spotify.login5.v3.credentials.proto.ParentChildCredential;
import com.spotify.login5.v3.credentials.proto.AppleSignInCredential;
import com.spotify.login5.v3.challenges.proto.HashcashChallenge;
import com.spotify.login5.v3.challenges.proto.CodeChallenge;
import com.spotify.limited_offlining_esperanto.proto.SetOfflineResponse;
import com.spotify.connect.esperanto.proto.ConnectMessages$PullResponse;
import com.spotify.connect.esperanto.proto.CommonMessages$LoggingParams;
import com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeRequestV1;
import com.spotify.bootstrap.v1.proto.Bootstrap$BootstrapResponse;
import java.lang.Object;
import p.en6;
import p.a40;
import p.b40;
import p.c40;
import p.d40;
import p.e40;
import p.f40;
import p.g40;
import p.m30;
import p.n30;
import p.o30;
import p.p30;
import p.q30;
import p.r30;
import p.s30;
import p.t30;
import p.u30;
import p.v30;
import p.w30;
import p.x30;
import p.y30;
import p.z30;
import p.s74;
import p.r74;
import p.v1;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.i80;
import p.sh0;

public final class h40 extends b implements u74	// class@0017d8 from classes.dex
{
    public final int a;

    public void h40(){
       this.a = 2;
       super(2);
    }
    public void h40(int p0){
       this.a = p0;
       switch (p0){
           case 1:
             super(Bootstrap$TrialsFacadeRequestV1.e());
             return;
           case 2:
             super(CommonMessages$LoggingParams.e());
             return;
           case 3:
             super(ConnectMessages$PullResponse.e());
             return;
           case 4:
             super(SetOfflineResponse.e());
             return;
           case 5:
             super(CodeChallenge.e());
             return;
           case 6:
             super(HashcashChallenge.e());
             return;
           case 7:
             super(AppleSignInCredential.e());
             return;
           case 8:
             super(ParentChildCredential.e());
             return;
           case 9:
             super(SamsungSignInCredential.e());
             return;
           case 10:
             super(Challenge.e());
             return;
           case 11:
             super(Challenges.e());
             return;
           case 12:
             super(LoginOk.e());
             return;
           case 13:
             super(LoginResponse.e());
             return;
           case 14:
             super(UserInfo.e());
             return;
           case 15:
             super(ClickActions$ClickActionV1.e());
             return;
           case 16:
             super(Messages$MessageResponseV1.e());
             return;
           case 17:
             super(Messages$MessageV1.e());
             return;
           case 18:
             super(Preview$PreviewResponseV1.e());
             return;
           case 19:
             super(Triggers$TriggerResponseV1.e());
             return;
           case 20:
             super(Triggers$TriggerV1.e());
             return;
           case 21:
             super(MetadataCosmos$MultiResponse.e());
             return;
           case 22:
             super(Metadata$ActivityPeriod.e());
             return;
           case 23:
             super(Metadata$Album.e());
             return;
           case 24:
             super(Metadata$AlbumGroup.e());
             return;
           case 25:
             super(Metadata$Artist.e());
             return;
           case 26:
             super(Metadata$ArtistWithRole.e());
             return;
           case 27:
             super(Metadata$Audio.e());
             return;
           case 28:
             super(Metadata$AudioFile.e());
             return;
           case 29:
             super(Metadata$Availability.e());
             return;
           default:
             super(Bootstrap$BootstrapResponse.e());
             return;
       }
    }
    public void h40(int p0,int p1){
       this.a = p0;
       if (p0 != 1) {
          super(0);
          return;
       }else {
          super(1);
          return;
       }
    }
    public void h40(int p0,Object p1){
       this.a = p0;
       if (p0 != 17) {
          super(16);
          return;
       }else {
          super(17);
          return;
       }
    }
    public void h40(int p0,en6 p1){
       this.a = p0;
       if (p0 != 20) {
          super(19);
          return;
       }else {
          super(20);
          return;
       }
    }
    public void h40(Object p0){
       this.a = 3;
       super(3);
    }
    public void h40(a40 p0){
       this.a = 27;
       super(27);
    }
    public void h40(b40 p0){
       this.a = 22;
       super(22);
    }
    public void h40(c40 p0){
       this.a = 25;
       super(25);
    }
    public void h40(d40 p0){
       this.a = 9;
       super(9);
    }
    public void h40(e40 p0){
       this.a = 29;
       super(29);
    }
    public void h40(en6 p0){
       this.a = 4;
       super(4);
    }
    public void h40(f40 p0){
       this.a = 26;
       super(26);
    }
    public void h40(g40 p0){
       this.a = 13;
       super(13);
    }
    public void h40(m30 p0){
       this.a = 5;
       super(5);
    }
    public void h40(n30 p0){
       this.a = 18;
       super(18);
    }
    public void h40(o30 p0){
       this.a = 23;
       super(23);
    }
    public void h40(p30 p0){
       this.a = 11;
       super(11);
    }
    public void h40(q30 p0){
       this.a = 15;
       super(15);
    }
    public void h40(r30 p0){
       this.a = 28;
       super(28);
    }
    public void h40(s30 p0){
       this.a = 12;
       super(12);
    }
    public void h40(t30 p0){
       this.a = 24;
       super(24);
    }
    public void h40(u30 p0){
       this.a = 14;
       super(14);
    }
    public void h40(v30 p0){
       this.a = 6;
       super(6);
    }
    public void h40(w30 p0){
       this.a = 7;
       super(7);
    }
    public void h40(x30 p0){
       this.a = 8;
       super(8);
    }
    public void h40(y30 p0){
       this.a = 21;
       super(21);
    }
    public void h40(z30 p0){
       this.a = 10;
       super(10);
    }
    public final s74 build(){
       switch (this.a){
           case 0:
             return super.build();
           case 1:
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
           case 12:
             return super.build();
           case 13:
             return super.build();
           case 14:
             return super.build();
           case 15:
             return super.build();
           case 16:
             return super.build();
           case 17:
             return super.build();
           case 18:
             return super.build();
           case 19:
             return super.build();
           case 20:
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
           case 12:
             return super.buildPartial();
           case 13:
             return super.buildPartial();
           case 14:
             return super.buildPartial();
           case 15:
             return super.buildPartial();
           case 16:
             return super.buildPartial();
           case 17:
             return super.buildPartial();
           case 18:
             return super.buildPartial();
           case 19:
             return super.buildPartial();
           case 20:
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
           case 12:
             return super.clear();
           case 13:
             return super.clear();
           case 14:
             return super.clear();
           case 15:
             return super.clear();
           case 16:
             return super.clear();
           case 17:
             return super.clear();
           case 18:
             return super.clear();
           case 19:
             return super.clear();
           case 20:
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
           case 12:
             return super.clone();
           case 13:
             return super.clone();
           case 14:
             return super.clone();
           case 15:
             return super.clone();
           case 16:
             return super.clone();
           case 17:
             return super.clone();
           case 18:
             return super.clone();
           case 19:
             return super.clone();
           case 20:
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
           case 12:
             return super.clone();
           case 13:
             return super.clone();
           case 14:
             return super.clone();
           case 15:
             return super.clone();
           case 16:
             return super.clone();
           case 17:
             return super.clone();
           case 18:
             return super.clone();
           case 19:
             return super.clone();
           case 20:
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
           case 12:
             return super.clone();
           case 13:
             return super.clone();
           case 14:
             return super.clone();
           case 15:
             return super.clone();
           case 16:
             return super.clone();
           case 17:
             return super.clone();
           case 18:
             return super.clone();
           case 19:
             return super.clone();
           case 20:
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
           case 12:
             return super.getDefaultInstanceForType();
           case 13:
             return super.getDefaultInstanceForType();
           case 14:
             return super.getDefaultInstanceForType();
           case 15:
             return super.getDefaultInstanceForType();
           case 16:
             return super.getDefaultInstanceForType();
           case 17:
             return super.getDefaultInstanceForType();
           case 18:
             return super.getDefaultInstanceForType();
           case 19:
             return super.getDefaultInstanceForType();
           case 20:
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
           case 12:
             return super.internalMergeFrom(p0);
           case 13:
             return super.internalMergeFrom(p0);
           case 14:
             return super.internalMergeFrom(p0);
           case 15:
             return super.internalMergeFrom(p0);
           case 16:
             return super.internalMergeFrom(p0);
           case 17:
             return super.internalMergeFrom(p0);
           case 18:
             return super.internalMergeFrom(p0);
           case 19:
             return super.internalMergeFrom(p0);
           case 20:
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
           case 12:
             return super.mergeFrom(p0);
           case 13:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 16:
             return super.mergeFrom(p0);
           case 17:
             return super.mergeFrom(p0);
           case 18:
             return super.mergeFrom(p0);
           case 19:
             return super.mergeFrom(p0);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1);
           case 13:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 16:
             return super.mergeFrom(p0, p1);
           case 17:
             return super.mergeFrom(p0, p1);
           case 18:
             return super.mergeFrom(p0, p1);
           case 19:
             return super.mergeFrom(p0, p1);
           case 20:
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
           case 12:
             return super.mergeFrom(p0);
           case 13:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 16:
             return super.mergeFrom(p0);
           case 17:
             return super.mergeFrom(p0);
           case 18:
             return super.mergeFrom(p0);
           case 19:
             return super.mergeFrom(p0);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1);
           case 13:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 16:
             return super.mergeFrom(p0, p1);
           case 17:
             return super.mergeFrom(p0, p1);
           case 18:
             return super.mergeFrom(p0, p1);
           case 19:
             return super.mergeFrom(p0, p1);
           case 20:
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
           case 12:
             return super.mergeFrom(p0);
           case 13:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 16:
             return super.mergeFrom(p0);
           case 17:
             return super.mergeFrom(p0);
           case 18:
             return super.mergeFrom(p0);
           case 19:
             return super.mergeFrom(p0);
           case 20:
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
           case 12:
             return super.mergeFrom(p0);
           case 13:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 16:
             return super.mergeFrom(p0);
           case 17:
             return super.mergeFrom(p0);
           case 18:
             return super.mergeFrom(p0);
           case 19:
             return super.mergeFrom(p0);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1);
           case 13:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 16:
             return super.mergeFrom(p0, p1);
           case 17:
             return super.mergeFrom(p0, p1);
           case 18:
             return super.mergeFrom(p0, p1);
           case 19:
             return super.mergeFrom(p0, p1);
           case 20:
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
           case 12:
             return super.mergeFrom(p0);
           case 13:
             return super.mergeFrom(p0);
           case 14:
             return super.mergeFrom(p0);
           case 15:
             return super.mergeFrom(p0);
           case 16:
             return super.mergeFrom(p0);
           case 17:
             return super.mergeFrom(p0);
           case 18:
             return super.mergeFrom(p0);
           case 19:
             return super.mergeFrom(p0);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1, p2);
           case 13:
             return super.mergeFrom(p0, p1, p2);
           case 14:
             return super.mergeFrom(p0, p1, p2);
           case 15:
             return super.mergeFrom(p0, p1, p2);
           case 16:
             return super.mergeFrom(p0, p1, p2);
           case 17:
             return super.mergeFrom(p0, p1, p2);
           case 18:
             return super.mergeFrom(p0, p1, p2);
           case 19:
             return super.mergeFrom(p0, p1, p2);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1, p2, p3);
           case 13:
             return super.mergeFrom(p0, p1, p2, p3);
           case 14:
             return super.mergeFrom(p0, p1, p2, p3);
           case 15:
             return super.mergeFrom(p0, p1, p2, p3);
           case 16:
             return super.mergeFrom(p0, p1, p2, p3);
           case 17:
             return super.mergeFrom(p0, p1, p2, p3);
           case 18:
             return super.mergeFrom(p0, p1, p2, p3);
           case 19:
             return super.mergeFrom(p0, p1, p2, p3);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1);
           case 13:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 16:
             return super.mergeFrom(p0, p1);
           case 17:
             return super.mergeFrom(p0, p1);
           case 18:
             return super.mergeFrom(p0, p1);
           case 19:
             return super.mergeFrom(p0, p1);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1);
           case 13:
             return super.mergeFrom(p0, p1);
           case 14:
             return super.mergeFrom(p0, p1);
           case 15:
             return super.mergeFrom(p0, p1);
           case 16:
             return super.mergeFrom(p0, p1);
           case 17:
             return super.mergeFrom(p0, p1);
           case 18:
             return super.mergeFrom(p0, p1);
           case 19:
             return super.mergeFrom(p0, p1);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1, p2);
           case 13:
             return super.mergeFrom(p0, p1, p2);
           case 14:
             return super.mergeFrom(p0, p1, p2);
           case 15:
             return super.mergeFrom(p0, p1, p2);
           case 16:
             return super.mergeFrom(p0, p1, p2);
           case 17:
             return super.mergeFrom(p0, p1, p2);
           case 18:
             return super.mergeFrom(p0, p1, p2);
           case 19:
             return super.mergeFrom(p0, p1, p2);
           case 20:
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
           case 12:
             return super.mergeFrom(p0, p1, p2, p3);
           case 13:
             return super.mergeFrom(p0, p1, p2, p3);
           case 14:
             return super.mergeFrom(p0, p1, p2, p3);
           case 15:
             return super.mergeFrom(p0, p1, p2, p3);
           case 16:
             return super.mergeFrom(p0, p1, p2, p3);
           case 17:
             return super.mergeFrom(p0, p1, p2, p3);
           case 18:
             return super.mergeFrom(p0, p1, p2, p3);
           case 19:
             return super.mergeFrom(p0, p1, p2, p3);
           case 20:
             return super.mergeFrom(p0, p1, p2, p3);
           default:
             return super.mergeFrom(p0, p1, p2, p3);
       }
    }
}
