package p.sl5;
import java.lang.Runnable;
import android.view.Choreographer;
import p.rl5;
import java.lang.Object;
import android.view.Choreographer$FrameCallback;

public abstract class sl5	// class@002651 from classes.dex
{

    public static void a(Runnable p0){
       Choreographer.getInstance().postFrameCallback(new rl5(0, p0));
    }
}
