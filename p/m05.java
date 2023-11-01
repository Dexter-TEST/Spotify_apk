package p.m05;
import p.n05;
import java.lang.Object;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class m05 extends n05	// class@001dfd from classes.dex
{
    public final float a;
    public final int b;
    public final int c;

    public void m05(int p0,float p1,int p2){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof m05) {
          return false;
       }
       if ((this.a - p0.a) || (p0.b != this.b || p0.c != this.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.c).hashCode() + ((Integer.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 0) * 31)) * 31));
    }
    public final String toString(){
       return tp2.n("Synchronizing{percentComplete="+this.a+", totalTracks="+this.b+", syncedTracks=", this.c, '}');
    }
}
