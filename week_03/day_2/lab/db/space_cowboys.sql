DROP TABLE IF EXISTS bounty;
CREATE TABLE bounty(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  species VARCHAR(255),
  value INT,
  collected_by VARCHAR(255)
);
