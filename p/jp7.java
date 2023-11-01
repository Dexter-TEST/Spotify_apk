package p.jp7;
import p.kp7;
import android.view.View;
import java.lang.Object;
import android.view.WindowId;

public final class jp7 implements kp7	// class@001b20 from classes.dex
{
    public final WindowId a;

    public void jp7(View p0){
       super();
       this.a = p0.getWindowId();
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof jp7 && p0.a.equals(this.a))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
