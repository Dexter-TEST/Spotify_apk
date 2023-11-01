package p.e36;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e5;

public final class e36 extends Drawable$ConstantState	// class@001411 from classes.dex
{
    public final Drawable a;
    public final float b;
    public final int c;
    public int d;

    public void e36(float p0,int p1,Drawable p2){
       co5.o(p2, "drawable");
       super();
       this.a = p2;
       this.b = p0;
       this.c = p1;
       p2.setBounds(0, 0, p2.getIntrinsicWidth(), p2.getIntrinsicHeight());
    }
    public final int getChangingConfigurations(){
       return this.d;
    }
    public final Drawable newDrawable(){
       return new e5(this.b, this.c, this.a);
    }
}
