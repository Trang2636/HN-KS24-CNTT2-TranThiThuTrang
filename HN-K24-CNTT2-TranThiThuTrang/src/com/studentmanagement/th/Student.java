package com.studentmanagement.th;

public class Student {
    private String id;
    private String name;
    private double score;

    // Constructor không tham số
    public Student() {}

    // Constructor đầy đủ tham số
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    // Phương thức xếp loại học lực
    public String getRank() {
        if (this.score >= 8.0) return "Gioi";
        if (this.score >= 6.5) return "Kha";
        return "Trung Binh";
    }
}