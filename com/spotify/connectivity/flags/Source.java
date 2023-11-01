package com.spotify.connectivity.flags.Source;
import java.lang.String;
import java.lang.Object;
import p.co5;

public class Source	// class@00071c from classes.dex
{
    private final String key;
    private final String sourceType;

    public void Source(String p0,String p1){
       co5.o(p0, "sourceType");
       co5.o(p1, "key");
       super();
       this.sourceType = p0;
       this.key = p1;
    }
    public final String getKey(){
       return this.key;
    }
    public final String getSourceType(){
       return this.sourceType;
    }
}
