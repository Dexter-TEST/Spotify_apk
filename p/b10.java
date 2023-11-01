package p.b10;
import p.c27;
import java.lang.String;
import java.lang.Character;
import p.a27;
import java.lang.Object;
import java.lang.CharSequence;
import p.a10;
import android.text.SpannableStringBuilder;

public final class b10	// class@001030 from classes.dex
{
    public final boolean a;
    public final int b;
    public final a27 c;
    public static final String d;
    public static final String e;
    public static final b10 f;
    public static final b10 g;

    static {
       b27 c = c27.c;
       b10.d = Character.toString(8206);
       b10.e = Character.toString(8207);
       b10.f = new b10(false, 2, c);
       b10.g = new b10(true, 2, c);
    }
    public void b10(boolean p0,int p1,a27 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static int a(CharSequence p0){
       a10 c;
       byte i4;
       a10 uoa10 = new a10(p0);
       int i = 0;
       uoa10.c = i;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if ((c = uoa10.c) < uoa10.b && !i1) {
             a10 a = uoa10.a;
             char c1 = a.charAt(c);
             uoa10.d = c1;
             if (Character.isHighSurrogate(c1)) {
                i4 = Character.codePointAt(a, uoa10.c);
                int i5 = Character.charCount(i4) + uoa10.c;
                uoa10.c = i5;
                i4 = Character.getDirectionality(i4);
             }else {
                i4 = uoa10.c + 1;
                uoa10.c = i4;
                i4 = ((c = uoa10.d) < 1792)? a10.e[c]: Character.getDirectionality(c);
             }
             if (i4) {
                if (i4 != 1 && i4 != 2) {
                   if (i4 != 9) {
                      switch (i4){
                          case 14:
                          case 15:
                            i3 = i3 + 1;
                            i2 = -1;
                            break;
                          case 16:
                          case 17:
                            i3 = i3 + 1;
                            i2 = 1;
                            break;
                          case 18:
                            i3 = i3 - 1;
                            i2 = 0;
                            break;
                          default:
                      }
                   }
                }else if(!i3){
                label_0086 :
                   i = 1;
                   break ;
                }
             }else if(!i3){
             label_008a :
                i = -1;
                break ;
             }
             i1 = i3;
          }else if(!i1){
             break ;
          }else if(i2){
             i = i2;
             break ;
          }else {
             while (uoa10.c > null) {
                switch (uoa10.a()){
                    case 14:
                    case 15:
                      if (i1 == i3) {
                         goto label_008a ;
                      }else {
                      label_008c :
                         i3 = i3 - 1;
                      }
                      break;
                    case 16:
                    case 17:
                      if (i1 == i3) {
                         goto label_0086 ;
                      }else {
                         goto label_008c ;
                      }
                      break;
                    case 18:
                      i3 = i3 + 1;
                      continue ;
                      break;
                    default:
                      continue ;
                }
             }
             return i;
          }
       }
    }
    public static int b(CharSequence p0){
       byte b;
       a10 uoa10 = new a10(p0);
       uoa10.c = uoa10.b;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (uoa10.c > null) {
          if (b = uoa10.a()) {
             if (b != 1 && b != 2) {
                if (b != 9) {
                   switch (b){
                       case 14:
                       case 15:
                         if (i2 == i1) {
                         label_003b :
                            i = -1;
                            break ;
                         }
                         break;
                       case 16:
                       case 17:
                         if (i2 != i1) {
                            i1 = i1 - 1;
                         }
                         break;
                       case 18:
                         i1 = i1 + 1;
                         break;
                       default:
                         if (i2) {
                         }
                   }
                }
             }else if(!i1){
                if (i2) {
                }
             }
             i = 1;
             break ;
          }else if(!i1){
             goto label_003b ;
          }else if(!i2){
          }
          i2 = i1;
       }
       return i;
    }
    public final SpannableStringBuilder c(CharSequence p0,a27 p1){
       String str;
       if (p0 == null) {
          return null;
       }
       boolean b = p1.i(p0, p0.length());
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       boolean i = ((this.b & 0x02))? 1: 0;
       String e = b10.e;
       String d = b10.d;
       b10 ta = this.a;
       if (i) {
          b27 b1 = (b)? c27.b: c27.a;
          i = b1.i(p0, p0.length());
          if (ta == null && (i && b10.a(p0) != 1)) {
             str = d;
          }else if(ta != null && (!i && b10.a(p0) != -1)){
             str = e;
          }else {
             str = "";
          }
          spannableStr.append(str);
       }
       if (b != ta) {
          char c = (b)? 8235: 8234;
          spannableStr.append(c);
          spannableStr.append(p0);
          spannableStr.append(8236);
       }else {
          spannableStr.append(p0);
       }
       b27 b2 = (b)? c27.b: c27.a;
       b = b2.i(p0, p0.length());
       if (ta == null && (b && b10.b(p0) != 1)) {
          e = d;
       }else if(ta != null && (!b && b10.b(p0) != -1)){
          e = "";
       }
       spannableStr.append(e);
       return spannableStr;
    }
}
