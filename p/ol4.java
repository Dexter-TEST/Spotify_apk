package p.ol4;
import p.lv1;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ol4 extends lv1	// class@002143 from classes.dex
{
    public final Bitmap P;

    public void ol4(Bitmap p0){
       super();
       this.P = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ol4) {
          return false;
       }
       return p0.P.equals(this.P);
    }
    public final int hashCode(){
       return (this.P.hashCode() + 0);
    }
    public final String toString(){
       return "ExtractColors{cover="+this.P+'}';
    }
}
