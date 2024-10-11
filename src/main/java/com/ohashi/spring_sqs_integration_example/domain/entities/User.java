package com.ohashi.spring_sqs_integration_example.domain.entities;

public record User(String id, String name, String email) {

    private User(Builder builder) {
        this(builder.id, builder.name, builder.email);
    }

    public static class Builder {
        private String id;
        private String name;
        private String email;

        public User build() {
            return new User(this);
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
