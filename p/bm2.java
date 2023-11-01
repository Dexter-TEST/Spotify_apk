package p.bm2;
import android.graphics.drawable.Drawable$ConstantState;
import p.dm2;
import android.graphics.drawable.Drawable;
import p.em2;

public final class bm2 extends Drawable$ConstantState	// class@0010f0 from classes.dex
{
    public final dm2 a;
    public int b;
    public int c;
    public final boolean d;
    public float e;
    public int f;

    public void bm2(dm2 p0,int p1,int p2,boolean p3,float p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final int getChangingConfigurations(){
       return this.f;
    }
    public final Drawable newDrawable(){
       em2 v6 = new em2(this.a, this.b, this.c, this.d, this.e);
       return v6;
    }
}
