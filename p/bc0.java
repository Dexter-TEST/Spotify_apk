package p.bc0;
import p.ul0;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p.au0;
import java.lang.Throwable;

public final class bc0 extends ul0	// class@001095 from classes.dex
{
    private int _resumed;
    public static final AtomicIntegerFieldUpdater c;

    static {
       bc0.c = AtomicIntegerFieldUpdater.newUpdater(bc0.class, "_resumed");
    }
    public void bc0(au0 p0,Throwable p1,boolean p2){
       super(p1, p2);
       this._resumed = 0;
    }
}
