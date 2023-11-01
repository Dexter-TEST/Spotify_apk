package p.iq5;
import p.xl7;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.x54;
import p.y54;
import java.util.ArrayList;
import java.util.List;
import p.hq5;
import java.lang.ref.Reference;
import android.graphics.Bitmap;
import java.util.Map;
import java.lang.System;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import p.dj0;

public final class iq5 implements xl7	// class@0019e6 from classes.dex
{
    public final LinkedHashMap a;
    public int b;

    public void iq5(){
       super();
       this.a = new LinkedHashMap();
    }
    public synchronized final void a(int p0){
       if (p0 >= 10 && p0 != 20) {
          this.d();
       }
       return;
    }
    public synchronized final y54 b(x54 p0){
       Bitmap uBitmap;
       ArrayList uArrayList = this.a.get(p0);
       y54 oy54 = null;
       if (uArrayList == null) {
          return oy54;
       }
       int i = uArrayList.size();
       int i1 = 0;
       while (i1 < i) {
          hq5 ohq5 = uArrayList.get(i1);
          y54 oy541 = ((uBitmap = ohq5.b.get()) != null)? new y54(uBitmap, ohq5.c): oy54;
          if (oy541 != null) {
             oy54 = oy541;
             break ;
          }
          i1 = i1 + 1;
       }
       iq5 tb = this.b;
       this.b = tb + 1;
       if (tb >= 10) {
          this.d();
       }
       return oy54;
    }
    public synchronized final void c(x54 p0,Bitmap p1,Map p2,int p3){
       ArrayList uArrayList;
       iq5 ta = this.a;
       if ((uArrayList = ta.get(p0)) == null) {
          uArrayList = new ArrayList();
          ta.put(p0, uArrayList);
       }
       int i = System.identityHashCode(p1);
       hq5 ohq5 = new hq5(i, new WeakReference(p1), p2, p3);
       int i1 = uArrayList.size();
       int i2 = 0;
       while (true) {
          if (i2 < i1) {
             hq5 ohq51 = uArrayList.get(i2);
             if (p3 >= ohq51.d) {
                if (ohq51.a == i && ohq51.b.get() == p1) {
                   uArrayList.set(i2, ohq5);
                label_004c :
                   iq5 tb = this.b;
                   this.b = tb + 1;
                   if (tb >= 10) {
                      this.d();
                      break ;
                   }
                   break ;
                }else {
                   uArrayList.add(i2, ohq5);
                   goto label_004c ;
                }
             }else {
                i2 = i2 + 1;
             }
          }else {
             uArrayList.add(ohq5);
             goto label_004c ;
          }
       }
       return;
    }
    public final void d(){
       hq5 ohq5;
       this.b = 0;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          ArrayList uArrayList = iterator.next();
          if (uArrayList.size() <= 1) {
             Bitmap uBitmap = ((ohq5 = dj0.l0(uArrayList)) != null && (ohq5 = ohq5.b) != null)? ohq5.get(): null;
             if (uBitmap == null) {
                iterator.remove();
             }
          }else {
             int i = uArrayList.size();
             int i1 = 0;
             int i2 = 0;
             while (i1 < i) {
                int i3 = i1 - i2;
                int i4 = (uArrayList.get(i3).b.get() == null)? 1: 0;
                if (i4) {
                   uArrayList.remove(i3);
                   i2 = i2 + 1;
                }
                i1 = i1 + 1;
             }
             if (uArrayList.isEmpty()) {
                iterator.remove();
             }
          }
       }
       return;
    }
}
