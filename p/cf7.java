package p.cf7;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.util.Random;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Boolean;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import p.we7;
import java.util.TimeZone;

public final class cf7 extends ThreadLocal	// class@0011fb from classes.dex
{
    public final int a;

    public void cf7(int p0){
       this.a = p0;
       super();
    }
    public final Object initialValue(){
       Path path;
       cf7 ta = this.a;
       switch (ta){
           case 0:
             return new PathMeasure();
           case 1:
             switch (ta){
                 case 1:
                   path = new Path();
                   break;
                 default:
                   path = new Path();
             }
             return path;
             break;
           case 2:
             switch (ta){
                 case 1:
                   path = new Path();
                   break;
                 default:
                   path = new Path();
             }
             return path;
             break;
           case 3:
             float[] uofloatArray = new float[4];
             return uofloatArray;
           case 4:
             return Boolean.FALSE;
           case 5:
             return Long.valueOf(0);
           case 6:
             char[] uocharArray = new char[1024];
             return uocharArray;
           case 7:
             return new Exception();
           case 8:
             return "Picasso-";
           case 9:
             return new Random();
           default:
             SimpleDateFormat simpleDateFo = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
             simpleDateFo.setLenient(false);
             simpleDateFo.setTimeZone(we7.e);
             return simpleDateFo;
       }
    }
}
