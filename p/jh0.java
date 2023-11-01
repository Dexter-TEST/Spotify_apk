package p.jh0;
import p.xe7;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Character;
import p.ih0;
import java.lang.IllegalArgumentException;

public final class jh0 extends xe7	// class@001ad4 from classes.dex
{
    public static final char[] F;
    public static final char[] G;
    public static final char[] H;
    public static final char I;

    static {
       char[] uocharArray = new char[4]{'A','B','C','D'};
       jh0.F = uocharArray;
       jh0.G = new char[4]{'T','N','*','E'};
       jh0.H = new char[4]{'/',':','+','.'};
       jh0.I = uocharArray[0];
    }
    public void jh0(){
       super();
    }
    public final boolean[] s(String p0){
       boolean i1;
       boolean i2;
       char c;
       boolean b1;
       int i6;
       int i7;
       char i = jh0.I;
       boolean b = false;
       if (p0.length() < 2) {
          p0 = i+p0+i;
       }else {
          char c1 = Character.toUpperCase(p0.charAt(b));
          char c2 = Character.toUpperCase(p0.charAt((p0.length() - 1)));
          char[] f = jh0.F;
          boolean i4 = ih0.K(f, c1);
          boolean i5 = ih0.K(f, c2);
          char[] g = jh0.G;
          i1 = ih0.K(g, c1);
          i2 = ih0.K(g, c2);
          String str = "Invalid start/end guards: ";
          if (i4) {
             if (!i5) {
                throw new IllegalArgumentException(str.concat(p0));
             }
          }else if(i1){
             if (!i2) {
                throw new IllegalArgumentException(str.concat(p0));
             }
          }else if(!i5 && !i2){
             p0 = i+p0+i;
          }else {
             throw new IllegalArgumentException(str.concat(p0));
          }
       }
       i1 = 20;
       i2 = 1;
       while (true) {
          int i3 = p0.length() - 1;
          if (i2 < i3) {
             if (!Character.isDigit(p0.charAt(i2)) && (p0.charAt(i2) != '-' && p0.charAt(i2) != '$')) {
                if (ih0.K(jh0.H, p0.charAt(i2))) {
                   i1 = i1 + 10;
                }else {
                   break ;
                }
             }else {
                i1 = i1 + 9;
             }
             i2 = i2 + 1;
          }else {
             boolean[] uobooleanArr = new boolean[((p0.length() - 1) + i1)];
             i2 = 0;
             i3 = 0;
          }
       }
       throw new IllegalArgumentException("Cannot encode : \'"+p0.charAt(i2)+''');
    }
}
