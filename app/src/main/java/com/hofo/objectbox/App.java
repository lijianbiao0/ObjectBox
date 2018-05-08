package com.hofo.objectbox;

import android.app.Application;

import com.hofo.objectbox.bean.ExampleEntity;
import com.hofo.objectbox.bean.MyObjectBox;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;

public class App extends Application {


    private BoxStore boxStore;
    private Box<ExampleEntity> notesBox;

    @Override
    public void onCreate() {
        super.onCreate();
//         做一次 通常在Application中初始化
        boxStore = MyObjectBox.builder().androidContext(App.this).build();
        // 在你的 activities/fragments 这样获得Box
        notesBox = this.getBoxStore().boxFor(ExampleEntity.class);
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}
