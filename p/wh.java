package p.wh;
import android.widget.TextView;
import java.lang.Object;
import p.fi;
import android.content.Context;
import p.ng;
import p.e57;
import android.content.res.ColorStateList;
import p.mw5;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import p.s3;
import java.lang.Class;
import p.co5;
import java.lang.Math;
import java.lang.Character;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.view.View;
import p.rh;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import p.wh7;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import java.lang.String;
import android.graphics.Typeface;
import p.uh;
import android.os.LocaleList;
import p.th;
import java.util.Locale;
import p.sh;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import p.bl7;
import p.x27;
import p.g57;
import p.ne1;
import p.vv7;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.tp2;
import java.lang.ref.WeakReference;
import p.ph;
import p.vh;

public final class wh	// class@002b3d from classes.dex
{
    public final TextView a;
    public e57 b;
    public e57 c;
    public e57 d;
    public e57 e;
    public e57 f;
    public e57 g;
    public e57 h;
    private final fi i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;

    public void wh(TextView p0){
       super();
       this.j = 0;
       this.k = -1;
       this.a = p0;
       this.i = new fi(p0);
    }
    public static e57 d(Context p0,ng p1,int p2){
       _monitor_enter(p1);
       ColorStateList uColorStateL = p1.a.i(p0, p2);
       _monitor_exit(p1);
       if (uColorStateL == null) {
          return null;
       }
       e57 uoe57 = new e57();
       uoe57.b = true;
       uoe57.c = uColorStateL;
       return uoe57;
    }
    public static void o(TextView p0,InputConnection p1,EditorInfo p2){
       int i3;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 30;
       if (sDK_INT < i && p1 != null) {
          CharSequence text = p0.getText();
          if (sDK_INT >= i) {
             s3.l(p2, text);
          }else {
             text.getClass();
             if (sDK_INT >= i) {
                s3.l(p2, text);
             }else {
                EditorInfo initialSelSt = p2.initialSelStart;
                EditorInfo initialSelEn = p2.initialSelEnd;
                i = (initialSelSt > initialSelEn)? initialSelEn + 0: initialSelSt + 0;
                int i1 = (initialSelSt > initialSelEn)? initialSelSt - 0: initialSelEn + 0;
                sDK_INT = text.length();
                CharSequence uCharSequenc = null;
                if (i >= 0 && i1 <= sDK_INT) {
                   int i2 = ((i2 = p2.inputType & 0x0fff) != 129 && (i2 != 225 && i2 != 18))? 0: 1;
                   if (i2) {
                      co5.J(p2, uCharSequenc, 0, 0);
                   }else if(sDK_INT <= 2048){
                      co5.J(p2, text, i, i1);
                   }else if((sDK_INT = i1 - i) > 1024){
                      i3 = 0;
                   }else {
                      i3 = sDK_INT;
                   }
                   int i4 = i3 - 2048;
                   i2 = Math.min((text.length() - i1), (i4 - Math.min(i, (int)((double)i4 * 0x3fe999999999999a))));
                   i4 = Math.min(i, (i4 - i2));
                   i = i - i4;
                   if (Character.isLowSurrogate(text.charAt(i))) {
                      i = i + 1;
                      i4 = i4 - 1;
                   }
                   if (Character.isHighSurrogate(text.charAt(((i1 + i2) - 1)))) {
                      i2 = i2 - 1;
                   }
                   int i5 = (i4 + i3) + i2;
                   if (i3 != sDK_INT) {
                      CharSequence[] uCharSequenc1 = new CharSequence[]{text.subSequence(i, (i + i4)),text.subSequence(i1, (i2 + i1))};
                      text = TextUtils.concat(uCharSequenc1);
                   }else {
                      text = text.subSequence(i, (i5 + i));
                   }
                   i4 = i4 + 0;
                   co5.J(p2, text, i4, (i3 + i4));
                }else {
                   co5.J(p2, uCharSequenc, 0, 0);
                }
             }
          }
       }
       return;
    }
    public final void a(Drawable p0,e57 p1){
       if (p0 != null && p1 != null) {
          ng.e(p0, p1, this.a.getDrawableState());
       }
       return;
    }
    public final void b(){
       Drawable[] compoundDraw;
       int i = 2;
       int i1 = 0;
       wh ta = this.a;
       if (this.b != null || (this.c != null || (this.d != null || this.e != null))) {
          compoundDraw = ta.getCompoundDrawables();
          this.a(compoundDraw[i1], this.b);
          this.a(compoundDraw[1], this.c);
          this.a(compoundDraw[i], this.d);
          this.a(compoundDraw[3], this.e);
       }
       if (this.f != null || this.g != null) {
          compoundDraw = rh.a(ta);
          this.a(compoundDraw[i1], this.f);
          this.a(compoundDraw[i], this.g);
       }
       return;
    }
    public final void c(){
       this.i.a();
    }
    public final int e(){
       return Math.round(this.i.e);
    }
    public final int f(){
       return Math.round(this.i.d);
    }
    public final int g(){
       return Math.round(this.i.c);
    }
    public final int[] h(){
       return this.i.f;
    }
    public final int i(){
       return this.i.a;
    }
    public final ColorStateList j(){
       wh th;
       e57 c = ((th = this.h) != null)? th.c: null;
       return c;
    }
    public final PorterDuff$Mode k(){
       wh th;
       e57 d = ((th = this.h) != null)? th.d: null;
       return d;
    }
    public final boolean l(){
       wh ti = this.i;
       boolean b = (ti.h() && ti.a != null)? true: false;
       return b;
    }
    public final void m(AttributeSet p0,int p1){
       int i9;
       ColorStateList uColorStateL;
       ColorStateList uColorStateL1;
       ColorStateList uColorStateL2;
       String str;
       String str1;
       int i10;
       ng ong1;
       wh l;
       fi j;
       float dimension1;
       ng ong2;
       Drawable uDrawable;
       Drawable uDrawable1;
       int i14;
       object oobject;
       object oobject1;
       wh owh = this;
       AttributeSet uAttributeSe = p0;
       int i = p1;
       wh a = owh.a;
       Context context = a.getContext();
       ng ong = ng.a();
       int[] k = ej4.K;
       p86 op86 = p86.m(context, uAttributeSe, k, i);
       wh7.n(a, a.getContext(), k, p0, op86.b, p1);
       int i1 = 0;
       int i2 = -1;
       boolean i3 = op86.i(i1, i2);
       int i4 = 3;
       if (op86.l(i4)) {
          owh.b = wh.d(context, ong, op86.i(i4, i1));
       }
       int i5 = 1;
       if (op86.l(i5)) {
          owh.c = wh.d(context, ong, op86.i(i5, i1));
       }
       int i6 = 4;
       if (op86.l(i6)) {
          owh.d = wh.d(context, ong, op86.i(i6, i1));
       }
       int i7 = 2;
       if (op86.l(i7)) {
          owh.e = wh.d(context, ong, op86.i(i7, i1));
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       int i8 = 5;
       if (op86.l(i8)) {
          owh.f = wh.d(context, ong, op86.i(i8, i1));
       }
       i7 = 6;
       if (op86.l(i7)) {
          owh.g = wh.d(context, ong, op86.i(i7, i1));
       }
       op86.o();
       v6 = a.getTransformationMethod() instanceof PasswordTransformationMethod;
       int[] a0 = ej4.a0;
       i7 = 23;
       i8 = 14;
       if (i3 != i2) {
          p86 op861 = new p86(context, context.obtainStyledAttributes(i3, a0));
          if (!i5 && op861.l(i8)) {
             i3 = op861.a(i8, i1);
             i9 = 1;
          }else {
             i3 = false;
             i9 = 0;
          }
          owh.v(context, op861);
          if (sDK_INT < i7) {
             uColorStateL = (op861.l(i4))? op861.b(i4): 0;
             if (op861.l(i6)) {
                uColorStateL1 = op861.b(i6);
                i6 = 5;
             }else {
                i6 = 5;
                uColorStateL1 = 0;
             }
             if (op861.l(i6)) {
                uColorStateL2 = op861.b(i6);
                i6 = 15;
             label_00f7 :
                if (op861.l(i6)) {
                   str = op861.j(i6);
                   i6 = 26;
                }else {
                   uDrawable1 = 26;
                   str = 0;
                }
                if (sDK_INT >= i6) {
                   i6 = 13;
                   if (op861.l(i6)) {
                      str1 = op861.j(i6);
                   label_0119 :
                      op861.o();
                   }
                }
                str1 = 0;
                goto label_0119 ;
             }
          }else {
             ong1 = 0;
             uColorStateL1 = 0;
          }
          i6 = 15;
          uColorStateL2 = 0;
          goto label_00f7 ;
       }else {
          i3 = false;
          i9 = 0;
          ong1 = 0;
          uColorStateL1 = 0;
          uColorStateL2 = 0;
          str = 0;
          str1 = 0;
       }
       p86 op862 = new p86(context, context.obtainStyledAttributes(uAttributeSe, a0, i, i1));
       if (!i5 && op862.l(i8)) {
          i3 = op862.a(i8, i1);
          i9 = 1;
       }
       if (sDK_INT < i7) {
          if (op862.l(i4)) {
             uColorStateL = op862.b(i4);
          }
          i10 = 4;
          if (op862.l(i10)) {
             uColorStateL1 = op862.b(i10);
          }
          i8 = 5;
          if (op862.l(i8)) {
             uColorStateL2 = op862.b(i8);
          }
       }
       ColorStateList uColorStateL3 = uColorStateL;
       ColorStateList uColorStateL4 = uColorStateL1;
       ColorStateList uColorStateL5 = uColorStateL2;
       i10 = 15;
       if (op862.l(i10)) {
          str = op862.j(i10);
       }
       String str2 = str;
       if (sDK_INT >= 26) {
          i4 = 13;
          if (op862.l(i4)) {
             str1 = op862.j(i4);
          }
       }else {
          j = 13;
       }
       ong1 = ong;
       String str3 = str1;
       if (sDK_INT >= 28 && (op862.l(i1) && !op862.d(i1, -1))) {
          a.setTextSize(i1, 0);
       }
       owh.v(context, op862);
       op862.o();
       if (uColorStateL3 != null) {
          a.setTextColor(uColorStateL3);
       }
       if (uColorStateL4 != null) {
          a.setHintTextColor(uColorStateL4);
       }
       if (uColorStateL5 != null) {
          a.setLinkTextColor(uColorStateL5);
       }
       if (!i5 && i9) {
          a.setAllCaps(i3);
       }
       if ((l = owh.l) != null) {
          if (owh.k == -1) {
             a.setTypeface(l, owh.j);
          }else {
             a.setTypeface(l);
          }
       }
       if (str3 != null) {
          uh.d(a, str3);
       }
       ong = 24;
       if (str2 != null) {
          if (sDK_INT >= ong) {
             th.b(a, th.a(str2));
          }else {
             rh.c(a, sh.a(str2.split(",")[i1]));
          }
       }
       wh i11 = owh.i;
       int[] l1 = ej4.L;
       j = i11.j;
       TypedArray typedArray = j.obtainStyledAttributes(uAttributeSe, l1, i, i1);
       fi i12 = i11.i;
       int i13 = 5;
       TypedArray typedArray1 = typedArray;
       TypedArray typedArray2 = typedArray;
       wh7.n(i12, i12.getContext(), l1, p0, typedArray1, p1);
       if (typedArray2.hasValue(i13)) {
          i11.a = typedArray2.getInt(i13, 0);
       }
       i3 = 4;
       float f = 0xbf800000;
       float dimension = (typedArray2.hasValue(i3))? typedArray2.getDimension(i3, f): 0xbf800000;
       sDK_INT = 2;
       if (typedArray2.hasValue(sDK_INT)) {
          dimension1 = typedArray2.getDimension(sDK_INT, f);
          sDK_INT = 1;
       }else {
          sDK_INT = 1;
          dimension1 = 0xbf800000;
       }
       float dimension2 = (typedArray2.hasValue(sDK_INT))? typedArray2.getDimension(sDK_INT, f): 0xbf800000;
       i5 = 3;
       if (typedArray2.hasValue(i5) && (i13 = typedArray2.getResourceId(i5, 0)) > 0) {
          typedArray = typedArray2.getResources().obtainTypedArray(i13);
          i = typedArray.length();
          int[] ointArray = new int[i];
          if (i > 0) {
             i8 = 0;
             while (i8 < i) {
                ointArray[i8] = typedArray.getDimensionPixelSize(i8, -1);
                i8 = i8 + 1;
                sDK_INT = 1;
             }
             i11.f = fi.b(ointArray);
             i11.g();
          }
          typedArray.recycle();
       }
       typedArray2.recycle();
       if (i11.h()) {
          if (i11.a == 1) {
             if (i11.g == null) {
                DisplayMetrics displayMetri = j.getResources().getDisplayMetrics();
                f = 0xbf800000;
                if (!(f - dimension1)) {
                   i5 = 2;
                   dimension1 = TypedValue.applyDimension(i5, 12.00f, displayMetri);
                }else {
                   i5 = 2;
                }
                if (!(f - dimension2)) {
                   dimension2 = TypedValue.applyDimension(i5, 112.00f, displayMetri);
                }
                if (!(f - dimension)) {
                   dimension = 0x3f800000;
                }
                i11.i(dimension1, dimension2, dimension);
             }
             i11.f();
          }
       }else {
          i11.a = 0;
       }
       if (bl7.b) {
          l = owh.i;
          if (l.a != null) {
             i12 = l.f;
             if (i12.length > 0) {
                if (0xbf800000 - (float)uh.a(a)) {
                   uh.b(a, Math.round(owh.i.d), Math.round(owh.i.e), Math.round(owh.i.c), 0);
                }else {
                   uh.c(a, i12, 0);
                }
             }
          }
       }
       p86 op863 = new p86(context, context.obtainStyledAttributes(uAttributeSe, l1));
       i8 = -1;
       if ((sDK_INT = op863.i(8, i8)) != i8) {
          ong2 = ong1;
          uDrawable = ong2.b(context, sDK_INT);
       }else {
          ong2 = ong1;
          uDrawable = null;
       }
       uDrawable1 = ((i6 = op863.i(13, i8)) != i8)? ong2.b(context, i6): null;
       Drawable uDrawable2 = ((i5 = op863.i(9, i8)) != i8)? ong2.b(context, i5): null;
       Drawable uDrawable3 = ((i14 = op863.i(6, i8)) != i8)? ong2.b(context, i14): null;
       Drawable uDrawable4 = ((i = op863.i(10, i8)) != i8)? ong2.b(context, i): null;
       Drawable uDrawable5 = ((i13 = op863.i(7, i8)) != i8)? ong2.b(context, i13): null;
       if (uDrawable4 == null && uDrawable5 == null) {
          if (uDrawable != null || (uDrawable1 != null || (uDrawable2 != null || uDrawable3 != null))) {
             Drawable[] uDrawableArr1 = rh.a(a);
             i7 = 0;
             if ((oobject = uDrawableArr1[i7]) == null && uDrawableArr1[2] == null) {
                uDrawableArr1 = a.getCompoundDrawables();
                if (uDrawable == null) {
                   oobject1 = uDrawableArr1[i7];
                }
                if (uDrawable1 == null) {
                   uDrawable1 = uDrawableArr1[1];
                }
                if (uDrawable2 == null) {
                   uDrawable2 = uDrawableArr1[2];
                }
                if (uDrawable3 == null) {
                   uDrawable3 = uDrawableArr1[3];
                }
                a.setCompoundDrawablesWithIntrinsicBounds(uDrawable, uDrawable1, uDrawable2, uDrawable3);
             }else if(uDrawable1 != null){
                uDrawable1 = uDrawableArr1[1];
             }
             oobject1 = uDrawableArr1[2];
             if (uDrawable3 == null) {
                uDrawable3 = uDrawableArr1[3];
             }
             rh.b(a, oobject, uDrawable1, oobject1, uDrawable3);
          }
       }else {
          Drawable[] uDrawableArr = rh.a(a);
          if (uDrawable4 == null) {
             uDrawable4 = uDrawableArr[0];
          }
          if (uDrawable1 == null) {
             uDrawable1 = uDrawableArr[1];
          }
          if (uDrawable5 == null) {
             uDrawable5 = uDrawableArr[2];
          }
          if (uDrawable3 == null) {
             uDrawable3 = uDrawableArr[3];
          }
          rh.b(a, uDrawable4, uDrawable1, uDrawable5, uDrawable3);
       }
       sDK_INT = 11;
       if (op863.l(sDK_INT)) {
          ColorStateList uColorStateL6 = op863.b(sDK_INT);
          if (Build$VERSION.SDK_INT >= 24) {
             x27.f(a, uColorStateL6);
          }else if(a instanceof g57){
             a.setSupportCompoundDrawablesTintList(uColorStateL6);
          }
       }
       sDK_INT = 12;
       if (op863.l(sDK_INT)) {
          PorterDuff$Mode mode = ne1.c(op863.h(sDK_INT, -1), null);
          if (Build$VERSION.SDK_INT >= 24) {
             x27.g(a, mode);
          }else if(a instanceof g57){
             a.setSupportCompoundDrawablesTintMode(mode);
          }
       }
       sDK_INT = op863.d(15, -1);
       i7 = op863.d(18, -1);
       i6 = op863.d(19, -1);
       op863.o();
       if (sDK_INT != -1) {
          vv7.M(a, sDK_INT);
       }
       if (i7 != -1) {
          vv7.N(a, i7);
       }
       if (i6 != -1) {
          vv7.O(a, i6);
       }
       return;
    }
    public final void n(Context p0,int p1){
       ColorStateList uColorStateL;
       String str;
       wh tl;
       p86 op86 = new p86(p0, p0.obtainStyledAttributes(p1, ej4.a0));
       p1 = 14;
       wh ta = this.a;
       if (op86.l(p1)) {
          ta.setAllCaps(op86.a(p1, false));
       }
       if ((p1 = Build$VERSION.SDK_INT) < 23) {
          int i = 3;
          if (op86.l(i) && (uColorStateL = op86.b(i)) != null) {
             ta.setTextColor(uColorStateL);
          }
          i = 5;
          if (op86.l(i) && (uColorStateL = op86.b(i)) != null) {
             ta.setLinkTextColor(uColorStateL);
          }
          i = 4;
          if (op86.l(i) && (uColorStateL = op86.b(i)) != null) {
             ta.setHintTextColor(uColorStateL);
          }
       }
       if (op86.l(false) && !op86.d(false, -1)) {
          ta.setTextSize(false, 0);
       }
       this.v(p0, op86);
       if (p1 >= 26) {
          int i1 = 13;
          if (op86.l(i1) && (str = op86.j(i1)) != null) {
             uh.d(ta, str);
          }
       }
       op86.o();
       if ((tl = this.l) != null) {
          ta.setTypeface(tl, this.j);
       }
       return;
    }
    public final void p(int p0,int p1,int p2,int p3){
       wh ti = this.i;
       if (ti.h()) {
          DisplayMetrics displayMetri = ti.j.getResources().getDisplayMetrics();
          ti.i(TypedValue.applyDimension(p3, (float)p0, displayMetri), TypedValue.applyDimension(p3, (float)p1, displayMetri), TypedValue.applyDimension(p3, (float)p2, displayMetri));
          if (ti.f()) {
             ti.a();
          }
       }
       return;
    }
    public final void q(int[] p0,int p1){
       wh ti = this.i;
       if (ti.h()) {
          int len = p0.length;
          int i = 0;
          if (len > 0) {
             int[] ointArray = new int[len];
             if (!p1) {
                ointArray = Arrays.copyOf(p0, len);
             }else {
                DisplayMetrics displayMetri = ti.j.getResources().getDisplayMetrics();
                for (; i < len; i = i + 1) {
                   ointArray[i] = Math.round(TypedValue.applyDimension(p1, (float)p0[i], displayMetri));
                }
             }
             ti.f = fi.b(ointArray);
             if (!ti.g()) {
                throw new IllegalArgumentException("None of the preset sizes is valid: "+Arrays.toString(p0));
             }
          }else {
             ti.g = i;
          }
          if (ti.f()) {
             ti.a();
          }
       }
       return;
    }
    public final void r(int p0){
       wh ti = this.i;
       if (ti.h()) {
          if (p0) {
             if (p0 == 1) {
                DisplayMetrics displayMetri = ti.j.getResources().getDisplayMetrics();
                float f = TypedValue.applyDimension(2, 12.00f, displayMetri);
                ti.i(f, TypedValue.applyDimension(2, 112.00f, displayMetri), 0x3f800000);
                if (ti.f()) {
                   ti.a();
                }
             }else {
                throw new IllegalArgumentException(tp2.k("Unknown auto-size text type: ", p0));
             }
          }else {
             ti.a = 0;
             ti.d = 0xbf800000;
             ti.e = 0xbf800000;
             ti.c = 0xbf800000;
             int[] ointArray = new int[0];
             ti.f = ointArray;
             ti.b = false;
          }
       }
       return;
    }
    public final void s(ColorStateList p0){
       if (this.h == null) {
          this.h = new e57();
       }
       wh th = this.h;
       th.c = p0;
       boolean b = (p0 != null)? true: false;
       th.b = b;
       this.b = th;
       this.c = th;
       this.d = th;
       this.e = th;
       this.f = th;
       this.g = th;
       return;
    }
    public final void t(PorterDuff$Mode p0){
       if (this.h == null) {
          this.h = new e57();
       }
       wh th = this.h;
       th.d = p0;
       boolean b = (p0 != null)? true: false;
       th.a = b;
       this.b = th;
       this.c = th;
       this.d = th;
       this.e = th;
       this.f = th;
       this.g = th;
       return;
    }
    public final void u(int p0,float p1){
       if (!bl7.b && !this.l()) {
          this.i.e(p1, p0);
       }
       return;
    }
    public final void v(Context p0,p86 p1){
       int i1;
       Typeface typeface;
       String str;
       int b1;
       this.j = p1.h(2, this.j);
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 0;
       if (sDK_INT >= 28) {
          i1 = p1.h(11, -1);
          this.k = i1;
          if (i1 != -1) {
             this.j = (this.j & 2) | i;
          }
       }
       i1 = 10;
       int i2 = 12;
       if (!p1.l(i1) && !p1.l(i2)) {
          if (p1.l(1)) {
             this.m = i;
             if ((b1 = p1.h(1, 1)) != 1) {
                if (b1 != 2) {
                   if (b1 == 3) {
                      this.l = Typeface.MONOSPACE;
                   }
                }else {
                   this.l = Typeface.SERIF;
                }
             }else {
                this.l = Typeface.SANS_SERIF;
             }
          }
          return;
       }else {
          this.l = null;
          if (p1.l(i2)) {
             i1 = 12;
          }
          wh tk = this.k;
          wh tj = this.j;
          if (!p0.isRestricted()) {
             WeakReference weakReferenc = new WeakReference(this.a);
             try{
                ph oph = new ph(this, tk, tj, weakReferenc);
                if ((typeface = p1.g(i1, this.j, oph)) != null) {
                   if (sDK_INT >= 28 && this.k != -1) {
                      typeface = Typeface.create(typeface, i);
                      wh tk2 = this.k;
                      boolean b = ((this.j & 2))? true: false;
                      this.l = vh.a(typeface, tk2, b);
                   }else {
                      this.l = typeface;
                   }
                }
                b1 = (this.l == null)? true: false;
                this.m = b1;
             }catch(java.lang.UnsupportedOperationException e0){
             }catch(android.content.res.Resources$NotFoundException e0){
             }
          }
          if (this.l == null && (str = p1.j(i1)) != null) {
             if (Build$VERSION.SDK_INT >= 28 && this.k != -1) {
                typeface = Typeface.create(str, i);
                wh tk1 = this.k;
                if ((this.j & 2)) {
                   i = true;
                }
                this.l = vh.a(typeface, tk1, i);
             }else {
                this.l = Typeface.create(str, this.j);
             }
          }
          return;
       }
    }
}
