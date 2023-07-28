package org.example.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Data
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String documento;
    private String direccion;
    private String telefono;
    private String correo;
    private String anotaciones;

}