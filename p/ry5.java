package p.ry5;
import android.graphics.drawable.Drawable$ConstantState;
import p.q24;
import android.graphics.drawable.Drawable;
import p.p24;
import p.sy5;

public final class ry5 extends Drawable$ConstantState	// class@002582 from classes.dex
{
    public final q24 a;
    public boolean b;

    public void ry5(q24 p0){
       super();
       this.a = p0;
       this.b = false;
    }
    public void ry5(ry5 p0){
       super();
       this.a = p0.a.a.newDrawable();
       this.b = p0.b;
    }
    public final int getChangingConfigurations(){
       return 0;
    }
    public final Drawable newDrawable(){
       return new sy5(new ry5(this));
    }
}
