package br.com.southsystem.workshop.appcrud.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.southsystem.workshop.appcrud.enumerators.Size;

@Document(collection="pizza")
public class Pizza{
    @Id
    private String id;

    private List<String> flavours = new ArrayList<>();

    private Size size = Size.MEDIUM;


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }


    /**
     * @return the size
     */
    public Size getSize() {
        return size;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param flavours the flavours to set
     */
    public void setFlavours(List<String> flavours) {
        this.flavours = flavours;
    }

    /**
     * @return the flavours
     */
    public List<String> getFlavours() {
        return flavours;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Size size) {
        this.size = size;
    }

}