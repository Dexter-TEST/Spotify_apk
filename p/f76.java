package p.f76;
import p.m67;
import p.h76;
import java.lang.Object;
import com.spotify.search.view.BackKeyEditText;
import com.spotify.search.view.ToolbarSearchFieldView;
import android.text.Editable;
import p.pg;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.l67;
import android.view.View;
import p.ry7;
import android.widget.Button;
import android.animation.StateListAnimator;
import p.yy;
import p.e76;

public final class f76 implements m67	// class@001574 from classes.dex
{
    public final h76 a;

    public void f76(h76 p0){
       this.a = p0;
       super();
    }
    public final void a(){
       f76 ta = this.a;
       h76 d = ta.d;
       if (TextUtils.isEmpty(d.getQueryEditText().getText())) {
          d.C.e();
       }
       BackKeyEditText uBackKeyEdit = ta.a();
       uBackKeyEdit.clearFocus();
       ry7.H(uBackKeyEdit);
       return;
    }
    public final void b(){
       StateListAnimator stateListAni;
       f76 ta = this.a;
       ta.b();
       ta.d.getSearchPlaceHolder().setPressed(false);
       if ((stateListAni = ta.d.getSearchPlaceHolder().getStateListAnimator()) != null) {
          stateListAni.jumpToCurrentState();
       }
       return;
    }
    public final void c(){
       yy b;
       BackKeyEditText uBackKeyEdit;
       f76 ta = this.a;
       if ((b = ta.b) != null) {
          int i = 1;
          if (b.c() == i) {
          label_000f :
             if (!i) {
                h76 d = ta.d;
                if (TextUtils.isEmpty(d.getQueryEditText().getText())) {
                   d.C.e();
                }
                uBackKeyEdit = ta.a();
                uBackKeyEdit.clearFocus();
                ry7.H(uBackKeyEdit);
                if (ta.a().hasFocus()) {
                   ta.a().getText().clear();
                }else {
                   d.C.e();
                }
             }
             return;
          }
       }
       uBackKeyEdit = 0;
       goto label_000f ;
    }
}
