package nttdata.grupo06.sistemaBanco.service;

import nttdata.grupo06.sistemaBanco.entity.BankAccount;
import nttdata.grupo06.sistemaBanco.entity.Signer;
import nttdata.grupo06.sistemaBanco.model.Clients;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientsService {



        Flux<BankAccount> findByClientId(String clientId);

        Mono<BankAccount> createClient(Clients clients);
        Mono<BankAccount> deleteClient(String id);
        Mono<BankAccount> getClientById(String id);
        Mono<BankAccount> updateClient(BankAccount bankAccount);

}
