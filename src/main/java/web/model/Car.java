package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private Long id;
    private String model;

    public Car() {
    }

    public Car(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

