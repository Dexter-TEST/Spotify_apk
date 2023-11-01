package p.qq0;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import p.oi;
import android.content.res.TypedArray;
import p.sq0;

public final class qq0	// class@0023f1 from classes.dex
{
    public int a;
    public int b;
    public float c;
    public float d;

    public void qq0(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0x3f800000;
       this.d = Float.NaN;
    }
    public final void a(Context p0,AttributeSet p1){
       int index;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, oi.B);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          if ((index = typedArray.getIndex(i)) == 1) {
             this.c = typedArray.getFloat(index, this.c);
          }else if(!index){
             index = typedArray.getInt(index, this.a);
             this.a = index;
             this.a = sq0.d[index];
          }else if(index == 4){
             this.b = typedArray.getInt(index, this.b);
          }else if(index == 3){
             this.d = typedArray.getFloat(index, this.d);
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
