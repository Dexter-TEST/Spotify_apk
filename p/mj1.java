package p.mj1;
import p.gg1;
import android.widget.EditText;
import p.zj1;
import android.text.TextWatcher;
import android.widget.TextView;
import p.oj1;
import android.text.Editable$Factory;
import p.hj1;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.is7;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.sk;
import android.text.method.KeyListener;
import p.sj1;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import p.pj1;

public final class mj1 extends gg1	// class@001ea6 from classes.dex
{
    public final EditText E;
    public final zj1 F;

    public void mj1(EditText p0){
       super(13);
       this.E = p0;
       zj1 ozj1 = new zj1(p0);
       this.F = ozj1;
       p0.addTextChangedListener(ozj1);
       if (oj1.b == null) {
          Object a = oj1.a;
          _monitor_enter(a);
          if (oj1.b == null) {
             oj1.b = new oj1();
          }
          _monitor_exit(a);
       }
       p0.setEditableFactory(oj1.b);
       return;
    }
    public final void V(boolean p0){
       mj1 tF = this.F;
       if (tF.t != p0) {
          if (tF.c != null) {
             hj1 ohj1 = hj1.a();
             zj1 c = tF.c;
             ohj1.getClass();
             is7.h(c, "initCallback cannot be null");
             hj1 a = ohj1.a;
             a.writeLock().lock();
             ohj1.b.remove(c);
             a.writeLock().unlock();
          }
          tF.t = p0;
          if (p0) {
             zj1.a(tF.a, hj1.a().b());
          }
       }
       return;
    }
    public final KeyListener Z(KeyListener p0){
       if (p0 instanceof sj1) {
          return p0;
       }
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof NumberKeyListener) {
          return p0;
       }
       return new sj1(p0);
    }
    public final InputConnection a0(InputConnection p0,EditorInfo p1){
       if (p0 instanceof pj1) {
          return p0;
       }
       return new pj1(this.E, p0, p1);
    }
}
