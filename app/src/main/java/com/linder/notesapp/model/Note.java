package com.linder.notesapp.model;

import java.util.Date;

/**
 * Created by Alumno on 2/10/2017.
 */

public class Note  {
        private Long id;

        private String title;

        private String content;

        private Date date;

        private Boolean favorite;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Boolean getFavorite() {
            return favorite;
        }

        public void setFavorite(Boolean favorite) {
            this.favorite = favorite;
        }

        @Override
        public String toString() {
            return "Note{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", date=" + date +
                    ", favorite=" + favorite +
                    '}';
        }
}

