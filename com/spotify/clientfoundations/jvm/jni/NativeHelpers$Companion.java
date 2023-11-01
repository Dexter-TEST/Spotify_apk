package com.spotify.clientfoundations.jvm.jni.NativeHelpers$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import p.tp2;
import java.io.ByteArrayOutputStream;
import p.oe0;
import java.nio.charset.Charset;
import p.co5;
import java.io.OutputStream;
import java.util.Map;
import java.util.LinkedHashMap;
import p.ib3;
import p.uk;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.spotify.clientfoundations.jvm.jni.NativeHelpers;

public final class NativeHelpers$Companion	// class@00058a from classes.dex
{

    private void NativeHelpers$Companion(){
       super();
    }
    public void NativeHelpers$Companion(DefaultConstructorMarker p0){
       super();
    }
    private final int nextNull(byte[] p0,int p1){
       try{
          while (p0[p1]) {
             p1++;
          }
          return p1;
       }catch(java.lang.Exception e0){
          throw new IndexOutOfBoundsException(tp2.k("Invalid character found at offset ", p1));
       }
    }
    private final void writeStringToStream(ByteArrayOutputStream p0,String p1){
       byte[] bytes = p1.getBytes(oe0.a);
       co5.l(bytes, "this as java.lang.String\).getBytes\(charset\)");
       p0.write(bytes);
       p0.write(0);
    }
    public final Map byteArrayToMap(byte[] p0){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       if (p0 == null) {
          return linkedHashMa;
       }
       int i = 0;
       while (i < p0.length) {
          int i1 = this.nextNull(p0, i);
          int i2 = i1 - 1;
          Charset a = oe0.a;
          i1 = i1 + 1;
          i = this.nextNull(p0, i1);
          int i3 = i - 1;
          i = i + 1;
          linkedHashMa.put(new String(uk.r0(p0, new ib3(i, i2)), a), new String(uk.r0(p0, new ib3(i1, i3)), a));
       }
       return linkedHashMa;
    }
    public final byte[] mapToByteArray(Map p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             NativeHelpers$Companion companion = NativeHelpers.Companion;
             companion.writeStringToStream(uByteArrayOu, key);
             companion.writeStringToStream(uByteArrayOu, uEntry.getValue());
          }
       }
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       co5.l(uobyteArray, "outputStream.toByteArray\(\)");
       return uobyteArray;
    }
}
