CREATE TABLE EXAMPLE (
  SEQ NUMBER GENERATED ALWAYS AS IDENTITY,
  TEXT VARCHAR2(100),
  SYSTEM_DATE DATE DEFAULT SYSDATE
);