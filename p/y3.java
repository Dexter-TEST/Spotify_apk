package p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.Object;
import p.w3;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.lang.String;
import java.util.ArrayList;
import android.os.Bundle;
import android.graphics.Rect;
import java.lang.CharSequence;
import java.util.List;
import android.text.SpannableString;
import android.text.TextUtils;
import p.k3;
import java.lang.Integer;
import android.os.BaseBundle;
import p.x3;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.os.Build$VERSION;
import p.p3;
import java.lang.StringBuilder;
import p.w51;
import p.l4;
import java.lang.Class;
import java.util.Collections;

public final class y3	// class@002d43 from classes.dex
{
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;
    public static int d;

    public void y3(AccessibilityNodeInfo p0){
       super();
       this.b = -1;
       this.c = -1;
       this.a = p0;
    }
    public final void a(int p0){
       this.a.addAction(p0);
    }
    public final void b(w3 p0){
       this.a.addAction(p0.a);
    }
    public final ArrayList c(String p0){
       ArrayList integerArray;
       y3 ta = this.a;
       if ((integerArray = ta.getExtras().getIntegerArrayList(p0)) == null) {
          integerArray = new ArrayList();
          ta.getExtras().putIntegerArrayList(p0, integerArray);
       }
       return integerArray;
    }
    public final void d(Rect p0){
       this.a.getBoundsInParent(p0);
    }
    public final CharSequence e(){
       String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
       y3 ta = this.a;
       if (!((this.c(str).isEmpty() ^ 0x01))) {
          return ta.getText();
       }
       ArrayList uArrayList = this.c(str);
       ArrayList uArrayList1 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
       ArrayList uArrayList2 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
       ArrayList uArrayList3 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
       int i = 0;
       SpannableString spannableStr = new SpannableString(TextUtils.substring(ta.getText(), i, ta.getText().length()));
       for (; i < uArrayList.size(); i = i + 1) {
          spannableStr.setSpan(new k3(uArrayList3.get(i).intValue(), this, ta.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), uArrayList.get(i).intValue(), uArrayList1.get(i).intValue(), uArrayList2.get(i).intValue());
       }
       return spannableStr;
    }
    public final boolean equals(Object p0){
       y3 ta;
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof y3) {
          return false;
       }
       y3 a = p0.a;
       if ((ta = this.a) == null) {
          if (a != null) {
             return false;
          }
       }else if(!ta.equals(a)){
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }else if(this.b != p0.b){
          return false;
       }else {
          return true;
       }
    }
    public final void f(int p0,boolean p1){
       Bundle extras;
       if ((extras = this.a.getExtras()) != null) {
          int i = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~ p0);
          if (!p1) {
             p0 = 0;
          }
          extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (p0 | i));
       }
       return;
    }
    public final void g(x3 p0){
       this.a.setCollectionItemInfo(p0.a);
    }
    public final void h(String p0){
       y3 ta = this.a;
       if (Build$VERSION.SDK_INT >= 26) {
          p3.v(ta, p0);
       }else {
          ta.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", p0);
       }
       return;
    }
    public final int hashCode(){
       y3 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return i;
    }
    public final void i(CharSequence p0){
       this.a.setText(p0);
    }
    public final String toString(){
       String uniqueId;
       ArrayList uArrayList;
       int i1;
       String str2;
       Rect rect = new Rect();
       this.d(rect);
       y3 ta = this.a;
       ta.getBoundsInScreen(rect);
       StringBuilder str = "".append(super.toString()).append("; boundsInParent: ".append(rect).toString()).append("; boundsInScreen: ".append(rect).toString()).append("; packageName: ").append(ta.getPackageName()).append("; className: ").append(ta.getClassName()).append("; text: ").append(this.e()).append("; contentDescription: ").append(ta.getContentDescription()).append("; viewId: ").append(ta.getViewIdResourceName()).append("; uniqueId: ");
       uniqueId = (w51.D())? ta.getUniqueId(): ta.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
       str = str.append(uniqueId).append("; checkable: ").append(ta.isCheckable()).append("; checked: ").append(ta.isChecked()).append("; focusable: ").append(ta.isFocusable()).append("; focused: ").append(ta.isFocused()).append("; selected: ").append(ta.isSelected()).append("; clickable: ").append(ta.isClickable()).append("; longClickable: ").append(ta.isLongClickable()).append("; enabled: ").append(ta.isEnabled()).append("; password: ").append(ta.isPassword()).append("; scrollable: ".append(ta.isScrollable()).toString()).append("; [");
       List actionList = ta.getActionList();
       int i = 0;
       if (actionList != null) {
          uArrayList = new ArrayList();
          i1 = actionList.size();
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             w3 v12 = new w3(actionList.get(i2), 0, null, null, null);
             uArrayList.add(v12);
          }
       }else {
          uArrayList = Collections.emptyList();
       }
       while (i < uArrayList.size()) {
          w3 ow3 = uArrayList.get(i);
          i1 = ow3.a();
          String str1 = "ACTION_UNKNOWN";
          if (i1 != 1) {
             if (i1 != 2) {
                switch (i1){
                    case 4:
                      str2 = "ACTION_SELECT";
                      break;
                    case 8:
                      str2 = "ACTION_CLEAR_SELECTION";
                      break;
                    case 16:
                      str2 = "ACTION_CLICK";
                      break;
                    case 32:
                      str2 = "ACTION_LONG_CLICK";
                      break;
                    case '@':
                      str2 = "ACTION_ACCESSIBILITY_FOCUS";
                      break;
                    case 128:
                      str2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                      break;
                    case 256:
                      str2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                      break;
                    case 512:
                      str2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                      break;
                    case 1024:
                      str2 = "ACTION_NEXT_HTML_ELEMENT";
                      break;
                    case 2048:
                      str2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                      break;
                    case 4096:
                      str2 = "ACTION_SCROLL_FORWARD";
                      break;
                    case 8192:
                      str2 = "ACTION_SCROLL_BACKWARD";
                      break;
                    case 0x4000:
                      str2 = "ACTION_COPY";
                      break;
                    case 0x8000:
                      str2 = "ACTION_PASTE";
                      break;
                    case 0x10000:
                      str2 = "ACTION_CUT";
                      break;
                    case 0x20000:
                      str2 = "ACTION_SET_SELECTION";
                      break;
                    case 0x40000:
                      str2 = "ACTION_EXPAND";
                      break;
                    case 0x80000:
                      str2 = "ACTION_COLLAPSE";
                      break;
                    case 0x200000:
                      str2 = "ACTION_SET_TEXT";
                      break;
                    case 0x1020042:
                      str2 = "ACTION_MOVE_WINDOW";
                      break;
                    default:
                      switch (i1){
                          case 0x1020036:
                            str2 = "ACTION_SHOW_ON_SCREEN";
                            break;
                          case 0x1020037:
                            str2 = "ACTION_SCROLL_TO_POSITION";
                            break;
                          case 0x1020038:
                            str2 = "ACTION_SCROLL_UP";
                            break;
                          case 0x1020039:
                            str2 = "ACTION_SCROLL_LEFT";
                            break;
                          case 0x102003a:
                            str2 = "ACTION_SCROLL_DOWN";
                            break;
                          case 0x102003b:
                            str2 = "ACTION_SCROLL_RIGHT";
                            break;
                          case 0x102003c:
                            str2 = "ACTION_CONTEXT_CLICK";
                            break;
                          case 0x102003d:
                            str2 = "ACTION_SET_PROGRESS";
                            break;
                          default:
                            switch (i1){
                                case 0x1020044:
                                  str2 = "ACTION_SHOW_TOOLTIP";
                                  break;
                                case 0x1020045:
                                  str2 = "ACTION_HIDE_TOOLTIP";
                                  break;
                                case 0x1020046:
                                  str2 = "ACTION_PAGE_UP";
                                  break;
                                case 0x1020047:
                                  str2 = "ACTION_PAGE_DOWN";
                                  break;
                                case 0x1020048:
                                  str2 = "ACTION_PAGE_LEFT";
                                  break;
                                case 0x1020049:
                                  str2 = "ACTION_PAGE_RIGHT";
                                  break;
                                case 0x102004a:
                                  str2 = "ACTION_PRESS_AND_HOLD";
                                  break;
                                default:
                                  switch (i1){
                                      case 0x1020054:
                                        str2 = "ACTION_IME_ENTER";
                                        break;
                                      case 0x1020055:
                                        str2 = "ACTION_DRAG_START";
                                        break;
                                      case 0x1020056:
                                        str2 = "ACTION_DRAG_DROP";
                                        break;
                                      case 0x1020057:
                                        str2 = "ACTION_DRAG_CANCEL";
                                        break;
                                      default:
                                        str2 = str1;
                                  }
                            }
                      }
                }
             }else {
                str2 = "ACTION_CLEAR_FOCUS";
             }
          }else {
             str2 = "ACTION_FOCUS";
          }
          if (str2.equals(str1) && ow3.b() != null) {
             str2 = ow3.b().toString();
          }
          str = str.append(str2);
          int i3 = uArrayList.size() - 1;
          if (i != i3) {
             str = str.append(", ");
          }
          i = i + 1;
       }
       return str+"]";
    }
}
