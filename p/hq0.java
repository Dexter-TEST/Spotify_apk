package p.hq0;
import android.view.ViewGroup$MarginLayoutParams;
import p.wq0;
import android.content.Context;
import android.util.AttributeSet;
import p.oi;
import android.content.res.TypedArray;
import p.gq0;
import android.util.SparseIntArray;
import java.lang.Math;
import java.lang.String;
import android.util.Log;
import p.sq0;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import p.jn2;

public final class hq0 extends ViewGroup$MarginLayoutParams	// class@00189e from classes.dex
{
    public int A;
    public int B;
    public final int C;
    public final int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public wq0 p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final int w;
    public int x;
    public final int y;
    public int z;

    public void hq0(int p0,int p1){
       super(p0, p1);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = true;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = -1;
       this.o = -1;
       this.p = -1;
       this.q = 0;
       this.r = 0;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       this.w = Integer.MIN_VALUE;
       this.x = Integer.MIN_VALUE;
       this.y = Integer.MIN_VALUE;
       this.z = Integer.MIN_VALUE;
       this.A = Integer.MIN_VALUE;
       this.B = Integer.MIN_VALUE;
       this.C = Integer.MIN_VALUE;
       this.D = 0;
       this.E = 0x3f000000;
       this.F = 0x3f000000;
       this.G = null;
       this.H = 0xbf800000;
       this.I = 0xbf800000;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0;
       this.P = 0;
       this.Q = 0;
       this.R = 0x3f800000;
       this.S = 0x3f800000;
       this.T = -1;
       this.U = -1;
       this.V = -1;
       this.W = false;
       this.X = false;
       this.Y = null;
       this.Z = 0;
       this.a0 = true;
       this.b0 = true;
       this.c0 = false;
       this.d0 = false;
       this.e0 = false;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = Integer.MIN_VALUE;
       this.k0 = Integer.MIN_VALUE;
       this.l0 = 0x3f000000;
       this.p0 = new wq0();
    }
    public void hq0(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = true;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = -1;
       this.o = -1;
       this.p = -1;
       this.q = 0;
       this.r = 0;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       int i = Integer.MIN_VALUE;
       this.w = i;
       this.x = i;
       this.y = i;
       this.z = i;
       this.A = i;
       this.B = i;
       this.C = i;
       this.D = 0;
       float f = 0x3f000000;
       this.E = f;
       this.F = f;
       String str = null;
       this.G = str;
       this.H = 0xbf800000;
       this.I = 0xbf800000;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0;
       this.P = 0;
       this.Q = 0;
       this.R = 0x3f800000;
       this.S = 0x3f800000;
       this.T = -1;
       this.U = -1;
       this.V = -1;
       this.W = false;
       this.X = false;
       this.Y = str;
       this.Z = 0;
       this.a0 = true;
       this.b0 = true;
       this.c0 = false;
       this.d0 = false;
       this.e0 = false;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = i;
       this.k0 = i;
       this.l0 = f;
       this.p0 = new wq0();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, oi.w);
       int indexCount = typedArray.getIndexCount();
       int i1 = 0;
       while (i1 < indexCount) {
          i = typedArray.getIndex(i1);
          int i2 = gq0.a.get(i);
          str = "ConstraintLayout";
          switch (i2){
              case 1:
                this.V = typedArray.getInt(i, this.V);
                break;
              case 2:
                i2 = typedArray.getResourceId(i, this.p);
                this.p = i2;
                if (i2 == -1) {
                   this.p = typedArray.getInt(i, -1);
                }
                break;
              case 3:
                this.q = typedArray.getDimensionPixelSize(i, this.q);
                break;
              case 4:
                f = 360.00f;
                float f1 = typedArray.getFloat(i, this.r) % f;
                this.r = f1;
                if ((f1) < 0) {
                   f1 = f - f1;
                   f1 = f1 % f;
                   this.r = f1;
                }
                break;
              case 5:
                this.a = typedArray.getDimensionPixelOffset(i, this.a);
                break;
              case 6:
                this.b = typedArray.getDimensionPixelOffset(i, this.b);
                break;
              case 7:
                this.c = typedArray.getFloat(i, this.c);
                break;
              case 8:
                i2 = typedArray.getResourceId(i, this.e);
                this.e = i2;
                if (i2 == -1) {
                   this.e = typedArray.getInt(i, -1);
                }
                break;
              case 9:
                i2 = typedArray.getResourceId(i, this.f);
                this.f = i2;
                if (i2 == -1) {
                   this.f = typedArray.getInt(i, -1);
                }
                break;
              case 10:
                i2 = typedArray.getResourceId(i, this.g);
                this.g = i2;
                if (i2 == -1) {
                   this.g = typedArray.getInt(i, -1);
                }
                break;
              case 11:
                i2 = typedArray.getResourceId(i, this.h);
                this.h = i2;
                if (i2 == -1) {
                   this.h = typedArray.getInt(i, -1);
                }
                break;
              case 12:
                i2 = typedArray.getResourceId(i, this.i);
                this.i = i2;
                if (i2 == -1) {
                   this.i = typedArray.getInt(i, -1);
                }
                break;
              case 13:
                i2 = typedArray.getResourceId(i, this.j);
                this.j = i2;
                if (i2 == -1) {
                   this.j = typedArray.getInt(i, -1);
                }
                break;
              case 14:
                i2 = typedArray.getResourceId(i, this.k);
                this.k = i2;
                if (i2 == -1) {
                   this.k = typedArray.getInt(i, -1);
                }
                break;
              case 15:
                i2 = typedArray.getResourceId(i, this.l);
                this.l = i2;
                if (i2 == -1) {
                   this.l = typedArray.getInt(i, -1);
                }
                break;
              case 16:
                i2 = typedArray.getResourceId(i, this.m);
                this.m = i2;
                if (i2 == -1) {
                   this.m = typedArray.getInt(i, -1);
                }
                break;
              case 17:
                i2 = typedArray.getResourceId(i, this.s);
                this.s = i2;
                if (i2 == -1) {
                   this.s = typedArray.getInt(i, -1);
                }
                break;
              case 18:
                i2 = typedArray.getResourceId(i, this.t);
                this.t = i2;
                if (i2 == -1) {
                   this.t = typedArray.getInt(i, -1);
                }
                break;
              case 19:
                i2 = typedArray.getResourceId(i, this.u);
                this.u = i2;
                if (i2 == -1) {
                   this.u = typedArray.getInt(i, -1);
                }
                break;
              case 20:
                i2 = typedArray.getResourceId(i, this.v);
                this.v = i2;
                if (i2 == -1) {
                   this.v = typedArray.getInt(i, -1);
                }
                break;
              case 21:
                this.w = typedArray.getDimensionPixelSize(i, this.w);
                break;
              case 22:
                this.x = typedArray.getDimensionPixelSize(i, this.x);
                break;
              case 23:
                this.y = typedArray.getDimensionPixelSize(i, this.y);
                break;
              case 24:
                this.z = typedArray.getDimensionPixelSize(i, this.z);
                break;
              case 25:
                this.A = typedArray.getDimensionPixelSize(i, this.A);
                break;
              case 26:
                this.B = typedArray.getDimensionPixelSize(i, this.B);
                break;
              case 27:
                this.W = typedArray.getBoolean(i, this.W);
                break;
              case 28:
                this.X = typedArray.getBoolean(i, this.X);
                break;
              case 29:
                this.E = typedArray.getFloat(i, this.E);
                break;
              case 30:
                this.F = typedArray.getFloat(i, this.F);
                break;
              case 31:
                i = typedArray.getInt(i, 0);
                this.L = i;
                if (i == 1) {
                   Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                }
                break;
              case 32:
                i = typedArray.getInt(i, 0);
                this.M = i;
                if (i == 1) {
                   Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                }
                break;
              case '!':
                try{
                   this.N = typedArray.getDimensionPixelSize(i, this.N);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(i, this.N) == -2) {
                      this.N = -2;
                   }
                }
                break;
              case '"':
                try{
                   this.P = typedArray.getDimensionPixelSize(i, this.P);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(i, this.P) == -2) {
                      this.P = -2;
                   }
                }
                break;
              case '#':
                this.R = Math.max(0, typedArray.getFloat(i, this.R));
                this.L = 2;
                break;
              case '$':
                try{
                   this.O = typedArray.getDimensionPixelSize(i, this.O);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(i, this.O) == -2) {
                      this.O = -2;
                   }
                }
                break;
              case '%':
                try{
                   this.Q = typedArray.getDimensionPixelSize(i, this.Q);
                }catch(java.lang.Exception e0){
                   if (typedArray.getInt(i, this.Q) == -2) {
                      this.Q = -2;
                   }
                }
                break;
              case '&':
                this.S = Math.max(0, typedArray.getFloat(i, this.S));
                this.M = 2;
                break;
              default:
                switch (i2){
                    case ',':
                      sq0.h(this, typedArray.getString(i));
                      break;
                    case '-':
                      this.H = typedArray.getFloat(i, this.H);
                      break;
                    case '.':
                      this.I = typedArray.getFloat(i, this.I);
                      break;
                    case '/':
                      this.J = typedArray.getInt(i, 0);
                      break;
                    case '0':
                      this.K = typedArray.getInt(i, 0);
                      break;
                    case '1':
                      this.T = typedArray.getDimensionPixelOffset(i, this.T);
                      break;
                    case '2':
                      this.U = typedArray.getDimensionPixelOffset(i, this.U);
                      break;
                    case '3':
                      this.Y = typedArray.getString(i);
                      break;
                    case '4':
                      i2 = typedArray.getResourceId(i, this.n);
                      this.n = i2;
                      if (i2 == -1) {
                         this.n = typedArray.getInt(i, -1);
                      }
                      break;
                    case '5':
                      i2 = typedArray.getResourceId(i, this.o);
                      this.o = i2;
                      if (i2 == -1) {
                         this.o = typedArray.getInt(i, -1);
                      }
                      break;
                    case '6':
                      this.D = typedArray.getDimensionPixelSize(i, this.D);
                      break;
                    case '7':
                      this.C = typedArray.getDimensionPixelSize(i, this.C);
                      break;
                    default:
                      switch (i2){
                          case '@':
                            sq0.g(this, typedArray, i, 0);
                            break;
                          case 'A':
                            sq0.g(this, typedArray, i, true);
                            break;
                          case 'B':
                            this.Z = typedArray.getInt(i, this.Z);
                            break;
                          case 'C':
                            this.d = typedArray.getBoolean(i, this.d);
                            break;
                          default:
                      }
                }
          }
          i1 = i1 + 1;
       }
       typedArray.recycle();
       this.a();
       return;
    }
    public void hq0(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = -1;
       this.b = -1;
       this.c = 0xbf800000;
       this.d = true;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       this.n = -1;
       this.o = -1;
       this.p = -1;
       this.q = 0;
       this.r = 0;
       this.s = -1;
       this.t = -1;
       this.u = -1;
       this.v = -1;
       this.w = Integer.MIN_VALUE;
       this.x = Integer.MIN_VALUE;
       this.y = Integer.MIN_VALUE;
       this.z = Integer.MIN_VALUE;
       this.A = Integer.MIN_VALUE;
       this.B = Integer.MIN_VALUE;
       this.C = Integer.MIN_VALUE;
       this.D = 0;
       this.E = 0x3f000000;
       this.F = 0x3f000000;
       this.G = null;
       this.H = 0xbf800000;
       this.I = 0xbf800000;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = 0;
       this.O = 0;
       this.P = 0;
       this.Q = 0;
       float f = 0x3f800000;
       this.R = f;
       this.S = f;
       this.T = -1;
       this.U = -1;
       this.V = -1;
       this.W = false;
       this.X = false;
       this.Y = null;
       this.Z = 0;
       this.a0 = true;
       this.b0 = true;
       this.c0 = false;
       this.d0 = false;
       this.e0 = false;
       this.f0 = -1;
       this.g0 = -1;
       this.h0 = -1;
       this.i0 = -1;
       this.j0 = Integer.MIN_VALUE;
       this.k0 = Integer.MIN_VALUE;
       this.l0 = 0x3f000000;
       this.p0 = new wq0();
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams marginLayout = p0;
          this.leftMargin = marginLayout.leftMargin;
          this.rightMargin = marginLayout.rightMargin;
          this.topMargin = marginLayout.topMargin;
          this.bottomMargin = marginLayout.bottomMargin;
          this.setMarginStart(marginLayout.getMarginStart());
          this.setMarginEnd(marginLayout.getMarginEnd());
       }
       if (!p0 instanceof hq0) {
          return;
       }else {
          this.a = p0.a;
          this.b = p0.b;
          this.c = p0.c;
          this.d = p0.d;
          this.e = p0.e;
          this.f = p0.f;
          this.g = p0.g;
          this.h = p0.h;
          this.i = p0.i;
          this.j = p0.j;
          this.k = p0.k;
          this.l = p0.l;
          this.m = p0.m;
          this.n = p0.n;
          this.o = p0.o;
          this.p = p0.p;
          this.q = p0.q;
          this.r = p0.r;
          this.s = p0.s;
          this.t = p0.t;
          this.u = p0.u;
          this.v = p0.v;
          this.w = p0.w;
          this.x = p0.x;
          this.y = p0.y;
          this.z = p0.z;
          this.A = p0.A;
          this.B = p0.B;
          this.C = p0.C;
          this.D = p0.D;
          this.E = p0.E;
          this.F = p0.F;
          this.G = p0.G;
          this.H = p0.H;
          this.I = p0.I;
          this.J = p0.J;
          this.K = p0.K;
          this.W = p0.W;
          this.X = p0.X;
          this.L = p0.L;
          this.M = p0.M;
          this.N = p0.N;
          this.P = p0.P;
          this.O = p0.O;
          this.Q = p0.Q;
          this.R = p0.R;
          this.S = p0.S;
          this.T = p0.T;
          this.U = p0.U;
          this.V = p0.V;
          this.a0 = p0.a0;
          this.b0 = p0.b0;
          this.c0 = p0.c0;
          this.d0 = p0.d0;
          this.f0 = p0.f0;
          this.g0 = p0.g0;
          this.h0 = p0.h0;
          this.i0 = p0.i0;
          this.j0 = p0.j0;
          this.k0 = p0.k0;
          this.l0 = p0.l0;
          this.Y = p0.Y;
          this.Z = p0.Z;
          this.p0 = p0.p0;
          return;
       }
    }
    public final void a(){
       ViewGroup$MarginLayoutParams twidth;
       ViewGroup$MarginLayoutParams theight;
       boolean b = false;
       this.d0 = b;
       boolean b1 = true;
       this.a0 = b1;
       this.b0 = b1;
       if ((twidth = this.width) == -2 && this.W != null) {
          this.a0 = b;
          if (this.L == null) {
             this.L = b1;
          }
       }
       if ((theight = this.height) == -2 && this.X != null) {
          this.b0 = b;
          if (this.M == null) {
             this.M = b1;
          }
       }
       if (twidth == null || twidth == -1) {
          this.a0 = b;
          if (twidth == null && this.L == b1) {
             this.width = -2;
             this.W = b1;
          }
       }
       if (theight == null || theight == -1) {
          this.b0 = b;
          if (theight == null && this.M == b1) {
             this.height = -2;
             this.X = b1;
          }
       }
       if ((0xbf800000 - this.c) || (this.a != -1 || this.b != -1)) {
          this.d0 = b1;
          this.a0 = b1;
          this.b0 = b1;
          if (!this.p0 instanceof jn2) {
             this.p0 = new jn2();
          }
          this.p0.S(this.V);
       }
       return;
    }
    public final void resolveLayoutDirection(int p0){
       int i1;
       hq0 ts;
       ViewGroup$MarginLayoutParams tleftMargin = this.leftMargin;
       ViewGroup$MarginLayoutParams trightMargin = this.rightMargin;
       super.resolveLayoutDirection(p0);
       int i = 0;
       p0 = ((i1 = 1) == this.getLayoutDirection())? 1: 0;
       this.h0 = -1;
       this.i0 = -1;
       this.f0 = -1;
       this.g0 = -1;
       this.j0 = this.w;
       this.k0 = this.y;
       hq0 tE = this.E;
       this.l0 = tE;
       hq0 ta = this.a;
       this.m0 = ta;
       hq0 tb = this.b;
       this.n0 = tb;
       hq0 tc = this.c;
       this.o0 = tc;
       if (p0) {
          if ((ts = this.s) != -1) {
             this.h0 = ts;
          }else if((ts = this.t) != -1){
             this.i0 = ts;
          }else if((ts = this.u) != -1){
             this.g0 = ts;
             i = 1;
          }
          if ((ts = this.v) != -1) {
             this.f0 = ts;
             i = 1;
          }
          if ((ts = this.A) != Integer.MIN_VALUE) {
             this.k0 = ts;
          }
          if ((ts = this.B) != Integer.MIN_VALUE) {
             this.j0 = ts;
          }
          float f = 0x3f800000;
          if (i) {
             this.l0 = f - tE;
          }
          if (this.d0 != null && (this.V == i1 && this.d != null)) {
             if (0xbf800000 - tc) {
                this.o0 = f - tc;
                this.m0 = -1;
                this.n0 = -1;
             }else if(ta != -1){
                this.n0 = ta;
                this.m0 = -1;
                this.o0 = 0xbf800000;
             }else if(tb != -1){
                this.m0 = tb;
                this.n0 = -1;
                this.o0 = 0xbf800000;
             }
          }
          i = 1;
       }else if((ts = this.s) != -1){
          this.g0 = ts;
       }
       if ((ts = this.t) != -1) {
          this.f0 = ts;
       }
       if ((ts = this.u) != -1) {
          this.h0 = ts;
       }
       if ((ts = this.v) != -1) {
          this.i0 = ts;
       }
       if ((ts = this.A) != Integer.MIN_VALUE) {
          this.j0 = ts;
       }
       if ((ts = this.B) != Integer.MIN_VALUE) {
          this.k0 = ts;
       }
       if (this.u == -1 && (this.v == -1 && (this.t == -1 && this.s == -1))) {
          if ((ts = this.g) != -1) {
             this.h0 = ts;
             if (this.rightMargin <= null && trightMargin > null) {
                this.rightMargin = trightMargin;
             }
          }else if((ts = this.h) != -1){
             this.i0 = ts;
             if (this.rightMargin <= null && trightMargin > null) {
                this.rightMargin = trightMargin;
             }
          }
          if ((ts = this.e) != -1) {
             this.f0 = ts;
             if (this.leftMargin <= null && tleftMargin > null) {
                this.leftMargin = tleftMargin;
             }
          }else if((ts = this.f) != -1){
             this.g0 = ts;
             if (this.leftMargin <= null && tleftMargin > null) {
                this.leftMargin = tleftMargin;
             }
          }
       }
       return;
    }
}
