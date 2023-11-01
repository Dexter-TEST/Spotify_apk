package p.im7;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class im7 implements View$OnTouchListener	// class@0019c4 from classes.dex
{

    public void im7(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       if (!p0.hasFocus()) {
          p0.requestFocus();
       }
       return false;
    }
}
