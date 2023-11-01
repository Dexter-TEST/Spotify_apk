package com.spotify.connectivity.http.HttpCacheUtils;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.co5;
import android.os.StatFs;
import java.lang.Math;

public final class HttpCacheUtils	// class@00072b from classes.dex
{
    public static final HttpCacheUtils INSTANCE;
    private static final int MAX_DISK_CACHE_SIZE;
    private static final int MIN_DISK_CACHE_SIZE;

    static {
       HttpCacheUtils.INSTANCE = new HttpCacheUtils();
    }
    private void HttpCacheUtils(){
       super();
    }
    public final long calculateDiskCacheSize(File p0){
       long l;
       co5.o(p0, "dir");
       try{
          int i = 0x500000;
          StatFs statFs = new StatFs(p0.getAbsolutePath());
          l = ((long)statFs.getBlockCount() * (long)statFs.getBlockSize()) / (long)50;
       }catch(java.lang.IllegalArgumentException e0){
          l = e0;
       }
       return Math.max(Math.min(l, 0x3200000), e0);
    }
}
