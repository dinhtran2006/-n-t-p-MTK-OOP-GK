/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.pojo;

/**
 *
 * @author CongDinh
 */
public class Question {

    private int id;
    private String content;
    private String hint;
    private String image;
    private int category_id;
    private int level_id;

    private Question(QuestionBuilder b) {
        this.id = b.getId();
        this.content = b.getContent();
        this.hint = b.getHint();
        this.image = b.getImage();
        this.category_id = b.getCategory_id();
        this.level_id = b.getQuestion_id();
    }

    public static class QuestionBuilder {

        private int id;
        private String content;
        private String hint;
        private String image;
        private int category_id;
        private int level_id;

        public QuestionBuilder setId(int id) {
            this.id = id;
            return this;
        }
        
        public QuestionBuilder setContent(String content) {
            this.content = content;
            return this;
        }
        
        public QuestionBuilder setCategory_id(int category_id) {
            this.category_id = category_id;
            return this;
        }
        
        public QuestionBuilder setLevel_id(int level_id) {
            this.level_id = level_id;
            return this;
        }
        
        public Question QuestionBuild() {
            return new Question(this);
        }

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @return the content
         */
        public String getContent() {
            return content;
        }

        /**
         * @return the hint
         */
        public String getHint() {
            return hint;
        }

        /**
         * @return the image
         */
        public String getImage() {
            return image;
        }

        /**
         * @return the category_id
         */
        public int getCategory_id() {
            return category_id;
        }

        /**
         * @return the level_id
         */
        public int getQuestion_id() {
            return level_id;
        }
        
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @return the category_id
     */
    public int getCategory_id() {
        return category_id;
    }

    /**
     * @return the level_id
     */
    public int getQuestion_id() {
        return level_id;
    }

}
