package p.hi7;
import java.util.concurrent.Callable;
import java.lang.Object;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import p.u44;
import p.qo5;
import java.lang.Class;
import java.lang.String;
import p.zy5;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import java.util.ArrayList;
import p.po5;
import p.ur6;
import p.co5;
import android.content.res.Resources;
import android.content.Context;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.io.FileInputStream;
import java.io.InputStream;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.reflect.Type;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import p.ll1;
import java.io.IOException;
import java.lang.Throwable;
import p.w71;
import p.ti5;
import p.sl7;
import p.xi0;
import p.vp;
import p.r45;
import p.ly0;
import java.lang.ref.Reference;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import android.util.Base64;

public final class hi7 implements Callable	// class@00185d from classes.dex
{
    public final int a;
    public final Object b;

    public void hi7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void hi7(View p0){
       this.a = 0;
       super();
       this.b = new WeakReference(p0);
    }
    public final List a(){
       int i1;
       List list;
       hi7 tb = this.b;
       switch (this.a){
           case 2:
             u44 b = tb.b;
             b.getClass();
             zy5 ozy5 = zy5.x(0, "\n        SELECT * FROM RateLimitedEvents\n        ");
             b.a.b();
             Cursor uCursor = vv7.J(b.a, ozy5, 0);
             int i = ej4.z(uCursor, "eventName");
             i1 = ej4.z(uCursor, "count");
             int i2 = ej4.z(uCursor, "timestamp");
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                String str = (uCursor.isNull(i))? null: uCursor.getString(i);
                uArrayList.add(new po5(uCursor.getInt(i1), uCursor.getLong(i2), str));
             }
             uCursor.close();
             ozy5.y();
             return uArrayList;
             break;
           default:
             ur6 a = tb.a;
             co5.o(a, "context");
             i1 = 0x7f110000;
             String str1 = Environment.getExternalStorageDirectory().getAbsolutePath()+'/'+a.getResources().getResourceEntryName(i1)+".json";
             try{
                File uFile = new File(str1);
                FileInputStream uFileInputSt = (uFile.exists())? new FileInputStream(uFile): a.getResources().openRawResource(i1);
                co5.l(uFileInputSt, "if \(file.exists\(\)\) {\n   …(rawId\)\n                }");
                if ((list = tb.b.d(ur6.c).fromJson(new String(ej4.D0(uFileInputSt), oe0.a))) == null) {
                   list = ll1.a;
                }
             }catch(java.io.IOException e0){
                throw new IOException("Failed to load RAW resource #2131820544", e0);
             }
       }
       return list;
    }
    public final Object call(){
       View view;
       String str;
       ti5 oti5;
       hi7 ta = this.a;
       hi7 tb = this.b;
       switch (ta){
           case 0:
             if ((view = tb.get()) != null && (view.getWidth() && view.getHeight())) {
                Bitmap uBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap$Config.RGB_565);
                view.draw(new Canvas(uBitmap));
                ByteArrayOutputStream view1 = new ByteArrayOutputStream();
                uBitmap.compress(Bitmap$CompressFormat.JPEG, 10, view1);
                str = Base64.encodeToString(view1.toByteArray(), 2);
                co5.l(str, "encodeToString\(outputStream.toByteArray\(\), Base64.NO_WRAP\)");
             }else {
                str = "";
             }
             return str;
             break;
           case 1:
             ly0.b(tb);
             return null;
           case 2:
             return this.a();
           case 3:
             return tb.b.a();
           case 4:
             return this.a();
           case 5:
             switch (ta){
                 case 5:
                   oti5 = w71.d(tb);
                   break;
                 default:
                   oti5 = sl7.b(tb);
             }
             return oti5;
             break;
           default:
             switch (ta){
                 case 5:
                   oti5 = w71.d(tb);
                   break;
                 default:
                   oti5 = sl7.b(tb);
             }
             return oti5;
       }
    }
}
