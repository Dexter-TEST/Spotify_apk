package p.rj5;
import android.view.View$OnFocusChangeListener;
import java.lang.Object;
import android.view.View;
import com.spotify.messaging.inappmessagingsdk.preview.views.PreviewSubmissionView;
import java.lang.Class;
import p.yy;
import p.h76;
import com.spotify.search.view.ToolbarSearchFieldView;
import android.animation.Animator;
import p.l67;
import com.spotify.search.view.BackKeyEditText;
import android.text.Editable;
import p.pg;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p.d76;

public final class rj5 implements View$OnFocusChangeListener	// class@0024fd from classes.dex
{
    public final int a;
    public final Object b;

    public void rj5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onFocusChange(View p0,boolean p1){
       ToolbarSearchFieldView c;
       Animator[] uAnimatorArr;
       rj5 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             int i = 0;
             int i1 = 1;
             h76 d = tb.d;
             if (p1) {
                c = d.C;
                uAnimatorArr = new Animator[i1];
                uAnimatorArr[i] = c.d;
                c.b(uAnimatorArr);
             }else if(TextUtils.isEmpty(d.getQueryEditText().getText())){
                c = d.C;
                uAnimatorArr = new Animator[i1];
                uAnimatorArr[i] = c.e;
                c.b(uAnimatorArr);
             }
             Iterator iterator = tb.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().c(p1);
             }
             return;
       }
       if (p1) {
          tb.a();
       }else {
          tb.getClass();
       }
       return;
    }
}
