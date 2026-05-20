package DTOs;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NotBlank

public class LocalRequest {

    @NotBlank(message = "Debes ingresar el nombre del local ")
    private String nombre;

    @NotBlank(message = "Debes ingresar la direccion del local ")
    private String direccion;

    @NotBlank(message = "Debes ingresar el numero telefono del local ")
    private String telefono;

    @NotBlank(message = "Debes ingresar la categoria ")
    private String categoria;
}
