package com.spotifyadaptor.data.handlers;

public interface DataProcessor <T, R>{

    R process(T request);
}
