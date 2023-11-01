package com.spotify.player.legacyplayer.PlayerRestrictions;
import android.os.Parcelable;
import com.spotify.player.legacyplayer.a;
import android.os.Parcel;
import java.lang.Object;
import java.util.HashSet;
import p.eo5;
import java.util.Set;
import java.util.Collections;

public class PlayerRestrictions implements Parcelable	// class@000b21 from classes.dex
{
    public final Set A;
    public final Set B;
    public final Set C;
    public final Set D;
    public final Set E;
    public final Set F;
    public final Set G;
    public final Set H;
    public final Set I;
    public final Set J;
    public final Set K;
    public final Set L;
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set t;
    public final Set v;
    public final Set w;
    public final Set x;
    public final Set y;
    public final Set z;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerRestrictions.CREATOR = new a(6);
    }
    public void PlayerRestrictions(Parcel p0){
       super();
       this.a = eo5.J(p0);
       this.b = eo5.J(p0);
       this.c = eo5.J(p0);
       this.t = eo5.J(p0);
       this.v = eo5.J(p0);
       this.w = eo5.J(p0);
       this.x = eo5.J(p0);
       this.y = eo5.J(p0);
       this.z = eo5.J(p0);
       this.A = eo5.J(p0);
       this.B = eo5.J(p0);
       this.C = eo5.J(p0);
       this.D = eo5.J(p0);
       this.E = eo5.J(p0);
       this.F = eo5.J(p0);
       this.G = eo5.J(p0);
       this.H = eo5.J(p0);
       this.I = eo5.J(p0);
       this.J = eo5.J(p0);
       this.K = eo5.J(p0);
       this.L = eo5.J(p0);
    }
    public void PlayerRestrictions(Set p0,Set p1,Set p2,Set p3,Set p4,Set p5,Set p6,Set p7,Set p8,Set p9,Set p10,Set p11,Set p12,Set p13,Set p14,Set p15,Set p16,Set p17,Set p18,Set p19,Set p20){
       int i = this;
       super();
       i.a = PlayerRestrictions.a(p0);
       i.b = PlayerRestrictions.a(p1);
       i.c = PlayerRestrictions.a(p2);
       i.t = PlayerRestrictions.a(p3);
       i.v = PlayerRestrictions.a(p4);
       i.w = PlayerRestrictions.a(p5);
       i.x = PlayerRestrictions.a(p6);
       i.y = PlayerRestrictions.a(p7);
       i.z = PlayerRestrictions.a(p8);
       i.A = PlayerRestrictions.a(p9);
       i.B = PlayerRestrictions.a(p10);
       i.C = PlayerRestrictions.a(p11);
       i.D = PlayerRestrictions.a(p12);
       i.E = PlayerRestrictions.a(p13);
       i.F = PlayerRestrictions.a(p14);
       i.G = PlayerRestrictions.a(p15);
       i.H = PlayerRestrictions.a(p16);
       i.I = PlayerRestrictions.a(p17);
       i.J = PlayerRestrictions.a(p18);
       i.K = PlayerRestrictions.a(p19);
       i.L = PlayerRestrictions.a(p20);
    }
    public static Set a(Set p0){
       if (p0 != null) {
       }else {
          p0 = Collections.emptySet();
       }
       return Collections.unmodifiableSet(p0);
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerRestrictions) {
          return false;
       }
       if (!this.v.equals(p0.v)) {
          return false;
       }
       if (!this.b.equals(p0.b)) {
          return false;
       }
       if (!this.a.equals(p0.a)) {
          return false;
       }
       if (!this.w.equals(p0.w)) {
          return false;
       }
       if (!this.A.equals(p0.A)) {
          return false;
       }
       if (!this.t.equals(p0.t)) {
          return false;
       }
       if (!this.c.equals(p0.c)) {
          return false;
       }
       if (!this.x.equals(p0.x)) {
          return false;
       }
       if (!this.y.equals(p0.y)) {
          return false;
       }
       if (!this.z.equals(p0.z)) {
          return false;
       }
       if (!this.B.equals(p0.B)) {
          return false;
       }
       if (!this.C.equals(p0.C)) {
          return false;
       }
       if (!this.D.equals(p0.D)) {
          return false;
       }
       if (!this.E.equals(p0.E)) {
          return false;
       }
       if (!this.F.equals(p0.F)) {
          return false;
       }
       if (!this.G.equals(p0.G)) {
          return false;
       }
       if (!this.H.equals(p0.H)) {
          return false;
       }
       if (!this.I.equals(p0.I)) {
          return false;
       }
       if (!this.J.equals(p0.J)) {
          return false;
       }
       if (!this.K.equals(p0.K)) {
          return false;
       }
       if (!this.L.equals(p0.L)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.L.hashCode() + ((this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.t.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31));
    }
    public final void writeToParcel(Parcel p0,int p1){
       eo5.c0(p0, this.a);
       eo5.c0(p0, this.b);
       eo5.c0(p0, this.c);
       eo5.c0(p0, this.t);
       eo5.c0(p0, this.v);
       eo5.c0(p0, this.w);
       eo5.c0(p0, this.x);
       eo5.c0(p0, this.y);
       eo5.c0(p0, this.z);
       eo5.c0(p0, this.A);
       eo5.c0(p0, this.B);
       eo5.c0(p0, this.C);
       eo5.c0(p0, this.D);
       eo5.c0(p0, this.E);
       eo5.c0(p0, this.F);
       eo5.c0(p0, this.G);
       eo5.c0(p0, this.H);
       eo5.c0(p0, this.I);
       eo5.c0(p0, this.J);
       eo5.c0(p0, this.K);
       eo5.c0(p0, this.L);
    }
}
