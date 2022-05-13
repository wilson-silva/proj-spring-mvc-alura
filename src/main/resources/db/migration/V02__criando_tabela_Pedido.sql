
CREATE TABLE PEDIDO(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome_produto VARCHAR(255) NOT NULL,
valor_negociado DECIMAL,
data_entrega DATE,
url_produto VARCHAR(500) NOT NULL,
url_imagem VARCHAR(500) NOT NULL,
descricao VARCHAR(255) NOT NULL,
status VARCHAR(255),
usuario_username VARCHAR(255),
CONSTRAINT fk_usuario FOREIGN KEY (usuario_username) REFERENCES users(username));

INSERT INTO PEDIDO(nome_produto, valor_negociado, data_entrega, url_produto, url_imagem, descricao, status, usuario_username)
VALUES('Kindle 10a. geração com bateria de longa duração - Cor Preta',null, null,
'https://www.amazon.com.br/gp/product/B07FQK1TS9?ref_=gw_ATF_jg_md_desk&pf_rd_r=AZ6HB8Y9J06QGH6TGDT1&pf_rd_p=fefb3772-2538-4d2f-b371-b73359f0b80f&pd_rd_r=34685d5a-5cdb-46c9-b1e8-e1bc905a1af5&pd_rd_w=3Dxoi&pd_rd_wg=8lWqo',
'https://m.media-amazon.com/images/I/61X0ISBpD-L._AC_SX679_.jpg',
'Uma atualização descrição qualquer para esses pedido',
'AGUARDANDO',
'joao'
);

INSERT INTO PEDIDO(nome_produto, valor_negociado, data_entrega, url_produto, url_imagem, descricao,status, usuario_username)
VALUES('BLACK+DECKER Parafusadeira e Furadeira de 3/8 Pol',null, null,
'https://www.amazon.com.br/Parafusadeira-Furadeira-Acess%C3%B3rios-Stanley-LD12SP-BR/dp/B07C292HSY?ref_=Oct_d_omwf_d_17113547011&pd_rd_w=iucD7&pf_rd_p=0a946fed-f177-4172-b4ee-5f9f85219905&pf_rd_r=4MCTEJ5R55PF9S2MCZ5A&pd_rd_r=08c9a7de-ebab-48f6-8b0e-8c39855d3180&pd_rd_wg=sYfdm&pd_rd_i=B07C292HSY',
'https://m.media-amazon.com/images/I/51NPkQERPXL._AC_SL1000_.jpg',
'Uma descrição qualquer para esses pedido',
'AGUARDANDO',
'joao'
);

INSERT INTO PEDIDO(nome_produto, valor_negociado, data_entrega, url_produto, url_imagem, descricao,status, usuario_username)
VALUES('TicWatch Pro 3 Ultra GPS smartwatch',1560, '2022-05-03',
'https://www.amazon.com.br/TicWatch-smartwatch-inteligente-Qualcomm-atividades/dp/B09JKCWHPJ?ref_=Oct_d_orecs_d_23469006011&pd_rd_w=aQVIl&pf_rd_p=0b88fdcf-5a93-418f-aa69-11a1a44f3d28&pf_rd_r=Q64CYX21DKDDHEZE6CCH&pd_rd_r=e083ec40-7890-4632-92b1-9271c8aa0814&pd_rd_wg=qADVG&pd_rd_i=B09JKCWHPJ',
'https://m.media-amazon.com/images/I/61lkymCCwAL._AC_SY879_.jpg',
'Uma descrição qualquer para esses pedido',
'ENTREGUE',
'maria'
);

INSERT INTO PEDIDO(nome_produto, valor_negociado, data_entrega, url_produto, url_imagem, descricao,status, usuario_username)
VALUES('TicWatch Pro 3 Ultra GPS smartwatch',1560, '2022-11-03',
'https://www.amazon.com.br/TicWatch-smartwatch-inteligente-Qualcomm-atividades/dp/B09JKCWHPJ?ref_=Oct_d_orecs_d_23469006011&pd_rd_w=aQVIl&pf_rd_p=0b88fdcf-5a93-418f-aa69-11a1a44f3d28&pf_rd_r=Q64CYX21DKDDHEZE6CCH&pd_rd_r=e083ec40-7890-4632-92b1-9271c8aa0814&pd_rd_wg=qADVG&pd_rd_i=B09JKCWHPJ',
'https://m.media-amazon.com/images/I/61lkymCCwAL._AC_SY879_.jpg',
'Uma descrição qualquer para esses pedido',
'ENTREGUE',
'maria'
);

INSERT INTO PEDIDO(nome_produto, valor_negociado, data_entrega, url_produto, url_imagem, descricao,status, usuario_username)
VALUES('TicWatch Pro 3 Ultra GPS smartwatch',1560, '2022-05-10',
'https://www.amazon.com.br/TicWatch-smartwatch-inteligente-Qualcomm-atividades/dp/B09JKCWHPJ?ref_=Oct_d_orecs_d_23469006011&pd_rd_w=aQVIl&pf_rd_p=0b88fdcf-5a93-418f-aa69-11a1a44f3d28&pf_rd_r=Q64CYX21DKDDHEZE6CCH&pd_rd_r=e083ec40-7890-4632-92b1-9271c8aa0814&pd_rd_wg=qADVG&pd_rd_i=B09JKCWHPJ',
'https://m.media-amazon.com/images/I/61lkymCCwAL._AC_SY879_.jpg',
'Uma descrição qualquer para esses pedido',
'ENTREGUE',
'joao'
);

INSERT INTO PEDIDO(nome_produto, valor_negociado, data_entrega, url_produto, url_imagem, descricao,status, usuario_username)
VALUES('TicWatch Pro 3 Ultra GPS smartwatch',null, null,
'https://www.amazon.com.br/TicWatch-smartwatch-inteligente-Qualcomm-atividades/dp/B09JKCWHPJ?ref_=Oct_d_orecs_d_23469006011&pd_rd_w=aQVIl&pf_rd_p=0b88fdcf-5a93-418f-aa69-11a1a44f3d28&pf_rd_r=Q64CYX21DKDDHEZE6CCH&pd_rd_r=e083ec40-7890-4632-92b1-9271c8aa0814&pd_rd_wg=qADVG&pd_rd_i=B09JKCWHPJ',
'https://m.media-amazon.com/images/I/61lkymCCwAL._AC_SY879_.jpg',
'Uma descrição qualquer para esses pedido',
'AGUARDANDO',
'joao'
);