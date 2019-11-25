package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {


    @Test
    public void onPostExecute() {
        String resultStatus = EndpointsAsyncTask.Status.FINISHED.toString();
        assertEquals(resultStatus, "FINISHED");

    }
}