package p.au;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class au	// class@000ff8 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;

    public void au(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof au) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || this.c != p0.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c);
    }
    public final String toString(){
       return en6.o("NowPlayingMobiusColors{backgroundColor="+this.a+", titleColor="+this.b+", textColor=", this.c, "}");
    }
}
