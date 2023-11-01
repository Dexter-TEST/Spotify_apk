package com.spotify.player.legacyplayer.AutoValue_PlayerOptions;
import com.spotify.player.legacyplayer.$AutoValue_PlayerOptions;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;

final class AutoValue_PlayerOptions extends $AutoValue_PlayerOptions	// class@000b16 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       AutoValue_PlayerOptions.CREATOR = new a(0);
    }
    public void AutoValue_PlayerOptions(boolean p0,boolean p1,boolean p2){
       super(p0, p1, p2);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
    }
}
