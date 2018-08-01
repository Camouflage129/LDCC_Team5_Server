CREATE TABLE users(
		id VARCHAR(30),
		pw VARCHAR(128) NOT NULL,
		name VARCHAR(20),
		affiliation VARCHAR(100),
		preference VARCHAR(20),
		region VARCHAR(20),
		date DATE
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE productinfo(
		num INT,
		code VARCHAR(200),
		region VARCHAR(20),
		id VARCHAR(30),
		volume VARCHAR(10),
		weight INT,
		address VARCHAR(200),
		recipient VARCHAR(30),
		phone VARCHAR(20),
		date DATE,
		delivery_complete VARCHAR(10),
		sort_num INT
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

ALTER TABLE users ADD CONSTRAINT IDX_users_PK PRIMARY KEY (id);
ALTER TABLE productinfo ADD CONSTRAINT IDX_productinfo_PK PRIMARY KEY (num);
ALTER TABLE productinfo ADD CONSTRAINT IDX_productinfo_FK0 FOREIGN KEY (id) REFERENCES users (id);

INSERT INTO users VALUES('test', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4', '원준희', 'a', 'a', 'a', '2018-08-01');
INSERT INTO users VALUES('test2', '1234', 'test', 'a', 'a', 'a', '2018-08-01');
