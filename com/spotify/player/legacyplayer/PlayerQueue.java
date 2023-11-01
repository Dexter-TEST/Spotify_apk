package com.spotify.player.legacyplayer.PlayerQueue;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import com.spotify.player.legacyplayer.PlayerTrack;
import android.os.Parcelable$Creator;
import p.eo5;
import java.util.Arrays;

public class PlayerQueue implements Parcelable	// class@000b20 from classes.dex
{
    public final PlayerTrack a;
    public final PlayerTrack[] b;
    public final PlayerTrack[] c;
    public final String t;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerQueue.CREATOR = new a(5);
    }
    public void PlayerQueue(Parcel p0){
       super();
       this.t = p0.readString();
       Parcelable$Creator cREATOR = PlayerTrack.CREATOR;
       this.a = eo5.K(p0, cREATOR);
       this.b = p0.createTypedArray(cREATOR);
       this.c = p0.createTypedArray(cREATOR);
    }
    public void PlayerQueue(String p0,PlayerTrack p1,PlayerTrack[] p2,PlayerTrack[] p3){
       super();
       this.t = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       PlayerQueue ta;
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerQueue) {
          return false;
       }
       if (!this.t.equals(p0.t)) {
          return false;
       }
       PlayerQueue a = p0.a;
       if ((ta = this.a) != null) {
          if (!ta.equals(a)) {
          label_0026 :
             return false;
          }
       }else if(a != null){
          goto label_0026 ;
       }
       if (!Arrays.equals(this.b, p0.b)) {
          return false;
       }else {
          return Arrays.equals(this.c, p0.c);
       }
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.t,this.a};
       return ((((Arrays.hashCode(objArray) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c));
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.t);
       eo5.d0(0, p0, this.a);
       p0.writeTypedArray(this.b, 0);
       p0.writeTypedArray(this.c, 0);
    }
}
