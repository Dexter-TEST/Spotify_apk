package com.spotify.signup.signup.view.GenderView;
import p.xo0;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.lang.Class;
import java.lang.Object;
import android.widget.ProgressBar;
import p.hr0;
import p.ei2;
import p.hm3;
import java.util.Iterator;
import java.util.AbstractList;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import p.dk7;
import android.widget.TextView;
import android.content.res.Resources;
import java.lang.String;
import android.text.Spanned;
import p.eb3;
import java.lang.CharSequence;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import p.ap0;
import p.fi2;
import android.view.View$OnClickListener;
import p.wy3;

public class GenderView extends LinearLayout implements xo0	// class@000c30 from classes.dex
{
    public Button a;
    public Button b;
    public Button c;
    public Button t;
    public Button v;
    public ProgressBar w;
    public ViewPropertyAnimator x;
    public final AtomicBoolean y;

    public void GenderView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.y = new AtomicBoolean(false);
       View.inflate(this.getContext(), R.layout.gender_contents, this);
       Button uButton = this.findViewById(R.id.gender_button_female);
       uButton.getClass();
       this.a = uButton;
       uButton = this.findViewById(R.id.gender_button_male);
       uButton.getClass();
       this.b = uButton;
       uButton = this.findViewById(R.id.gender_button_neutral);
       uButton.getClass();
       this.c = uButton;
       uButton = this.findViewById(R.id.gender_button_other);
       uButton.getClass();
       this.v = uButton;
       uButton = this.findViewById(R.id.gender_button_prefer_not_to_say);
       uButton.getClass();
       this.t = uButton;
       ProgressBar progressBar = this.findViewById(R.id.loader);
       progressBar.getClass();
       this.w = progressBar;
       this.b(R.id.sign_up_terms, 0x7f120089);
       this.b(R.id.sign_up_policy, 0x7f120088);
    }
    public final void a(hr0 p0,Button p1,ei2 p2,View[] p3){
       GenderView tx;
       long l;
       GenderView ty = this.y;
       ty.set(true);
       Iterator iterator = new hm3(p3, p1).iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          view.animate().setListener(null);
          view.clearAnimation();
       }
       if ((tx = this.x) != null) {
          tx.cancel();
       }
       int len = p3.length;
       int i = 0;
       while (true) {
          l = 300;
          if (i < len) {
             p3[i].animate().alpha(0.40f).setDuration(l).start();
             i = i + 1;
          }else {
             break ;
          }
       }
       ty.set(false);
       ViewPropertyAnimator viewProperty = p1.animate().alpha(0x3f800000).setDuration(l).setListener(new dk7(this, p0, p2, 2));
       this.x = viewProperty;
       viewProperty.start();
       return;
    }
    public final void b(int p0,int p1){
       TextView textView = this.findViewById(p0);
       textView.getClass();
       textView.setText(eb3.k(this.getResources().getString(p1)));
       textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public final ap0 d(hr0 p0){
       this.a.setOnClickListener(new fi2(this, p0, 0));
       this.b.setOnClickListener(new fi2(this, p0, 1));
       this.c.setOnClickListener(new fi2(this, p0, 2));
       this.v.setOnClickListener(new fi2(this, p0, 3));
       this.t.setOnClickListener(new fi2(this, p0, 4));
       return new wy3(this, 2);
    }
}
