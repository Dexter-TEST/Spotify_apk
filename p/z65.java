package p.z65;
import p.v65;
import java.util.ArrayList;
import java.lang.Object;
import android.util.SparseBooleanArray;
import p.pk;
import p.y65;

public final class z65	// class@002e99 from classes.dex
{
    public final List a;
    public final pk b;
    public final SparseBooleanArray c;
    public final y65 d;
    public static final v65 e;

    static {
       z65.e = new v65();
    }
    public void z65(ArrayList p0,ArrayList p1){
       y65 e;
       super();
       this.a = p0;
       this.c = new SparseBooleanArray();
       this.b = new pk();
       int i = p0.size();
       int i1 = Integer.MIN_VALUE;
       y65 oy65 = null;
       int i2 = 0;
       while (i2 < i) {
          y65 oy651 = p0.get(i2);
          if ((e = oy651.e) > i1) {
             oy65 = oy651;
             i1 = e;
          }
          i2 = i2 + 1;
       }
       this.d = oy65;
       return;
    }
}
