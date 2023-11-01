package p.hz3;
import p.iz3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.qw3;
import p.kw3;
import java.lang.StringBuilder;
import p.kg4;

public final class hz3	// class@0018f0 from classes.dex
{
    public final qw3 a;
    public int b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final q87 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public void hz3(iz3 p0){
       co5.o(p0, "lyricsViewConfiguration");
       iz3 a = p0.a;
       qw3 x = a.x;
       co5.o(a, "lyrics");
       iz3 d = p0.d;
       co5.o(d, "translationState");
       super();
       this.a = a;
       this.b = x.c;
       this.c = x.b;
       this.d = p0.c;
       this.e = p0.b;
       this.f = d;
       this.g = p0.e;
       this.h = p0.f;
       this.i = p0.g;
       this.j = p0.j;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof hz3) {
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
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.h != p0.h) {
          return false;
       }
       if (this.i != p0.i) {
          return false;
       }
       if (this.j != p0.j) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       hz3 td;
       int i2;
       hz3 tg;
       int i = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
       int i1 = 1;
       if ((td = this.d) != null) {
          td = 1;
       }
       i = (i + td) * 31;
       if ((td = this.e) != null) {
          i2 = 1;
       }
       i2 = (this.f.hashCode() + ((i + i2) * 31)) * 31;
       if ((tg = this.g) != null) {
          tg = 1;
       }
       i2 = (i2 + tg) * 31;
       if ((tg = this.h) != null) {
          i = 1;
       }
       i2 = (i2 + i) * 31;
       if ((tg = this.i) != null) {
          i = 1;
       }
       i2 = (i2 + i) * 31;
       if ((tg = this.j) == null) {
          i1 = tg;
       }
       return (i2 + i1);
    }
    public final String toString(){
       return kg4.p("LyricsUIModel\(lyrics="+this.a+", activeColor="+this.b+", inactiveColor="+this.c+", showFooter="+this.d+", showHeader="+this.e+", translationState="+this.f+", supportManualScroll="+this.g+", allowLineClicks="+this.h+", useNewFont="+this.i+", singleSentence=", this.j, ')');
    }
}
