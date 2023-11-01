package p.g27;
import java.lang.Runnable;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Object;
import android.view.View;

public final class g27 implements Runnable	// class@00168a from classes.dex
{
    public final int a;
    public final TextInputLayout b;

    public void g27(TextInputLayout p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       g27 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.v.requestLayout();
             return;
       }
       tb.z0.performClick();
       tb.z0.jumpDrawablesToCurrentState();
       return;
    }
}
