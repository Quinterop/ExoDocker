DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS userTypes;
DROP TABLE IF EXISTS user_types;


CREATE TABLE user_types (
    name VARCHAR(20) NOT NULL,
    description VARCHAR(100),
    PRIMARY KEY (name)
);

CREATE TABLE users (
    id SERIAL NOT NULL ,
    name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    user_type VARCHAR(20) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_type) REFERENCES user_types(name)
);

INSERT INTO user_types (name, description) VALUES ('admin', 'Administrator');
INSERT INTO users (name, first_name, email, user_type) VALUES ('admin', 'admin', 'admin@localhost', 'admin');