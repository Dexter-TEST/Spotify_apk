package p.lr;
import p.b43;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import p.i77;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class lr	// class@001daf from classes.dex
{
    public final boolean a;
    public final b43 b;
    public final String c;
    public final String d;
    public final b43 e;
    public final Throwable f;

    public void lr(boolean p0,b43 p1,String p2,String p3,b43 p4,Throwable p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final lr a(boolean p0){
       i77 oi77 = new i77(this);
       oi77.a = Boolean.valueOf(p0);
       oi77.f = null;
       oi77.b = null;
       oi77.d = null;
       return oi77.g();
    }
    public final boolean equals(Object p0){
       lr tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof lr) {
          return false;
       }
       if (this.a == p0.a) {
          lr b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_0058 :
                b = false;
             label_0059 :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          if (this.c.equals(p0.c)) {
             b1 = p0.d;
             if ((tb = this.d) == null) {
                if (b1 != null) {
                }
             }else if(tb.equals(b1)){
             }
             b1 = p0.e;
             if ((tb = this.e) == null) {
                if (b1 != null) {
                }
             }else if(tb.equals(b1)){
             }
             p0 = p0.f;
             if ((b1 = this.f) == null) {
                if (p0 == null) {
                   goto label_0059 ;
                }else {
                   goto label_0058 ;
                }
             }else if(b1.equals(p0)){
                goto label_0059 ;
             }else {
                goto label_0058 ;
             }
          }else {
             goto label_0058 ;
          }
       }else {
          goto label_0058 ;
       }
    }
    public final int hashCode(){
       lr tb;
       lr tf;
       int i = (this.a != null)? 1231: 1237;
       int i1 = 0xf4243;
       i = (i ^ i1) * i1;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (((i ^ i3) * i1) ^ this.c.hashCode()) * i1;
       i3 = ((tb = this.d) == null)? 0: tb.hashCode();
       i = (i ^ i3) * i1;
       i3 = ((tb = this.e) == null)? 0: tb.hashCode();
       i = (i ^ i3) * i1;
       if ((tf = this.f) != null) {
          i2 = tf.hashCode();
       }
       return (i ^ i2);
    }
    public final String toString(){
       return "AssistedCurationSearchModel{requestFocus="+this.a+", searchResult="+this.b+", playlistUri="+this.c+", searchQuery="+this.d+", recentSearches="+this.e+", error="+this.f+"}";
    }
}
