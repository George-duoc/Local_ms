package Client;

import DTOs.ReseniaResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Rese-a_ms", url = "${ms.resenias.url}")
public interface Client {

    @GetMapping("/resenias/local/{idLocal}")
    List<ReseniaResponse>obtenerReseniaPorLocal(@PathVariable String idLocal);
}
