package com.spotify.player.legacyplayer.PlayerTrack;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import p.co5;
import p.k73;
import p.m73;
import java.util.Set;
import p.dt5;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map$Entry;

public final class PlayerTrack implements Parcelable	// class@000b23 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String t;
    public final String v;
    public final Map w;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerTrack.CREATOR = new a(8);
    }
    public void PlayerTrack(String p0,String p1,String p2,String p3,String p4,Map p5){
       co5.o(p0, "uri");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       if (p1 == null) {
          p1 = "";
       }
       this.b = p1;
       k73 ok73 = m73.a();
       if (p5 != null && ((p5.isEmpty() ^ 1))) {
          ok73.f(p5.entrySet());
       }
       if (p2 != null) {
          p4 = "album_uri";
          if (p5 == null || !p5.containsKey(p4)) {
             ok73.d(p4, p2);
          }
       }
       if (p3 != null && (p5 == null && p5.containsKey("artist_uri"))) {
          ok73.d("artist_uri", p3);
       }
       this.w = ok73.b(1);
       return;
    }
    public final PlayerTrack copy(String p0,String p1,String p2,String p3,String p4,Map p5){
       co5.o(p0, "uri");
       PlayerTrack v0 = new PlayerTrack(p0, p1, p2, p3, p4, p5);
       return v0;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerTrack) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       if (!co5.c(this.w, p0.w)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       PlayerTrack tb;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       i2 = ((tb = this.t) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       i2 = ((tb = this.v) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.w) != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return "PlayerTrack\(uri="+this.a+", uid="+this.b+", albumUri="+this.c+", artistUri="+this.t+", provider="+this.v+", metadata="+this.w+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       PlayerTrack tw;
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.t);
       p0.writeString(this.v);
       if ((tw = this.w) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          p0.writeInt(tw.size());
          Iterator iterator = tw.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             p0.writeString(uEntry.getKey());
             p0.writeString(uEntry.getValue());
          }
       }
       return;
    }
}
