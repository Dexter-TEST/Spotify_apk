package p.ho6;
import android.text.TextWatcher;
import android.text.SpanWatcher;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.Spannable;
import p.xa7;
import android.os.Build$VERSION;

public final class ho6 implements TextWatcher, SpanWatcher	// class@001892 from classes.dex
{
    public final Object a;
    public final AtomicInteger b;

    public void ho6(Object p0){
       super();
       this.b = new AtomicInteger(0);
       this.a = p0;
    }
    public final void afterTextChanged(Editable p0){
       this.a.afterTextChanged(p0);
    }
    public final void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.a.beforeTextChanged(p0, p1, p2, p3);
    }
    public final void onSpanAdded(Spannable p0,Object p1,int p2,int p3){
       if (this.b.get() > 0 && p1 instanceof xa7) {
          return;
       }
       this.a.onSpanAdded(p0, p1, p2, p3);
       return;
    }
    public final void onSpanChanged(Spannable p0,Object p1,int p2,int p3,int p4,int p5){
       int i;
       int i1;
       if (this.b.get() > 0 && p1 instanceof xa7) {
          return;
       }
       if (Build$VERSION.SDK_INT < 28) {
          if (p2 > p3) {
             p2 = 0;
          }
          if (p4 > p5) {
             i = p2;
             i1 = 0;
          label_001e :
             this.a.onSpanChanged(p0, p1, i, p3, i1, p5);
             return;
          }
       }
       i = p2;
       i1 = p4;
       goto label_001e ;
    }
    public final void onSpanRemoved(Spannable p0,Object p1,int p2,int p3){
       if (this.b.get() > 0 && p1 instanceof xa7) {
          return;
       }
       this.a.onSpanRemoved(p0, p1, p2, p3);
       return;
    }
    public final void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.a.onTextChanged(p0, p1, p2, p3);
    }
}
