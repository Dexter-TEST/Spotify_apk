package p.xk7;
import java.lang.Runnable;
import android.widget.EditText;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import java.lang.String;
import android.view.inputmethod.InputMethodManager;

public final class xk7 implements Runnable	// class@002c98 from classes.dex
{
    public final int a;
    public final View b;

    public void xk7(EditText p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       String str = "input_method";
       xk7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getContext().getSystemService(str).showSoftInput(tb, 1);
             return;
       }
       tb.getContext().getSystemService(str).showSoftInput(tb, 1);
       return;
    }
}
