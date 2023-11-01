package p.ps7;
import p.qt5;
import io.reactivex.rxjava3.core.Observable;
import p.ns7;
import p.qs7;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class ps7	// class@0022c4 from classes.dex
{
    public final qt5 a;
    public final Observable b;
    public final ns7 c;
    public final qs7 d;
    public final Scheduler e;

    public void ps7(qt5 p0,Observable p1,ns7 p2,qs7 p3,Scheduler p4){
       co5.o(p0, "zeroRatingIdentificationProperties");
       co5.o(p1, "connectionType");
       co5.o(p2, "zeroRatingIdentificationDataSource");
       co5.o(p3, "zeroRatingIdentificationRetryHandler");
       co5.o(p4, "ioScheduler");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
}
