package p.mg7;
import android.graphics.drawable.Drawable$ConstantState;
import p.og7;
import p.lg7;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;

public final class mg7 extends Drawable$ConstantState	// class@001e91 from classes.dex
{
    public int a;
    public lg7 b;
    public ColorStateList c;
    public PorterDuff$Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public void mg7(){
       super();
       this.c = null;
       this.d = og7.A;
       this.b = new lg7();
    }
    public void mg7(mg7 p0){
       super();
       this.c = null;
       this.d = og7.A;
       if (p0 != null) {
          this.a = p0.a;
          lg7 olg7 = new lg7(p0.b);
          this.b = olg7;
          if (p0.b.e != null) {
             olg7.e = new Paint(p0.b.e);
          }
          if (p0.b.d != null) {
             this.b.d = new Paint(p0.b.d);
          }
          this.c = p0.c;
          this.d = p0.d;
          this.e = p0.e;
       }
       return;
    }
    public int getChangingConfigurations(){
       return this.a;
    }
    public final Drawable newDrawable(){
       return new og7(this);
    }
    public final Drawable newDrawable(Resources p0){
       return new og7(this);
    }
}
