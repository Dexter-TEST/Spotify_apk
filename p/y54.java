package p.y54;
import android.graphics.Bitmap;
import java.util.Map;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class y54	// class@002d51 from classes.dex
{
    public final Bitmap a;
    public final Map b;

    public void y54(Bitmap p0,Map p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof y54 || (!co5.c(this.a, p0.a) || !co5.c(this.b, p0.b))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "Value\(bitmap="+this.a+", extras="+this.b+')';
    }
}
