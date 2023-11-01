package com.spotify.cosmos.cosmonaut.annotations.Query;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract Query implements Annotation	// class@00088c from classes.dex
{

    boolean encoded();
    String value();
}
