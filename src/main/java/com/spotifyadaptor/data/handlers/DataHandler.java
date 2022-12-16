package com.spotifyadaptor.data.handlers;

public interface DataHandler<Q,T,S> extends Handler<Q,S> {

    default S handle(Q requestParams){

       // RequestMapper<T> requestMapper = getRequestMapper();
        DataProcessor<Q, T> dataProcessor = getDataProcessor();
        ResponseMapper<T,S> responseMapper = getResponseMapper();

        //T request = requestMapper.apply(requestParams);
        T response = dataProcessor.process(requestParams);//request);

        return responseMapper.apply(response);
    }

   // RequestMapper<T> getRequestMapper();

    DataProcessor<Q,T> getDataProcessor();

    ResponseMapper<T,S> getResponseMapper();
}
