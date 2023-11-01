package p.bf1;
import android.view.View$OnTouchListener;
import p.df1;
import android.widget.AutoCompleteTextView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.System;

public final class bf1 implements View$OnTouchListener	// class@0010b0 from classes.dex
{
    public final AutoCompleteTextView a;
    public final df1 b;

    public void bf1(df1 p0,AutoCompleteTextView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       int i = 1;
       if (p1.getAction() == i) {
          bf1 tb = this.b;
          tb.getClass();
          long l = System.currentTimeMillis() - tb.l;
          if ((l) >= 0 && (l - 300) <= 0) {
             i = 0;
          }
          if (i) {
             tb.j = false;
          }
          df1.d(tb, this.a);
       }
       return false;
    }
}
