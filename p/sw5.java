package p.sw5;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import java.lang.Object;
import java.lang.Class;
import p.yo4;

public final class sw5	// class@0026b2 from classes.dex
{
    public final Resources a;
    public final Resources$Theme b;

    public void sw5(Resources p0,Resources$Theme p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || sw5.class != p0.getClass()) {
          return false;
       }
       if (!this.a.equals(p0.a) || !yo4.a(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return yo4.b(objArray);
    }
}
