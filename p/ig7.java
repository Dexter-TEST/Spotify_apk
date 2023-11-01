package p.ig7;
import p.jg7;
import android.graphics.Matrix;
import java.util.ArrayList;
import p.pk;
import java.lang.Object;
import p.wh6;
import p.hg7;
import p.gg7;
import p.kg7;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ig7 extends jg7	// class@00198e from classes.dex
{
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public void ig7(){
       super();
       this.a = new Matrix();
       this.b = new ArrayList();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0x3f800000;
       this.g = 0x3f800000;
       this.h = 0;
       this.i = 0;
       this.j = new Matrix();
       this.l = null;
    }
    public void ig7(ig7 p0,pk p1){
       hg7 ohg7;
       super();
       this.a = new Matrix();
       this.b = new ArrayList();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0x3f800000;
       this.g = 0x3f800000;
       this.h = 0;
       this.i = 0;
       Matrix matrix = new Matrix();
       this.j = matrix;
       this.l = null;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       ig7 l = p0.l;
       this.l = l;
       this.k = p0.k;
       if (l != null) {
          p1.put(l, this);
       }
       matrix.set(p0.j);
       p0 = p0.b;
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return;
          }
          kg7 obj = p0.get(i);
          if (obj instanceof ig7) {
             this.b.add(new ig7(obj, p1));
          }else if(obj instanceof hg7){
             ohg7 = new hg7(obj);
          }else if(obj instanceof gg7){
             ohg7 = new gg7(obj);
          }else {
             break ;
          }
          this.b.add(ohg7);
          if ((obj = ohg7.b) != null) {
             p1.put(obj, ohg7);
          }
          i = i + 1;
       }
       throw new IllegalStateException("Unknown object in the tree!");
    }
    public final boolean a(){
       boolean b = false;
       int i = 0;
       while (true) {
          ig7 tb = this.b;
          if (i >= tb.size()) {
             return b;
          }
          if (tb.get(i).a()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean b(int[] p0){
       int i = 0;
       int i1 = 0;
       while (true) {
          ig7 tb = this.b;
          if (i < tb.size()) {
             i1 = i1 | tb.get(i).b(p0);
             i = i + 1;
          }else {
             break ;
          }
       }
       return i1;
    }
    public final void c(){
       ig7 tj = this.j;
       tj.reset();
       tj.postTranslate((- this.d), (- this.e));
       tj.postScale(this.f, this.g);
       tj.postRotate(this.c, 0, 0);
       tj.postTranslate((this.h + this.d), (this.i + this.e));
    }
    public String getGroupName(){
       return this.l;
    }
    public Matrix getLocalMatrix(){
       return this.j;
    }
    public float getPivotX(){
       return this.d;
    }
    public float getPivotY(){
       return this.e;
    }
    public float getRotation(){
       return this.c;
    }
    public float getScaleX(){
       return this.f;
    }
    public float getScaleY(){
       return this.g;
    }
    public float getTranslateX(){
       return this.h;
    }
    public float getTranslateY(){
       return this.i;
    }
    public void setPivotX(float p0){
       if (this.d - p0) {
          this.d = p0;
          this.c();
       }
       return;
    }
    public void setPivotY(float p0){
       if (this.e - p0) {
          this.e = p0;
          this.c();
       }
       return;
    }
    public void setRotation(float p0){
       if (this.c - p0) {
          this.c = p0;
          this.c();
       }
       return;
    }
    public void setScaleX(float p0){
       if (this.f - p0) {
          this.f = p0;
          this.c();
       }
       return;
    }
    public void setScaleY(float p0){
       if (this.g - p0) {
          this.g = p0;
          this.c();
       }
       return;
    }
    public void setTranslateX(float p0){
       if (this.h - p0) {
          this.h = p0;
          this.c();
       }
       return;
    }
    public void setTranslateY(float p0){
       if (this.i - p0) {
          this.i = p0;
          this.c();
       }
       return;
    }
}
