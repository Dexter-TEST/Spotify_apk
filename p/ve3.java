package p.ve3;
import p.me3;
import p.ye0;
import p.q75;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.ox7;
import kotlinx.coroutines.internal.a;
import p.ve0;
import p.ij4;
import p.te3;
import p.z83;
import p.ul0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.co5;
import p.oe3;
import p.re3;
import p.io2;
import p.cd2;
import p.ng2;
import p.dl1;
import p.a93;
import java.lang.Boolean;
import p.se3;
import p.bd1;
import p.lj4;
import p.xw0;
import p.vv7;
import p.ue3;
import p.qn;
import p.ww0;
import p.vw0;
import p.is7;
import p.gg1;
import java.util.concurrent.CancellationException;
import p.ue0;
import p.ne3;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.NullPointerException;
import p.c45;
import p.w51;
import p.y83;
import p.zf2;
import p.yc3;
import p.zc3;

public class ve3 implements me3, ye0, q75	// class@0029d7 from classes.dex
{
    private Object _parentHandle;
    private Object _state;
    public static final AtomicReferenceFieldUpdater a;

    static {
       ve3.a = AtomicReferenceFieldUpdater.newUpdater(ve3.class, Object.class, "_state");
    }
    public void ve3(boolean p0){
       super();
       dl1 b = (p0)? ox7.B: ox7.A;
       this._state = b;
       this._parentHandle = null;
       return;
    }
    public static ve0 D(a p0){
       while (p0.i()) {
          p0 = p0.h();
       }
       while (true) {
          p0 = p0.g();
          if (!p0.i()) {
             if (p0 instanceof ve0) {
                break ;
             }else {
                if (p0 instanceof ij4) {
                   return null;
                }
                continue ;
             }
          }
       }
       return p0;
    }
    public static String I(Object p0){
       if (p0 instanceof te3) {
          if (p0.e()) {
             p0 = "Cancelling";
          }else if(p0.f()){
             p0 = "Completing";
          }else {
          label_0024 :
             p0 = "Active";
          }
       }else if(p0 instanceof z83){
          if (p0.b()) {
             goto label_0024 ;
          }else {
             p0 = "New";
          }
       }else if(p0 instanceof ul0){
          p0 = "Cancelled";
       }else {
          p0 = "Completed";
       }
       return p0;
    }
    public boolean A(){
       return false;
    }
    public final Object B(Object p0){
       Object obj;
       String str;
       Throwable throwable;
       while (true) {
          if ((obj = this.K(this.t(), p0)) == ox7.v) {
             str = "Job "+this+" is already complete or completing, but is being completed with "+p0;
             throwable = null;
             if (p0 instanceof ul0) {
             }else {
                p0 = throwable;
             }
             if (p0 != null) {
                throwable = p0.a;
                break ;
             }
             break ;
          }else {
             if (obj != ox7.x) {
                return obj;
             }
             continue ;
          }
       }
       throw new IllegalStateException(str, throwable);
    }
    public String C(){
       return this.getClass().getSimpleName();
    }
    public final void E(ij4 p0,Throwable p1){
       a uoa = p0.f();
       cd2 uocd2 = null;
       while (!co5.c(uoa, p0)) {
          if (uoa instanceof oe3) {
             uoa.l(p1);
          }
          uoa = uoa.g();
       }
       if (uocd2 != null) {
          this.v(uocd2);
       }
       this.i(p1);
       return;
    }
    public void F(Object p0){
    }
    public void G(){
    }
    public final void H(re3 p0){
       AtomicReferenceFieldUpdater a;
       a uoa;
       AtomicReferenceFieldUpdater a1;
       ij4 oij4 = new ij4();
       p0.getClass();
       a.b.lazySet(oij4, p0);
       a = a.a;
       a.lazySet(oij4, p0);
       while (p0.f() == p0) {
          while (true) {
             if (a.compareAndSet(p0, p0, oij4)) {
                uoa = 1;
             }else {
                if (a.get(p0) != p0) {
                   uoa = 0;
                }
             }
             if (uoa) {
                oij4.e(p0);
             }else {
                continue ;
             }
          }
          return;
       }
       uoa = p0.g();
       do {
          a1 = ve3.a;
       } while (a1.compareAndSet(this, p0, uoa) || a1.get(this) != p0);
    }
    public final Object J(Object p0,ng2 p1){
       return p1.b(p0, this);
    }
    public final Object K(Object p0,Object p1){
       ij4 obj;
       int i1;
       if (!p0 instanceof z83) {
          return ox7.v;
       }
       boolean i = 0;
       if (!p0 instanceof dl1 && (!p0 instanceof re3 || (p0 instanceof ve0 || p1 instanceof ul0))) {
          if ((obj = this.r(p0)) == null) {
             p0 = ox7.x;
          }else {
             Throwable throwable = null;
             te3 ote3 = (p0 instanceof te3)? p0: throwable;
             if (ote3 == null) {
                ote3 = new te3(obj, throwable);
             }
             _monitor_enter(ote3);
             if (ote3.f()) {
                p0 = ox7.v;
                _monitor_exit(ote3);
             }else {
                ote3.i();
                if (ote3 != p0) {
                   AtomicReferenceFieldUpdater a = ve3.a;
                   while (true) {
                      if (a.compareAndSet(this, p0, ote3)) {
                         i = 1;
                      }else {
                         if (a.get(this) == p0) {
                            continue ;
                         }
                      }
                      if (!i) {
                         p0 = ox7.x;
                         _monitor_exit(ote3);
                         break ;
                      }
                   }
                }
                i = ote3.e();
                ul0 oul0 = (p1 instanceof ul0)? p1: throwable;
                if (oul0 != null) {
                   ote3.a(oul0.a);
                }
                Throwable throwable1 = ote3.d();
                if (!Boolean.valueOf((i ^ 1)).booleanValue()) {
                   throwable1 = throwable;
                }
                _monitor_exit(ote3);
                if (throwable1 != null) {
                   this.E(obj, throwable1);
                }
                int i2 = (p0 instanceof ve0)? p0: throwable;
                if (i2 == null) {
                   if ((p0 = p0.c()) != null) {
                      throwable = ve3.D(p0);
                   }
                }else {
                   throwable = i2;
                }
                if (throwable != null && this.L(ote3, throwable, p1)) {
                   p0 = ox7.w;
                }else {
                   p0 = this.n(ote3, p1);
                }
             }
          }
          return p0;
       }else {
          obj = p0;
          a93 uoa93 = (p1 instanceof z83)? new a93(p1): p1;
          while (true) {
             p0 = ve3.a;
             if (p0.compareAndSet(this, obj, uoa93)) {
                i1 = 1;
             }else {
                if (p0.get(this) != obj) {
                   i1 = 0;
                }
             }
             if (i1) {
                this.F(p1);
                this.l(obj, p1);
                i = 1;
             }
             if (i) {
                break ;
             }else {
                return ox7.x;
             }
          }
          return p1;
       }
    }
    public final boolean L(te3 p0,ve0 p1,Object p2){
       while (true) {
          if (io2.n(p1.v, false, new se3(this, p0, p1, p2), 1) != lj4.a) {
             return 1;
          }
          if ((p1 = ve3.D(p1)) == null) {
             break ;
          }
       }
       return false;
    }
    public final xw0 T(xw0 p0){
       co5.o(p0, "context");
       return vv7.G(this, p0);
    }
    public boolean b(){
       Object obj = this.t();
       boolean b = (obj instanceof z83 && obj.b())? true: false;
       return b;
    }
    public final boolean e(Object p0,ij4 p1,re3 p2){
       AtomicReferenceFieldUpdater a;
       boolean b;
       int i;
       int i1;
       ue3 oue3 = new ue3(p2, this, p0);
       do {
          p0 = p1.h();
          a.b.lazySet(p2, p0);
          a = a.a;
          a.lazySet(p2, p1);
          oue3.c = p1;
          while (true) {
             b = false;
             if (a.compareAndSet(p0, p1, oue3)) {
                a = 1;
             }else {
                if (a.get(p0) != p1) {
                   a = 0;
                }
             }
             i = 2;
             if (!a) {
                i1 = 0;
             }else if(oue3.a(p0) == null){
                i1 = 1;
             }else {
                i1 = 2;
             }
             if (i1 != 1) {
                if (i1 != i) {
                   continue ;
                }
             }else {
                b = true;
                break ;
             }
             break ;
          }
          return b;
       } while (i1 != i);
    }
    public final vw0 f(ww0 p0){
       return is7.o(this, p0);
    }
    public void g(Object p0){
    }
    public final ww0 getKey(){
       return gg1.y;
    }
    public final boolean h(Object p0){
       Throwable obj;
       ij4 oij4;
       bx6 v = ox7.v;
       boolean b = false;
       if (this.q()) {
          do {
             obj = this.t();
             if (obj instanceof z83 && (!obj instanceof te3 && obj.f())) {
             }else {
                v = ox7.v;
                break ;
             }
          } while ((v = this.K(obj, new ul0(this.m(p0), b))) != ox7.x);
          if (v == ox7.w) {
             return true;
          }
       }
       if (v == ox7.v) {
          obj = null;
          Throwable throwable = obj;
          while (true) {
             AtomicReferenceFieldUpdater obj1 = this.t();
             if (obj1 instanceof te3) {
                _monitor_enter(obj1);
                if (obj1.g()) {
                   p0 = ox7.y;
                   _monitor_exit(obj1);
                }else {
                   boolean b1 = obj1.e();
                   if (throwable == null) {
                      throwable = this.m(p0);
                   }
                   obj1.a(throwable);
                   p0 = obj1.d();
                   if ((b1 ^ 0x01)) {
                      obj = p0;
                   }
                   _monitor_exit(obj1);
                   if (obj != null) {
                      this.E(obj1.a, obj);
                   }
                   p0 = ox7.v;
                }
             }else if(obj1 instanceof z83){
                if (throwable == null) {
                   throwable = this.m(p0);
                }
                Object obj2 = obj1;
                if (obj2.b()) {
                   if ((oij4 = this.r(obj2)) != null) {
                      te3 ote3 = new te3(oij4, throwable);
                      while (true) {
                         obj1 = ve3.a;
                         if (obj1.compareAndSet(this, obj2, ote3)) {
                            obj1 = 1;
                         }else {
                            if (obj1.get(this) != obj2) {
                               obj1 = 0;
                            }else {
                               continue ;
                            }
                         }
                         if (obj1) {
                            this.E(oij4, throwable);
                            obj1 = 1;
                         label_00be :
                            if (obj1) {
                               p0 = ox7.v;
                            }
                         }
                      }
                      return b;
                   }
                   obj1 = 0;
                   goto label_00be ;
                }else if((obj2 = this.K(obj1, new ul0(throwable, b))) != ox7.v){
                   if (obj2 != ox7.x) {
                      v = obj2;
                   }
                }else {
                   throw new IllegalStateException("Cannot happen in "+obj1.toString());
                }
             }else {
                p0 = ox7.y;
             }
             v = p0;
          }
       }
       if (v != ox7.v && v != ox7.w) {
          if (v == ox7.y) {
          }else {
             this.g(v);
          }
       }
       b = true;
    }
    public final boolean i(Throwable p0){
       ve3 t_parentHand;
       boolean b = true;
       if (this.A()) {
          return b;
       }
       boolean b1 = p0 instanceof CancellationException;
       if ((t_parentHand = this._parentHandle) == null || t_parentHand == lj4.a) {
          return b1;
       }
       if (!t_parentHand.a(p0) && !b1) {
          b = false;
       }
       return b;
    }
    public String j(){
       return "Job was cancelled";
    }
    public boolean k(Throwable p0){
       boolean b = true;
       if (p0 instanceof CancellationException) {
          return b;
       }
       if (!this.h(p0) || !this.p()) {
          b = false;
       }
       return b;
    }
    public final void l(z83 p0,Object p1){
       ve3 t_parentHand;
       ij4 oij4;
       if ((t_parentHand = this._parentHandle) != null) {
          t_parentHand.dispose();
          this._parentHandle = lj4.a;
       }
       if (p1 instanceof ul0) {
       }else {
          p1 = null;
       }
       p1 = (p1 != null)? p1.a: null;
       if (p0 instanceof re3) {
          p0.l(p1);
       }else if((oij4 = p0.c()) != null){
          a uoa = oij4.f();
          while (!co5.c(uoa, oij4)) {
             if (uoa instanceof re3) {
                uoa.l(p1);
             }
             uoa = uoa.g();
          }
          if (null != null) {
             this.v(null);
          }
       }
       return;
    }
    public final Throwable m(Object p0){
       Throwable throwable;
       if (p0 instanceof Throwable) {
       }else {
          Object obj = p0.t();
          int i = 0;
          if (obj instanceof te3) {
             throwable = obj.d();
          }else if(obj instanceof ul0){
             throwable = obj.a;
          }else if(!obj instanceof z83){
             throwable = i;
          }else {
             throw new IllegalStateException("Cannot be cancelling child in this state: "+obj.toString());
          }
          if (throwable instanceof CancellationException) {
             i = throwable;
          }
          if (i == null) {
             i = new ne3("Parent job is ".concat(ve3.I(obj)), throwable, p0);
          }
          p0 = i;
       }
       return p0;
    }
    public final Object n(te3 p0,Object p1){
       AtomicReferenceFieldUpdater a;
       Throwable throwable1;
       int i;
       Throwable throwable2;
       Throwable throwable = null;
       ul0 oul0 = (p1 instanceof ul0)? p1: throwable;
       oul0 = (oul0 != null)? oul0.a: throwable;
       _monitor_enter(p0);
       p0.e();
       ArrayList uArrayList = p0.h(oul0);
       if (uArrayList.isEmpty()) {
          if (p0.e()) {
             throwable = new ne3(this.j(), throwable, this);
          }
       }else {
          Iterator iterator1 = uArrayList.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                Object obj = iterator1.next();
                if (i = obj instanceof CancellationException ^ 1) {
                   throwable = obj;
                }
             }
             if (throwable == null) {
                throwable = uArrayList.get(0);
             }
          }
          this.l(p0, p1);
          return p1;
       }
       if (throwable != null && uArrayList.size() > 1) {
          Set set = Collections.newSetFromMap(new IdentityHashMap(uArrayList.size()));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             if ((throwable1 = iterator.next()) != throwable && (throwable1 != throwable && (!throwable1 instanceof CancellationException && set.add(throwable1)))) {
                io2.a(throwable, throwable1);
             }else {
                continue ;
             }
          }
       }
       _monitor_exit(p0);
       if (throwable != null && throwable != oul0) {
          p1 = new ul0(throwable, 0);
       }
       if (throwable != null) {
          a = (!this.i(throwable) && !this.u(throwable))? 0: 1;
          if (oul0) {
             if (p1 != null) {
                ul0.b.compareAndSet(p1, 0, 1);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
             }
          }
       }
       this.F(p1);
       a = ve3.a;
       a93 uoa93 = (p1 instanceof z83)? new a93(p1): p1;
       do {
       } while (a.compareAndSet(this, p0, uoa93) || a.get(this) != p0);
    }
    public final CancellationException o(){
       Throwable obj = this.t();
       CancellationException uCancellatio = null;
       String str = "Job is still new or active: ";
       if (obj instanceof te3) {
          if ((obj = obj.d()) != null) {
             String str1 = this.getClass().getSimpleName().concat(" is cancelling");
             if (obj instanceof CancellationException) {
                uCancellatio = obj;
             }
             if (uCancellatio == null) {
                if (str1 == null) {
                   str1 = this.j();
                }
                uCancellatio = new ne3(str1, obj, this);
             }
          }else {
             throw new IllegalStateException(str+this.toString());
          }
       }else if(!obj instanceof z83){
          if (obj instanceof ul0) {
             ul0 a = obj.a;
             if (a instanceof CancellationException) {
                uCancellatio = a;
             }
             if (uCancellatio == null) {
                uCancellatio = new ne3(this.j(), a, this);
             }
          }else {
             uCancellatio = new ne3(this.getClass().getSimpleName().concat(" has completed normally"), uCancellatio, this);
          }
       }else {
          throw new IllegalStateException(str+this.toString());
       }
       return uCancellatio;
    }
    public boolean p(){
       return true;
    }
    public boolean q(){
       return false;
    }
    public final ij4 r(z83 p0){
       ij4 oij4;
       if ((oij4 = p0.c()) == null) {
          if (p0 instanceof dl1) {
             oij4 = new ij4();
          }else if(p0 instanceof re3){
             this.H(p0);
             oij4 = null;
          }else {
             throw new IllegalStateException("State should have list: "+p0.toString());
          }
       }
       return oij4;
    }
    public final ue0 s(){
       return this._parentHandle;
    }
    public final Object t(){
       ve3 t_state;
       while (true) {
          t_state = this._state;
          if (!t_state instanceof c45) {
             break ;
          }else {
             t_state.a(this);
          }
       }
       return t_state;
    }
    public final String toString(){
       return this.C()+'{'+ve3.I(this.t())+'}'+'@'+w51.x(this);
    }
    public boolean u(Throwable p0){
       return false;
    }
    public void v(cd2 p0){
       throw p0;
    }
    public final void w(me3 p0){
       lj4 a = lj4.a;
       if (p0 == null) {
          this._parentHandle = a;
          return;
       }else {
          while (true) {
             Object obj = p0.t();
             AtomicReferenceFieldUpdater a1 = ve3.a;
             int i = 0;
             if (obj instanceof dl1) {
                if (obj.a == null) {
                   dl1 b = ox7.B;
                   while (true) {
                      if (a1.compareAndSet(p0, obj, b)) {
                         i = 1;
                      }else {
                         if (a1.get(p0) == obj) {
                            continue ;
                         }
                      }
                      if (!i) {
                      label_004d :
                         i = -1;
                      }else {
                         p0.G();
                      label_0052 :
                         i = 1;
                      }
                   }
                }
             }else if(obj instanceof y83){
                y83 a2 = obj.a;
                while (true) {
                   if (a1.compareAndSet(p0, obj, a2)) {
                      i = 1;
                   }else {
                      if (a1.get(p0) == obj) {
                         continue ;
                      }
                   }
                   if (!i) {
                      goto label_004d ;
                   }else {
                      p0.G();
                      goto label_0052 ;
                   }
                }
             }
             if (i && i != true) {
                continue ;
             }else {
                ue0 oue0 = io2.n(p0, true, new ve0(this), 2);
                this._parentHandle = oue0;
                if ((this.t() instanceof z83 ^ true)) {
                   oue0.dispose();
                   this._parentHandle = a;
                   break ;
                }
                break ;
             }
          }
          return;
       }
    }
    public final xw0 y(ww0 p0){
       return is7.u(this, p0);
    }
    public final bd1 z(boolean p0,boolean p1,zf2 p2){
       Object obj;
       ij4 obj2;
       AtomicReferenceFieldUpdater a;
       lj4 a1;
       Throwable throwable;
       ul0 oul0 = null;
       if (p0) {
          obj = (p2 instanceof oe3)? p2: oul0;
          if (obj == null) {
             obj = new yc3(p2);
          }
       }else if(p2 instanceof re3){
          obj = p2;
       }else {
          obj = oul0;
       }
       if (obj == null) {
          obj = new zc3(p2);
       }
       obj.t = this;
       while (true) {
          ij4 obj1 = this.t();
          if (obj1 instanceof dl1) {
             obj2 = obj1;
             if (obj2.a != null) {
                a = ve3.a;
                while (true) {
                   if (a.compareAndSet(this, obj1, obj)) {
                      obj1 = 1;
                   }else {
                      if (a.get(this) != obj1) {
                         obj1 = 0;
                      }else {
                         continue ;
                      }
                   }
                   if (obj1) {
                      return obj;
                   }
                   continue ;
                }
             }else {
                obj1 = new ij4();
                if (obj2.a == null) {
                   y83 oy83 = new y83(obj1);
                }
                do {
                   a = ve3.a;
                } while (a.compareAndSet(this, obj2, obj1) || a.get(this) != obj2);
             }
          }else if(obj1 instanceof z83){
             if ((obj2 = obj1.c()) == null) {
                if (obj1 != null) {
                   this.H(obj1);
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                }
             }else {
                a1 = lj4.a;
                if (p0 && obj1 instanceof te3) {
                   _monitor_enter(obj1);
                   if ((throwable = obj1.d()) == null || (p2 instanceof ve0 || obj1.f())) {
                      if (!this.e(obj1, obj2, obj)) {
                         _monitor_exit(obj1);
                      }else if(throwable == null){
                         _monitor_exit(obj1);
                         return obj;
                      }else {
                         a1 = obj;
                      }
                   }
                   _monitor_exit(obj1);
                }else {
                   throwable = oul0;
                }
                if (throwable != null) {
                   if (p1) {
                      p2.invoke(throwable);
                      break ;
                   }
                   break ;
                }else if(this.e(obj1, obj2, obj)){
                   return obj;
                }
             }
          }else if(p1){
             if (obj1 instanceof ul0) {
             }else {
                obj1 = oul0;
             }
             if (obj1 != null) {
                oul0 = obj1.a;
             }
             p2.invoke(oul0);
          }
       }
       return a1;
    }
}
