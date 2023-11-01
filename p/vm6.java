package p.vm6;
import p.zf2;
import p.gh2;
import java.lang.Object;
import p.cv1;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import android.app.Activity;
import p.ba0;
import java.lang.Number;

public final class vm6 extends gh2 implements zf2	// class@002a25 from classes.dex
{
    public final int z;

    public void vm6(int p0,Object p1){
       this.z = p0;
       switch (p0){
           case 1:
             super(1, p1, View.class, "findViewById", "findViewById\(I\)Landroid/view/View;");
             return;
           case 2:
             super(1, p1, cv1.class, "addStatesListEnteredCountsTotal", "addStatesListEnteredCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           case 3:
             super(1, p1, cv1.class, "addStatesListRejectedClientCountsTotal", "addStatesListRejectedClientCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           case 4:
             super(1, p1, cv1.class, "addStatesListDroppedCountsTotal", "addStatesListDroppedCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           case 5:
             super(1, p1, cv1.class, "addStatesListPersistedCountsTotal", "addStatesListPersistedCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           case 6:
             super(1, p1, cv1.class, "addStatesListRejectedBackendCountsTotal", "addStatesListRejectedBackendCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           case 7:
             super(1, p1, cv1.class, "addStatesListDeliveredCountsTotal", "addStatesListDeliveredCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           case 8:
             super(1, p1, cv1.class, "addStatesListDeletedCountsTotal", "addStatesListDeletedCountsTotal\(J\)Lcom/spotify/messages/EventSenderStats2NonAuth$Builder;");
             return;
           default:
             super(1, p1, Activity.class, "findViewById", "findViewById\(I\)Landroid/view/View;");
             return;
       }
    }
    public final cv1 g(long p0){
       ba0 tb = this.b;
       switch (this.z){
           case 2:
             tb.o(p0);
             return tb;
           case 3:
             tb.s(p0);
             return tb;
           case 4:
             tb.n(p0);
             return tb;
           case 5:
             tb.q(p0);
             return tb;
           case 6:
             tb.r(p0);
             return tb;
           case 7:
             tb.m(p0);
             return tb;
           default:
             tb.l(p0);
             return tb;
       }
    }
    public final Object invoke(Object p0){
       int i;
       ba0 tb = this.b;
       vm6 tz = this.z;
       switch (tz){
           case 0:
             i = p0.intValue();
             switch (tz){
                 case 0:
                   i = tb.findViewById(i);
                   break;
                 default:
                   i = tb.findViewById(i);
             }
             return i;
             break;
           case 1:
             i = p0.intValue();
             switch (tz){
                 case 0:
                   i = tb.findViewById(i);
                   break;
                 default:
                   i = tb.findViewById(i);
             }
             return i;
             break;
           case 2:
             return this.g(p0.longValue());
           case 3:
             return this.g(p0.longValue());
           case 4:
             return this.g(p0.longValue());
           case 5:
             return this.g(p0.longValue());
           case 6:
             return this.g(p0.longValue());
           case 7:
             return this.g(p0.longValue());
           default:
             return this.g(p0.longValue());
       }
    }
}
