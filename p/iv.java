package p.iv;
import p.b43;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import p.o11;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class iv	// class@001a14 from classes.dex
{
    public final boolean a;
    public final b43 b;
    public final String c;
    public final b43 d;
    public final Throwable e;

    public void iv(boolean p0,b43 p1,String p2,b43 p3,Throwable p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final iv a(boolean p0){
       o11 oo11 = new o11(this, 0);
       oo11.b = Boolean.valueOf(p0);
       oo11.w = null;
       oo11.c = null;
       oo11.t = null;
       return oo11.l();
    }
    public final boolean equals(Object p0){
       iv tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof iv) {
          return false;
       }
       if (this.a == p0.a) {
          iv b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_004e :
                b = false;
             label_004f :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          b1 = p0.c;
          if ((tb = this.c) == null) {
             if (b1 != null) {
             }
          }else if(tb.equals(b1)){
          }
          b1 = p0.d;
          if ((tb = this.d) == null) {
             if (b1 != null) {
             }
          }else if(tb.equals(b1)){
          }
          p0 = p0.e;
          if ((b1 = this.e) == null) {
             if (p0 == null) {
                goto label_004f ;
             }else {
                goto label_004e ;
             }
          }else if(b1.equals(p0)){
             goto label_004f ;
          }else {
             goto label_004e ;
          }
       }else {
          goto label_004e ;
       }
    }
    public final int hashCode(){
       iv tb;
       iv te;
       int i = (this.a != null)? 1231: 1237;
       int i1 = 0xf4243;
       i = (i ^ i1) * i1;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i ^ i3) * i1;
       i3 = ((tb = this.c) == null)? 0: tb.hashCode();
       i = (i ^ i3) * i1;
       i3 = ((tb = this.d) == null)? 0: tb.hashCode();
       i = (i ^ i3) * i1;
       if ((te = this.e) != null) {
          i2 = te.hashCode();
       }
       return (i ^ i2);
    }
    public final String toString(){
       return "SearchModel{requestFocus="+this.a+", searchResult="+this.b+", searchQuery="+this.c+", recentSearches="+this.d+", error="+this.e+"}";
    }
}
