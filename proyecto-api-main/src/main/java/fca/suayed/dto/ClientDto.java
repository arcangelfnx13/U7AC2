package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String lastname1;
    private String lastname2;
    private String RFC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getlastname1() {
        return lastname1;
    }

    public void setDescription(String lastname1) {
        this.lastname1 = lastname1;
    }

    @ColumnName("apellido_materno")
    public String getlastname2() {
        return this.lastname2;
    }

    public void setPrice(String lastname2) {
        this.lastname2 = lastname2;
    }

    @ColumnName("RFC")
    public String getRFC() {
        return RFC;
    }

    public void setQuantity(String RFC) {
        this.RFC = RFC;
    }


}
