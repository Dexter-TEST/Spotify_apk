package p.x51;
import android.graphics.drawable.BitmapDrawable;
import java.lang.Object;
import p.co5;

public final class x51	// class@002c0d from classes.dex
{
    public final Drawable a;
    public final boolean b;

    public void x51(BitmapDrawable p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof x51 || (!co5.c(this.a, p0.a) || this.b != p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = this.a.hashCode() * 31;
       int i1 = (this.b != null)? 1231: 1237;
       return (i + i1);
    }
}
