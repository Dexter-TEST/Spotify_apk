package p.sr6;
import p.ge1;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import p.fe1;

public abstract class sr6 extends ge1	// class@002687 from classes.dex
{
    public rr6 E;
    public boolean F;

    public void sr6(){
       super();
    }
    public final void applyTheme(Resources$Theme p0){
       super.applyTheme(p0);
       this.onStateChange(this.getState());
    }
    public Drawable mutate(){
       if (this.F == null) {
          super.mutate();
          this.E.e();
          this.F = true;
       }
       return this;
    }
    public abstract boolean onStateChange(int[] p0);
}
