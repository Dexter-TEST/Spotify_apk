package p.k37;
import p.k93;
import android.widget.EditText;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.i37;
import java.lang.CharSequence;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Observer;
import p.j37;
import io.reactivex.rxjava3.disposables.Disposable;
import android.text.TextWatcher;

public final class k37 extends k93	// class@001b9e from classes.dex
{
    public final int a;
    public final TextView b;

    public void k37(EditText p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          co5.q(p0, "view");
          super();
          this.b = p0;
          return;
       }else {
          co5.q(p0, "view");
          super();
          this.b = p0;
          return;
       }
    }
    public final Object a(){
       k37 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.getText();
       }
       CharSequence text = tb.getText();
       co5.h(text, "view.text");
       i37 v0 = new i37(tb, text, 0, 0, 0);
       return v0;
    }
    public final void b(Observer p0){
       j37 oj37;
       k37 tb = this.b;
       String str = "observer";
       switch (this.a){
           case 0:
           default:
             co5.q(p0, str);
             oj37 = new j37(tb, p0, 1);
             p0.onSubscribe(oj37);
             tb.addTextChangedListener(oj37);
             return;
       }
       co5.q(p0, str);
       oj37 = new j37(tb, p0, 0);
       p0.onSubscribe(oj37);
       tb.addTextChangedListener(oj37);
       return;
    }
}
