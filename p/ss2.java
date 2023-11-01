package p.ss2;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import p.il7;
import io.reactivex.rxjava3.core.FlowableEmitter;
import java.lang.Object;
import p.us2;
import p.ts2;
import p.xs2;
import p.bt2;
import java.util.WeakHashMap;
import android.os.Parcelable;
import p.ys2;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.sk3;
import p.ju2;
import android.graphics.Rect;
import android.view.View;
import p.jl7;
import io.reactivex.rxjava3.core.Emitter;

public final class ss2 implements ViewTreeObserver$OnScrollChangedListener	// class@00268c from classes.dex
{
    public final int a;
    public Object b;
    public final Object c;

    public void ss2(il7 p0,FlowableEmitter p1){
       this.a = 1;
       this.b = p1;
       this.c = p0;
       super();
    }
    public void ss2(us2 p0){
       this.a = 0;
       this.c = p0;
       super();
    }
    public void ss2(us2 p0,int p1){
       this.a = 0;
       super(p0);
    }
    public final void onScrollChanged(){
       ss2 tc = this.c;
       switch (this.a){
           case 0:
             us2 e = tc.e;
             us2 f = tc.f;
             if (e != null && f != null) {
                xs2 w = tc.c.w;
                f.b(e, new ts2(w.d(w.a), tc.b.t0()));
             }
             break;
           default:
             ss2 tb = this.b;
             il7 b = tc.b;
             float f1 = (tc.a.getGlobalVisibleRect(b))? (float)b.height() / (float)tc.a.getMeasuredHeight(): 0;
             tb.onNext(new jl7(f1));
             return;
       }
       return;
    }
}
