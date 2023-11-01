package p.sj1;
import android.text.method.KeyListener;
import p.gg1;
import java.lang.Object;
import android.view.View;
import android.text.Editable;
import android.view.KeyEvent;
import java.lang.Class;
import p.hj1;
import p.vj1;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;

public final class sj1 implements KeyListener	// class@00263b from classes.dex
{
    public final KeyListener a;
    public final gg1 b;

    public void sj1(KeyListener p0){
       super();
       this.a = p0;
       this.b = new gg1(15);
    }
    public final void clearMetaKeyState(View p0,Editable p1,int p2){
       this.a.clearMetaKeyState(p0, p1, p2);
    }
    public final int getInputType(){
       return this.a.getInputType();
    }
    public final boolean onKeyDown(View p0,Editable p1,int p2,KeyEvent p3){
       int i;
       this.b.getClass();
       boolean b = true;
       if (p2 != 67) {
          i = (p2 != 112)? 0: vj1.a(p1, p3, b);
       }else {
          i = vj1.a(p1, p3, false);
       }
       if (i) {
          MetaKeyKeyListener.adjustMetaAfterKeypress(p1);
          i = 1;
       }else {
          i = 0;
       }
       if (!i && !this.a.onKeyDown(p0, p1, p2, p3)) {
          b = false;
       }
       return b;
    }
    public final boolean onKeyOther(View p0,Editable p1,KeyEvent p2){
       return this.a.onKeyOther(p0, p1, p2);
    }
    public final boolean onKeyUp(View p0,Editable p1,int p2,KeyEvent p3){
       return this.a.onKeyUp(p0, p1, p2, p3);
    }
}
