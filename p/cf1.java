package p.cf1;
import android.widget.AutoCompleteTextView$OnDismissListener;
import p.df1;
import java.lang.Object;
import java.lang.System;

public final class cf1 implements AutoCompleteTextView$OnDismissListener	// class@0011f5 from classes.dex
{
    public final df1 a;

    public void cf1(df1 p0){
       this.a = p0;
       super();
    }
    public final void onDismiss(){
       cf1 ta = this.a;
       ta.j = true;
       ta.l = System.currentTimeMillis();
       ta.f(false);
    }
}
