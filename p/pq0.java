package p.pq0;
import android.util.SparseIntArray;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import p.oi;
import android.content.res.TypedArray;
import android.util.TypedValue;
import java.lang.String;
import p.sq0;
import p.ej4;

public final class pq0	// class@0022ac from classes.dex
{
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;
    public static final SparseIntArray j;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       pq0.j = sparseIntArr;
       sparseIntArr.append(3, 1);
       sparseIntArr.append(5, 2);
       sparseIntArr.append(9, 3);
       sparseIntArr.append(2, 4);
       sparseIntArr.append(1, 5);
       sparseIntArr.append(0, 6);
       sparseIntArr.append(4, 7);
       sparseIntArr.append(8, 8);
       sparseIntArr.append(7, 9);
       sparseIntArr.append(6, 10);
    }
    public void pq0(){
       super();
       this.a = -1;
       this.b = 0;
       this.c = -1;
       this.d = Float.NaN;
       this.e = Float.NaN;
       this.f = Float.NaN;
       this.g = -1;
       this.h = null;
       this.i = -1;
    }
    public final void a(Context p0,AttributeSet p1){
       TypedValue type;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, oi.A);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          int i1 = 3;
          switch (pq0.j.get(index)){
              case 1:
                this.e = typedArray.getFloat(index, this.e);
                break;
              case 2:
                this.c = typedArray.getInt(index, this.c);
                break;
              case 3:
                if (typedArray.peekValue(index).type == i1) {
                   typedArray.getString(index);
                }else {
                   object oobject = ej4.x[typedArray.getInteger(index, 0)];
                }
                break;
              case 4:
                typedArray.getInt(index, 0);
                break;
              case 5:
                this.a = sq0.f(typedArray, index, this.a);
                break;
              case 6:
                this.b = typedArray.getInteger(index, this.b);
                break;
              case 7:
                this.d = typedArray.getFloat(index, this.d);
                break;
              case 8:
                this.g = typedArray.getInteger(index, this.g);
                break;
              case 9:
                this.f = typedArray.getFloat(index, this.f);
                break;
              case 10:
                if ((type = typedArray.peekValue(index).type) == 1) {
                   this.i = typedArray.getResourceId(index, -1);
                }else if(type == i1){
                   String str = typedArray.getString(index);
                   this.h = str;
                   if (str.indexOf("/") > 0) {
                      this.i = typedArray.getResourceId(index, -1);
                   }
                }else {
                   typedArray.getInteger(index, this.i);
                }
                break;
              default:
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
