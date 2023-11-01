package p.pc1;
import android.view.DisplayCutout;
import java.lang.Object;
import java.lang.Class;
import p.yo4;
import p.q3;
import java.lang.String;
import java.lang.StringBuilder;

public final class pc1	// class@002232 from classes.dex
{
    public final DisplayCutout a;

    public void pc1(DisplayCutout p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 != null && pc1.class == p0.getClass()) {
          return yo4.a(this.a, p0.a);
       }
       return false;
    }
    public final int hashCode(){
       pc1 ta;
       int i = ((ta = this.a) == null)? 0: q3.c(ta);
       return i;
    }
    public final String toString(){
       return "DisplayCutoutCompat{"+this.a+"}";
    }
}
