package p.g;
import p.ks6;
import android.os.Parcelable;
import java.lang.String;
import p.v35;
import p.na5;
import p.ra5;
import java.lang.Object;
import java.lang.NullPointerException;
import p.es;
import java.lang.Long;
import java.lang.StringBuilder;

public abstract class g implements ks6, Parcelable	// class@0016ca from classes.dex
{
    public final String a;
    public final v35 b;
    public final na5 c;
    public final ra5 t;
    public final String v;
    public final String w;
    public final boolean x;
    public final long y;
    public final long z;

    public void g(String p0,v35 p1,na5 p2,ra5 p3,String p4,String p5,boolean p6,long p7,long p8){
       super();
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null handle");
       }
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       return;
    }
    public static es c(){
       es uoes = new es();
       uoes.d = null;
       uoes.a = new v35(null, null, null);
       uoes.b = null;
       uoes.c = null;
       uoes.e = null;
       uoes.f = null;
       uoes.e(false);
       uoes.g = Long.valueOf(0);
       uoes.h = Long.valueOf(0);
       return uoes;
    }
    public final boolean a(){
       return false;
    }
    public final boolean b(){
       boolean b;
       if (this.c != null) {
          g tb = this.b;
          if (tb.c != null && (tb.a != null && this.a != null)) {
             b = true;
          label_0015 :
             return b;
          }
       }
       b = false;
       goto label_0015 ;
    }
    public final boolean equals(Object p0){
       g ta;
       g tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof g) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b)) {
                ta = p0.c;
                if ((tc = this.c) == null) {
                   if (ta != null) {
                   label_0079 :
                      b = false;
                   label_007a :
                      return b;
                   }
                }else if(tc.equals(ta)){
                }
                ta = p0.t;
                if ((tc = this.t) == null) {
                   if (ta != null) {
                   }
                }else if(tc.equals(ta)){
                }
                ta = p0.v;
                if ((tc = this.v) == null) {
                   if (ta != null) {
                   }
                }else if(tc.equals(ta)){
                }
                ta = p0.w;
                if ((tc = this.w) == null) {
                   if (ta != null) {
                   }
                }else if(tc.equals(ta)){
                }
                if (this.x == p0.x && (!(this.y - p0.y) && !(this.z - p0.z))) {
                   goto label_007a ;
                }else {
                   goto label_0079 ;
                }
             }else {
                goto label_0079 ;
             }
          }else {
             goto label_0079 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0079 ;
       }
    }
    public final int hashCode(){
       g ta;
       g tc;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (((i1 ^ i2) * i2) ^ this.b.hashCode()) * i2;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tc = this.t) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tc = this.v) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i2;
       if ((tc = this.w) != null) {
          i = tc.hashCode();
       }
       i = (i ^ i1) * i2;
       i1 = (this.x != null)? 1231: 1237;
       tc = this.y;
       g tz = this.z;
       return (((((i ^ i1) * i2) ^ (int)(tc ^ (tc >> 32))) * i2) ^ (int)((tz >> 32) ^ tz));
    }
    public final String toString(){
       return "OneTimePassModel{code="+this.a+", handle="+this.b+", challenge="+this.c+", verified="+this.t+", mismatch="+this.v+", clip="+this.w+", loggingIn="+this.x+", resendEnabledTimeMs="+this.y+", challengeExpiredTimeMs="+this.z+"}";
    }
}
