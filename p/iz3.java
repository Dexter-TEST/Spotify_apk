package p.iz3;
import p.qw3;
import p.q87;
import io.reactivex.rxjava3.core.Observable;
import p.vj3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class iz3	// class@001a33 from classes.dex
{
    public final qw3 a;
    public final boolean b;
    public final boolean c;
    public final q87 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Observable h;
    public final vj3 i;
    public final boolean j;

    public void iz3(qw3 p0,boolean p1,boolean p2,q87 p3,boolean p4,boolean p5,boolean p6,Observable p7,vj3 p8,boolean p9){
       co5.o(p3, "translationState");
       co5.o(p7, "trackProgressSource");
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
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof iz3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       if (!co5.c(this.i, p0.i)) {
          return false;
       }
       if (this.j != p0.j) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       iz3 tb;
       int i2;
       iz3 te;
       int i = this.a.hashCode() * 31;
       int i1 = 1;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       i = (i + tb) * 31;
       if ((tb = this.c) != null) {
          i2 = 1;
       }
       i2 = (this.d.hashCode() + ((i + i2) * 31)) * 31;
       if ((te = this.e) != null) {
          te = 1;
       }
       i2 = (i2 + te) * 31;
       if ((te = this.f) != null) {
          i = 1;
       }
       i2 = (i2 + i) * 31;
       if ((te = this.g) != null) {
          i = 1;
       }
       i = (this.h.hashCode() + ((i2 + i) * 31)) * 31;
       i2 = ((tb = this.i) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.j) == null) {
          i1 = tb;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("LyricsViewConfiguration\(lyrics="+this.a+", showHeader="+this.b+", showFooter="+this.c+", translationState="+this.d+", supportManualScroll="+this.e+", allowLineClicks="+this.f+", useNewFont="+this.g+", trackProgressSource="+this.h+", lifecycle="+this.i+", singleSentence=", this.j, ')');
    }
}
