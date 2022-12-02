DROP TABLE IF EXISTS pet_info;
DROP TABLE IF EXISTS pet;

CREATE TABLE pet (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  pet_type ENUM('BIRD', 'CAT', 'DOG') NOT NULL
);

CREATE TABLE pet_info (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  birth_year INT NOT NULL,
  pet_id INT NOT NULL,
  favorite_food VARCHAR(250) NOT NULL,
  foreign key (pet_id) references pet(id)
);

INSERT INTO pet(id, name, pet_type) values(1, 'Kitty', 'CAT');
INSERT INTO pet(id, name, pet_type) values(2, 'Charlie', 'DOG');
INSERT INTO pet(id, name, pet_type) values(3, 'Pamuk', 'BIRD');
INSERT INTO pet_info(id, pet_id, birth_year, favorite_food) values(1, 1, 2018, 'chicken');
INSERT INTO pet_info(id, pet_id, birth_year, favorite_food) values(2, 2, 2016, 'steak');
INSERT INTO pet_info(id, pet_id, birth_year, favorite_food) values(3, 3, 2022, 'banana');
