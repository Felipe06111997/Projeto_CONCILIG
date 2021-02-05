DROP TABLE CONTRATO;
DROP TABLE PESSOA;
DROP TABLE PRODUTO;

DROP SEQUENCE SEQ_PESSOA;
DROP SEQUENCE SEQ_PRODUTO;
DROP SEQUENCE SEQ_CONTRATO;

create table PESSOA 
(PES_ID INTEGER NOT NULL,
PES_NOME VARCHAR (25) NOT NULL,
PES_CPF VARCHAR (20) NOT NULL
);


CREATE TABLE PRODUTO
(PRO_ID INTEGER NOT NULL,
PRO_NOME VARCHAR2 (26)
);

CREATE TABLE CONTRATO
(CON_ID INTEGER NOT NULL,
PES_ID INTEGER NOT NULL,
PRO_ID INTEGER,
CON_NUMERO INTEGER NOT NULL,
CON_VENCIMENTO DATE,
CON_VALOR NUMBER (10,2)
);

------CRIA��O DAS PKS-------
ALTER TABLE PESSOA
ADD CONSTRAINT PK_PES_ID
PRIMARY KEY (PES_ID);

ALTER TABLE PRODUTO
ADD CONSTRAINT PK_PRO_ID
PRIMARY KEY (PRO_ID);

ALTER TABLE CONTRATO
ADD CONSTRAINT PK_CON_ID
PRIMARY KEY (CON_ID);

------CRIA��O DAS FKS-------
ALTER TABLE CONTRATO
ADD CONSTRAINT FK_CONTRATO_PESSOA
FOREIGN KEY (PES_ID)
REFERENCES PESSOA (PES_ID);

ALTER TABLE CONTRATO
ADD CONSTRAINT FK_CONTRATO_PRODUTO
FOREIGN KEY (PRO_ID)
REFERENCES PRODUTO (PRO_ID);


----SEQUENCES------
CREATE SEQUENCE Felipe.SEQ_PESSOA
 MINVALUE 1 
 MAXVALUE 9999999 
 INCREMENT BY 1 
 START WITH 1 
 NOCACHE;

CREATE SEQUENCE Felipe.SEQ_PRODUTO  
 MINVALUE 1 
 MAXVALUE 9999999 
 INCREMENT BY 1 
 START WITH 1 
 NOCACHE;

CREATE SEQUENCE Felipe.SEQ_CONTRATO  
 MINVALUE 1 
 MAXVALUE 9999999 
 INCREMENT BY 1 
 START WITH 1 
 NOCACHE;

-----TRIGGERS------
/
CREATE OR REPLACE TRIGGER TRG_PESSOA
    BEFORE INSERT ON PESSOA
    FOR EACH ROW
BEGIN
    SELECT SEQ_PESSOA.NEXTVAL
    INTO :NEW.PES_ID
    FROM DUAL;
END;
/
CREATE OR REPLACE TRIGGER TRG_PRODUTO
    BEFORE INSERT ON PRODUTO
    FOR EACH ROW
BEGIN
    SELECT SEQ_PRODUTO.NEXTVAL
    INTO :NEW.PRO_ID
    FROM DUAL;
END;
/
CREATE OR REPLACE TRIGGER TRG_CONTRATO
    BEFORE INSERT ON CONTRATO
    FOR EACH ROW
BEGIN
    SELECT SEQ_CONTRATO.NEXTVAL
    INTO :NEW.CON_ID
    FROM DUAL;
END;
/

----INSERTS-------
INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Juliano de Souza', '871.876.120-87');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Silvia Santos' , '681.941.770-57');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Judite Eus�bio', '681.945.789-54');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Emanuel Pereira' , '297.545.720-03');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Epaminondas Carneiro' , '140.008.850-06');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Alceb�ades Eust�quio' , '083.595.090-50');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Maria Antonieta' , '052.566.140-96');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Marcelo Ferreira' , '101.644.400-11');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Carla Os�rio' , '284.805.630-44');

INSERT INTO PESSOA(
PES_NOME, PES_CPF)
VALUES ('Joana Almeida' , '350.823.350-22');

INSERT INTO PRODUTO(
PRO_NOME)
VALUES('Financiamento imobili�rio');

INSERT INTO PRODUTO(
PRO_NOME)
VALUES('Cart�o de cr�dito');

INSERT INTO PRODUTO(
PRO_NOME)
VALUES('Cr�dito pessoal');

INSERT INTO PRODUTO(
PRO_NOME)
VALUES('Financiamento ve�culo');

INSERT INTO PRODUTO(
PRO_NOME)
VALUES('Cheque especial');

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(1,1,6039,'20/01/2020',6565.55);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(2,3,3031,'06/09/2020',58264.39);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(2,4,2579,'18/04/2020',71962.28);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(2,3,7037,'13/05/2019',70781.23);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(3,2,7273,'08/12/2019',34287.68);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(4,2,4849,'18/11/2020',16052.96);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(5,3,3977,'04/01/2020',70717.2);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(5,1,7213,'04/03/2020',56702.37);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(5,3,3434,'17/11/2020',57943.02);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(5,5,7641,'28/03/2019',3610.2);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(6,4,4036,'20/02/2020',5988.46);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(6,5,5844,'20/07/2019',25535.82);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(6,4,6588,'11/01/2021',52613.57);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(6,4,5695,'07/10/2020',47521.65);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(7,1,9599,'20/09/2019',14073.91);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(8,3,2889,'05/08/2019',24027.42);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(9,4,6618,'23/10/2019',98143.91);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(9,1,9396,'10/09/2020',27261.76);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(9,4,6681,'25/07/2020',44035.18);

INSERT INTO CONTRATO(
PES_ID,PRO_ID,CON_NUMERO,CON_VENCIMENTO,CON_VALOR)
VALUES(10,5,5817,'03/06/2020',24535.85);






