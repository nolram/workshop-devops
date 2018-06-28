package br.com.southsystem.workshop.appcrud.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.southsystem.workshop.appcrud.domain.Pizza;
import br.com.southsystem.workshop.appcrud.repository.PizzaRepository;

@Service
@Transactional
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza save(Pizza pizza){
        return pizzaRepository.save(pizza);
    }

    public Pizza findOne(String id){
        return pizzaRepository.findOne(id);
    }

    public List<Pizza> findAll(){
        return pizzaRepository.findAll();
    }

    public Page<Pizza> findAllPagination(int n){
        return pizzaRepository.findAll(new PageRequest(n, 3));
    }

    public Page<Pizza> findAllPageable(Pageable pag){
        return pizzaRepository.findAll(pag);
    }

    public void delete(String id){
        pizzaRepository.delete(id);
    }
}