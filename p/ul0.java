package p.ul0;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.StringBuilder;

public class ul0	// class@0028ce from classes.dex
{
    private int _handled;
    public final Throwable a;
    public static final AtomicIntegerFieldUpdater b;

    static {
       ul0.b = AtomicIntegerFieldUpdater.newUpdater(ul0.class, "_handled");
    }
    public void ul0(Throwable p0,boolean p1){
       super();
       this.a = p0;
       this._handled = p1;
    }
    public final String toString(){
       return this.getClass().getSimpleName()+'['+this.a+']';
    }
}
