package p.sr5;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.animation.Interpolator;
import p.yr5;
import android.util.Log;

public final class sr5	// class@002686 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public void sr5(){
       super();
       this.d = -1;
       this.f = false;
       this.g = 0;
       this.a = 0;
       this.b = 0;
       this.c = Integer.MIN_VALUE;
       this.e = null;
    }
    public final void a(RecyclerView p0){
       sr5 td;
       sr5 tc;
       if ((td = this.d) >= null) {
          this.d = -1;
          p0.P(td);
          this.f = false;
          return;
       }else if(this.f != null){
          if ((td = this.e) != null && this.c < 1) {
             throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
          }else if((tc = this.c) >= 1){
             p0.v0.c(this.a, this.b, tc, td);
             int i = this.g + 1;
             this.g = i;
             if (i > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
             }
             this.f = false;
          }else {
             throw new IllegalStateException("Scroll duration must be a positive number");
          }
       }else {
          this.g = 0;
       }
       return;
    }
}
