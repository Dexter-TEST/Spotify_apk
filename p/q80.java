package p.q80;
import p.ff4;
import java.lang.String;
import java.io.Serializable;
import java.lang.Object;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;

public final class q80 implements ff4	// class@00234c from classes.dex
{
    public final int a;
    public final String b;
    public final String c;
    public final Serializable d;

    public void q80(String p0,String p1,Serializable p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final byte[] a(){
       q80 oq80;
       int i1;
       int i = 0;
       byte[] uobyteArray = null;
       switch (this.a){
           case 0:
             q80 td = this.d;
             if ((oq80 = td) == null || !oq80.length) {
                i = 1;
             }
             try{
                if (!i) {
                   ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                   GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
                   gZIPOutputSt.write(td);
                   gZIPOutputSt.finish();
                   gZIPOutputSt.close();
                   uByteArrayOu.close();
                   uobyteArray = uByteArrayOu.toByteArray();
                }
             }catch(java.io.IOException e0){
             }
             break;
           default:
             byte[] uobyteArray1 = new byte[8192];
             try{
                InputStream inputStream = this.b();
                ByteArrayOutputStream uByteArrayOu1 = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputSt1 = new GZIPOutputStream(uByteArrayOu1);
                if (inputStream == null) {
                   gZIPOutputSt1.close();
                   uByteArrayOu1.close();
                   if (inputStream != null) {
                      inputStream.close();
                   }
                }else {
                   while ((i1 = inputStream.read(uobyteArray1)) > 0) {
                      gZIPOutputSt1.write(uobyteArray1, i, i1);
                   }
                   gZIPOutputSt1.finish();
                   gZIPOutputSt1.close();
                   uByteArrayOu1.close();
                   inputStream.close();
                   uobyteArray = uByteArrayOu1.toByteArray();
                }
                return uobyteArray;
             }catch(java.io.IOException e0){
             }
       }
       return uobyteArray;
    }
    public final InputStream b(){
       q80 oq80;
       InputStream inputStream = null;
       q80 td = this.d;
       switch (this.a){
           case 0:
             oq80 = ((oq80 = td) != null && oq80.length)? 0: 1;
             if (!oq80) {
                inputStream = new ByteArrayInputStream(td);
             }
             break;
           default:
             oq80 = td;
             if (oq80.exists() && oq80.isFile()) {
                try{
                   inputStream = new FileInputStream(td);
                }catch(java.io.FileNotFoundException e0){
                }
             }
             return inputStream;
       }
       return inputStream;
    }
}
