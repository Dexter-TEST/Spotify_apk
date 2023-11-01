package p.u6;
import p.gg4;
import p.dh4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Intent;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import p.lv1;
import android.content.res.TypedArray;
import p.av6;
import java.lang.StringBuilder;
import android.content.ComponentName;
import android.net.Uri;

public final class u6 extends gg4	// class@002854 from classes.dex
{
    public Intent B;
    public String C;

    public void u6(dh4 p0){
       co5.o(p0, "activityNavigator");
       super(p0);
    }
    public final boolean equals(Object p0){
       u6 tB;
       boolean b1;
       boolean b = false;
       if (p0 != null && (p0 instanceof u6 && super.equals(p0))) {
          if ((tB = this.B) != null) {
             b1 = tB.filterEquals(p0.B);
          }else if(p0.B == null){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1 && co5.c(this.C, p0.C)) {
             b = true;
          }
       }
       return b;
    }
    public final int hashCode(){
       int i = super.hashCode() * 31;
       u6 tB = this.B;
       int i1 = 0;
       int i2 = (tB != null)? tB.filterHashCode(): 0;
       i = (i + i2) * 31;
       if ((tB = this.C) != null) {
          i1 = tB.hashCode();
       }
       return (i + i1);
    }
    public final void k(Context p0,AttributeSet p1){
       String str;
       String packageName;
       co5.o(p0, "context");
       super.k(p0, p1);
       TypedArray typedArray = p0.getResources().obtainAttributes(p1, lv1.M);
       co5.l(typedArray, "context.resources.obtain…tyNavigator\n            \)");
       if ((str = typedArray.getString(4)) != null) {
          packageName = p0.getPackageName();
          co5.l(packageName, "context.packageName");
          str = av6.x0(str, "${applicationId}", packageName);
       }
       if (this.B == null) {
          this.B = new Intent();
       }
       u6 tB = this.B;
       co5.i(tB);
       tB.setPackage(str);
       int i = 0;
       if ((packageName = typedArray.getString(i)) != null) {
          if (packageName.charAt(i) == '.') {
             packageName = p0.getPackageName()+packageName;
          }
          ComponentName uComponentNa = new ComponentName(p0, packageName);
          if (this.B == null) {
             this.B = new Intent();
          }
          u6 tB1 = this.B;
          co5.i(tB1);
          tB1.setComponent(uComponentNa);
       }
       String str1 = typedArray.getString(1);
       if (this.B == null) {
          this.B = new Intent();
       }
       u6 tB2 = this.B;
       co5.i(tB2);
       tB2.setAction(str1);
       if ((str1 = typedArray.getString(2)) != null) {
          Uri uri = Uri.parse(str1);
          if (this.B == null) {
             this.B = new Intent();
          }
          tB2 = this.B;
          co5.i(tB2);
          tB2.setData(uri);
       }
       this.C = typedArray.getString(3);
       typedArray.recycle();
       return;
    }
    public final String toString(){
       u6 tB = this.B;
       String str = null;
       ComponentName component = (tB != null)? tB.getComponent(): str;
       StringBuilder str1 = super.toString();
       if (component != null) {
          str1 = str1+" class="+component.getClassName();
       }else if((tB = this.B) != null){
          str = tB.getAction();
       }
       if (str != null) {
          str1 = str1+" action="+str;
       }
       String str2 = str1;
       co5.l(str2, "sb.toString\(\)");
       return str2;
    }
}
