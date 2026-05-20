package DTOs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LocalResponse {

    private Long id;

    private String nombre;

    private String direccion;

    private String telefono;

    private String categoria;
}
