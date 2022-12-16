package com.spotifyadaptor.data.handlers;

import java.util.function.Function;

public interface RequestMapper<T> extends Function<String, T> {

}
