package br.com.tse.dadosabertos.batch.dadosabertos.config;

record Database(
        String username,
        String password,
        String url,
        String driverClassName
) { }
