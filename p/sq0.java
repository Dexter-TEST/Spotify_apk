package p.sq0;
import android.util.SparseIntArray;
import java.lang.Object;
import java.util.HashMap;
import androidx.constraintlayout.widget.Barrier;
import java.lang.String;
import android.content.Context;
import android.view.View;
import p.do5;
import java.lang.reflect.Field;
import java.lang.Class;
import android.content.res.Resources;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Integer;
import java.util.Arrays;
import android.util.AttributeSet;
import p.nq0;
import p.oi;
import android.content.res.TypedArray;
import p.ej4;
import p.mq0;
import p.oq0;
import p.hd4;
import android.util.TypedValue;
import p.pq0;
import p.rq0;
import p.qq0;
import android.util.Log;
import p.hq0;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Float;
import java.lang.Math;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.lang.RuntimeException;
import p.fq0;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import p.dq0;
import p.en6;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.lang.StringBuilder;
import java.lang.Throwable;
import androidx.constraintlayout.widget.Guideline;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;

public final class sq0	// class@002679 from classes.dex
{
    public final HashMap a;
    public final boolean b;
    public final HashMap c;
    public static final int[] d;
    public static final SparseIntArray e;
    public static final SparseIntArray f;

    static {
       sq0.d = new int[3]{0,4,8};
       SparseIntArray sparseIntArr = new SparseIntArray();
       sq0.e = sparseIntArr;
       SparseIntArray sparseIntArr1 = new SparseIntArray();
       sq0.f = sparseIntArr1;
       sparseIntArr.append(82, 25);
       sparseIntArr.append(83, 26);
       sparseIntArr.append(85, 29);
       sparseIntArr.append(86, 30);
       sparseIntArr.append(92, 36);
       sparseIntArr.append(91, 35);
       sparseIntArr.append(63, 4);
       sparseIntArr.append(62, 3);
       sparseIntArr.append(58, 1);
       sparseIntArr.append(60, 91);
       sparseIntArr.append(59, 92);
       sparseIntArr.append(101, 6);
       sparseIntArr.append(102, 7);
       sparseIntArr.append(70, 17);
       sparseIntArr.append(71, 18);
       sparseIntArr.append(72, 19);
       sparseIntArr.append(54, 99);
       sparseIntArr.append(0, 27);
       sparseIntArr.append(87, 32);
       sparseIntArr.append(88, 33);
       sparseIntArr.append(69, 10);
       sparseIntArr.append(68, 9);
       sparseIntArr.append(106, 13);
       sparseIntArr.append(109, 16);
       sparseIntArr.append(107, 14);
       sparseIntArr.append(104, 11);
       sparseIntArr.append(108, 15);
       sparseIntArr.append(105, 12);
       sparseIntArr.append(95, 40);
       sparseIntArr.append(80, 39);
       sparseIntArr.append(79, 41);
       sparseIntArr.append(94, 42);
       sparseIntArr.append(78, 20);
       sparseIntArr.append(93, 37);
       sparseIntArr.append(67, 5);
       sparseIntArr.append(81, 87);
       sparseIntArr.append(90, 87);
       sparseIntArr.append(84, 87);
       sparseIntArr.append(61, 87);
       sparseIntArr.append(57, 87);
       sparseIntArr.append(5, 24);
       sparseIntArr.append(7, 28);
       sparseIntArr.append(23, 31);
       sparseIntArr.append(24, 8);
       sparseIntArr.append(6, 34);
       sparseIntArr.append(8, 2);
       sparseIntArr.append(3, 23);
       sparseIntArr.append(4, 21);
       sparseIntArr.append(96, 95);
       sparseIntArr.append(73, 96);
       sparseIntArr.append(2, 22);
       sparseIntArr.append(13, 43);
       sparseIntArr.append(26, 44);
       sparseIntArr.append(21, 45);
       sparseIntArr.append(22, 46);
       sparseIntArr.append(20, 60);
       sparseIntArr.append(18, 47);
       sparseIntArr.append(19, 48);
       sparseIntArr.append(14, 49);
       sparseIntArr.append(15, 50);
       sparseIntArr.append(16, 51);
       sparseIntArr.append(17, 52);
       sparseIntArr.append(25, 53);
       sparseIntArr.append(97, 54);
       sparseIntArr.append(74, 55);
       sparseIntArr.append(98, 56);
       sparseIntArr.append(75, 57);
       sparseIntArr.append(99, 58);
       sparseIntArr.append(76, 59);
       sparseIntArr.append(64, 61);
       sparseIntArr.append(66, 62);
       sparseIntArr.append(65, 63);
       sparseIntArr.append(28, 64);
       sparseIntArr.append(121, 65);
       sparseIntArr.append(35, 66);
       sparseIntArr.append(122, 67);
       sparseIntArr.append(113, 79);
       sparseIntArr.append(1, 38);
       sparseIntArr.append(112, 68);
       sparseIntArr.append(100, 69);
       sparseIntArr.append(77, 70);
       sparseIntArr.append(111, 97);
       sparseIntArr.append(32, 71);
       sparseIntArr.append(30, 72);
       sparseIntArr.append(31, 73);
       sparseIntArr.append(33, 74);
       sparseIntArr.append(29, 75);
       sparseIntArr.append(114, 76);
       sparseIntArr.append(89, 77);
       sparseIntArr.append(123, 78);
       sparseIntArr.append(56, 80);
       sparseIntArr.append(55, 81);
       sparseIntArr.append(116, 82);
       sparseIntArr.append(120, 83);
       sparseIntArr.append(119, 84);
       sparseIntArr.append(118, 85);
       sparseIntArr.append(117, 86);
       sparseIntArr1.append(85, 6);
       sparseIntArr1.append(85, 7);
       sparseIntArr1.append(0, 27);
       sparseIntArr1.append(89, 13);
       sparseIntArr1.append(92, 16);
       sparseIntArr1.append(90, 14);
       sparseIntArr1.append(87, 11);
       sparseIntArr1.append(91, 15);
       sparseIntArr1.append(88, 12);
       sparseIntArr1.append(78, 40);
       sparseIntArr1.append(71, 39);
       sparseIntArr1.append(70, 41);
       sparseIntArr1.append(77, 42);
       sparseIntArr1.append(69, 20);
       sparseIntArr1.append(76, 37);
       sparseIntArr1.append(60, 5);
       sparseIntArr1.append(72, 87);
       sparseIntArr1.append(75, 87);
       sparseIntArr1.append(73, 87);
       sparseIntArr1.append(57, 87);
       sparseIntArr1.append(56, 87);
       sparseIntArr1.append(5, 24);
       sparseIntArr1.append(7, 28);
       sparseIntArr1.append(23, 31);
       sparseIntArr1.append(24, 8);
       sparseIntArr1.append(6, 34);
       sparseIntArr1.append(8, 2);
       sparseIntArr1.append(3, 23);
       sparseIntArr1.append(4, 21);
       sparseIntArr1.append(79, 95);
       sparseIntArr1.append(64, 96);
       sparseIntArr1.append(2, 22);
       sparseIntArr1.append(13, 43);
       sparseIntArr1.append(26, 44);
       sparseIntArr1.append(21, 45);
       sparseIntArr1.append(22, 46);
       sparseIntArr1.append(20, 60);
       sparseIntArr1.append(18, 47);
       sparseIntArr1.append(19, 48);
       sparseIntArr1.append(14, 49);
       sparseIntArr1.append(15, 50);
       sparseIntArr1.append(16, 51);
       sparseIntArr1.append(17, 52);
       sparseIntArr1.append(25, 53);
       sparseIntArr1.append(80, 54);
       sparseIntArr1.append(65, 55);
       sparseIntArr1.append(81, 56);
       sparseIntArr1.append(66, 57);
       sparseIntArr1.append(82, 58);
       sparseIntArr1.append(67, 59);
       sparseIntArr1.append(59, 62);
       sparseIntArr1.append(58, 63);
       sparseIntArr1.append(28, 64);
       sparseIntArr1.append(105, 65);
       sparseIntArr1.append(34, 66);
       sparseIntArr1.append(106, 67);
       sparseIntArr1.append(96, 79);
       sparseIntArr1.append(1, 38);
       sparseIntArr1.append(97, 98);
       sparseIntArr1.append(95, 68);
       sparseIntArr1.append(83, 69);
       sparseIntArr1.append(68, 70);
       sparseIntArr1.append(32, 71);
       sparseIntArr1.append(30, 72);
       sparseIntArr1.append(31, 73);
       sparseIntArr1.append(33, 74);
       sparseIntArr1.append(29, 75);
       sparseIntArr1.append(98, 76);
       sparseIntArr1.append(74, 77);
       sparseIntArr1.append(107, 78);
       sparseIntArr1.append(55, 80);
       sparseIntArr1.append(54, 81);
       sparseIntArr1.append(100, 82);
       sparseIntArr1.append(104, 83);
       sparseIntArr1.append(103, 84);
       sparseIntArr1.append(102, 85);
       sparseIntArr1.append(101, 86);
       sparseIntArr1.append(94, 97);
    }
    public void sq0(){
       super();
       this.a = new HashMap();
       this.b = true;
       this.c = new HashMap();
    }
    public static int[] c(Barrier p0,String p1){
       int intx;
       ConstraintLayout d;
       Object obj;
       String[] stringArray = p1.split(",");
       Context context = p0.getContext();
       int[] ointArray = new int[stringArray.length];
       int i = 0;
       int i1 = 0;
       while (i < stringArray.length) {
          String str = stringArray[i].trim();
          try{
             int i2 = 0;
             intx = do5.class.getField(str).getInt(i2);
          }catch(java.lang.Exception e0){
             intx = 0;
          }
          if (!intx) {
             intx = e0.getResources().getIdentifier(str, "id", e0.getPackageName());
          }
          if (!intx && (p0.isInEditMode() && p0.getParent() instanceof ConstraintLayout)) {
             ConstraintLayout parent = p0.getParent();
             parent.getClass();
             if (str instanceof String && ((d = parent.D) != null && d.containsKey(str))) {
                obj = parent.D.get(str);
             }
             if (obj != null && obj instanceof Integer) {
                intx = obj.intValue();
             }
          }
          int i3 = i1 + 1;
          ointArray[i1] = intx;
          i = i + 1;
          i1 = i3;
       }
       if (i1 != stringArray.length) {
          ointArray = Arrays.copyOf(ointArray, i1);
       }
       return ointArray;
    }
    public static nq0 d(Context p0,AttributeSet p1,boolean p2){
       int indexCount;
       int i;
       int index;
       int i1;
       int i2;
       TypedValue type;
       String str;
       int index1;
       nq0 onq0 = new nq0();
       int[] x = (p2)? oi.x: oi.v;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, x);
       String[] x1 = ej4.x;
       int[] d = sq0.d;
       SparseIntArray e = sq0.e;
       nq0 b = onq0.b;
       nq0 e1 = onq0.e;
       nq0 c = onq0.c;
       nq0 d1 = onq0.d;
       if (p2) {
          indexCount = typedArray.getIndexCount();
          mq0 omq0 = new mq0();
          c.getClass();
          d1.getClass();
          b.getClass();
          e1.getClass();
          for (i = 0; i < indexCount; indexCount = i1) {
             index = typedArray.getIndex(i);
             i1 = indexCount;
             switch (sq0.f.get(index)){
                 case 2:
                   i2 = i;
                   omq0.b(2, typedArray.getDimensionPixelSize(index, d1.I));
                   break;
                 case 5:
                   i2 = i;
                   omq0.c(5, typedArray.getString(index));
                   break;
                 case 6:
                   i2 = i;
                   omq0.b(6, typedArray.getDimensionPixelOffset(index, d1.C));
                   break;
                 case 7:
                   i2 = i;
                   omq0.b(7, typedArray.getDimensionPixelOffset(index, d1.D));
                   break;
                 case 8:
                   i2 = i;
                   omq0.b(8, typedArray.getDimensionPixelSize(index, d1.J));
                   break;
                 case 11:
                   i2 = i;
                   omq0.b(11, typedArray.getDimensionPixelSize(index, d1.P));
                   break;
                 case 12:
                   i2 = i;
                   omq0.b(12, typedArray.getDimensionPixelSize(index, d1.Q));
                   break;
                 case 13:
                   i2 = i;
                   omq0.b(13, typedArray.getDimensionPixelSize(index, d1.M));
                   break;
                 case 14:
                   i2 = i;
                   omq0.b(14, typedArray.getDimensionPixelSize(index, d1.O));
                   break;
                 case 15:
                   i2 = i;
                   omq0.b(15, typedArray.getDimensionPixelSize(index, d1.R));
                   break;
                 case 16:
                   i2 = i;
                   omq0.b(16, typedArray.getDimensionPixelSize(index, d1.N));
                   break;
                 case 17:
                   i2 = i;
                   omq0.b(17, typedArray.getDimensionPixelOffset(index, d1.d));
                   break;
                 case 18:
                   i2 = i;
                   omq0.b(18, typedArray.getDimensionPixelOffset(index, d1.e));
                   break;
                 case 19:
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, d1.f), 19);
                   break;
                 case 20:
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, d1.w), 20);
                   break;
                 case 21:
                   i2 = i;
                   omq0.b(21, typedArray.getLayoutDimension(index, d1.c));
                   break;
                 case 22:
                   i2 = i;
                   omq0.b(22, d[typedArray.getInt(index, b.a)]);
                   break;
                 case 23:
                   i2 = i;
                   omq0.b(23, typedArray.getLayoutDimension(index, d1.b));
                   break;
                 case 24:
                   i2 = i;
                   omq0.b(24, typedArray.getDimensionPixelSize(index, d1.F));
                   break;
                 case 27:
                   i2 = i;
                   omq0.b(27, typedArray.getInt(index, d1.E));
                   break;
                 case 28:
                   i2 = i;
                   omq0.b(28, typedArray.getDimensionPixelSize(index, d1.G));
                   break;
                 case 31:
                   i2 = i;
                   omq0.b(31, typedArray.getDimensionPixelSize(index, d1.K));
                   break;
                 case '"':
                   i2 = i;
                   omq0.b(34, typedArray.getDimensionPixelSize(index, d1.H));
                   break;
                 case '%':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, d1.x), 37);
                   break;
                 case '&':
                   i2 = i;
                   indexCount = typedArray.getResourceId(index, onq0.a);
                   onq0.a = indexCount;
                   omq0.b(38, indexCount);
                   break;
                 case 39:
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, d1.U), 39);
                   break;
                 case '(':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, d1.T), 40);
                   break;
                 case ')':
                   i2 = i;
                   omq0.b(41, typedArray.getInt(index, d1.V));
                   break;
                 case '*':
                   i2 = i;
                   omq0.b(42, typedArray.getInt(index, d1.W));
                   break;
                 case '+':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, b.c), 43);
                   break;
                 case ',':
                   i2 = i;
                   indexCount = 44;
                   omq0.d(indexCount, true);
                   omq0.a(typedArray.getDimension(index, e1.m), indexCount);
                   break;
                 case '-':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, e1.b), 45);
                   break;
                 case '.':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, e1.c), 46);
                   break;
                 case '/':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, e1.d), 47);
                   break;
                 case '0':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, e1.e), 48);
                   break;
                 case '1':
                   i2 = i;
                   omq0.a(typedArray.getDimension(index, e1.f), 49);
                   break;
                 case '2':
                   i2 = i;
                   omq0.a(typedArray.getDimension(index, e1.g), 50);
                   break;
                 case '3':
                   i2 = i;
                   omq0.a(typedArray.getDimension(index, e1.i), 51);
                   break;
                 case '4':
                   i2 = i;
                   omq0.a(typedArray.getDimension(index, e1.j), 52);
                   break;
                 case '5':
                   i2 = i;
                   omq0.a(typedArray.getDimension(index, e1.k), 53);
                   break;
                 case '6':
                   i2 = i;
                   omq0.b(54, typedArray.getInt(index, d1.X));
                   break;
                 case '7':
                   i2 = i;
                   omq0.b(55, typedArray.getInt(index, d1.Y));
                   break;
                 case '8':
                   i2 = i;
                   omq0.b(56, typedArray.getDimensionPixelSize(index, d1.Z));
                   break;
                 case '9':
                   i2 = i;
                   omq0.b(57, typedArray.getDimensionPixelSize(index, d1.a0));
                   break;
                 case ':':
                   i2 = i;
                   omq0.b(58, typedArray.getDimensionPixelSize(index, d1.b0));
                   break;
                 case ';':
                   i2 = i;
                   omq0.b(59, typedArray.getDimensionPixelSize(index, d1.c0));
                   break;
                 case '<':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, e1.a), 60);
                   break;
                 case '>':
                   i2 = i;
                   omq0.b(62, typedArray.getDimensionPixelSize(index, d1.A));
                   break;
                 case '?':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, d1.B), 63);
                   break;
                 case '@':
                   i2 = i;
                   omq0.b(64, sq0.f(typedArray, index, c.a));
                   break;
                 case 'A':
                   i2 = i;
                   if (typedArray.peekValue(index).type == 3) {
                      omq0.c(65, typedArray.getString(index));
                   }else {
                      omq0.c(65, x1[typedArray.getInteger(index, 0)]);
                   }
                   break;
                 case 'B':
                   i2 = i;
                   omq0.b(66, typedArray.getInt(index, 0));
                   break;
                 case 'C':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, c.e), 67);
                   break;
                 case 'D':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, b.d), 68);
                   break;
                 case 'E':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, 0x3f800000), 69);
                   break;
                 case 'F':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, 0x3f800000), 70);
                   break;
                 case 'G':
                   i2 = i;
                   Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                   break;
                 case 'H':
                   i2 = i;
                   omq0.b(72, typedArray.getInt(index, d1.f0));
                   break;
                 case 'I':
                   i2 = i;
                   omq0.b(73, typedArray.getDimensionPixelSize(index, d1.g0));
                   break;
                 case 'J':
                   i2 = i;
                   omq0.c(74, typedArray.getString(index));
                   break;
                 case 'K':
                   i2 = i;
                   omq0.d(75, typedArray.getBoolean(index, d1.n0));
                   break;
                 case 'L':
                   i2 = i;
                   omq0.b(76, typedArray.getInt(index, c.c));
                   break;
                 case 'M':
                   i2 = i;
                   omq0.c(77, typedArray.getString(index));
                   break;
                 case 'N':
                   i2 = i;
                   omq0.b(78, typedArray.getInt(index, b.b));
                   break;
                 case 'O':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, c.d), 79);
                   break;
                 case 'P':
                   i2 = i;
                   omq0.d(80, typedArray.getBoolean(index, d1.l0));
                   break;
                 case 'Q':
                   i2 = i;
                   omq0.d(81, typedArray.getBoolean(index, d1.m0));
                   break;
                 case 'R':
                   i2 = i;
                   omq0.b(82, typedArray.getInteger(index, c.b));
                   break;
                 case 'S':
                   i2 = i;
                   omq0.b(83, sq0.f(typedArray, index, e1.h));
                   break;
                 case 'T':
                   i2 = i;
                   omq0.b(84, typedArray.getInteger(index, c.g));
                   break;
                 case 'U':
                   i2 = i;
                   omq0.a(typedArray.getFloat(index, c.f), 85);
                   break;
                 case 'V':
                   i2 = i;
                   if ((type = typedArray.peekValue(index).type) == 1) {
                      i = -1;
                      indexCount = typedArray.getResourceId(index, i);
                      c.i = indexCount;
                      omq0.b(89, indexCount);
                      if (c.i != i) {
                         omq0.b(88, -2);
                      }
                   }else if(type == 3){
                      str = typedArray.getString(index);
                      c.h = str;
                      omq0.c(90, str);
                      if (c.h.indexOf("/") > 0) {
                         index = typedArray.getResourceId(index, -1);
                         c.i = index;
                         omq0.b(89, index);
                         omq0.b(88, -2);
                      }else {
                         omq0.b(88, -1);
                      }
                   }else {
                      omq0.b(88, typedArray.getInteger(index, c.i));
                   }
                   break;
                 case 'W':
                   i2 = i;
                   Integer.toHexString(index);
                   e.get(index);
                   break;
                 case ']':
                   i2 = i;
                   omq0.b(93, typedArray.getDimensionPixelSize(index, d1.L));
                   break;
                 case '^':
                   i2 = i;
                   omq0.b(94, typedArray.getDimensionPixelSize(index, d1.S));
                   break;
                 case '_':
                   i2 = i;
                   sq0.g(omq0, typedArray, index, 0);
                   break;
                 case '`':
                   i2 = i;
                   sq0.g(omq0, typedArray, index, 1);
                   break;
                 case 'a':
                   i2 = i;
                   omq0.b(97, typedArray.getInt(index, d1.o0));
                   break;
                 case 'b':
                   i2 = i;
                   if (typedArray.peekValue(index).type == 3) {
                      typedArray.getString(index);
                   }else {
                      onq0.a = typedArray.getResourceId(index, onq0.a);
                   }
                   break;
                 case 'c':
                   omq0.d(99, typedArray.getBoolean(index, d1.g));
                   i2 = i;
                   break;
                 default:
                   i2 = i;
                   Integer.toHexString(index);
                   e.get(index);
             }
             i = i2 + 1;
          }
       }else {
          indexCount = typedArray.getIndexCount();
          for (index = 0; index < indexCount; indexCount = i1) {
             if ((index1 = typedArray.getIndex(index)) != 1 && 23 != index1) {
                if (24 != index1) {
                   c.getClass();
                   d1.getClass();
                   b.getClass();
                   e1.getClass();
                }
             }else {
                TypedValue type1 = 24;
             }
             switch (e.get(index1)){
                 case 1:
                   i1 = indexCount;
                   d1.p = sq0.f(typedArray, index1, d1.p);
                   break;
                 case 2:
                   i1 = indexCount;
                   d1.I = typedArray.getDimensionPixelSize(index1, d1.I);
                   break;
                 case 3:
                   i1 = indexCount;
                   d1.o = sq0.f(typedArray, index1, d1.o);
                   break;
                 case 4:
                   i1 = indexCount;
                   d1.n = sq0.f(typedArray, index1, d1.n);
                   break;
                 case 5:
                   i1 = indexCount;
                   d1.y = typedArray.getString(index1);
                   break;
                 case 6:
                   i1 = indexCount;
                   d1.C = typedArray.getDimensionPixelOffset(index1, d1.C);
                   break;
                 case 7:
                   i1 = indexCount;
                   d1.D = typedArray.getDimensionPixelOffset(index1, d1.D);
                   break;
                 case 8:
                   i1 = indexCount;
                   d1.J = typedArray.getDimensionPixelSize(index1, d1.J);
                   break;
                 case 9:
                   i1 = indexCount;
                   d1.v = sq0.f(typedArray, index1, d1.v);
                   break;
                 case 10:
                   i1 = indexCount;
                   d1.u = sq0.f(typedArray, index1, d1.u);
                   break;
                 case 11:
                   i1 = indexCount;
                   d1.P = typedArray.getDimensionPixelSize(index1, d1.P);
                   break;
                 case 12:
                   i1 = indexCount;
                   d1.Q = typedArray.getDimensionPixelSize(index1, d1.Q);
                   break;
                 case 13:
                   i1 = indexCount;
                   d1.M = typedArray.getDimensionPixelSize(index1, d1.M);
                   break;
                 case 14:
                   i1 = indexCount;
                   d1.O = typedArray.getDimensionPixelSize(index1, d1.O);
                   break;
                 case 15:
                   i1 = indexCount;
                   d1.R = typedArray.getDimensionPixelSize(index1, d1.R);
                   break;
                 case 16:
                   i1 = indexCount;
                   d1.N = typedArray.getDimensionPixelSize(index1, d1.N);
                   break;
                 case 17:
                   i1 = indexCount;
                   d1.d = typedArray.getDimensionPixelOffset(index1, d1.d);
                   break;
                 case 18:
                   i1 = indexCount;
                   d1.e = typedArray.getDimensionPixelOffset(index1, d1.e);
                   break;
                 case 19:
                   i1 = indexCount;
                   d1.f = typedArray.getFloat(index1, d1.f);
                   break;
                 case 20:
                   i1 = indexCount;
                   d1.w = typedArray.getFloat(index1, d1.w);
                   break;
                 case 21:
                   i1 = indexCount;
                   d1.c = typedArray.getLayoutDimension(index1, d1.c);
                   break;
                 case 22:
                   i1 = indexCount;
                   b.a = d[typedArray.getInt(index1, b.a)];
                   break;
                 case 23:
                   i1 = indexCount;
                   d1.b = typedArray.getLayoutDimension(index1, d1.b);
                   break;
                 case 24:
                   i1 = indexCount;
                   d1.F = typedArray.getDimensionPixelSize(index1, d1.F);
                   break;
                 case 25:
                   i1 = indexCount;
                   d1.h = sq0.f(typedArray, index1, d1.h);
                   break;
                 case 26:
                   i1 = indexCount;
                   d1.i = sq0.f(typedArray, index1, d1.i);
                   break;
                 case 27:
                   i1 = indexCount;
                   d1.E = typedArray.getInt(index1, d1.E);
                   break;
                 case 28:
                   i1 = indexCount;
                   d1.G = typedArray.getDimensionPixelSize(index1, d1.G);
                   break;
                 case 29:
                   i1 = indexCount;
                   d1.j = sq0.f(typedArray, index1, d1.j);
                   break;
                 case 30:
                   i1 = indexCount;
                   d1.k = sq0.f(typedArray, index1, d1.k);
                   break;
                 case 31:
                   i1 = indexCount;
                   d1.K = typedArray.getDimensionPixelSize(index1, d1.K);
                   break;
                 case 32:
                   i1 = indexCount;
                   d1.s = sq0.f(typedArray, index1, d1.s);
                   break;
                 case '!':
                   i1 = indexCount;
                   d1.t = sq0.f(typedArray, index1, d1.t);
                   break;
                 case '"':
                   i1 = indexCount;
                   d1.H = typedArray.getDimensionPixelSize(index1, d1.H);
                   break;
                 case '#':
                   i1 = indexCount;
                   d1.m = sq0.f(typedArray, index1, d1.m);
                   break;
                 case '$':
                   i1 = indexCount;
                   d1.l = sq0.f(typedArray, index1, d1.l);
                   break;
                 case '%':
                   i1 = indexCount;
                   d1.x = typedArray.getFloat(index1, d1.x);
                   break;
                 case '&':
                   i1 = indexCount;
                   onq0.a = typedArray.getResourceId(index1, onq0.a);
                   break;
                 case 39:
                   i1 = indexCount;
                   d1.U = typedArray.getFloat(index1, d1.U);
                   break;
                 case '(':
                   i1 = indexCount;
                   d1.T = typedArray.getFloat(index1, d1.T);
                   break;
                 case ')':
                   i1 = indexCount;
                   d1.V = typedArray.getInt(index1, d1.V);
                   break;
                 case '*':
                   i1 = indexCount;
                   d1.W = typedArray.getInt(index1, d1.W);
                   break;
                 case '+':
                   i1 = indexCount;
                   b.c = typedArray.getFloat(index1, b.c);
                   break;
                 case ',':
                   i1 = indexCount;
                   e1.l = true;
                   e1.m = typedArray.getDimension(index1, e1.m);
                   break;
                 case '-':
                   i1 = indexCount;
                   e1.b = typedArray.getFloat(index1, e1.b);
                   break;
                 case '.':
                   i1 = indexCount;
                   e1.c = typedArray.getFloat(index1, e1.c);
                   break;
                 case '/':
                   i1 = indexCount;
                   e1.d = typedArray.getFloat(index1, e1.d);
                   break;
                 case '0':
                   i1 = indexCount;
                   e1.e = typedArray.getFloat(index1, e1.e);
                   break;
                 case '1':
                   i1 = indexCount;
                   e1.f = typedArray.getDimension(index1, e1.f);
                   break;
                 case '2':
                   i1 = indexCount;
                   e1.g = typedArray.getDimension(index1, e1.g);
                   break;
                 case '3':
                   i1 = indexCount;
                   e1.i = typedArray.getDimension(index1, e1.i);
                   break;
                 case '4':
                   i1 = indexCount;
                   e1.j = typedArray.getDimension(index1, e1.j);
                   break;
                 case '5':
                   i1 = indexCount;
                   e1.k = typedArray.getDimension(index1, e1.k);
                   break;
                 case '6':
                   i1 = indexCount;
                   d1.X = typedArray.getInt(index1, d1.X);
                   break;
                 case '7':
                   i1 = indexCount;
                   d1.Y = typedArray.getInt(index1, d1.Y);
                   break;
                 case '8':
                   i1 = indexCount;
                   d1.Z = typedArray.getDimensionPixelSize(index1, d1.Z);
                   break;
                 case '9':
                   i1 = indexCount;
                   d1.a0 = typedArray.getDimensionPixelSize(index1, d1.a0);
                   break;
                 case ':':
                   i1 = indexCount;
                   d1.b0 = typedArray.getDimensionPixelSize(index1, d1.b0);
                   break;
                 case ';':
                   i1 = indexCount;
                   d1.c0 = typedArray.getDimensionPixelSize(index1, d1.c0);
                   break;
                 case '<':
                   i1 = indexCount;
                   e1.a = typedArray.getFloat(index1, e1.a);
                   break;
                 case '=':
                   i1 = indexCount;
                   d1.z = sq0.f(typedArray, index1, d1.z);
                   break;
                 case '>':
                   i1 = indexCount;
                   d1.A = typedArray.getDimensionPixelSize(index1, d1.A);
                   break;
                 case '?':
                   i1 = indexCount;
                   d1.B = typedArray.getFloat(index1, d1.B);
                   break;
                 case '@':
                   i1 = indexCount;
                   c.a = sq0.f(typedArray, index1, c.a);
                   break;
                 case 'A':
                   i1 = indexCount;
                   if (typedArray.peekValue(index1).type == 3) {
                      typedArray.getString(index1);
                      c.getClass();
                   label_070f :
                      i = 0;
                   }else {
                      c.getClass();
                   }
                   break;
                 case 'B':
                   i1 = indexCount;
                   typedArray.getInt(index1, 0);
                   c.getClass();
                label_06fb :
                   str = 3;
                   goto label_070f ;
                   break;
                 case 'C':
                   i1 = indexCount;
                   c.e = typedArray.getFloat(index1, c.e);
                   goto label_06fb ;
                   break;
                 case 'D':
                   i1 = indexCount;
                   b.d = typedArray.getFloat(index1, b.d);
                   goto label_06fb ;
                   break;
                 case 'E':
                   i1 = indexCount;
                   d1.d0 = typedArray.getFloat(index1, 0x3f800000);
                   goto label_06fb ;
                   break;
                 case 'F':
                   i1 = indexCount;
                   d1.e0 = typedArray.getFloat(index1, 0x3f800000);
                   goto label_06fb ;
                   break;
                 case 'G':
                   i1 = indexCount;
                   Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                label_06bb :
                   i = 0x3f800000;
                   goto label_06fb ;
                   break;
                 case 'H':
                   i1 = indexCount;
                   d1.f0 = typedArray.getInt(index1, d1.f0);
                   goto label_06bb ;
                   break;
                 case 'I':
                   i1 = indexCount;
                   d1.g0 = typedArray.getDimensionPixelSize(index1, d1.g0);
                   goto label_06bb ;
                   break;
                 case 'J':
                   i1 = indexCount;
                   d1.j0 = typedArray.getString(index1);
                   goto label_06bb ;
                   break;
                 case 'K':
                   i1 = indexCount;
                   d1.n0 = typedArray.getBoolean(index1, d1.n0);
                   goto label_06bb ;
                   break;
                 case 'L':
                   i1 = indexCount;
                   c.c = typedArray.getInt(index1, c.c);
                   goto label_06bb ;
                   break;
                 case 'M':
                   i1 = indexCount;
                   d1.k0 = typedArray.getString(index1);
                   goto label_06bb ;
                   break;
                 case 'N':
                   i1 = indexCount;
                   b.b = typedArray.getInt(index1, b.b);
                   goto label_06bb ;
                   break;
                 case 'O':
                   i1 = indexCount;
                   c.d = typedArray.getFloat(index1, c.d);
                   goto label_06bb ;
                   break;
                 case 'P':
                   i1 = indexCount;
                   d1.l0 = typedArray.getBoolean(index1, d1.l0);
                   goto label_06bb ;
                   break;
                 case 'Q':
                   i1 = indexCount;
                   d1.m0 = typedArray.getBoolean(index1, d1.m0);
                   goto label_06bb ;
                   break;
                 case 'R':
                   i1 = indexCount;
                   c.b = typedArray.getInteger(index1, c.b);
                   goto label_06bb ;
                   break;
                 case 'S':
                   i1 = indexCount;
                   e1.h = sq0.f(typedArray, index1, e1.h);
                   goto label_06bb ;
                   break;
                 case 'T':
                   i1 = indexCount;
                   c.g = typedArray.getInteger(index1, c.g);
                   goto label_06bb ;
                   break;
                 case 'U':
                   i1 = indexCount;
                   c.f = typedArray.getFloat(index1, c.f);
                   goto label_06bb ;
                   break;
                 case 'V':
                   type1 = typedArray.peekValue(index1).type;
                   i1 = indexCount;
                   if (type1 == 1) {
                      c.i = typedArray.getResourceId(index1, -1);
                      goto label_06fb ;
                   }else if(type1 == 3){
                      str = typedArray.getString(index1);
                      c.h = str;
                      if (str.indexOf("/") > 0) {
                         c.i = typedArray.getResourceId(index1, -1);
                         goto label_06bb ;
                      }else {
                         goto label_06bb ;
                      }
                   }else {
                      typedArray.getInteger(index1, c.i);
                      goto label_06bb ;
                   }
                   break;
                 case 'W':
                   Integer.toHexString(index1);
                   e.get(index1);
                label_05d4 :
                   i1 = indexCount;
                   goto label_06fb ;
                   break;
                 case '[':
                   d1.q = sq0.f(typedArray, index1, d1.q);
                   goto label_05d4 ;
                   break;
                 case 92:
                   d1.r = sq0.f(typedArray, index1, d1.r);
                   goto label_05d4 ;
                   break;
                 case ']':
                   d1.L = typedArray.getDimensionPixelSize(index1, d1.L);
                   goto label_05d4 ;
                   break;
                 case '^':
                   d1.S = typedArray.getDimensionPixelSize(index1, d1.S);
                   goto label_05d4 ;
                   break;
                 case '_':
                   sq0.g(d1, typedArray, index1, 0);
                   goto label_05d4 ;
                   break;
                 case '`':
                   sq0.g(d1, typedArray, index1, 1);
                   goto label_05d4 ;
                   break;
                 case 'a':
                   d1.o0 = typedArray.getInt(index1, d1.o0);
                   goto label_05d4 ;
                   break;
                 default:
                   i1 = indexCount;
                   Integer.toHexString(index1);
                   e.get(index1);
             }
             index = index + 1;
          }
          if (d1.j0 != null) {
             d1.i0 = null;
          }
       }
       typedArray.recycle();
       return onq0;
    }
    public static int f(TypedArray p0,int p1,int p2){
       if ((p2 = p0.getResourceId(p1, p2)) == -1) {
          p2 = p0.getInt(p1, -1);
       }
       return p2;
    }
    public static void g(Object p0,TypedArray p1,int p2,int p3){
       int intx;
       int i1;
       String str;
       float f;
       if (p0 == null) {
          return;
       }
       TypedValue type = p1.peekValue(p2).type;
       int i = 0;
       if (type != 3) {
          if (type != 5) {
             intx = p1.getInt(p2, i);
             i1 = -2;
             if (intx != -4) {
                if (intx != -3 && (intx == i1 && intx != -1)) {
                label_002d :
                   i1 = intx;
                }else {
                   i1 = 0;
                }
             }else {
                i = true;
             }
          }else {
             intx = p1.getDimensionPixelSize(p2, i);
             goto label_002d ;
          }
          if (p0 instanceof hq0) {
             if (!p3) {
                p0.width = i1;
                p0.W = i;
             }else {
                p0.height = i1;
                p0.X = i;
             }
          }else if(p0 instanceof oq0){
             if (!p3) {
                p0.b = i1;
                p0.l0 = i;
             }else {
                p0.c = i1;
                p0.m0 = i;
             }
          }else if(p0 instanceof mq0){
             if (!p3) {
                p0.b(23, i1);
                p0.d(80, i);
             }else {
                p0.b(21, i1);
                p0.d(81, i);
             }
          }
          return;
       }else if((str = p1.getString(p2)) == null){
          p2 = str.indexOf(61);
          i1 = str.length();
          if (p2 > 0 && p2 < (i1 - 1)) {
             String str1 = str.substring(i, p2);
             str = str.substring((p2 + 1));
             if (str.length() > 0) {
                String str2 = str1.trim();
                str = str.trim();
                if ("ratio".equalsIgnoreCase(str2)) {
                   if (p0 instanceof hq0) {
                      p0.width = (!p3)? i: i;
                      sq0.h(p0, str);
                   }else if(p0 instanceof oq0){
                      p0.y = str;
                   }else if(p0 instanceof mq0){
                      p0.c(5, str);
                   }
                }else if("weight".equalsIgnoreCase(str2)){
                   f = Float.parseFloat(str);
                   if (p0 instanceof hq0) {
                      if (!p3) {
                         p0.width = i;
                         p0.H = f;
                      }else {
                         p0.height = i;
                         p0.I = f;
                      }
                   }else if(p0 instanceof oq0){
                      if (!p3) {
                         p0.b = i;
                         p0.U = f;
                      }else {
                         p0.c = i;
                         p0.T = f;
                      }
                   }else if(p0 instanceof mq0){
                      if (!p3) {
                         p0.b(23, i);
                         p0.a(f, 39);
                      }else {
                         p0.b(21, i);
                         p0.a(f, 40);
                      }
                   }
                }else if("parent".equalsIgnoreCase(str2)){
                   f = Math.max(0, Math.min(0x3f800000, Float.parseFloat(str)));
                   if (p0 instanceof hq0) {
                      if (!p3) {
                         p0.width = i;
                         p0.R = f;
                         p0.L = 2;
                      }else {
                         p0.height = i;
                         p0.S = f;
                         p0.M = 2;
                      }
                   }else if(p0 instanceof oq0){
                      if (!p3) {
                         p0.b = i;
                         p0.d0 = f;
                         p0.X = 2;
                      }else {
                         p0.c = i;
                         p0.e0 = f;
                         p0.Y = 2;
                      }
                   }else if(p0 instanceof mq0){
                      if (!p3) {
                         p0.b(23, i);
                         p0.b(54, 2);
                      }else {
                         p0.b(21, i);
                         p0.b(55, 2);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public static void h(hq0 p0,String p1){
       String str1;
       try{
          if (p1 != null) {
             int i = p1.length();
             int i1 = p1.indexOf(44);
             int i2 = 0;
             int i3 = -1;
             if (i1 > 0 && i1 < (i - 1)) {
                String str = p1.substring(i2, i1);
                if (!str.equalsIgnoreCase("W")) {
                   i2 = (str.equalsIgnoreCase("H"))? 1: -1;
                }
                i3 = i2;
                i2 = i1 + 1;
             }
             if ((i1 = p1.indexOf(58)) >= 0 && i1 < (i - 1)) {
                str1 = p1.substring(i2, i1);
                String str2 = p1.substring((i1 + 1));
                if (str1.length() > 0 && str2.length() > 0) {
                   float f = Float.parseFloat(str1);
                   float f1 = Float.parseFloat(str2);
                   i2 = 0;
                   if ((i2 - f) > 0 && (i2 - f1) > 0) {
                      if (i3 == 1) {
                         Math.abs((f1 / f));
                      }else {
                         Math.abs((f / f1));
                      }
                   }
                }
             }else {
                str1 = p1.substring(i2);
                if (str1.length() > 0) {
                   Float.parseFloat(str1);
                }
             }
          }
          p0.G = p1;
          return;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public final void a(ConstraintLayout p0){
       int i2;
       nq0 onq0;
       nq0 d;
       oq0 i0;
       View obj;
       Class[] uClassArray;
       int i4;
       Object[] objArray;
       Class[] uClassArray1;
       int i6;
       int[] ointArray;
       nq0 onq02;
       sq0 osq0 = this;
       ViewGroup viewGroup = p0;
       int childCount = p0.getChildCount();
       sq0 c = osq0.c;
       HashSet hashSet = new HashSet(c.keySet());
       int i = 0;
       while (true) {
          int i1 = 1;
          if (i < childCount) {
             View childAt = viewGroup.getChildAt(i);
             int id = childAt.getId();
             if (!c.containsKey(Integer.valueOf(id))) {
                try{
                   childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                }catch(java.lang.Exception e0){
                }
             }else {
                int i3 = -1;
                if (osq0.b != null && id == i3) {
                   break ;
                }else if(id == i3 || !c.containsKey(Integer.valueOf(id))){
                   hashSet.remove(Integer.valueOf(id));
                   if ((onq0 = c.get(Integer.valueOf(id))) != null) {
                      if (childAt instanceof Barrier) {
                         d = onq0.d;
                         d.h0 = i1;
                         View view = childAt;
                         view.setId(id);
                         view.setType(d.f0);
                         view.setMargin(d.g0);
                         view.setAllowsGoneWidget(d.n0);
                         if ((i0 = d.i0) != null) {
                            view.setReferencedIds(i0);
                         }else if((i0 = d.j0) != null){
                            ointArray = sq0.c(view, i0);
                            d.i0 = ointArray;
                            view.setReferencedIds(ointArray);
                         }
                      }
                      ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                      layoutParams.a();
                      onq0.a(layoutParams);
                      d = onq0.f;
                      Class class = childAt.getClass();
                      Iterator iterator = d.keySet().iterator();
                      while (iterator.hasNext()) {
                         obj = iterator.next();
                         dq0 uodq0 = d.get(obj);
                         nq0 onq01 = d;
                         String str = (uodq0.a == null)? en6.n("set", obj): obj;
                         Iterator iterator1 = iterator;
                         try{
                            switch (en6.A(uodq0.b)){
                                case 0:
                                  i2 = childCount;
                                  uClassArray = new Class[1];
                                  i4 = 0;
                                  uClassArray[i4] = Integer.TYPE;
                                  objArray = new Object[1];
                                  objArray[i4] = Integer.valueOf(uodq0.c);
                                  class.getMethod(str, uClassArray).invoke(childAt, objArray);
                                  break;
                                case 1:
                                  i2 = childCount;
                                  uClassArray = new Class[1];
                                  i4 = 0;
                                  uClassArray[i4] = Float.TYPE;
                                  objArray = new Object[1];
                                  objArray[i4] = Float.valueOf(uodq0.d);
                                  class.getMethod(str, uClassArray).invoke(childAt, objArray);
                                  break;
                                case 2:
                                  i2 = childCount;
                                  uClassArray = new Class[1];
                                  i4 = 0;
                                  uClassArray[i4] = Integer.TYPE;
                                  objArray = new Object[1];
                                  objArray[i4] = Integer.valueOf(uodq0.g);
                                  class.getMethod(str, uClassArray).invoke(childAt, objArray);
                                  break;
                                case 3:
                                  i2 = childCount;
                                  uClassArray1 = new Class[]{Drawable.class};
                                  ColorDrawable uColorDrawab = new ColorDrawable();
                                  uColorDrawab.setColor(uodq0.g);
                                  Object[] objArray1 = new Object[]{uColorDrawab};
                                  class.getMethod(str, uClassArray1).invoke(childAt, objArray1);
                                  break;
                                case 4:
                                  i2 = childCount;
                                  uClassArray = new Class[1];
                                  i4 = 0;
                                  uClassArray[i4] = CharSequence.class;
                                  objArray = new Object[1];
                                  objArray[i4] = uodq0.e;
                                  class.getMethod(str, uClassArray).invoke(childAt, objArray);
                                  break;
                                case 5:
                                  i2 = childCount;
                                  uClassArray = new Class[1];
                                  i4 = 0;
                                  uClassArray[i4] = Boolean.TYPE;
                                  objArray = new Object[1];
                                  objArray[i4] = Boolean.valueOf(uodq0.f);
                                  class.getMethod(str, uClassArray).invoke(childAt, objArray);
                                  break;
                                case 6:
                                  i2 = childCount;
                                  uClassArray = new Class[1];
                                  i4 = 0;
                                  uClassArray[i4] = Float.TYPE;
                                  objArray = new Object[1];
                                  objArray[i4] = Float.valueOf(uodq0.d);
                                  class.getMethod(str, uClassArray).invoke(childAt, objArray);
                                  break;
                                case 7:
                                  int i5 = 1;
                                  i2 = childCount;
                                  uClassArray1 = new Class[i5];
                                  i4 = 0;
                                  uClassArray1[i4] = Integer.TYPE;
                                  Object[] objArray2 = new Object[i5];
                                  objArray2[i4] = Integer.valueOf(uodq0.c);
                                  class.getMethod(str, uClassArray1).invoke(childAt, objArray2);
                                  break;
                                default:
                                  i2 = childCount;
                            }
                         label_0233 :
                            d = onq01;
                            iterator = iterator1;
                            childCount = i2;
                         }catch(java.lang.NoSuchMethodException e0){
                            i2 = childCount;
                         }catch(java.lang.IllegalAccessException e0){
                            i2 = childCount;
                         }catch(java.lang.reflect.InvocationTargetException e0){
                            i2 = childCount;
                         }catch(java.lang.NoSuchMethodException e0){
                         }catch(java.lang.IllegalAccessException e0){
                         }catch(java.lang.reflect.InvocationTargetException e0){
                         }
                         Log.e("TransitionLayout", en6.t(" Custom Attribute \"", obj, "\" not found on ").append(class.getName()).toString(), e0);
                         goto label_0233 ;
                      }
                      i2 = childCount;
                      childAt.setLayoutParams(layoutParams);
                      nq0 b = onq0.b;
                      if (b.b == null) {
                         childAt.setVisibility(b.a);
                      }
                      childAt.setAlpha(b.c);
                      b = onq0.e;
                      childAt.setRotation(b.a);
                      childAt.setRotationX(b.b);
                      childAt.setRotationY(b.c);
                      childAt.setScaleX(b.d);
                      childAt.setScaleY(b.e);
                      if (b.h != -1) {
                         if ((obj = childAt.getParent().findViewById(b.h)) != null) {
                            id = obj.getBottom() + obj.getTop();
                            float f = (float)id;
                            f = f / 2.00f;
                            i6 = obj.getRight() + obj.getLeft();
                            float f1 = (float)i6 / 2.00f;
                            if ((id = childAt.getRight() - childAt.getLeft()) > 0 && (id = childAt.getBottom() - childAt.getTop()) > 0) {
                               f1 = f1 - (float)childAt.getLeft();
                               f = f - (float)childAt.getTop();
                               childAt.setPivotX(f1);
                               childAt.setPivotY(f);
                            }
                         }
                      }else if(!Float.isNaN(b.f)){
                         childAt.setPivotX(b.f);
                      }
                      if (!Float.isNaN(b.g)) {
                         childAt.setPivotY(b.g);
                      }
                      childAt.setTranslationX(b.i);
                      childAt.setTranslationY(b.j);
                      childAt.setTranslationZ(b.k);
                      if (b.l != null) {
                         childAt.setElevation(b.m);
                      label_02f3 :
                         i = i + 1;
                         osq0 = this;
                         childCount = i2;
                      }else {
                         goto label_02f3 ;
                      }
                   }
                }
             }
             i2 = childCount;
             goto label_02f3 ;
          }else {
             i2 = childCount;
             Iterator iterator2 = hashSet.iterator();
             while (iterator2.hasNext()) {
                Integer integer = iterator2.next();
                if ((onq02 = c.get(integer)) == null) {
                   continue ;
                }else {
                   nq0 d1 = onq02.d;
                   if (d1.h0 == 1) {
                      Barrier uBarrier = new Barrier(p0.getContext());
                      uBarrier.setId(integer.intValue());
                      if ((i0 = d1.i0) != null) {
                         uBarrier.setReferencedIds(i0);
                      }else if((i0 = d1.j0) != null){
                         ointArray = sq0.c(uBarrier, i0);
                         d1.i0 = ointArray;
                         uBarrier.setReferencedIds(ointArray);
                      }
                      uBarrier.setType(d1.f0);
                      uBarrier.setMargin(d1.g0);
                      hq0 ohq0 = new hq0(-2, -2);
                      uBarrier.k();
                      onq02.a(ohq0);
                      viewGroup.addView(uBarrier, ohq0);
                   }
                   if (d1.a != null) {
                      Guideline guideline = new Guideline(p0.getContext());
                      guideline.setId(integer.intValue());
                      hq0 ohq01 = new hq0(-2, -2);
                      onq02.a(ohq01);
                      viewGroup.addView(guideline, ohq01);
                   }
                }
             }
             i1 = 0;
             i6 = i2;
             while (i1 < i6) {
                View childAt1 = viewGroup.getChildAt(i1);
                if (childAt1 instanceof fq0) {
                   childAt1.f(viewGroup);
                }
                i1 = i1 + 1;
             }
             return;
          }
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public final void b(ConstraintLayout p0){
       Object obj;
       int i1;
       sq0 osq01;
       nq0 obj1;
       int i2;
       sq0 osq0 = this;
       int childCount = p0.getChildCount();
       sq0 c = osq0.c;
       c.clear();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          View childAt = p0.getChildAt(i);
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          int id = childAt.getId();
          if (osq0.b != null && id == -1) {
             break ;
          }else if(!c.containsKey(Integer.valueOf(id))){
             c.put(Integer.valueOf(id), new nq0());
          }
          if ((obj = c.get(Integer.valueOf(id))) == null) {
             i1 = childCount;
             osq01 = c;
          }else {
             sq0 a = osq0.a;
             HashMap hashMap = new HashMap();
             Class class = childAt.getClass();
             Iterator iterator = a.keySet().iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                dq0 uodq0 = a.get(obj1);
                try{
                   i1 = childCount;
                   if (obj1.equals("BackgroundColor")) {
                      Integer integer = Integer.valueOf(childAt.getBackground().getColor());
                      osq01 = c;
                      hashMap.put(obj1, new dq0(uodq0, integer));
                   }else {
                      i2 = c;
                      Class[] uClassArray = new Class[0];
                      Object[] objArray = new Object[0];
                      hashMap.put(obj1, new dq0(uodq0, class.getMethod("".append("getMap").append(obj1).toString(), uClassArray).invoke(childAt, objArray)));
                   }
                label_0122 :
                   childCount = i1;
                   c = i2;
                }catch(java.lang.NoSuchMethodException e0){
                   i2 = c;
                }catch(java.lang.IllegalAccessException e0){
                   i2 = c;
                }catch(java.lang.reflect.InvocationTargetException e0){
                   i2 = c;
                }catch(java.lang.NoSuchMethodException e0){
                }catch(java.lang.IllegalAccessException e0){
                }catch(java.lang.reflect.InvocationTargetException e0){
                }
                Log.e("TransitionLayout", en6.t(" Custom Attribute \"", obj1, "\" not found on ").append(class.getName()).toString(), e0);
                goto label_0122 ;
             }
             i1 = childCount;
             osq01 = c;
             obj.f = hashMap;
             obj.a = id;
             obj1 = obj.d;
             obj1.h = layoutParams.e;
             obj1.i = layoutParams.f;
             obj1.j = layoutParams.g;
             obj1.k = layoutParams.h;
             obj1.l = layoutParams.i;
             obj1.m = layoutParams.j;
             obj1.n = layoutParams.k;
             obj1.o = layoutParams.l;
             obj1.p = layoutParams.m;
             obj1.q = layoutParams.n;
             obj1.r = layoutParams.o;
             obj1.s = layoutParams.s;
             obj1.t = layoutParams.t;
             obj1.u = layoutParams.u;
             obj1.v = layoutParams.v;
             obj1.w = layoutParams.E;
             obj1.x = layoutParams.F;
             obj1.y = layoutParams.G;
             obj1.z = layoutParams.p;
             obj1.A = layoutParams.q;
             obj1.B = layoutParams.r;
             obj1.C = layoutParams.T;
             obj1.D = layoutParams.U;
             obj1.E = layoutParams.V;
             obj1.f = layoutParams.c;
             obj1.d = layoutParams.a;
             obj1.e = layoutParams.b;
             obj1.b = layoutParams.width;
             obj1.c = layoutParams.height;
             obj1.F = layoutParams.leftMargin;
             obj1.G = layoutParams.rightMargin;
             obj1.H = layoutParams.topMargin;
             obj1.I = layoutParams.bottomMargin;
             obj1.L = layoutParams.D;
             obj1.T = layoutParams.I;
             obj1.U = layoutParams.H;
             obj1.W = layoutParams.K;
             obj1.V = layoutParams.J;
             obj1.l0 = layoutParams.W;
             obj1.m0 = layoutParams.X;
             obj1.X = layoutParams.L;
             obj1.Y = layoutParams.M;
             obj1.Z = layoutParams.P;
             obj1.a0 = layoutParams.Q;
             obj1.b0 = layoutParams.N;
             obj1.c0 = layoutParams.O;
             obj1.d0 = layoutParams.R;
             obj1.e0 = layoutParams.S;
             obj1.k0 = layoutParams.Y;
             obj1.N = layoutParams.x;
             obj1.P = layoutParams.z;
             obj1.M = layoutParams.w;
             obj1.O = layoutParams.y;
             obj1.R = layoutParams.A;
             obj1.Q = layoutParams.B;
             obj1.S = layoutParams.C;
             obj1.o0 = layoutParams.Z;
             obj1.J = layoutParams.getMarginEnd();
             obj1.K = layoutParams.getMarginStart();
             nq0 b = obj.b;
             b.a = childAt.getVisibility();
             b.c = childAt.getAlpha();
             b = obj.e;
             b.a = childAt.getRotation();
             b.b = childAt.getRotationX();
             b.c = childAt.getRotationY();
             b.d = childAt.getScaleX();
             b.e = childAt.getScaleY();
             float pivotX = childAt.getPivotX();
             float pivotY = childAt.getPivotY();
             obj = 0;
             if ((obj - (double)pivotX) || (obj - (double)pivotY)) {
                b.f = pivotX;
                b.g = pivotY;
             }
             b.i = childAt.getTranslationX();
             b.j = childAt.getTranslationY();
             b.k = childAt.getTranslationZ();
             if (b.l != null) {
                b.m = childAt.getElevation();
             }
             if (childAt instanceof Barrier) {
                obj1.n0 = childAt.getAllowsGoneWidget();
                obj1.i0 = childAt.getReferencedIds();
                obj1.f0 = childAt.getType();
                obj1.g0 = childAt.getMargin();
             }
          }
          i = i + 1;
          osq0 = this;
          childCount = i1;
          c = osq01;
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public final void e(Context p0,int p1){
       XmlResourceParser xml = p0.getResources().getXml(p1);
       try{
          int eventType = xml.getEventType();
          while (true) {
             boolean b = true;
             if (eventType != b) {
                if (eventType == 2) {
                   nq0 onq0 = sq0.d(p0, Xml.asAttributeSet(xml), false);
                   if (xml.getName().equalsIgnoreCase("Guideline")) {
                      onq0.d.a = b;
                   }
                   this.c.put(Integer.valueOf(onq0.a), onq0);
                }
                eventType = xml.next();
             }
          }
       }catch(org.xmlpull.v1.XmlPullParserException e8){
          Log.e("ConstraintSet", "Error parsing resource: "+p1, e8);
       }catch(java.io.IOException e8){
          Log.e("ConstraintSet", "Error parsing resource: "+p1, e8);
       }
       return;
    }
}
