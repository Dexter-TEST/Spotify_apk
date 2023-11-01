package com.spotify.player.legacyplayer.AutoValue_PlayerOptionsOverrides;
import com.spotify.player.legacyplayer.$AutoValue_PlayerOptionsOverrides;
import com.spotify.player.legacyplayer.a;
import java.lang.Boolean;
import android.os.Parcel;

final class AutoValue_PlayerOptionsOverrides extends $AutoValue_PlayerOptionsOverrides	// class@000b17 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       AutoValue_PlayerOptionsOverrides.CREATOR = new a(1);
    }
    public void AutoValue_PlayerOptionsOverrides(Boolean p0,Boolean p1,Boolean p2){
       super(p0, p1, p2);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       $AutoValue_PlayerOptionsOverrides ta;
       if ((ta = this.a) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeInt(ta.booleanValue());
       }
       if ((ta = this.b) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeInt(ta.booleanValue());
       }
       if ((ta = this.c) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeInt(ta.booleanValue());
       }
       return;
    }
}
