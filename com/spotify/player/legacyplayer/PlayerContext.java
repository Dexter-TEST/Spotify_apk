package com.spotify.player.legacyplayer.PlayerContext;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.ry7;
import android.os.Parcelable$Creator;
import p.m73;
import p.eo5;
import com.spotify.player.legacyplayer.PlayerRestrictions;
import com.spotify.player.legacyplayer.PlayerContextPage;
import java.util.Map;
import p.dt5;
import java.lang.Class;
import p.w51;
import java.util.Arrays;
import p.pc;

public class PlayerContext implements Parcelable	// class@000b1c from classes.dex
{
    public final String a;
    public final String b;
    public final m73 c;
    public final PlayerRestrictions t;
    public final PlayerContextPage[] v;
    public final PlayerContextPage[] w;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerContext.CREATOR = new a(3);
    }
    public void PlayerContext(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = eo5.E(p0, ry7.G);
       this.t = eo5.K(p0, PlayerRestrictions.CREATOR);
       Parcelable$Creator cREATOR = PlayerContextPage.CREATOR;
       this.v = p0.createTypedArray(cREATOR);
       this.w = p0.createTypedArray(cREATOR);
    }
    public void PlayerContext(String p0,Map p1,PlayerRestrictions p2,PlayerContextPage[] p3,PlayerContextPage[] p4,String p5){
       super();
       this.a = p0;
       this.b = p5;
       this.c = (p1 != null && !p1.isEmpty())? m73.b(p1): dt5.x;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       PlayerContext tb;
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerContext) {
          return false;
       }
       if (!this.a.equals(p0.a)) {
          return false;
       }
       PlayerContext b = p0.b;
       if ((tb = this.b) != null) {
          if (!tb.equals(b)) {
          label_0026 :
             return false;
          }
       }else if(b != null){
          goto label_0026 ;
       }
       b = this.c;
       b.getClass();
       if (!w51.q(b, p0.c)) {
          return false;
       }else {
          b = p0.t;
          if ((tb = this.t) != null) {
             if (!tb.equals(b)) {
             label_0044 :
                return false;
             }
          }else if(b != null){
             goto label_0044 ;
          }
          if (!Arrays.equals(this.v, p0.v)) {
             return false;
          }else {
             return Arrays.equals(this.w, p0.w);
          }
       }
    }
    public final int hashCode(){
       PlayerContext tb;
       PlayerContext tt;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) != null)? tb.hashCode(): 0;
       i2 = (this.c.hashCode() + ((i + i2) * 31)) * 31;
       if ((tt = this.t) != null) {
          i1 = tt.hashCode();
       }
       return (((((i2 + i1) * 31) + Arrays.hashCode(this.v)) * 31) + Arrays.hashCode(this.w));
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       eo5.Z(p0, this.c, ry7.E, 0);
       eo5.d0(p1, p0, this.t);
       p0.writeTypedArray(this.v, p1);
       p0.writeTypedArray(this.w, p1);
    }
}
