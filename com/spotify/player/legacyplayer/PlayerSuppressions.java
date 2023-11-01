package com.spotify.player.legacyplayer.PlayerSuppressions;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;
import java.lang.Object;
import java.util.HashSet;
import p.eo5;
import java.util.Set;
import java.util.Collections;

public class PlayerSuppressions implements Parcelable	// class@000b22 from classes.dex
{
    public final Set a;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerSuppressions.CREATOR = new a(7);
    }
    public void PlayerSuppressions(Parcel p0){
       super();
       this.a = eo5.J(p0);
    }
    public void PlayerSuppressions(Set p0){
       super();
       this.a = (p0 != null && !p0.isEmpty())? Collections.unmodifiableSet(p0): Collections.unmodifiableSet(Collections.emptySet());
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerSuppressions) {
          return false;
       }
       if (!this.a.equals(p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final void writeToParcel(Parcel p0,int p1){
       eo5.c0(p0, this.a);
    }
}
