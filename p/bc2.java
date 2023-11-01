package p.bc2;
import java.util.Locale;
import java.lang.String;
import android.widget.TextView;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.lang.Object;
import android.text.TextPaint;
import android.graphics.Paint;

public abstract class bc2	// class@001097 from classes.dex
{
    public static final Locale[] a;

    static {
       Locale[] localeArray = new Locale[]{new Locale("th"),new Locale("vi")};
       bc2.a = localeArray;
    }
    public static void a(TextView p0,Context p1){
       Locale locale = is7.p(p1.getResources().getConfiguration()).c(0);
       Locale[] a = bc2.a;
       int len = a.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (locale.getLanguage().equals(a[i].getLanguage())) {
                locale = 1;
             label_002e :
                if (locale) {
                   break ;
                }else {
                   TextPaint paint = p0.getPaint();
                   paint.setFlags(((paint.getFlags() | 0x0080) | 1));
                   paint.setHinting(0);
                   return;
                }
             }else {
                i = i + 1;
             }
          }else {
             locale = 0;
             goto label_002e ;
          }
       }
       return;
    }
}
