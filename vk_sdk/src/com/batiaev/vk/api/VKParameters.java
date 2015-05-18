package com.batiaev.vk.api;

import java.util.HashMap;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

public class VKParameters {
    private HashMap<String, String> values = new HashMap<String, String>();

    public void setValue(String key, String value) {
        values.put(key, value);
    }

    public void setValue(String key, int value) {
        values.put(key, String.valueOf(value));
    }

    public String value(String key) {
        return values.get(key);
    }

    public String toString() {
        String result = "";
        for (String key : values.keySet()) {
            if (!result.isEmpty())
                result += "&";
            result += key + "=" + values.get(key);
        }
        return result.replace(" ", "");
    }
}