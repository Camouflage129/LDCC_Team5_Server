/**********************************/
/* Table Name: Users */
/**********************************/
CREATE TABLE Users(
		id VARCHAR(30),
		pw VARCHAR(128) NOT NULL,
		affiliation VARCHAR(100),
		preference VARCHAR(20),
		region VARCHAR(20),
		date DATE
);
/**********************************/
/* Table Name: ProductInfo */
/**********************************/
CREATE TABLE ProductInfo(
		code VARCHAR(200),
		region VARCHAR(20),
		volume VARCHAR(10),
		weight INT,
		address VARCHAR(200),
		recipient VARCHAR(30),
		phone VARCHAR(20),
		date DATE,
		delivery_complete VARCHAR(10),
		sort_num INT
);

ALTER TABLE Users ADD CONSTRAINT IDX_Users_PK PRIMARY KEY (id);

ALTER TABLE ProductInfo ADD CONSTRAINT IDX_ProductInfo_PK PRIMARY KEY (code);

INSERT INTO Users Values('test', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4', 'a', 'a', 'a', '2018-08-01');
