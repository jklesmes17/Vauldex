# --- !Ups
CREATE TABLE "EMPLOYEE" (
  "ID" BIGSERIAL NOT NULL PRIMARY KEY,
  "USERNAME" VARCHAR(50) NOT NULL,
  "PASSWORD" VARCHAR(50) NOT NULL,
  "FNAME" VARCHAR(50) NOT NULL,
  "LNAME" VARCHAR(50) NOT NULL,
  "MNAME" VARCHAR(50) NOT NULL,
  "TIN" VARCHAR(30) NULL,
  "SSS" VARCHAR(30) NULL,
  "PAGIBIG" VARCHAR(30) NULL,
  "RATE_PER_HOUR" DOUBLE PRECISION NOT NULL
);

CREATE TABLE "ATTENDANCE" (
  "ID" BIGSERIAL NOT NULL PRIMARY KEY,
  "ID_USER" INTEGER NOT NULL,
  "DATE" DATE NOT NULL,
  "TIME_IN" TIMESTAMP NOT NULL,
  "TIME_OUT" TIMESTAMP NOT NULL
);

CREATE TABLE "ADMIN" (
  "ID" BIGSERIAL NOT NULL PRIMARY KEY,
  "USERNAME" VARCHAR(50) NOT NULL,
  "PASSWORD" VARCHAR(50) NOT NULL,
  "FNAME" VARCHAR(50) NOT NULL,
  "LNAME" VARCHAR(50) NOT NULL
);

ALTER TABLE "ATTENDANCE" ADD CONSTRAINT "FK_ID_EMPLOYEE" FOREIGN KEY("ID_USER") REFERENCES "EMPLOYEE"("ID") ON UPDATE CASCADE ON DELETE CASCADE;

# --- !Downs
ALTER TABLE "ATTENDANCE" DROP CONSTRAINT "FK_ID_EMPLOYEE";

DROP TABLE "EMPLOYEE";
DROP TABLE "ATTENDANCE";
DROP TABLE "ADMIN";
