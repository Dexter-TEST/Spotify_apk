package p.cz6;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.content.res.Resources;
import android.view.View;
import java.lang.CharSequence;
import p.ez6;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;

public final class cz6	// class@0012ab from classes.dex
{
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public int d;
    public View e;
    public TabLayout f;
    public ez6 g;
    public int h;

    public void cz6(){
       super();
       this.d = -1;
       this.h = -1;
    }
    public final void a(){
       cz6 tf;
       if ((tf = this.f) == null) {
          throw new IllegalArgumentException("Tab not attached to a TabLayout");
       }
       tf.j(this, true);
       return;
    }
    public final void b(int p0){
       cz6 tf;
       cz6 tg;
       if ((tf = this.f) == null) {
          throw new IllegalArgumentException("Tab not attached to a TabLayout");
       }
       this.c = tf.getResources().getText(p0);
       if ((tg = this.g) != null) {
          tg.e();
       }
       return;
    }
    public final void c(StateListDrawable p0){
       this.a = p0;
       cz6 tf = this.f;
       if (tf.N == true || tf.Q == 2) {
          tf.l(true);
       }
       if ((tf = this.g) != null) {
          tf.e();
       }
       return;
    }
    public final void d(int p0){
       cz6 tf;
       cz6 tg;
       if ((tf = this.f) == null) {
          throw new IllegalArgumentException("Tab not attached to a TabLayout");
       }
       CharSequence text = tf.getResources().getText(p0);
       if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(text)) {
          this.g.setContentDescription(text);
       }
       this.b = text;
       if ((tg = this.g) != null) {
          tg.e();
       }
       return;
    }
}
