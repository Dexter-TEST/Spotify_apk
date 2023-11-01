package com.spotify.player.legacyplayer.PlayOptions;
import com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import java.lang.Long;
import com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import com.spotify.player.legacyplayer.PlayerSuppressions;
import p.if5;
import p.jf5;
import java.lang.String;
import p.hf5;
import java.lang.Object;

public class PlayOptions	// class@000b1a from classes.dex
{
    public final PlayOptionsSkipTo a;
    public final boolean b;
    public final Long c;
    public final boolean d;
    public final PlayerOptionsOverrides e;
    public final PlayerSuppressions f;
    public final boolean g;
    public final if5 h;
    public final jf5 i;
    public final String j;
    public final boolean k;
    public final hf5 l;
    public final boolean m;

    public void PlayOptions(PlayOptionsSkipTo p0,boolean p1,Long p2,boolean p3,PlayerOptionsOverrides p4,PlayerSuppressions p5,boolean p6,if5 p7,jf5 p8,String p9,boolean p10,hf5 p11,boolean p12){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
    }
    public final boolean equals(Object p0){
       PlayOptions ta;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof PlayOptions) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.k != p0.k) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.m != p0.m) {
          return false;
       }
       PlayOptions a = p0.a;
       if ((ta = this.a) != null) {
          if (!ta.equals(a)) {
          label_0037 :
             return false;
          }
       }else if(a != null){
          goto label_0037 ;
       }
       if (this.b != p0.b) {
          return false;
       }else {
          a = p0.c;
          if ((ta = this.c) != null) {
             if (!ta.equals(a)) {
             label_004e :
                return false;
             }
          }else if(a != null){
             goto label_004e ;
          }
          a = p0.j;
          if ((ta = this.j) != null) {
             if (!ta.equals(a)) {
             label_005e :
                return false;
             }
          }else if(a != null){
             goto label_005e ;
          }
          a = p0.e;
          if ((ta = this.e) != null) {
             if (!ta.equals(a)) {
             label_006e :
                return false;
             }
          }else if(a != null){
             goto label_006e ;
          }
          a = p0.f;
          if ((ta = this.f) != null) {
             if (!ta.equals(a)) {
             label_007e :
                return false;
             }
          }else if(a != null){
             goto label_007e ;
          }
          a = p0.h;
          if ((ta = this.h) != null) {
             if (ta != a) {
             label_008a :
                return false;
             }
          }else if(a != null){
             goto label_008a ;
          }
          a = p0.l;
          if ((ta = this.l) != null) {
             if (ta != a) {
             label_0096 :
                return false;
             }
          }else if(a != null){
             goto label_0096 ;
          }
          p0 = p0.i;
          if ((a = this.i) != null) {
             if (a != p0) {
                b = false;
             }
          }else if(p0 == null){
          }
          return b;
       }
    }
    public final int hashCode(){
       PlayOptions ta;
       PlayOptions tc;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       int i2 = ((tc = this.c) != null)? tc.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.d) * 31;
       i2 = ((tc = this.e) != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tc = this.f) != null)? tc.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.g) * 31;
       i2 = ((tc = this.h) != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tc = this.i) != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tc = this.j) != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tc = this.l) != null)? tc.hashCode(): 0;
       return (((((((i1 + i2) * 31) + this.k) * 31) + i) * 31) + this.m);
    }
}
