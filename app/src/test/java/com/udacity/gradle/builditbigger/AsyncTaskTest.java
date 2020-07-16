package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertNotNull;


@RunWith(RobolectricTestRunner.class)
public class AsyncTaskTest {



    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {

        Context context = ApplicationProvider.getApplicationContext();
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(context);


        String randomJoke = task.get();


        assertNotNull(randomJoke);
    }
}