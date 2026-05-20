package Service;

import DTOs.LocalRequest;
import DTOs.LocalResponse;

import Model.Local;

import Repository.LocalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;

    public LocalResponse crearLocal(LocalRequest request){
        Local local = new Local();

        local.setNombre(request.getNombre());
        local.setDireccion(request.getDireccion());
        local.setTelefono(request.getTelefono());
        local.setCategoria(request.getCategoria());

        Local localGuardado = localRepository.save(local);

        return
                new LocalResponse(
                        localGuardado.getId(),
                        localGuardado.getNombre(),
                        localGuardado.getDireccion(),
                        localGuardado.getTelefono(),
                        localGuardado.getCategoria()
                );
    }

    public List<LocalResponse> obtenerLocales(){

        List<Local> locales = localRepository.findAll();

        return
                locales.stream().map(local -> new LocalResponse(
                        local.getId(),
                        local.getNombre(),
                        local.getDireccion(),
                        local.getTelefono(),
                        local.getCategoria()
                         )
                ).collect(Collectors.toList());
    }
}
