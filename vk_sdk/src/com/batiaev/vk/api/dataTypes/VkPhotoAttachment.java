package com.batiaev.vk.api.dataTypes;

/**
 * @author batiaev
 * Created by batyaev on 7/20/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VkPhotoAttachment extends VkAttachment {
    public VkPhotoAttachment() {
        type = Photo;
    }
    private VKPhoto photo;

    public VKPhoto photo() {
        return photo;
    }

    public void setPhoto(VKPhoto photo) {
        this.photo = photo;
    }
}