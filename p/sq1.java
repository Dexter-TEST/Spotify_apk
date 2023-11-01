package p.sq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsContextPlayerState$PlaybackQuality;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextIndex;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import com.spotify.offline_esperanto.proto.EsOffline$TotalProgressResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import com.spotify.offline_esperanto.proto.EsOffline$Item;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Error;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadResponse;
import com.spotify.offline_esperanto.proto.EsOffline$DeviceKey;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.offline_esperanto.proto.EsOffline$Context;
import com.spotify.metadata.proto.Metadata$VideoFile;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.metadata.proto.Metadata$TopTracks;
import com.spotify.metadata.proto.Metadata$Show;
import com.spotify.metadata.proto.Metadata$SalePeriod;
import com.spotify.metadata.proto.Metadata$Restriction;
import com.spotify.metadata.proto.Metadata$Licensor;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import com.spotify.metadata.proto.Metadata$Image;
import com.spotify.metadata.proto.Metadata$ExternalId;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.metadata.proto.Metadata$Disc;
import com.spotify.metadata.proto.Metadata$Date;
import com.spotify.metadata.proto.Metadata$Copyright;
import com.spotify.metadata.proto.Metadata$ContentRating;
import com.spotify.metadata.proto.Metadata$Biography;

public final class sq1 extends b implements u74	// class@00267a from classes.dex
{

    public void sq1(){
       super(EsPlayOptions$PlayOptions.e());
    }
    public void sq1(int p0){
       switch (p0){
           case 1:
             super(Metadata$ContentRating.e());
             return;
           case 2:
             super(Metadata$Copyright.e());
             return;
           case 3:
             super(Metadata$Date.e());
             return;
           case 4:
             super(Metadata$Disc.e());
             return;
           case 5:
             super(Metadata$Episode.e());
             return;
           case 6:
             super(Metadata$ExternalId.e());
             return;
           case 7:
             super(Metadata$Image.e());
             return;
           case 8:
             super(Metadata$ImageGroup.e());
             return;
           case 9:
             super(Metadata$Licensor.e());
             return;
           case 10:
             super(Metadata$Restriction.e());
             return;
           case 11:
             super(Metadata$SalePeriod.e());
             return;
           case 12:
             super(Metadata$Show.e());
             return;
           case 13:
             super(Metadata$TopTracks.e());
             return;
           case 14:
             super(Metadata$Track.e());
             return;
           case 15:
             super(Metadata$VideoFile.e());
             return;
           case 16:
             super(EsOffline$Context.e());
             return;
           case 17:
             super(EsOffline$ContextInfo.e());
             return;
           case 18:
             super(EsOffline$DeviceKey.e());
             return;
           case 19:
             super(EsOffline$DownloadResponse.e());
             return;
           case 20:
             super(EsOffline$Error.e());
             return;
           case 21:
             super(EsOffline$GetContextsResponse.e());
             return;
           case 22:
             super(EsOffline$Item.e());
             return;
           case 23:
             super(EsOffline$Progress.e());
             return;
           case 24:
             super(EsOffline$TotalProgressResponse.e());
             return;
           case 25:
             super(EsContextPlayerError$ContextPlayerError.e());
             return;
           case 26:
             super(EsContextPlayerOptions$ContextPlayerOptions.e());
             return;
           case 27:
             super(EsContextPlayerState$ContextIndex.e());
             return;
           case 28:
             super(EsContextPlayerState$ContextPlayerState.e());
             return;
           case 29:
             super(EsContextPlayerState$PlaybackQuality.e());
             return;
           default:
             super(Metadata$Biography.e());
             return;
       }
    }
}
