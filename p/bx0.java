package p.bx0;
import java.util.Iterator;
import p.et0;
import p.la6;
import p.pa6;
import java.util.ArrayList;
import p.oa6;
import java.util.List;
import p.ye7;
import p.xw0;
import java.lang.Throwable;
import java.lang.Object;
import p.ax0;
import java.lang.Thread;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.RuntimeException;
import java.lang.String;
import p.io2;
import p.ds2;
import p.tx5;
import p.eb3;

public abstract class bx0	// class@001150 from classes.dex
{
    public static final List a;

    static {
       bx0.a = ye7.N(oa6.H(pa6.F(et0.q())));
    }
    public static final void a(xw0 p0,Throwable p1){
       Iterator iterator = bx0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().x(p0, p1);
       }
       Thread thread = Thread.currentThread();
       io2.a(p1, new ds2(p0));
       thread.getUncaughtExceptionHandler().uncaughtException(thread, p1);
       return;
    }
}
