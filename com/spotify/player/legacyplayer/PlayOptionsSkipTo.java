package com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.io.Serializable;
import java.lang.Integer;
import p.io2;
import java.util.Arrays;

public class PlayOptionsSkipTo implements Parcelable	// class@000b1b from classes.dex
{
    public final String a;
    public final Integer b;
    public final String c;
    public final String t;
    public final int v;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayOptionsSkipTo.CREATOR = new a(2);
    }
    public void PlayOptionsSkipTo(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readSerializable();
       this.c = p0.readString();
       this.t = p0.readString();
       this.v = p0.readInt();
    }
    public void PlayOptionsSkipTo(String p0,Integer p1,String p2,String p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayOptionsSkipTo) {
          return false;
       }
       if (!io2.j(this.a, p0.a)) {
          return false;
       }
       if (!io2.j(this.b, p0.b)) {
          return false;
       }
       if (!io2.j(this.c, p0.c)) {
          return false;
       }
       if (!io2.j(this.t, p0.t)) {
          return false;
       }
       if (this.v != p0.v) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c,this.t,Integer.valueOf(this.v)};
       return Arrays.hashCode(objArray);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeSerializable(this.b);
       p0.writeString(this.c);
       p0.writeString(this.t);
       p0.writeInt(this.v);
    }
}
