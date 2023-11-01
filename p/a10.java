package p.a10;
import java.lang.Character;
import java.lang.CharSequence;
import java.lang.Object;

public final class a10	// class@000eef from classes.dex
{
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;
    public static final byte[] e;

    static {
       byte[] uobyteArray = new byte[1792];
       a10.e = uobyteArray;
       for (int i = 0; i < 1792; i = i + 1) {
          a10.e[i] = Character.getDirectionality(i);
       }
    }
    public void a10(CharSequence p0){
       super();
       this.a = p0;
       this.b = p0.length();
    }
    public final byte a(){
       byte i;
       a10 td;
       a10 ta = this.a;
       char c = ta.charAt((this.c - 1));
       this.d = c;
       if (Character.isLowSurrogate(c)) {
          i = Character.codePointBefore(ta, this.c);
          this.c = this.c - Character.charCount(i);
          return Character.getDirectionality(i);
       }else {
          this.c = this.c - 1;
          i = ((td = this.d) < 1792)? a10.e[td]: Character.getDirectionality(td);
          return i;
       }
    }
}
