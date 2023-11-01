package p.dy0;
import java.util.concurrent.Callable;
import p.ly0;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.zb;

public final class dy0 implements Callable	// class@0013db from classes.dex
{
    public final long a;
    public final ly0 b;

    public void dy0(ly0 p0,long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final Object call(){
       Bundle uBundle = new Bundle();
       uBundle.putInt("fatal", 1);
       uBundle.putLong("timestamp", this.a);
       this.b.s.m(uBundle);
       return null;
    }
}
