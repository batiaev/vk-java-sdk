package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * @author batiaev
 *
 * Builds requests for API.wall part
 * 
 * https://vk.com/dev/wall
 */
public class VKApiWall extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.get
     *
     * This is an open method; it does not require an access_token.
     */
    public String get(VKParameters params) {
		return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.search
     *
     * This is an open method; it does not require an access_token.
     */
    public String search(VKParameters params) {
		return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.getById
     *
     * This is an open method; it does not require an access_token.
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.post
     *
     * You need the following rights to call this method: wall.
     * This method is only available to Standalone-apps and web clients using the confirmation window.
     */
    public String post(VKParameters params) {
        return execute(getUrl("post", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.repost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String repost(VKParameters params) {
        return execute(getUrl("repost", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.getReposts
     *
     * This is an open method; it does not require an access_token.
     */
    public String getReposts(VKParameters params) {
        return execute(getUrl("getReposts", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.edit
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.delete
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String delete(VKParameters params) {
        return execute(getUrl(VkApiMethods.DELETE, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.restore
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String restore(VKParameters params) {
        return execute(getUrl("restore", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.pin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String pin(VKParameters params) {
        return execute(getUrl("pin", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.unpin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unpin(VKParameters params) {
        return execute(getUrl("unpin", params)).toString();
    }


    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.getComments
     *
     * This is an open method; it does not require an access_token.
     * Your app needs the following rights to access data on a user's behalf: wall.
     */
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.addComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String addComment(VKParameters params) {
        return execute(getUrl("addComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.editComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return execute(getUrl("editComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.deleteComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return execute(getUrl("deleteComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.restoreComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return execute(getUrl("restoreComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.reportPost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String reportPost(VKParameters params) {
        return execute(getUrl("reportPost", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.reportComment
     *
     * This is an open method; it does not require an access_token.
     */
    public String reportComment(VKParameters params) {
        return execute(getUrl("reportComment", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "wall";
    }
}
