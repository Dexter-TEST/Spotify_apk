package com.spotify.hubs.moshi.HubsJsonViewModel;
import java.lang.Object;
import p.b43;
import com.spotify.hubs.moshi.HubsJsonViewModel$HubsJsonViewModelCompatibility;
import p.k23;
import java.util.List;
import com.google.common.collect.c;
import p.oi;
import p.eb3;
import p.au2;
import p.a23;
import java.lang.String;

public class HubsJsonViewModel	// class@0008d3 from classes.dex
{
    private String a;
    private String b;
    private ju2 c;
    private List d;
    private List e;
    private String f;
    private au2 g;
    private static final String h = "id";
    private static final String i = "title";
    private static final String j = "header";
    private static final String k = "body";
    private static final String l = "overlays";
    private static final String m = "extension";
    private static final String n = "custom";

    public void HubsJsonViewModel(){
       super();
    }
    public b43 a(){
       HubsJsonViewModel$HubsJsonViewModelCompatibility v8 = new HubsJsonViewModel$HubsJsonViewModelCompatibility(this.a, this.b, this.c, eb3.p(oi.b(this.d)), eb3.p(oi.b(this.e)), this.f, a23.W(this.g));
       return v8;
    }
}
