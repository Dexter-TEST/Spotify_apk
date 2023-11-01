package p.pa4;
import p.ka4;
import p.nf2;
import android.os.Build$VERSION;
import java.lang.String;

public final class pa4 extends ka4	// class@002223 from classes.dex
{
    public static final pa4 c;

    static {
       pa4.c = new pa4();
    }
    public void pa4(){
       super(3, 4);
    }
    public final void a(nf2 p0){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.r("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN \(2, 3, 5\)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
       }
       return;
    }
}
