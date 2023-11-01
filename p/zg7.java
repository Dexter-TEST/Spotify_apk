package p.zg7;
import p.bh7;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.CharSequence;
import android.view.View;
import p.ph7;

public final class zg7 extends bh7	// class@002ef3 from classes.dex
{
    public final int e;

    public void zg7(int p0,int p1){
       this.e = p1;
       super(p0, Boolean.class, 0, 28);
    }
    public void zg7(int p0,int p1,int p2,int p3){
       this.e = p3;
       super(p0, CharSequence.class, p1, p2);
    }
    public final Boolean d(View p0){
       switch (this.e){
           case 0:
           default:
             return Boolean.valueOf(ph7.c(p0));
       }
       return Boolean.valueOf(ph7.d(p0));
    }
}
