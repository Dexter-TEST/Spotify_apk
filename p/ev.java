package p.ev;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class ev	// class@00150a from classes.dex
{
    public final int a;
    public final MotionEvent b;

    public void ev(MotionEvent p0,int p1){
       super();
       this.a = p1;
       if (p0 == null) {
          throw new NullPointerException("Null motionEvent");
       }
       this.b = p0;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ev) {
          return false;
       }
       if (this.a != p0.a || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "AdapterTouchEvent{position="+this.a+", motionEvent="+this.b+"}";
    }
}
