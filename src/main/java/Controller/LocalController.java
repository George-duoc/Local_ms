package Controller;

import DTOs.LocalRequest;
import DTOs.LocalResponse;

import Service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locales")

public class LocalController {

    @Autowired
    private LocalService localService;

    @PostMapping
    public ResponseEntity<LocalResponse>crearLocal(
            @RequestBody LocalRequest request){

        LocalResponse response = localService.crearLocal(request);

        return
                ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<LocalResponse>>obtenerLocales(){

        List<LocalResponse> lista = localService.obtenerLocales();

        return ResponseEntity.ok(lista);
    }
}
