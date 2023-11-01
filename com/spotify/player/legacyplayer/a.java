package com.spotify.player.legacyplayer.a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.player.legacyplayer.PlayerSuppressions;
import com.spotify.player.legacyplayer.PlayerRestrictions;
import com.spotify.player.legacyplayer.PlayerQueue;
import com.spotify.player.legacyplayer.PlayerContextPage;
import com.spotify.player.legacyplayer.PlayerContext;
import com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import com.spotify.player.legacyplayer.AutoValue_PlayerOptionsOverrides;
import java.lang.Boolean;
import com.spotify.player.legacyplayer.AutoValue_PlayerOptions;
import java.lang.String;
import p.co5;
import java.util.LinkedHashMap;
import java.util.AbstractMap;
import com.spotify.player.legacyplayer.PlayerTrack;
import java.util.Map;

public final class a implements Parcelable$Creator	// class@000b25 from classes.dex
{
    public final int a;

    public void a(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       boolean b2;
       Boolean uBoolean1;
       Boolean uBoolean2;
       PlayerTrack p0;
       Boolean uBoolean = null;
       boolean b = false;
       int i = 1;
       switch (this.a){
           case 0:
             boolean b1 = (p0.readInt() == i)? true: false;
             b2 = (p0.readInt() == i)? true: false;
             if (p0.readInt() == i) {
                b = true;
             }
             return new AutoValue_PlayerOptions(b1, b2, b);
             break;
           case 1:
             if (!p0.readInt()) {
                b2 = (p0.readInt() == i)? true: false;
                uBoolean1 = Boolean.valueOf(b2);
             }else {
                uBoolean1 = uBoolean;
             }
             if (!p0.readInt()) {
                boolean b3 = (p0.readInt() == i)? true: false;
                uBoolean2 = Boolean.valueOf(b3);
             }else {
                uBoolean2 = uBoolean;
             }
             if (!p0.readInt()) {
                if (p0.readInt() == i) {
                   b = true;
                }
                uBoolean = Boolean.valueOf(b);
             }
             return new AutoValue_PlayerOptionsOverrides(uBoolean1, uBoolean2, uBoolean);
             break;
           case 2:
             return new PlayOptionsSkipTo(p0);
           case 3:
             return new PlayerContext(p0);
           case 4:
             return new PlayerContextPage(p0);
           case 5:
             return new PlayerQueue(p0);
           case 6:
             return new PlayerRestrictions(p0);
           case 7:
             return new PlayerSuppressions(p0);
           default:
             co5.o(p0, "parcel");
             String str = p0.readString();
             String str1 = p0.readString();
             String str2 = p0.readString();
             String str3 = p0.readString();
             String str4 = p0.readString();
             if (p0.readInt()) {
                int i1 = p0.readInt();
                uBoolean = new LinkedHashMap(i1);
                for (; b != i1; b = b + 1) {
                   uBoolean.put(p0.readString(), p0.readString());
                }
             }
             Boolean uBoolean3 = uBoolean;
             p0 = new PlayerTrack(str, str1, str2, str3, str4, uBoolean3);
             return p0;
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             AutoValue_PlayerOptions[] uAutoValue_P = new AutoValue_PlayerOptions[p0];
             return uAutoValue_P;
           case 1:
             AutoValue_PlayerOptionsOverrides[] uAutoValue_P1 = new AutoValue_PlayerOptionsOverrides[p0];
             return uAutoValue_P1;
           case 2:
             PlayOptionsSkipTo[] playOptionsS = new PlayOptionsSkipTo[p0];
             return playOptionsS;
           case 3:
             PlayerContext[] playerContex = new PlayerContext[p0];
             return playerContex;
           case 4:
             PlayerContextPage[] playerContex1 = new PlayerContextPage[p0];
             return playerContex1;
           case 5:
             PlayerQueue[] playerQueueA = new PlayerQueue[p0];
             return playerQueueA;
           case 6:
             PlayerRestrictions[] playerRestri = new PlayerRestrictions[p0];
             return playerRestri;
           case 7:
             PlayerSuppressions[] playerSuppre = new PlayerSuppressions[p0];
             return playerSuppre;
           default:
             PlayerTrack[] playerTrackA = new PlayerTrack[p0];
             return playerTrackA;
       }
    }
}
