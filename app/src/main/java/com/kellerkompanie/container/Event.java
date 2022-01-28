package com.kellerkompanie.container;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Event {
    private int id;
    private int userId;
    private Date createDate;
    private Date eventDate;
    private String title;
    private String content;
    private String contact;
    private String link;

    private Event(JSONObject jsonObject) throws JSONException, ParseException {
        id = jsonObject.getInt("id");
        userId = jsonObject.getInt("user_id");
        title = jsonObject.getString("title");
        content = jsonObject.getString("content");
        contact = jsonObject.getString("contact");
        link = jsonObject.getString("link");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.GERMANY);
        createDate = format.parse(jsonObject.getString("create_date"));
        eventDate = format.parse(jsonObject.getString("event_date"));
    }

    public static ArrayList<Event> fromJSONArray(JSONArray jsonArray) throws JSONException, ParseException {
        ArrayList<Event> events = new ArrayList<>(jsonArray.length());
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            events.add(new Event(jsonObject));
        }
        return events;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getContact() {
        return contact;
    }

    public String getLink() {
        return link;
    }
}
