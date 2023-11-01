package p.ng7;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import p.og7;
import android.graphics.drawable.VectorDrawable;
import p.fg7;
import android.content.res.Resources;
import android.content.res.Resources$Theme;

public final class ng7 extends Drawable$ConstantState	// class@001fd5 from classes.dex
{
    public final Drawable$ConstantState a;

    public void ng7(Drawable$ConstantState p0){
       super();
       this.a = p0;
    }
    public final boolean canApplyTheme(){
       return this.a.canApplyTheme();
    }
    public int getChangingConfigurations(){
       return this.a.getChangingConfigurations();
    }
    public final Drawable newDrawable(){
       og7 oog7 = new og7();
       oog7.a = this.a.newDrawable();
       return oog7;
    }
    public final Drawable newDrawable(Resources p0){
       og7 oog7 = new og7();
       oog7.a = this.a.newDrawable(p0);
       return oog7;
    }
    public final Drawable newDrawable(Resources p0,Resources$Theme p1){
       og7 oog7 = new og7();
       oog7.a = this.a.newDrawable(p0, p1);
       return oog7;
    }
}
