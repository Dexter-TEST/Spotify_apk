package com.spotify.player.legacyplayer.PlayerContextPage;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;
import java.lang.Object;
import p.ry7;
import android.os.Parcelable$Creator;
import p.m73;
import p.eo5;
import java.lang.String;
import com.spotify.player.legacyplayer.PlayerTrack;
import java.util.Map;
import p.dt5;
import java.util.Arrays;
import java.lang.Class;
import p.w51;
import p.pc;

public class PlayerContextPage implements Parcelable	// class@000b1d from classes.dex
{
    public final String a;
    public final String b;
    public final PlayerTrack[] c;
    public final m73 t;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerContextPage.CREATOR = new a(4);
    }
    public void PlayerContextPage(Parcel p0){
       super();
       this.t = eo5.E(p0, ry7.G);
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.createTypedArray(PlayerTrack.CREATOR);
    }
    public void PlayerContextPage(String p0,String p1,PlayerTrack[] p2,Map p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = (p3 != null && !p3.isEmpty())? m73.b(p3): dt5.x;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       PlayerContextPage ta;
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerContextPage) {
          return false;
       }
       if ((ta = this.a) != null) {
          if (!ta.equals(p0.a)) {
          label_001d :
             return false;
          }
       }else if(p0.a != null){
          goto label_001d ;
       }
       if ((ta = this.b) != null) {
          if (!ta.equals(p0.b)) {
          label_002f :
             return false;
          }
       }else if(p0.b != null){
          goto label_002f ;
       }
       if (!Arrays.equals(this.c, p0.c)) {
          return false;
       }else {
          ta = this.t;
          ta.getClass();
          return w51.q(ta, p0.t);
       }
    }
    public final int hashCode(){
       PlayerContextPage ta;
       PlayerContextPage tb;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (this.t.hashCode() + ((((i1 + i) * 31) + Arrays.hashCode(this.c)) * 31));
    }
    public final void writeToParcel(Parcel p0,int p1){
       eo5.Z(p0, this.t, ry7.E, 0);
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeTypedArray(this.c, p1);
    }
}
