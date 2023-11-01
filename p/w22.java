package p.w22;
import p.x22;
import java.lang.Enum;
import p.q22;
import p.r22;
import p.s22;
import p.t22;
import p.u22;
import p.v22;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Character;
import java.lang.Class;
import java.lang.Object;

public abstract class w22 extends Enum implements x22	// class@002ab0 from classes.dex
{
    public static final q22 a;
    public static final w22[] b;

    static {
       q22 oq22 = new q22();
       w22.a = oq22;
       w22[] ow22Array = new w22[]{oq22,new r22(),new s22(),new t22(),new u22(),new v22()};
       w22.b = ow22Array;
    }
    public void w22(String p0,int p1){
       super(p0, p1);
    }
    public static String b(String p0,String p1){
       StringBuilder str = "";
       int i = p0.length();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          char c = p0.charAt(i1);
          if (Character.isUpperCase(c) && str.length()) {
             str = str.append(p1);
          }
          str = str.append(c);
       }
       return str;
    }
    public static String c(String p0){
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (!Character.isLetter(p0.charAt(i2)) && i2 < i) {
          i2 = i2 + 1;
       }
       char c = p0.charAt(i2);
       if (Character.isUpperCase(c)) {
          return p0;
       }
       c = Character.toUpperCase(c);
       if (!i2) {
          return c+p0.substring(1);
       }
       return p0.substring(i1, i2)+c+p0.substring((i2 + 1));
    }
    public static w22 valueOf(String p0){
       return Enum.valueOf(w22.class, p0);
    }
    public static w22[] values(){
       return w22.b.clone();
    }
}
