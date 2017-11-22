package com.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//ignore unknown JSON values that do not have specific variables
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

        //values from the JSON object
        private Long id;
        private String quote;

        //constructor
        public Value() {
        }

        //getters/setters
        public Long getId() {
            return this.id;
        }

        public String getQuote() {
            return this.quote;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setQuote(String quote) {
            this.quote = quote;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "id=" + id +
                    ", quote='" + quote + '\'' +
                    '}';
        }
    }

