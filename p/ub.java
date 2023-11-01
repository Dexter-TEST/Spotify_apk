package p.ub;
import p.p2;
import p.v9;
import io.reactivex.rxjava3.core.Scheduler;
import p.v26;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.i70;
import java.lang.Class;
import p.m26;
import p.vi7;
import p.eb;
import p.tb;

public final class ub extends p2	// class@00287f from classes.dex
{
    public final i9 d;
    public final Scheduler e;
    public final Scheduler f;
    public final i70 g;

    public void ub(v9 p0,Scheduler p1,Scheduler p2,v26 p3){
       co5.o(p3, "savedStateRegistryOwner");
       super(p3);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       i70.c = false;
       this.g = i70.b;
    }
    public final vi7 d(String p0,Class p1,m26 p2){
       co5.o(p2, "savedStateHandle");
       return new eb(new tb(this), p2);
    }
}
