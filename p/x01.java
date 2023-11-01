package p.x01;
import android.database.ContentObserver;
import p.y01;
import android.os.Handler;
import android.database.Cursor;
import android.net.Uri;
import p.qb2;

public final class x01 extends ContentObserver	// class@002bde from classes.dex
{
    public final int a;
    public final Object b;

    public void x01(y01 p0){
       this.a = 0;
       this.b = p0;
       super(new Handler());
    }
    public final boolean deliverSelfNotifications(){
       switch (this.a){
           case 0:
           default:
             return super.deliverSelfNotifications();
       }
       return true;
    }
    public final void onChange(boolean p0){
       y01 c;
       switch (this.a){
           case 0:
             x01 tb = this.b;
             if (tb.b != null && ((c = tb.c) != null && !c.isClosed())) {
                tb.a = tb.c.requery();
             }
             break;
           default:
             super.onChange(p0);
             return;
       }
       return;
    }
    public final void onChange(boolean p0,Uri p1){
       switch (this.a){
           case 1:
           default:
             super.onChange(p0, p1);
             return;
       }
       this.b.c();
       return;
    }
}
