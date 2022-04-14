package com.ap.PorfolioApiV8.Services.RedSocial;

import java.util.List;

import com.ap.PorfolioApiV8.models.RedSocial;

import org.springframework.http.ResponseEntity;

public interface IRedSocialService {
    
    public List<RedSocial> verRedSociales();
    
    public void crearRedSocial (RedSocial redSoc);
    
    public void borrarRedSocial (Long id);
    
    public RedSocial buscarRedSocial (Long id);   
    
    public ResponseEntity<RedSocial> buscarRedSocialId (Long id);
    
    public void editarRedSocial (RedSocial redSoc);

}
