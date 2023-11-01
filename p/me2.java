package p.me2;
import p.tj7;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import p.oe2;
import com.spotify.legacyglue.widgetstate.ViewPagerIndicator;
import java.lang.Class;
import android.view.View;

public final class me2 extends tj7	// class@001e7a from classes.dex
{
    public final int a;
    public final Object b;

    public void me2(){
       this.a = 1;
       super();
       this.b = new ArrayList(3);
    }
    public void me2(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(int p0){
       me2 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             try{
                Iterator iterator = tb.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(p0);
                }
                return;
             }catch(java.util.ConcurrentModificationException e3){
                throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e3);
             }
             break;
           default:
             tb.getClass();
             return;
       }
       tb.b(false);
       return;
    }
    public final void b(int p0,float p1,int p2){
       me2 tb = this.b;
       switch (this.a){
           case 1:
             try{
                Iterator iterator = tb.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(p0, p1, p2);
                }
                return;
             }catch(java.util.ConcurrentModificationException e3){
                throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e3);
             }
             break;
           case 2:
             tb.getClass();
             if ((0 - p1) <= 0) {
                p1 = 0;
             }
             break;
           default:
             return;
       }
       tb.c = (float)p0 + p1;
       tb.postInvalidate();
       return;
    }
    public final void c(int p0){
       me2 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             try{
                Iterator iterator = tb.iterator();
                while (iterator.hasNext()) {
                   iterator.next().c(p0);
                }
                return;
             }catch(java.util.ConcurrentModificationException e3){
                throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e3);
             }
             break;
           default:
             tb.c = (float)p0;
             tb.postInvalidate();
             return;
       }
       tb.b(false);
       return;
    }
}
