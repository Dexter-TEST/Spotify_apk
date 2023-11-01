package p.ge;
import android.graphics.drawable.Drawable$ConstantState;
import p.ee1;
import android.graphics.drawable.Drawable;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.res.Resources;

public final class ge extends Drawable$ConstantState	// class@0016f4 from classes.dex
{
    public og7 a;
    public AnimatorSet b;
    public ArrayList c;
    public pk d;

    public void ge(ee1 p0){
       super();
    }
    public final int getChangingConfigurations(){
       return 0;
    }
    public final Drawable newDrawable(){
       throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    public final Drawable newDrawable(Resources p0){
       throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
