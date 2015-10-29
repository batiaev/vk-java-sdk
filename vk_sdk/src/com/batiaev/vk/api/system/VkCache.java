package com.batiaev.vk.api.system;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Properties;
import java.util.Set;

/**
 * Created by batiaev on 10/29/15.
 * @author batiaev
 */
public class VkCache extends Properties {
    protected static final Logger LOG = LogManager.getLogger(VkCache.class);

    private String name;

    public VkCache(String name) {
        this.name = name;
        File file = new File(name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else loadProperties();
    }

    public void loadProperties() {

        File file = new File(name);
        if (!file.exists()) {
            LOG.warn("Property file '" + name + "' not found.");
            return;
        }
        try {
            Set<PosixFilePermission> perms = Files.getPosixFilePermissions(file.toPath());
            String correctPermissions = "rw-------";
            if (!PosixFilePermissions.toString(perms).equals(correctPermissions)) {
                Files.setPosixFilePermissions(file.toPath(), PosixFilePermissions.fromString(correctPermissions));
                LOG.info("Setup '600' permissions for file " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            load(new FileInputStream(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save() {
        File file = new File(name);
        try {
            OutputStream out = new FileOutputStream(file);
            store(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object setProperty(String key, String value) {
        Object result = super.put(key, value);
        save();
        return result;
    }

    public boolean hasProperty(String key) {
        return containsKey(key);
    }
}