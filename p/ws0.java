package p.ws0;
import p.eo5;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class ws0 extends eo5	// class@002b95 from classes.dex
{
    public final Drawable D;

    public void ws0(Drawable p0){
       this.D = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ws0) {
          return false;
       }
       if (!co5.c(this.D, p0.D)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.D.hashCode();
    }
    public final String toString(){
       return "DrawableIcon\(drawable="+this.D+')';
    }
}
