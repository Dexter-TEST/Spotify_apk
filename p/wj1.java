package p.wj1;
import p.gg1;
import android.widget.TextView;
import p.rj1;
import android.text.InputFilter;
import android.util.SparseArray;
import java.lang.Object;
import java.lang.System;
import android.text.method.TransformationMethod;
import p.ak1;
import android.text.method.PasswordTransformationMethod;

public final class wj1 extends gg1	// class@002b48 from classes.dex
{
    public final TextView E;
    public final rj1 F;
    public boolean G;

    public void wj1(TextView p0){
       super(16);
       this.E = p0;
       this.G = true;
       this.F = new rj1(p0);
    }
    public final InputFilter[] E(InputFilter[] p0){
       int i = 0;
       int i1 = 1;
       if (this.G == null) {
          SparseArray sparseArray = new SparseArray(i1);
          i1 = 0;
          while (i1 < p0.length) {
             object oobject = p0[i1];
             if (oobject instanceof rj1) {
                sparseArray.put(i1, oobject);
             }
             i1 = i1 + 1;
          }
          if (sparseArray.size()) {
             i1 = p0.length;
             InputFilter[] inputFilterA = new InputFilter[(p0.length - sparseArray.size())];
             int i2 = 0;
             while (i < i1) {
                if (sparseArray.indexOfKey(i) < 0) {
                   inputFilterA[i2] = p0[i];
                   i2 = i2 + 1;
                }
                i = i + 1;
             }
             p0 = inputFilterA;
          }
          return p0;
       }else {
          int len = p0.length;
          int i3 = 0;
          while (true) {
             wj1 tF = this.F;
             if (i3 < len) {
                if (p0[i3] == tF) {
                   break ;
                }else {
                   i3 = i3 + 1;
                }
             }else {
                InputFilter[] inputFilterA1 = new InputFilter[(p0.length + i1)];
                System.arraycopy(p0, i, inputFilterA1, i, len);
                inputFilterA1[len] = tF;
                p0 = inputFilterA1;
                break ;
             }
          }
          return p0;
       }
    }
    public final boolean K(){
       return this.G;
    }
    public final void U(boolean p0){
       if (p0) {
          wj1 tE = this.E;
          tE.setTransformationMethod(this.Y(tE.getTransformationMethod()));
       }
       return;
    }
    public final void V(boolean p0){
       this.G = p0;
       wj1 tE = this.E;
       tE.setTransformationMethod(this.Y(tE.getTransformationMethod()));
       tE.setFilters(this.E(tE.getFilters()));
    }
    public final TransformationMethod Y(TransformationMethod p0){
       ak1 uoak1;
       if (this.G != null) {
          if (!p0 instanceof ak1 && !p0 instanceof PasswordTransformationMethod) {
             uoak1 = new ak1(p0);
          }
          return p0;
       }else if(p0 instanceof ak1){
          uoak1 = p0.a;
       }
       return uoak1;
    }
}
