package p.o46;
import p.s46;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class o46 implements s46	// class@0020ab from classes.dex
{
    public final List a;
    public final boolean b;
    public final boolean c;

    public void o46(List p0,boolean p1,boolean p2){
       co5.o(p0, "content");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof o46) {
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
       return true;
    }
    public final int hashCode(){
       o46 tb;
       int i = this.a.hashCode() * 31;
       int i1 = 1;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       i = (i + tb) * 31;
       if ((tb = this.c) == null) {
          i1 = tb;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("ScreenContent\(content="+this.a+", useContentStackView="+this.b+", showInputs=", this.c, ')');
    }
}
