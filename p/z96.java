package p.z96;
import p.z6;
import com.spotify.lite.welcome.SelectLoginActivity;
import java.lang.Object;
import p.y6;
import java.lang.Class;
import android.content.Intent;
import java.lang.String;
import android.app.Activity;

public final class z96 implements z6	// class@002eb3 from classes.dex
{
    public final int a;
    public final SelectLoginActivity b;

    public void z96(SelectLoginActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void b(Object p0){
       y6 b;
       Intent intent;
       z96 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             if ((b = p0.b) == null) {
                b = new Intent();
             }
             break;
           default:
             tb.getClass();
             if ((b = p0.b) == null) {
                intent = new Intent();
             }
             intent.putExtra("SELECTED_METHOD", 3);
             tb.setResult(p0.a, intent);
             tb.finish();
             return;
       }
       b.putExtra("SELECTED_METHOD", 1);
       tb.setResult(p0.a, b);
       tb.finish();
       return;
    }
}
