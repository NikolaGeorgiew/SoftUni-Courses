ALTER TABLE products 
ADD CONSTRAINT my_fk
  FOREIGN KEY (`category_id`)
  REFERENCES categories (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;