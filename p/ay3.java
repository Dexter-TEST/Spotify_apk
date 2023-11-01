package p.ay3;
import p.ir0;
import p.by3;
import java.lang.Object;
import p.t65;
import java.lang.String;
import p.co5;
import java.lang.Number;
import java.lang.Integer;
import java.util.HashMap;
import p.tc0;
import java.lang.Class;
import p.gv4;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.hz3;
import p.qw3;
import java.util.Collection;
import p.ll1;
import java.util.List;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import p.ax3;
import p.hc4;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.graphics.Rect;
import p.g37;
import java.util.ArrayList;
import p.dj0;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import android.text.Layout;
import java.lang.CharSequence;
import p.ye7;
import p.hh3;
import p.xz1;
import p.u44;
import p.il7;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.View$OnLayoutChangeListener;
import p.il0;
import p.jl7;
import p.t00;

public final class ay3 implements ir0	// class@001017 from classes.dex
{
    public final int a;
    public final by3 b;

    public void ay3(by3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       by3 g;
       tc0 otc02;
       int i5;
       tc0 otc03;
       by3 j;
       int i7;
       LyricsRecyclerView d1;
       LyricsRecyclerView e11;
       tc0 b1;
       ArrayList uArrayList;
       int i10;
       Iterator iterator1;
       int i11;
       Layout layout;
       Layout layout1;
       Rect rect1;
       Rect rect2;
       String str1;
       ay3 uoay3 = this;
       ay3 b = uoay3.b;
       switch (uoay3.a){
           case 0:
             break;
           default:
             b.b.onNext(p0);
             return;
       }
       Integer obj = p0;
       co5.o(obj, "indexes");
       int i = obj.a.intValue();
       int i1 = obj.b.intValue();
       if (i <= i1) {
          while (true) {
             by3 h = b.h;
             tc0 otc0 = h.get(Integer.valueOf(i));
             Rect int i2 = 0;
             if (otc0 != null) {
                otc0 = otc0.c;
             label_0039 :
                if (otc0 == null) {
                   by3 i3 = b.i;
                   i3.getClass();
                   co5.o(by3.k[i2], "property");
                   int i4 = i3.a.intValue();
                   if ((g = b.g) != null) {
                      tc0 otc01 = h.get(Integer.valueOf(i));
                      LyricsRecyclerView e1 = g.e1;
                      String str = "uiModel";
                      if (e1 != null) {
                         if (i >= e1.a.a.size()) {
                            otc02 = new tc0(i2, ll1.a, i2);
                         }else {
                            hr5 layoutManage = g.getLayoutManager();
                            if ((d1 = g.d1) != null) {
                               if ((e11 = g.e1) != null) {
                                  View view = (layoutManage != null)? layoutManage.C(i): null;
                                  if (view == null) {
                                     if (otc01 == null) {
                                        otc02 = hc4.a;
                                     }else {
                                        i5 = i1;
                                     }
                                  }else {
                                     AppCompatTextView uAppCompatTe = view.b();
                                     int lineCount = uAppCompatTe.getLineCount();
                                     int[] ointArray = new int[2];
                                     uAppCompatTe.getLocationOnScreen(ointArray);
                                     int i8 = ointArray[1];
                                     i2 = new Rect();
                                     Rect rect = new Rect();
                                     uAppCompatTe.getWindowVisibleDisplayFrame(i2);
                                     uAppCompatTe.getGlobalVisibleRect(rect);
                                     Rect bottom = rect.bottom;
                                     i2 = i2.bottom;
                                     if (bottom > i2) {
                                        bottom = bottom - (bottom - i2);
                                     }
                                     i2 = rect.top;
                                     int lineHeight = (e11.i != null)? uAppCompatTe.getLineHeight(): d1.b;
                                     if (otc01 != null && (b1 = otc01.b) != null) {
                                        uArrayList = dj0.C0(b1);
                                     }else {
                                        uArrayList = new ArrayList(lineCount);
                                        for (i11 = 0; i11 < lineCount; lineCount = lineCount) {
                                           uArrayList.add(Boolean.FALSE);
                                           i11 = i11 + 1;
                                        }
                                     }
                                     tc0 a2 = (otc01 != null)? otc01.a: 0;
                                     Iterator iterator = uArrayList.iterator();
                                     i5 = i1;
                                     i1 = 0;
                                     while (true) {
                                        if (iterator.hasNext()) {
                                           Object obj1 = iterator.next();
                                           int i9 = i1 + 1;
                                           if (i1 >= 0) {
                                              if (!obj1.booleanValue()) {
                                                 i10 = i1 * lineHeight;
                                                 iterator1 = iterator;
                                                 i11 = i10 + i8;
                                                 i10 = i8;
                                                 i8 = i11 + lineHeight;
                                                 if (i11 >= i2 && i8 <= bottom) {
                                                    if ((layout = uAppCompatTe.getLayout()) != null) {
                                                       i11 = layout.getLineStart(i1);
                                                       if ((layout1 = uAppCompatTe.getLayout()) != null) {
                                                          rect1 = bottom;
                                                          CharSequence text = uAppCompatTe.getText();
                                                          rect2 = i2;
                                                          co5.l(text, "text");
                                                          str1 = text.subSequence(i11, layout1.getLineEnd(i1)).toString();
                                                       label_0155 :
                                                          i7 = str1.length() + a2;
                                                          uArrayList.set(i1, Boolean.TRUE);
                                                          a2 = i7;
                                                       }
                                                    }
                                                    rect1 = bottom;
                                                    rect2 = i2;
                                                    str1 = "";
                                                    goto label_0155 ;
                                                 }else {
                                                    rect1 = bottom;
                                                    rect2 = i2;
                                                 }
                                              }else {
                                                 rect1 = bottom;
                                                 rect2 = i2;
                                                 iterator1 = iterator;
                                                 i10 = i8;
                                              }
                                              i8 = i10;
                                              i1 = i9;
                                              iterator = iterator1;
                                              bottom = rect1;
                                              i2 = rect2;
                                           }else {
                                              ye7.W();
                                              throw null;
                                           }
                                        }else if(otc01 != null){
                                           otc03 = otc01.b;
                                        }else {
                                           otc03 = null;
                                        }
                                        if (!co5.c(otc03, uArrayList) && a2) {
                                           uArrayList.toString();
                                        }
                                        i7 = uArrayList.contains(Boolean.FALSE) ^ 0x01;
                                        otc01 = new tc0(a2, uArrayList, i7);
                                     }
                                  }
                                  otc02 = otc01;
                               label_019d :
                                  otc03 = ((otc03 = h.get(Integer.valueOf(i))) != null)? otc03.a: 0;
                                  h.put(Integer.valueOf(i), otc02);
                                  i1 = otc02.a - otc03;
                                  i1 = i1 + i4;
                                  hh3[] k = by3.k;
                                  int i6 = 0;
                                  object oobject = k[i6];
                                  obj = Integer.valueOf(i1);
                                  i3.getClass();
                                  co5.o(oobject, "property");
                                  gv4 a = i3.a;
                                  i3.a = obj;
                                  i3.a(a, obj, oobject);
                                  i3.getClass();
                                  co5.o(k[i6], "property");
                                  if (i3.a.intValue() >= 140) {
                                     b.f.t();
                                     if ((j = b.j) != null) {
                                        il7 a1 = j.a;
                                        a1.getViewTreeObserver().removeOnScrollChangedListener(j.c);
                                        a1.removeOnLayoutChangeListener(null);
                                     }
                                     b.d.onComplete();
                                     break ;
                                  }else {
                                     i7 = i5;
                                  }
                               }else {
                                  co5.N(str);
                                  throw null;
                               }
                            }else {
                               co5.N("lyricViewLineSpec");
                               throw null;
                            }
                         }
                         i5 = i1;
                         goto label_019d ;
                      }else {
                         co5.N(str);
                         throw null;
                      }
                   }else {
                      co5.N("viewBinder");
                      throw null;
                   }
                }else {
                   i7 = i1;
                }
                if (i != i7) {
                   i = i + 1;
                   i1 = i7;
                   i7 = this;
                }
             }else {
                otc0 = null;
                goto label_0039 ;
             }
          }
       }else {
          b.getClass();
       }
       return;
    }
}
