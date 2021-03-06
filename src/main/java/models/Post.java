package models;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>();
    private boolean published;
    private int id;
    private LocalDateTime createdAt;

    public Post(String content) {
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        instances.add(this);
        this.id = instances.size();
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll() {
        return instances;
    }

    public static Post findById(int id) {
        return instances.get(id-1);
    }

    public static void clearAllPosts() {
        instances.clear();
    }

    public boolean getPublished() {
        return this.published;
    }

    public int getId() {
        return id;
    }

    public void deletePost() {
        instances.remove(id-1);
    }

    public void update(String content) {
        this.content = content;
    }
}