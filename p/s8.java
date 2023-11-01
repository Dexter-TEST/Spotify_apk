package p.s8;
import android.content.DialogInterface;
import p.lg;
import android.content.Context;
import p.q8;
import android.app.Dialog;
import android.view.Window;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import android.widget.TextView;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.widget.Button;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.lang.Class;
import java.lang.Object;
import android.os.Build$VERSION;
import p.wh7;
import p.kh7;
import p.m8;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AbsListView;
import p.l8;
import java.lang.Runnable;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.KeyEvent;

public final class s8 extends lg implements DialogInterface	// class@0025df from classes.dex
{
    public final q8 w;

    public void s8(Context p0,int p1){
       super(p0, s8.g(p0, p1));
       this.w = new q8(this.getContext(), this, this.getWindow());
    }
    public static int g(Context p0,int p1){
       if ((((p1 >> 24) & 0x00ff)) >= 1) {
          return p1;
       }
       TypedValue typedValue = new TypedValue();
       p0.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
       return typedValue.resourceId;
    }
    public final void onCreate(Bundle p0){
       int i2;
       q8 i4;
       View view4;
       int paddingRight;
       q8 e1;
       q8 q;
       AlertController$RecycleListView b1;
       AlertController$RecycleListView a;
       super.onCreate(p0);
       s8 w = this.w;
       w.b.setContentView(w.r);
       q8 c = w.c;
       View view = c.findViewById(R.id.parentPanel);
       View view1 = view.findViewById(R.id.topPanel);
       View view2 = view.findViewById(R.id.contentPanel);
       View view3 = view.findViewById(R.id.buttonPanel);
       ViewGroup viewGroup = view.findViewById(R.id.customPanel);
       c.setFlags(0x20000, 0x20000);
       int i = 8;
       viewGroup.setVisibility(i);
       ViewGroup viewGroup1 = q8.c(viewGroup.findViewById(R.id.topPanel), view1);
       ViewGroup viewGroup2 = q8.c(viewGroup.findViewById(R.id.contentPanel), view2);
       ViewGroup viewGroup3 = q8.c(viewGroup.findViewById(R.id.buttonPanel), view3);
       NestedScrollView nestedScroll = c.findViewById(R.id.scrollView);
       w.i = nestedScroll;
       boolean b = false;
       nestedScroll.setFocusable(b);
       w.i.setNestedScrollingEnabled(b);
       TextView textView = viewGroup2.findViewById(0x102000b);
       w.n = textView;
       int i1 = -1;
       if (textView == null) {
       }else {
          textView.setVisibility(i);
          w.i.removeView(w.n);
          if (w.e != null) {
             ViewGroup parent = w.i.getParent();
             paddingRight = parent.indexOfChild(w.i);
             parent.removeViewAt(paddingRight);
             parent.addView(w.e, paddingRight, new ViewGroup$LayoutParams(i1, i1));
          }else {
             viewGroup2.setVisibility(i);
          }
       }
       Button uButton = viewGroup3.findViewById(0x1020019);
       w.f = uButton;
       q8 x = w.x;
       uButton.setOnClickListener(x);
       CharSequence uCharSequenc = null;
       if (TextUtils.isEmpty(uCharSequenc)) {
          w.f.setVisibility(i);
          i2 = 0;
       }else {
          w.f.setText(uCharSequenc);
          w.f.setVisibility(b);
          i2 = 1;
       }
       Button uButton1 = viewGroup3.findViewById(0x102001a);
       w.g = uButton1;
       uButton1.setOnClickListener(x);
       if (TextUtils.isEmpty(uCharSequenc)) {
          w.g.setVisibility(i);
       }else {
          w.g.setText(uCharSequenc);
          w.g.setVisibility(b);
          i2 = i2 | 0x02;
       }
       uButton1 = viewGroup3.findViewById(0x102001b);
       w.h = uButton1;
       uButton1.setOnClickListener(x);
       if (TextUtils.isEmpty(uCharSequenc)) {
          w.h.setVisibility(i);
       }else {
          w.h.setText(uCharSequenc);
          w.h.setVisibility(b);
          i2 = i2 | 0x04;
       }
       TypedValue x1 = new TypedValue();
       w.a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, x1, true);
       x1 = (x1.data != null)? 1: 0;
       if (x1) {
          if (i2 == 1) {
             q8.a(w.f);
          }else if(i2 == 2){
             q8.a(w.g);
          }else if(i2 == 4){
             q8.a(w.h);
          }
       }
       x1 = (i2)? 1: 0;
       if (!x1) {
          viewGroup3.setVisibility(i);
       }
       i2 = 0x7f0a0633;
       if (w.o != null) {
          viewGroup1.addView(w.o, b, new ViewGroup$LayoutParams(i1, -2));
          c.findViewById(i2).setVisibility(i);
       }else {
          w.l = c.findViewById(0x1020006);
          if (((TextUtils.isEmpty(w.d) ^ true)) && w.v != null) {
             TextView textView1 = c.findViewById(R.id.alertTitle);
             w.m = textView1;
             textView1.setText(w.d);
             if ((x = w.j) != null) {
                w.l.setImageResource(x);
             }else if((x = w.k) != null){
                w.l.setImageDrawable(x);
             }else {
                w.m.setPadding(w.l.getPaddingLeft(), w.l.getPaddingTop(), w.l.getPaddingRight(), w.l.getPaddingBottom());
                w.l.setVisibility(i);
             }
          }else {
             c.findViewById(i2).setVisibility(i);
             w.l.setVisibility(i);
             viewGroup1.setVisibility(i);
          }
       }
       viewGroup = (viewGroup.getVisibility() != i)? 1: 0;
       int i3 = (viewGroup1 != null && viewGroup1.getVisibility() != i)? 1: 0;
       viewGroup3 = (viewGroup3.getVisibility() != i)? 1: 0;
       if (!viewGroup3 && (view3 = viewGroup2.findViewById(R.id.textSpacerNoButtons)) != null) {
          view3.setVisibility(b);
       }
       if (i3) {
          if ((i4 = w.i) != null) {
             i4.setClipToPadding(true);
          }
          view4 = (w.e != null)? viewGroup1.findViewById(R.id.titleDividerNoCustom): null;
          if (view4 != null) {
             view4.setVisibility(b);
          }
       }else if((view4 = viewGroup2.findViewById(R.id.textSpacerNoTitle)) != null){
          view4.setVisibility(b);
       }
       q8 e = w.e;
       if (e instanceof AlertController$RecycleListView) {
          e.getClass();
          if (!viewGroup3 || !i3) {
             i1 = e.getPaddingLeft();
             i = (i3)? e.getPaddingTop(): e.a;
             paddingRight = e.getPaddingRight();
             i2 = (viewGroup3)? e.getPaddingBottom(): e.b;
             e.setPadding(i1, i, paddingRight, i2);
          }
       }
       if (!viewGroup) {
          if ((e1 = w.e) == null) {
             e1 = w.i;
          }
          if (e1 != null) {
             if (viewGroup3) {
                b = 2;
             }
             int i5 = b | i3;
             View view5 = c.findViewById(R.id.scrollIndicatorUp);
             View view6 = c.findViewById(R.id.scrollIndicatorDown);
             if ((i3 = Build$VERSION.SDK_INT) >= 23) {
                if (i3 >= 23) {
                   kh7.d(e1, i5, 3);
                }
                if (view5 != null) {
                   viewGroup2.removeView(view5);
                }
                if (view6 != null) {
                   viewGroup2.removeView(view6);
                }
             }else if(view5 != null && !((i5 & 0x01))){
                viewGroup2.removeView(view5);
                view5 = null;
             }
             if (view6 != null && !((i5 & 0x02))) {
                viewGroup2.removeView(view6);
                view2 = null;
             }else {
                view2 = view6;
             }
             if (view5 != null || view2 != null) {
                if ((c = w.e) != null) {
                   c.setOnScrollListener(new m8(view5, view2));
                   w.e.post(new l8(w, view5, view2, true));
                }else if(view5 != null){
                   viewGroup2.removeView(view5);
                }
                if (view2 != null) {
                   viewGroup2.removeView(view2);
                }
             }
          }
       }
       if ((c = w.e) != null && (e1 = w.p) != null) {
          c.setAdapter(e1);
          if ((q = w.q) > -1) {
             c.setItemChecked(q, true);
             c.setSelection(q);
          }
       }
       return;
    }
    public final boolean onKeyDown(int p0,KeyEvent p1){
       q8 i = ((i = this.w.i) != null && i.k(p1))? 1: 0;
       if (i) {
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public final boolean onKeyUp(int p0,KeyEvent p1){
       q8 i = ((i = this.w.i) != null && i.k(p1))? 1: 0;
       if (i) {
          return true;
       }else {
          return super.onKeyUp(p0, p1);
       }
    }
    public final void setTitle(CharSequence p0){
       q8 m;
       super.setTitle(p0);
       s8 tw = this.w;
       tw.d = p0;
       if ((m = tw.m) != null) {
          m.setText(p0);
       }
       return;
    }
}
