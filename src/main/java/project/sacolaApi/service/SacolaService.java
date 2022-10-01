package project.sacolaApi.service;

import project.sacolaApi.model.Item;
import project.sacolaApi.model.Sacola;
import project.sacolaApi.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
