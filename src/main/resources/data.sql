-- tipo etapa
insert into tipo_etapa(tipo_etapa_id, nome)values(1, 'Em Separação')
insert into tipo_etapa(tipo_etapa_id, nome)values(2, 'Emissão CRT')
insert into tipo_etapa(tipo_etapa_id, nome)values(3, 'Em Transporte')
insert into tipo_etapa(tipo_etapa_id, nome)values(4, 'Entregue')

-- status
insert into status_etapa(status_etapa_id, nome)values(1, 'Pendente')
insert into status_etapa(status_etapa_id, nome)values(2, 'Em Andamento')
insert into status_etapa(status_etapa_id, nome)values(3, 'Finalizado')
insert into status_etapa(status_etapa_id, nome)values(4, 'Cancelado')


-- alguns fluxos em andamento
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (1, 1, 1, 2000,'2022-03-08', '2022-03-08')
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-05T18:07:19.2727633', 1, '2022-03-05T15:07:19.2727633', 3, 1)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-06T18:07:19.2727633', 1, '2022-03-05T18:07:19.2727633', 3, 2)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T13:07:19.2727633', 1, '2022-03-06T18:07:19.2727633', 3, 3)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T13:07:19.2727633', 1, '2022-03-08T13:07:19.2727633', 3, 4)


-- alguns fluxos em andamento
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (6, 3, 5, 2300,'2022-04-01', '2022-04-02')
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-05T18:07:19.2727633', 6, '2022-03-05T15:07:19.2727633', 3, 1)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-06T18:07:19.2727633', 6, '2022-03-05T18:07:19.2727633', 3, 2)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T13:07:19.2727633', 6, '2022-03-06T18:07:19.2727633', 3, 3)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T13:07:19.2727633', 6, '2022-03-08T13:07:19.2727633', 3, 4)

-- alguns fluxos em andamento
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (7, 2, 4, 1000,'2022-04-03', '2022-04-01')
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-05T18:07:19.2727633', 7, '2022-03-05T15:07:19.2727633', 3, 1)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-06T18:07:19.2727633', 7, '2022-03-05T18:07:19.2727633', 3, 2)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T13:07:19.2727633', 7, '2022-03-06T18:07:19.2727633', 3, 3)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T13:07:19.2727633', 7, '2022-03-08T13:07:19.2727633', 3, 4)
--
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (2, 1, 3, 1000, '2022-03-10', null)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-07T18:07:19.2727633', 2, '2022-03-05T15:07:19.2727633', 3, 1)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T18:07:19.2727633', 2, '2022-03-07T18:07:19.2727633', 1, 2)

--
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (5, 2, 4, 500, '2022-03-19', null)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-15T18:07:19.2727633', 5, '2022-03-14T15:07:19.2727633', 3, 1)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-18T18:07:19.2727633', 5, '2022-03-15T18:07:19.2727633', 1, 2)

--cancelada
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (3, 2, 2, 2500, '2022-03-10', null)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-07T18:07:19.2727633', 3, '2022-03-05T15:07:19.2727633', 3, 1)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-08T18:07:19.2727633', 3, '2022-03-07T18:07:19.2727633', 4, 2)

--cancelada
insert into fluxo_entrega(fluxo_id, cliente_id, mercadoria_id, valor_frete, previsao_entrega, data_entrega) values (4, 2, 2, 2000, '2022-03-12', null)
insert into etapa(etapa_id, finalizada_em, fluxo_entrega_fluxo_id, iniciada_em, status_etapa_id, tipo_etapa_id)values (default, '2022-03-07T18:07:19.2727633', 4, '2022-03-05T15:07:19.2727633', 4, 1)