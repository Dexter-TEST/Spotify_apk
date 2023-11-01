package p.rj4;
import p.uj4;
import android.os.Bundle;
import p.vj4;
import android.app.Notification$BigTextStyle;
import android.app.Notification$Builder;
import java.lang.CharSequence;
import java.lang.String;

public final class rj4 extends uj4	// class@0024fc from classes.dex
{
    public CharSequence c;

    public void rj4(){
       super();
    }
    public final void a(Bundle p0){
       super.a(p0);
    }
    public final void b(vj4 p0){
       new Notification$BigTextStyle(p0.a).setBigContentTitle(this.b).bigText(this.c);
    }
    public final String c(){
       return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
