package p.wz1;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.graphics.drawable.Drawable;
import p.yz1;

public final class wz1 extends Drawable$ConstantState	// class@002bd5 from classes.dex
{
    public final Context a;
    public final String b;
    public final int c;
    public final int d;
    public int e;

    public void wz1(int p0,int p1,Context p2,String p3){
       co5.o(p2, "context");
       super();
       this.a = p2;
       this.b = p3;
       this.c = p0;
       this.d = p1;
    }
    public final int getChangingConfigurations(){
       return this.e;
    }
    public final Drawable newDrawable(){
       return new yz1(this.c, this.d, this.a, this.b);
    }
}
