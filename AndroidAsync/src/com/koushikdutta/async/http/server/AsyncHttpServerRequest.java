package com.koushikdutta.async.http.server;

import com.koushikdutta.async.AsyncSocket;
import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.http.Headers;
import com.koushikdutta.async.http.Multimap;
import com.koushikdutta.async.http.body.AsyncHttpRequestBody;

import java.util.regex.Matcher;

public interface AsyncHttpServerRequest extends DataEmitter {
    Headers getHeaders();
    Matcher getMatcher();
    <T extends AsyncHttpRequestBody> T getBody();
    AsyncSocket getSocket();
    String getPath();
    Multimap getQuery();
    String getMethod();

    String get(String name);
}
