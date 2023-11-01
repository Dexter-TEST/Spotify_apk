package p.n3;
import android.view.View$AccessibilityDelegate;
import java.lang.Object;
import p.l3;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p.u44;
import android.view.accessibility.AccessibilityNodeProvider;
import p.m3;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.ViewGroup;
import android.os.Bundle;
import java.util.List;
import java.util.Collections;
import p.w3;
import java.lang.Class;
import java.lang.reflect.Constructor;
import p.tp2;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import p.l4;
import android.os.BaseBundle;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import android.text.style.ClickableSpan;
import java.lang.CharSequence;
import android.text.Spanned;

public class n3	// class@001f60 from classes.dex
{
    public final View$AccessibilityDelegate a;
    public final l3 b;
    public static final View$AccessibilityDelegate c;

    static {
       n3.c = new View$AccessibilityDelegate();
    }
    public void n3(){
       super(n3.c);
    }
    public void n3(View$AccessibilityDelegate p0){
       super();
       this.a = p0;
       this.b = new l3(this);
    }
    public boolean a(View p0,AccessibilityEvent p1){
       return this.a.dispatchPopulateAccessibilityEvent(p0, p1);
    }
    public u44 b(View p0){
       AccessibilityNodeProvider uAccessibili;
       if ((uAccessibili = m3.a(this.a, p0)) != null) {
          return new u44(6, uAccessibili);
       }
       return null;
    }
    public void c(View p0,AccessibilityEvent p1){
       this.a.onInitializeAccessibilityEvent(p0, p1);
    }
    public void d(View p0,y3 p1){
       this.a.onInitializeAccessibilityNodeInfo(p0, p1.a);
    }
    public void e(View p0,AccessibilityEvent p1){
       this.a.onPopulateAccessibilityEvent(p0, p1);
    }
    public boolean f(ViewGroup p0,View p1,AccessibilityEvent p2){
       return this.a.onRequestSendAccessibilityEvent(p0, p1, p2);
    }
    public boolean g(View p0,int p1,Bundle p2){
       List tag;
       w3 d;
       w3 c;
       int b1;
       SparseArray tag1;
       WeakReference weakReferenc;
       ClickableSpan uClickableSp;
       CharSequence text;
       if ((tag = p0.getTag(R.id.tag_accessibility_actions)) == null) {
          tag = Collections.emptyList();
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          boolean b = false;
          if (i1 < tag.size()) {
             w3 ow3 = tag.get(i1);
             if (ow3.a() == p1) {
                if ((d = ow3.d) != null) {
                   try{
                      if ((c = ow3.c) != null) {
                         Class[] uClassArray = new Class[i];
                         Object[] objArray = new Object[i];
                         tp2.v(c.getDeclaredConstructor(uClassArray).newInstance(objArray));
                         throw b;
                      }
                   }catch(java.lang.Exception e3){
                      Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(c.getName()), e3);
                   }
                   b1 = d.d(p0);
                label_0056 :
                   if (!b1) {
                      b1 = m3.b(this.a, p0, p1, p2);
                   }
                   if (!b1 && (p1 == 0x7f0a0012 && p2 != null)) {
                      p1 = p2.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
                      if ((tag1 = p0.getTag(R.id.tag_accessibility_clickable_spans)) != null && (weakReferenc = tag1.get(p1)) != null) {
                         if ((uClickableSp = weakReferenc.get()) != null) {
                            text = p0.createAccessibilityNodeInfo().getText();
                            if (text instanceof Spanned) {
                               b = text.getSpans(i, text.length(), ClickableSpan.class);
                            }
                            b1 = 0;
                            while (true) {
                               if (b != null && b1 < b.length) {
                                  if (uClickableSp.equals(b[b1])) {
                                     text = 1;
                                  label_00ba :
                                     if (text) {
                                        uClickableSp.onClick(p0);
                                        i = 1;
                                     }
                                  }else {
                                     b1 = b1 + 1;
                                  }
                               }
                            }
                         }
                         text = 0;
                         goto label_00ba ;
                      }
                      b1 = i;
                      break ;
                   }
                   break ;
                }else {
                label_0055 :
                   b1 = false;
                   goto label_0056 ;
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             goto label_0055 ;
          }
       }
       return b1;
    }
    public void h(View p0,int p1){
       this.a.sendAccessibilityEvent(p0, p1);
    }
    public void i(View p0,AccessibilityEvent p1){
       this.a.sendAccessibilityEventUnchecked(p0, p1);
    }
}
