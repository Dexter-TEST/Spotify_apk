package p.xj1;
import p.gg1;
import android.widget.TextView;
import p.wj1;
import android.text.InputFilter;
import p.hj1;
import android.text.method.TransformationMethod;

public final class xj1 extends gg1	// class@002c89 from classes.dex
{
    public final wj1 E;

    public void xj1(TextView p0){
       super(16);
       this.E = new wj1(p0);
    }
    public final InputFilter[] E(InputFilter[] p0){
       int i = (hj1.j != null)? 1: 0;
       if ((i ^ 1)) {
          return p0;
       }else {
          return this.E.E(p0);
       }
    }
    public final boolean K(){
       return this.E.G;
    }
    public final void U(boolean p0){
       int i = (hj1.j != null)? 1: 0;
       if ((i ^ 1)) {
          return;
       }else {
          this.E.U(p0);
          return;
       }
    }
    public final void V(boolean p0){
       int i = 1;
       int i1 = (hj1.j != null)? 1: 0;
       xj1 tE = this.E;
       if ((i1 ^ i)) {
          tE.G = p0;
       }else {
          tE.V(p0);
       }
       return;
    }
    public final TransformationMethod Y(TransformationMethod p0){
       int i = (hj1.j != null)? 1: 0;
       if ((i ^ 1)) {
          return p0;
       }else {
          return this.E.Y(p0);
       }
    }
}
