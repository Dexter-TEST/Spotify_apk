package p.hu5;
import p.yf2;
import p.iu5;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import p.ie0;
import java.lang.String;
import p.mi;
import android.text.TextUtils;
import java.lang.Boolean;
import android.text.Editable;
import android.widget.EditText;
import p.vk7;
import p.tk7;
import p.aq6;
import p.td7;
import p.dt5;
import p.m73;
import p.ju5;
import java.util.Map;
import io.reactivex.rxjava3.core.Completable;
import p.cm7;
import p.g16;
import p.b5;
import p.ok0;
import p.jk0;
import p.bo3;
import io.reactivex.rxjava3.core.Observable;
import p.ox7;
import java.lang.IllegalStateException;

public final class hu5 implements yf2	// class@0018c5 from classes.dex
{
    public final int a;
    public final iu5 b;

    public void hu5(iu5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       aq6 uoaq6;
       hu5 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             p0 = ie0.E.O(tb.t.getText());
             iu5 v = tb.v;
             if ((uoaq6 = td7.d(tb.b().a)) == null) {
                throw new IllegalStateException("Could not parse URI");
             }
             v.getClass();
             ju5 w = v.w;
             w.getClass();
             ju5 v1 = v.v;
             v1.getClass();
             return ox7.B(v.t.g(uoaq6.t, m73.h("name", p0)).c(Completable.i(new g16(w, 16, uoaq6))).c(Completable.i(new g16(v1, 10, uoaq6))).c(v1.b()));
       }
       tb.getClass();
       boolean b = (!ie0.E.O(p0).isEmpty() && !TextUtils.equals(tb.A, p0))? true: false;
       return Boolean.valueOf(b);
    }
}
