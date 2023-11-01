package p.vq3;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class vq3	// class@002a45 from classes.dex
{
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public void vq3(BroadcastReceiver p0,IntentFilter p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final String toString(){
       StringBuilder str = new StringBuilder(128)+"Receiver{"+this.b+" filter="+this.a;
       if (this.d != null) {
          str = str+" DEAD";
       }
       return str+"}";
    }
}
