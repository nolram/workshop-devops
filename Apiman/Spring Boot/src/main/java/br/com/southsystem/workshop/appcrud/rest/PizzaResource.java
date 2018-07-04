package br.com.southsystem.workshop.appcrud.rest;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.southsystem.workshop.appcrud.domain.Pizza;
import br.com.southsystem.workshop.appcrud.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaResource{
    private final PizzaService pizzaService;

    public PizzaResource(PizzaService pizzaService){
        this.pizzaService = pizzaService;
    }

    @PostMapping
    public ResponseEntity<Pizza> save(@RequestBody Pizza pizza){
        return ResponseEntity.ok(pizzaService.save(pizza));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> getOne(@PathVariable String id){
        Pizza pizza = pizzaService.findOne(id);
        if(pizza == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pizzaService.findOne(id));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Pizza>> getAll(){
        return ResponseEntity.ok(pizzaService.findAll());
    }

    @GetMapping
    public ResponseEntity<Page<Pizza>> getAllPagination(Pageable n){
        return ResponseEntity.ok(pizzaService.findAllPageable(n));
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        pizzaService.delete(id);
        return ResponseEntity.ok().build();
    }
}