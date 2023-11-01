package p.v6;
import p.dh4;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.n26;
import p.la6;
import p.pa6;
import java.util.Iterator;
import android.app.Activity;
import p.gg4;
import p.u6;
import android.os.Bundle;
import p.ng4;
import android.content.Intent;
import java.lang.StringBuffer;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import android.os.BaseBundle;
import android.net.Uri;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.content.res.Resources;
import p.en6;
import java.lang.IllegalStateException;

public class v6 extends dh4	// class@002993 from classes.dex
{
    public final Context c;
    public final Activity d;

    public void v6(Context p0){
       Activity uActivity;
       co5.o(p0, "context");
       super();
       this.c = p0;
       Iterator iterator = pa6.G(p0, n26.c).iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             uActivity = null;
             break ;
          }
          uActivity = iterator.next();
       } while (uActivity instanceof Activity);
       this.d = uActivity;
       return;
    }
    public final gg4 a(){
       return new u6(this);
    }
    public final gg4 c(gg4 p0,Bundle p1,ng4 p2){
       int i1;
       int i2;
       boolean b;
       v6 td;
       Intent intent1;
       if (p0.B == null) {
          throw new IllegalStateException(en6.o("Destination ", p0.y, " does not have an Intent set.").toString());
       }
       Intent intent = new Intent(p0.B);
       int i = 0;
       if (p1 != null) {
          intent.putExtras(p1);
          u6 c = p0.C;
          i1 = 1;
          StringBuffer str = (c != null && c.length())? 0: 1;
          if (!i2) {
             str = "";
             Matcher matcher = Pattern.compile("\\{\(.+?\)\\}").matcher(c);
             while (true) {
                if (b = matcher.find()) {
                   String str1 = matcher.group(i1);
                   if (p1.containsKey(str1)) {
                      matcher.appendReplacement(str, "");
                      str = str.append(Uri.encode(String.valueOf(p1.get(str1))));
                   }else {
                      throw new IllegalArgumentException("Could not find "+str1+" in "+p1+" to fill data pattern "+c);
                   }
                }else {
                   matcher.appendTail(str);
                   intent.setData(Uri.parse(str));
                }
             }
          }
       }
       if ((td = this.d) == null) {
          intent.addFlags(0x10000000);
       }
       if (p2 != null && p2.a != null) {
          intent.addFlags(0x20000000);
       }
       String str2 = "android-support-navigation:ActivityNavigator:current";
       if (td != null && ((intent1 = td.getIntent()) != null && (i1 = intent1.getIntExtra(str2, i)))) {
          intent.putExtra("android-support-navigation:ActivityNavigator:source", i1);
       }
       intent.putExtra(str2, p0.y);
       v6 tc = this.c;
       Resources resources = tc.getResources();
       if (p2 != null) {
          ng4 h = p2.h;
          ng4 i3 = p2.i;
          if (h > null && (co5.c(resources.getResourceTypeName(h), "animator") || (i3 > null && co5.c(resources.getResourceTypeName(i3), "animator")))) {
             resources.getResourceName(h);
             resources.getResourceName(i3);
             p0.toString();
          }else {
             intent.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", h);
             intent.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
          }
       }
       tc.startActivity(intent);
       if (p2 != null && td != null) {
          ng4 f = p2.f;
          p2 = p2.g;
          if (f > null && (co5.c(resources.getResourceTypeName(f), "animator") || (p2 > null && co5.c(resources.getResourceTypeName(p2), "animator")))) {
             resources.getResourceName(f);
             resources.getResourceName(p2);
             p0.toString();
          }else if(f < null && p2 < null){
             if (f < null) {
                f = 0;
             }
             if (p2 >= null) {
                i = p2;
             }
             td.overridePendingTransition(f, i);
          }
       }
       return null;
    }
    public final boolean i(){
       v6 td;
       if ((td = this.d) == null) {
          return false;
       }
       td.finish();
       return true;
    }
}
