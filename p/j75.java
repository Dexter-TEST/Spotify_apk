package p.j75;
import p.lv1;
import java.lang.reflect.Method;
import java.lang.String;
import p.i70;
import java.lang.Object;
import java.util.Objects;
import p.gv5;
import p.su0;
import java.lang.Character;
import p.e70;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.IllegalArgumentException;
import java.lang.AssertionError;
import p.tp2;
import p.do5;

public final class j75 extends lv1	// class@000256 from classes2.dex
{
    public final Method P;
    public final int Q;
    public final String R;
    public final su0 S;
    public final boolean T;

    public void j75(Method p0,int p1,String p2,boolean p3){
       super();
       this.P = p0;
       this.Q = p1;
       Objects.requireNonNull(p2, "name == null");
       this.R = p2;
       this.S = i70.a;
       this.T = p3;
    }
    public final void a(gv5 p0,Object p1){
       String str;
       String str1;
       j75 oj75 = this;
       gv5 ogv5 = p0;
       String obj = p1;
       j75 r = oj75.R;
       int i = 0;
       if (obj) {
          obj = oj75.S.a(obj);
          if (ogv5.c == null) {
             throw new AssertionError();
          }
          int i1 = obj.length();
          int i2 = 0;
          while (true) {
             if (i2 < i1) {
                int i3 = obj.codePointAt(i2);
                int i4 = 47;
                int i5 = 37;
                j75 t = oj75.T;
                int i6 = -1;
                if (i3 >= 32 && (i3 < 127 && (" \"<>^`{}|\\?#".indexOf(i3) == i6 && (t != null && (i3 == i4 && i3 != i5))))) {
                   i2 = i2 + Character.charCount(i3);
                }else {
                   e70 uoe70 = new e70();
                   uoe70.C0(obj, i, i2);
                   e70 uoe701 = null;
                   while (i2 < i1) {
                      i5 = obj.codePointAt(i2);
                      if (t == null || (i5 != 9 || (i5 == 10 || (i5 == 12 || i5 == 13)))) {
                         if (i5 >= 32 && (i5 < 127 && (" \"<>^`{}|\\?#".indexOf(i5) == i6 && (t != null && (i5 == i4 && i5 != 37))))) {
                            uoe70.D0(i5);
                         }else if(uoe701 == null){
                            uoe701 = new e70();
                         }
                         uoe701.D0(i5);
                         while (!uoe701.F()) {
                            i4 = uoe701.readByte() & 0x00ff;
                            uoe70.v0(37);
                            char[] l = gv5.l;
                            int i7 = i4 >> 4;
                            i7 = i7 & 0x0f;
                            uoe70.v0(l[i7]);
                            i4 = i4 & 0x0f;
                            uoe70.v0(l[i4]);
                            i6 = -1;
                         }
                      }
                      i2 = i2 + Character.charCount(i5);
                      i4 = 47;
                      i6 = -1;
                   }
                   str = uoe70.q0();
                label_00bd :
                   str1 = ogv5.c.replace("{"+r+"}", str);
                   if (gv5.m.matcher(str1).matches()) {
                      throw new IllegalArgumentException("@Path parameters shouldn\'t perform path traversal \(\'.\' or \'..\'\): ".concat(obj));
                   }
                }
             }else {
                str = obj;
                goto label_00bd ;
             }
          }
          ogv5.c = str1;
          return;
       }else {
          Object[] objArray = new Object[i];
          throw do5.W(oj75.P, oj75.Q, tp2.m("Path parameter \"", r, "\" value must not be null."), objArray);
       }
    }
}
