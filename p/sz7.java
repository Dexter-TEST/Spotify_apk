package p.sz7;
import p.jd;
import java.lang.String;
import p.dx7;
import java.lang.Object;
import java.lang.Class;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;
import java.lang.Integer;
import p.dy7;
import p.hx7;
import java.lang.Long;
import java.lang.Exception;
import java.util.Dictionary;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class sz7	// class@0026cf from classes.dex
{
    public final byte[] a;
    public final dx7 b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public int g;
    public static final jd h;

    static {
       sz7.h = new jd("SliceMetadataManager");
    }
    public void sz7(dx7 p0,String p1,int p2,long p3,String p4){
       super();
       byte[] uobyteArray = new byte[8192];
       this.a = uobyteArray;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = -1;
    }
    public final int a(){
       sz7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(new File(tb.c(this.d, this.e, this.c), "_slices"), "_metadata"), this.f), "checkpoint.dat");
       if (!uFile.exists()) {
          return 0;
       }
       FileInputStream tb1 = new FileInputStream(uFile);
       Properties properties = new Properties();
       properties.load(tb1);
       tb1.close();
       if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
          return -1;
       }
       String str = "previousChunk";
       if (properties.getProperty(str) != null) {
          return (Integer.parseInt(properties.getProperty(str)) + 1);
       }
       throw new dy7("Slice checkpoint file corrupt.");
    }
    public final hx7 b(){
       String str = "-1";
       sz7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(new File(tb.c(this.d, this.e, this.c), "_slices"), "_metadata"), this.f), "checkpoint.dat");
       if (!uFile.exists()) {
          throw new dy7("Slice checkpoint file does not exist.");
       }
       Properties properties = new Properties();
       FileInputStream uFileInputSt = new FileInputStream(uFile);
       properties.load(uFileInputSt);
       uFileInputSt.close();
       String str1 = "fileStatus";
       if (properties.getProperty(str1) == null || properties.getProperty("previousChunk") == null) {
          throw new dy7("Slice checkpoint file corrupt.");
       }
       try{
          this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
          hx7 str2 = new hx7(Integer.parseInt(properties.getProperty(str1)), Integer.parseInt(properties.getProperty("previousChunk")), Long.parseLong(properties.getProperty("fileOffset", str)), Long.parseLong(properties.getProperty("remainingBytes", str)), properties.getProperty("fileName"));
          return str;
       }catch(java.lang.NumberFormatException e0){
          throw new dy7(v4, e0);
       }
    }
    public final File c(){
       sz7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(tb.c(this.d, this.e, this.c), "_slices"), "_metadata"), this.f);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.g)};
       return new File(uFile, String.format("%s-NAM.dat", objArray));
    }
    public final void d(int p0){
       Properties properties = new Properties();
       properties.put("fileStatus", "3");
       properties.put("fileOffset", String.valueOf(this.c().length()));
       properties.put("previousChunk", String.valueOf(p0));
       properties.put("metadataFileCounter", String.valueOf(this.g));
       FileOutputStream uFileOutputS = new FileOutputStream(this.j());
       properties.store(uFileOutputS, null);
       uFileOutputS.close();
    }
    public final void e(String p0,long p1,long p2,int p3){
       Properties properties = new Properties();
       properties.put("fileStatus", "1");
       properties.put("fileName", p0);
       properties.put("fileOffset", String.valueOf(p1));
       properties.put("remainingBytes", String.valueOf(p2));
       properties.put("previousChunk", String.valueOf(p3));
       properties.put("metadataFileCounter", String.valueOf(this.g));
       FileOutputStream uFileOutputS = new FileOutputStream(this.j());
       properties.store(uFileOutputS, null);
       uFileOutputS.close();
    }
    public final void f(byte[] p0,int p1){
       Properties properties = new Properties();
       properties.put("fileStatus", "2");
       properties.put("previousChunk", String.valueOf(p1));
       properties.put("metadataFileCounter", String.valueOf(this.g));
       FileOutputStream uFileOutputS = new FileOutputStream(this.j());
       properties.store(uFileOutputS, null);
       uFileOutputS.close();
       sz7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(new File(tb.c(this.d, this.e, this.c), "_slices"), "_metadata"), this.f), "checkpoint_ext.dat");
       if (uFile.exists()) {
          uFile.delete();
       }
       uFileOutputS = new FileOutputStream(uFile);
       uFileOutputS.write(p0);
       uFileOutputS.close();
       return;
    }
    public final void g(int p0){
       Properties properties = new Properties();
       properties.put("fileStatus", "4");
       properties.put("previousChunk", String.valueOf(p0));
       properties.put("metadataFileCounter", String.valueOf(this.g));
       FileOutputStream uFileOutputS = new FileOutputStream(this.j());
       properties.store(uFileOutputS, null);
       uFileOutputS.close();
    }
    public final void h(byte[] p0){
       int i = 1;
       this.g = this.g + i;
       sz7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(tb.c(this.d, this.e, this.c), "_slices"), "_metadata"), this.f);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       Object[] objArray = new Object[i];
       objArray[0] = Integer.valueOf(this.g);
       String str = String.format("%s-LFH.dat", objArray);
       try{
          File uFile1 = new File(uFile, str);
          FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
          uFileOutputS.write(p0);
          uFileOutputS.close();
          return;
       }catch(java.io.IOException e11){
          throw new dy7("Could not write metadata file.", e11);
       }
    }
    public final void i(InputStream p0,byte[] p1){
       sz7 ta = this.a;
       this.g = this.g + 1;
       FileOutputStream uFileOutputS = new FileOutputStream(this.c());
       uFileOutputS.write(p1);
       int i = p0.read(ta);
       while (i > 0) {
          uFileOutputS.write(ta, 0, i);
          i = p0.read(ta);
       }
       uFileOutputS.close();
       return;
    }
    public final File j(){
       sz7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(new File(tb.c(this.d, this.e, this.c), "_slices"), "_metadata"), this.f), "checkpoint.dat");
       uFile.getParentFile().mkdirs();
       uFile.createNewFile();
       return uFile;
    }
}
