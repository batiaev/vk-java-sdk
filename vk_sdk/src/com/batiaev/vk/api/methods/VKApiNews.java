package com.batiaev.vk.api.methods;

/**
 * @author batiaev
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * Builds requests for API.newsfeed part
 *
 * @see <a href="https://vk.com/dev/newsfeed">API newsfeed</a>
 */
public class VKApiNews extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.get">API newsfeed.get()</a>
     *
     * You need the following rights to call this method: wall and friends. 
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getRecommended">API newsfeed.getRecommended()</a>
     *
     * You need the following rights to call this method: wall and friends. 
     */
    public String getRecommended(VKParameters params) {
        return prepareRequest("getRecommended", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getComments">API newsfeed.getComments()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications. 
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getMentions">API newsfeed.getMentions()</a>
     *
     * You need the following rights to call this method: wall.
     */
    public String getMentions(VKParameters params) {
        return prepareRequest("getMentions", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getBanned">API newsfeed.getBanned()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications. 
     */
    public String getBanned(VKParameters params) {
        return prepareRequest("getBanned", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.addBan">API newsfeed.addBan()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.  
     */
    public String addBan(VKParameters params) {
        return prepareRequest("addBan", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.deleteBan">API newsfeed.deleteBan()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteBan(VKParameters params) {
        return prepareRequest("deleteBan", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.ignoreItem">API newsfeed.ignoreItem()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String ignoreItem(VKParameters params) {
        return prepareRequest("ignoreItem", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.unignoreItem">API newsfeed.unignoreItem()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unignoreItem(VKParameters params) {
        return prepareRequest("unignoreItem", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.search">API newsfeed.search()</a>
     *
     * This is an open method; it does not require an access_token. 
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getLists">API newsfeed.getLists()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String getLists(VKParameters params) {
        return prepareRequest("getLists", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.saveList">API newsfeed.saveList()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String saveList(VKParameters params) {
        return prepareRequest("saveList", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.deleteList">API newsfeed.deleteList()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteList(VKParameters params) {
        return prepareRequest("deleteList", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.unsubscribe">API newsfeed.unsubscribe()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unsubscribe(VKParameters params) {
        return prepareRequest("unsubscribe", params).getRequest();
    }
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getSuggestedSources">API newsfeed.getSuggestedSources()</a>
     *
     * This method doesn't require any specific rights. 
     */
    public String getSuggestedSources(VKParameters params) {
        return prepareRequest("getSuggestedSources", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "news";
    }
}
