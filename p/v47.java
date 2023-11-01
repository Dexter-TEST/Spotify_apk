package p.v47;
import android.view.View$OnTouchListener;
import android.view.GestureDetector;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.widget.Checkable;

public final class v47 implements View$OnTouchListener	// class@002980 from classes.dex
{
    public final GestureDetector a;

    public void v47(GestureDetector p0){
       this.a = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       if (p0.isChecked()) {
          return this.a.onTouchEvent(p1);
       }
       return false;
    }
}
