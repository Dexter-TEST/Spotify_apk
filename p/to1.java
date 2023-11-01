package p.to1;
import p.p63;
import android.graphics.drawable.Drawable;
import p.n63;
import java.lang.Throwable;
import java.lang.Object;
import p.co5;

public final class to1 extends p63	// class@0027ab from classes.dex
{
    public final Drawable a;
    public final n63 b;
    public final Throwable c;

    public void to1(Drawable p0,n63 p1,Throwable p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final n63 a(){
       return this.b;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof to1 || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || !co5.c(this.c, p0.c)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       to1 ta;
       int i = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (this.c.hashCode() + ((this.b.hashCode() + (i * 31)) * 31));
    }
}
