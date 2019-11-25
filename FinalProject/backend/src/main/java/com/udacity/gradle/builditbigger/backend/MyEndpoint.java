package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokes.JavaJokesClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "pullJoke")
    public MyBean pullJoke(@Named("jokeContext") String joke) {
        MyBean response = new MyBean();
        JavaJokesClass javaJokesClass = new JavaJokesClass();
        String jokeFromLibrary = javaJokesClass.getJoke();
        response.setData(jokeFromLibrary);

        return response;
    }

}
