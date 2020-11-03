CREATE TABLE member_tbl(
    my_seq NUMBER PRIMARY KEY,
    my_id VARCHAR2(20) UNIQUE,
    my_pw VARCHAR2(20),
    my_email VARCHAR2(50),
    my_name VARCHAR2(20),
    my_birth VARCHAR2(10),
    interest VARCHAR2(200),
    intro VARCHAR2(300)
);

CREATE SEQUENCE member_seq;