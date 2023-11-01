package p.y65;
import java.lang.Object;
import android.graphics.Color;
import p.lj0;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.Arrays;

public final class y65	// class@002d5b from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public void y65(int p0,int p1){
       super();
       this.a = Color.red(p0);
       this.b = Color.green(p0);
       this.c = Color.blue(p0);
       this.d = p0;
       this.e = p1;
    }
    public final void a(){
       if (this.f == null) {
          int i = -1;
          float f = 4.50f;
          y65 td = this.d;
          int i1 = lj0.e(i, f, td);
          int i2 = lj0.e(i, 3.00f, td);
          if (i1 != i && i2 != i) {
             this.h = lj0.h(i, i1);
             this.g = lj0.h(i, i2);
             this.f = true;
             return;
          }else {
             int i3 = lj0.e(0xff000000, f, td);
             int i4 = lj0.e(0xff000000, 3.00f, td);
             if (i3 != i && i4 != i) {
                this.h = lj0.h(0xff000000, i3);
                this.g = lj0.h(0xff000000, i4);
                this.f = true;
                return;
             }else if(i1 != i){
                i3 = lj0.h(i, i1);
             }else {
                i3 = lj0.h(0xff000000, i3);
             }
             this.h = i3;
             i = (i2 != i)? lj0.h(i, i2): lj0.h(0xff000000, i4);
             this.g = i;
             this.f = true;
          }
       }
       return;
    }
    public final float[] b(){
       if (this.i == null) {
          float[] uofloatArray = new float[3];
          this.i = uofloatArray;
       }
       lj0.a(this.a, this.b, this.c, this.i);
       return this.i;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || y65.class != p0.getClass()) {
          return false;
       }
       if (this.e != p0.e || this.d != p0.d) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return ((this.d * 31) + this.e);
    }
    public final String toString(){
       this.a();
       this.a();
       return y65.class.getSimpleName()+" [RGB: #"+Integer.toHexString(this.d)+"] [HSL: "+Arrays.toString(this.b())+"] [Population: "+this.e+"] [Title Text: #"+Integer.toHexString(this.g)+"] [Body Text: #"+Integer.toHexString(this.h)+']';
    }
}
