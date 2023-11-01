package p.yr7;
import android.graphics.drawable.Drawable$ConstantState;
import p.wr7;
import android.graphics.drawable.Drawable;
import p.xr7;
import android.content.res.Resources;

public final class yr7 extends Drawable$ConstantState	// class@002e15 from classes.dex
{
    public int a;
    public Drawable$ConstantState b;
    public ColorStateList c;
    public PorterDuff$Mode d;

    public void yr7(yr7 p0){
       super();
       this.c = null;
       this.d = wr7.x;
       if (p0 != null) {
          this.a = p0.a;
          this.b = p0.b;
          this.c = p0.c;
          this.d = p0.d;
       }
       return;
    }
    public final int getChangingConfigurations(){
       yr7 tb;
       yr7 ta = this.a;
       int changingConf = ((tb = this.b) != null)? tb.getChangingConfigurations(): 0;
       return (ta | changingConf);
    }
    public final Drawable newDrawable(){
       return new xr7(this, null);
    }
    public final Drawable newDrawable(Resources p0){
       return new xr7(this, p0);
    }
}
