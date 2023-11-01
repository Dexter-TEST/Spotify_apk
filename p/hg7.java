package p.hg7;
import p.kg7;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import p.xl0;

public final class hg7 extends kg7	// class@00184b from classes.dex
{
    public xl0 e;
    public float f;
    public xl0 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint$Cap m;
    public Paint$Join n;
    public float o;

    public void hg7(){
       super();
       this.f = 0;
       this.h = 0x3f800000;
       this.i = 0x3f800000;
       this.j = 0;
       this.k = 0x3f800000;
       this.l = 0;
       this.m = Paint$Cap.BUTT;
       this.n = Paint$Join.MITER;
       this.o = 4.00f;
    }
    public void hg7(hg7 p0){
       super(p0);
       this.f = 0;
       this.h = 0x3f800000;
       this.i = 0x3f800000;
       this.j = 0;
       this.k = 0x3f800000;
       this.l = 0;
       this.m = Paint$Cap.BUTT;
       this.n = Paint$Join.MITER;
       this.o = 4.00f;
       this.e = p0.e;
       this.f = p0.f;
       this.h = p0.h;
       this.g = p0.g;
       this.c = p0.c;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
       this.n = p0.n;
       this.o = p0.o;
    }
    public final boolean a(){
       boolean b = (!this.g.d() && !this.e.d())? false: true;
       return b;
    }
    public final boolean b(int[] p0){
       return (this.e.e(p0) | this.g.e(p0));
    }
    public float getFillAlpha(){
       return this.i;
    }
    public int getFillColor(){
       return this.g.b;
    }
    public float getStrokeAlpha(){
       return this.h;
    }
    public int getStrokeColor(){
       return this.e.b;
    }
    public float getStrokeWidth(){
       return this.f;
    }
    public float getTrimPathEnd(){
       return this.k;
    }
    public float getTrimPathOffset(){
       return this.l;
    }
    public float getTrimPathStart(){
       return this.j;
    }
    public void setFillAlpha(float p0){
       this.i = p0;
    }
    public void setFillColor(int p0){
       this.g.b = p0;
    }
    public void setStrokeAlpha(float p0){
       this.h = p0;
    }
    public void setStrokeColor(int p0){
       this.e.b = p0;
    }
    public void setStrokeWidth(float p0){
       this.f = p0;
    }
    public void setTrimPathEnd(float p0){
       this.k = p0;
    }
    public void setTrimPathOffset(float p0){
       this.l = p0;
    }
    public void setTrimPathStart(float p0){
       this.j = p0;
    }
}
