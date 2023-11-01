package p.rq0;
import android.util.SparseIntArray;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import p.oi;
import android.content.res.TypedArray;
import p.sq0;

public final class rq0	// class@002537 from classes.dex
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;
    public static final SparseIntArray n;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       rq0.n = sparseIntArr;
       sparseIntArr.append(6, 1);
       sparseIntArr.append(7, 2);
       sparseIntArr.append(8, 3);
       sparseIntArr.append(4, 4);
       sparseIntArr.append(5, 5);
       sparseIntArr.append(0, 6);
       sparseIntArr.append(1, 7);
       sparseIntArr.append(2, 8);
       sparseIntArr.append(3, 9);
       sparseIntArr.append(9, 10);
       sparseIntArr.append(10, 11);
       sparseIntArr.append(11, 12);
    }
    public void rq0(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = 0x3f800000;
       this.f = Float.NaN;
       this.g = Float.NaN;
       this.h = -1;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = false;
       this.m = 0;
    }
    public final void a(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, oi.D);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          switch (rq0.n.get(index)){
              case 1:
                this.a = typedArray.getFloat(index, this.a);
                break;
              case 2:
                this.b = typedArray.getFloat(index, this.b);
                break;
              case 3:
                this.c = typedArray.getFloat(index, this.c);
                break;
              case 4:
                this.d = typedArray.getFloat(index, this.d);
                break;
              case 5:
                this.e = typedArray.getFloat(index, this.e);
                break;
              case 6:
                this.f = typedArray.getDimension(index, this.f);
                break;
              case 7:
                this.g = typedArray.getDimension(index, this.g);
                break;
              case 8:
                this.i = typedArray.getDimension(index, this.i);
                break;
              case 9:
                this.j = typedArray.getDimension(index, this.j);
                break;
              case 10:
                this.k = typedArray.getDimension(index, this.k);
                break;
              case 11:
                this.l = true;
                this.m = typedArray.getDimension(index, this.m);
                break;
              case 12:
                this.h = sq0.f(typedArray, index, this.h);
                break;
              default:
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
