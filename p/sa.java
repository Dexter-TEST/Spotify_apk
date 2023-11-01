package p.sa;
import p.a02;
import io.reactivex.rxjava3.core.Flowable;
import p.zg0;
import p.kz6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.mf1;
import p.yf2;
import p.ir2;
import java.lang.Class;
import p.r82;
import io.reactivex.rxjava3.core.Observable;

public abstract class sa implements a02	// class@0025f2 from classes.dex
{

    public static kz6 a(Flowable p0,zg0 p1){
       co5.o(p1, "clock");
       p0 = p0.w(new mf1(4, p1));
       p0.getClass();
       return new r82(p0, ir2.N, 0).x();
    }
}
