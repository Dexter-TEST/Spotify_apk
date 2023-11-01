package p.he;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import p.ie;
import android.content.Context;
import p.fg7;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.Resources;
import android.content.res.Resources$Theme;

public final class he extends Drawable$ConstantState	// class@00183a from classes.dex
{
    public final Drawable$ConstantState a;

    public void he(Drawable$ConstantState p0){
       super();
       this.a = p0;
    }
    public final boolean canApplyTheme(){
       return this.a.canApplyTheme();
    }
    public final int getChangingConfigurations(){
       return this.a.getChangingConfigurations();
    }
    public final Drawable newDrawable(){
       ie oie = new ie(null);
       Drawable uDrawable = this.a.newDrawable();
       oie.a = uDrawable;
       uDrawable.setCallback(oie.t);
       return oie;
    }
    public final Drawable newDrawable(Resources p0){
       ie oie = new ie(null);
       Drawable uDrawable = this.a.newDrawable(p0);
       oie.a = uDrawable;
       uDrawable.setCallback(oie.t);
       return oie;
    }
    public final Drawable newDrawable(Resources p0,Resources$Theme p1){
       ie oie = new ie(null);
       Drawable uDrawable = this.a.newDrawable(p0, p1);
       oie.a = uDrawable;
       uDrawable.setCallback(oie.t);
       return oie;
    }
}
