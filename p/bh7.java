package p.bh7;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;
import android.view.View;
import android.os.Build$VERSION;
import p.zg7;
import java.lang.CharSequence;
import p.ph7;
import p.rh7;
import android.text.TextUtils;
import android.view.View$AccessibilityDelegate;
import p.wh7;
import p.l3;
import p.n3;

public abstract class bh7	// class@0010c8 from classes.dex
{
    public final int a;
    public final Class b;
    public final int c;
    public final int d;

    public void bh7(int p0,Class p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
    public static boolean a(Boolean p0,Boolean p1){
       boolean b = false;
       int i = (p0 != null && p0.booleanValue())? 1: 0;
       int i1 = (p1 != null && p1.booleanValue())? 1: 0;
       if (i == i1) {
          b = true;
       }
       return b;
    }
    public final Object b(View p0){
       Boolean uBoolean;
       int i = (Build$VERSION.SDK_INT >= this.c)? 1: 0;
       if (i) {
          zg7 ozg7 = this;
          zg7 e = ozg7.e;
          switch (e){
              case 0:
                uBoolean = ozg7.d(p0);
                break;
              case 1:
                switch (e){
                    case 1:
                      uBoolean = ph7.b(p0);
                      break;
                    default:
                      uBoolean = rh7.a(p0);
                }
                break;
              case 2:
                switch (e){
                    case 1:
                      uBoolean = ph7.b(p0);
                      break;
                    default:
                      uBoolean = rh7.a(p0);
                }
                break;
              default:
                uBoolean = ozg7.d(p0);
          }
          return uBoolean;
       }else {
          p0 = p0.getTag(this.a);
          if (this.b.isInstance(p0)) {
             return p0;
          }else {
             return null;
          }
       }
    }
    public final void c(View p0,Object p1){
       Boolean uBoolean;
       n3 on3;
       CharSequence uCharSequenc;
       boolean i = (Build$VERSION.SDK_INT >= this.c)? 1: 0;
       if (i) {
          zg7 e = this.e;
          switch (e){
              case 0:
                switch (e){
                    case 0:
                      ph7.i(p0, p1.booleanValue());
                      break;
                    default:
                      ph7.g(p0, p1.booleanValue());
                }
                break;
              case 1:
                switch (e){
                    case 1:
                      ph7.h(p0, p1);
                      break;
                    default:
                      rh7.b(p0, p1);
                }
                break;
              case 2:
                switch (e){
                    case 1:
                      ph7.h(p0, p1);
                      break;
                    default:
                      rh7.b(p0, p1);
                }
                break;
              default:
                switch (e){
                    case 0:
                      ph7.i(p0, p1.booleanValue());
                      break;
                    default:
                      ph7.g(p0, p1.booleanValue());
                }
          }
       }else {
          View$AccessibilityDelegate obj = this.b(p0);
          zg7 e1 = this.e;
          switch (e1){
              case 0:
                uBoolean = p1;
                switch (e1){
                    case 0:
                      i = bh7.a(obj, uBoolean);
                      break;
                    default:
                      i = bh7.a(obj, uBoolean);
                }
                break;
              case 1:
                uCharSequenc = p1;
                switch (e1){
                    case 1:
                      i = TextUtils.equals(obj, uCharSequenc);
                      break;
                    default:
                      i = TextUtils.equals(obj, uCharSequenc);
                }
                break;
              case 2:
                uCharSequenc = p1;
                switch (e1){
                    case 1:
                      i = TextUtils.equals(obj, uCharSequenc);
                      break;
                    default:
                      i = TextUtils.equals(obj, uCharSequenc);
                }
                break;
              default:
                uBoolean = p1;
                switch (e1){
                    case 0:
                      i = bh7.a(obj, uBoolean);
                      break;
                    default:
                      i = bh7.a(obj, uBoolean);
                }
          }
          i = i ^ 1;
          if (i) {
             if ((obj = wh7.c(p0)) == null) {
                on3 = null;
             }else if(obj instanceof l3){
                on3 = obj.a;
             }else {
                on3 = new n3(obj);
             }
             if (on3 == null) {
                on3 = new n3();
             }
             wh7.o(p0, on3);
             p0.setTag(this.a, p1);
             wh7.g(p0, this.d);
          }
       }
       return;
    }
}
