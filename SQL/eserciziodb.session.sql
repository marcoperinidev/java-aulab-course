-- CREATE TABLE users (
--    id INT NOT NULL AUTO_INCREMENT,
--    name VARCHAR(50) NOT NULL,
--    email VARCHAR(100) NOT NULL,
--    age INT,
--    PRIMARY KEY (id)
-- );



-- CREATE TABLE posts (
--    id INT NOT NULL AUTO_INCREMENT,
--    title VARCHAR(100) NOT NULL,
--    body TEXT NOT NULL,
--    user_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (user_id) REFERENCES users(id)
-- );


-- CREATE TABLE comments (
--    id INT NOT NULL AUTO_INCREMENT,
--    body TEXT NOT NULL,
--    user_id INT NOT NULL,
--    post_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (user_id) REFERENCES users(id),
--    FOREIGN KEY (post_id) REFERENCES posts(id)
-- );


-- CREATE TABLE likes (
--    id INT NOT NULL AUTO_INCREMENT,
--    user_id INT NOT NULL,
--    post_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (user_id) REFERENCES users(id),
--    FOREIGN KEY (post_id) REFERENCES posts(id)
-- );


-- CREATE TABLE follows (
--    id INT NOT NULL AUTO_INCREMENT,
--    follower_id INT NOT NULL,
--    followed_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (follower_id) REFERENCES users(id),
--    FOREIGN KEY (followed_id) REFERENCES users(id)
-- );

-- CREATE TABLE user_post (
--    id INT NOT NULL AUTO_INCREMENT,
--    user_id INT NOT NULL,
--    post_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (user_id) REFERENCES users(id),
--    FOREIGN KEY (post_id) REFERENCES posts(id)
-- );

-- CREATE TABLE user_comments (
--    id INT NOT NULL AUTO_INCREMENT,
--    user_id INT NOT NULL,
--    comment_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (user_id) REFERENCES users(id),
--    FOREIGN KEY (comment_id) REFERENCES comments(id)
-- );

-- CREATE TABLE user_likes (
--    id INT NOT NULL AUTO_INCREMENT,
--    user_id INT NOT NULL,
--    like_id INT NOT NULL,
--    PRIMARY KEY (id),
--    FOREIGN KEY (user_id) REFERENCES users(id),
--    FOREIGN KEY (like_id) REFERENCES likes(id)
-- );

SELECT *
FROM users
INNER JOIN posts ON users.id = posts.user_id;


-- SELECT users.name, posts.title, posts.body
-- FROM users
-- JOIN posts ON users.id = posts.user_id;


