package com.spotify.webapi.service.models.Pager$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.spotify.webapi.service.models.Pager;
import java.lang.String;
import p.co5;

public final class Pager$Companion	// class@000c96 from classes.dex
{

    private void Pager$Companion(){
       super();
    }
    public void Pager$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final Pager fromItems(List p0){
       co5.o(p0, "items");
       Pager pager = new Pager();
       pager.items = p0;
       return pager;
    }
}
