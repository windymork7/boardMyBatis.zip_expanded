CREATE TABLE board_tbl(
    board_num NUMBER PRIMARY KEY,
    board_name VARCHAR2(30),
    board_pass VARCHAR2(20),
    board_subject VARCHAR2(50),
    board_content VARCHAR2(300),
    board_re_ref NUMBER,
    board_re_lev NUMBER,
    board_re_seq NUMBER,
    board_read_count NUMBER,
    board_date DATE
);

CREATE SEQUENCE board_tbl_seq;

COMMIT;