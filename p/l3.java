package p.l3;
import android.view.View$AccessibilityDelegate;
import p.n3;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import p.u44;
import android.view.accessibility.AccessibilityNodeInfo;
import p.y3;
import p.wh7;
import p.zg7;
import java.lang.Object;
import p.bh7;
import java.lang.Boolean;
import android.os.Build$VERSION;
import p.q3;
import java.lang.CharSequence;
import android.os.Bundle;
import java.lang.String;
import p.s3;
import android.util.SparseArray;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import java.lang.Integer;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.lang.Class;
import android.os.BaseBundle;
import java.util.List;
import java.util.Collections;
import p.w3;
import android.view.ViewGroup;

public final class l3 extends View$AccessibilityDelegate	// class@001cdb from classes.dex
{
    public final n3 a;

    public void l3(n3 p0){
       super();
       this.a = p0;
    }
    public final boolean dispatchPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       return this.a.a(p0, p1);
    }
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View p0){
       AccessibilityNodeProvider uAccessibili;
       u44 ou44 = ((ou44 = this.a.b(p0)) != null)? ou44.b: null;
       return ou44;
    }
    public final void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       this.a.c(p0, p1);
    }
    public final void onInitializeAccessibilityNodeInfo(View p0,AccessibilityNodeInfo p1){
       SparseArray tag;
       int i6;
       SparseArray tag1;
       List tag2;
       View view = p0;
       AccessibilityNodeInfo uAccessibili = p1;
       y3 oy3 = new y3(uAccessibili);
       int i = 0;
       Boolean uBoolean = new zg7(R.id.tag_screen_reader_focusable, i).b(view);
       int i1 = 1;
       boolean b = (uBoolean != null && uBoolean.booleanValue())? true: false;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i2 = 28;
       if (sDK_INT >= i2) {
          q3.s(uAccessibili, b);
       }else {
          oy3.f(i1, b);
       }
       b = ((uBoolean = new zg7(R.id.tag_accessibility_heading, 3).b(view)) != null && uBoolean.booleanValue())? true: false;
       int i3 = 2;
       if (sDK_INT >= i2) {
          q3.A(uAccessibili, b);
       }else {
          oy3.f(i3, b);
       }
       CharSequence uCharSequenc = new zg7(R.id.tag_accessibility_pane_title, 8, i2, i1).b(view);
       if (sDK_INT >= i2) {
          q3.r(uAccessibili, uCharSequenc);
       }else {
          p1.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", uCharSequenc);
       }
       int i4 = 30;
       uCharSequenc = new zg7(R.id.tag_state_description, 64, i4, i3).b(view);
       if (sDK_INT < i4) {
          i1 = 0;
       }
       if (i1) {
          s3.k(uAccessibili, uCharSequenc);
       }else {
          p1.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", uCharSequenc);
       }
       this.a.d(view, oy3);
       CharSequence text = p1.getText();
       if (sDK_INT < 26) {
          p1.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
          p1.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
          p1.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
          p1.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
          int i5 = 0x7f0a05fe;
          if ((tag = view.getTag(i5)) != null) {
             ArrayList uArrayList = new ArrayList();
             i6 = 0;
             while (i6 < tag.size()) {
                if (tag.valueAt(i6).get() == null) {
                   uArrayList.add(Integer.valueOf(i6));
                }
                i6 = i6 + 1;
             }
             for (i6 = 0; i6 < uArrayList.size(); i6 = i6 + 1) {
                tag.remove(uArrayList.get(i6).intValue());
             }
          }
          ClickableSpan[] spans = (text instanceof Spanned)? text.getSpans(i, text.length(), ClickableSpan.class): null;
          if (spans != null && spans.length > 0) {
             oy3.a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
             if ((tag1 = view.getTag(i5)) == null) {
                tag1 = new SparseArray();
                view.setTag(i5, tag1);
             }
             i5 = 0;
             while (i5 < spans.length) {
                object oobject = spans[i5];
                int i7 = 0;
                while (true) {
                   if (i7 < tag1.size()) {
                      if (oobject.equals(tag1.valueAt(i7).get())) {
                         i6 = tag1.keyAt(i7);
                      label_0177 :
                         tag1.put(i6, new WeakReference(spans[i5]));
                         object oobject1 = spans[i5];
                         CharSequence uCharSequenc1 = text;
                         oy3.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(uCharSequenc1.getSpanStart(oobject1)));
                         oy3.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(uCharSequenc1.getSpanEnd(oobject1)));
                         oy3.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(uCharSequenc1.getSpanFlags(oobject1)));
                         oy3.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i6));
                         i5 = i5 + 1;
                         i = 0;
                      }else {
                         i7 = i7 + 1;
                      }
                   }else {
                      i6 = y3.d;
                      i7 = i6 + 1;
                      y3.d = i7;
                      goto label_0177 ;
                   }
                }
             }
          }
       }
       if ((tag2 = view.getTag(R.id.tag_accessibility_actions)) == null) {
          tag2 = Collections.emptyList();
       }
       for (i = 0; i < tag2.size(); i = i + 1) {
          oy3.b(tag2.get(i));
       }
       return;
    }
    public final void onPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       this.a.e(p0, p1);
    }
    public final boolean onRequestSendAccessibilityEvent(ViewGroup p0,View p1,AccessibilityEvent p2){
       return this.a.f(p0, p1, p2);
    }
    public final boolean performAccessibilityAction(View p0,int p1,Bundle p2){
       return this.a.g(p0, p1, p2);
    }
    public final void sendAccessibilityEvent(View p0,int p1){
       this.a.h(p0, p1);
    }
    public final void sendAccessibilityEventUnchecked(View p0,AccessibilityEvent p1){
       this.a.i(p0, p1);
    }
}
