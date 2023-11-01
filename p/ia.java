package p.ia;
import p.ma;
import p.de5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class ia extends ma	// class@00195a from classes.dex
{
    public final de5 a;
    public final boolean b;

    public void ia(de5 p0,boolean p1){
       co5.o(p0, "picker");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ia) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ia tb;
       int i = this.a.hashCode() * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public final String toString(){
       return kg4.p("PickerItemClicked\(picker="+this.a+", userSelectedFromPicker=", this.b, ')');
    }
}
